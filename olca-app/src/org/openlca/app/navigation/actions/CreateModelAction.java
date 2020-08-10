package org.openlca.app.navigation.actions;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.PlatformUI;
import org.openlca.app.M;
import org.openlca.app.navigation.CategoryElement;
import org.openlca.app.navigation.INavigationElement;
import org.openlca.app.navigation.ModelTypeElement;
import org.openlca.app.navigation.Navigator;
import org.openlca.app.rcp.images.Images;
import org.openlca.app.rcp.images.Overlay;
import org.openlca.app.util.UI;
import org.openlca.app.wizards.INewModelWizard;
import org.openlca.core.model.Category;
import org.openlca.core.model.ModelType;
import org.slf4j.LoggerFactory;

/**
 * Opens the 'New'-wizard for a model type.
 */
class CreateModelAction extends Action implements INavigationAction {

	private Category category;
	private ModelType type;
	private INavigationElement<?> parent;

	@Override
	public boolean accept(INavigationElement<?> elem) {
		type = null;
		category = null;

		if (elem instanceof ModelTypeElement) {
			var e = (ModelTypeElement) elem;
			type = e.getContent();
		}
		if (elem instanceof CategoryElement) {
			var e = (CategoryElement) elem;
			category = e.getContent();
			type = category.modelType;
		}

		if (type == null || elem.getLibrary().isPresent())
			return false;
		parent = elem;
		setText(getText());
		setImageDescriptor(getImageDescriptor());
		return true;
	}

	@Override
	public boolean accept(List<INavigationElement<?>> elements) {
		return false;
	}

	@Override
	public void run() {
		var wizardId = getWizardId();
		try {
			var wizard = PlatformUI.getWorkbench()
					.getNewWizardRegistry()
					.findWizard(wizardId)
					.createWizard();
			if (wizard instanceof INewModelWizard) {
				var modelWizard = (INewModelWizard) wizard;
				modelWizard.setCategory(category);
			}
			var dialog = new WizardDialog(UI.shell(), wizard);
			dialog.open();
			Navigator.refresh(parent);
		} catch (CoreException e) {
			var log = LoggerFactory.getLogger(getClass());
			log.error("Open model wizard failed", e);
		}
	}

	private String getWizardId() {
		if (type == null)
			return null;
		return "wizards.new." + type.getModelClass().getSimpleName().toLowerCase();
	}

	@Override
	public String getText() {
		if (type == null)
			return M.Unknown + "?";
		switch (type) {
		case ACTOR:
			return M.NewActor;
		case CURRENCY:
			return M.NewCurrency;
		case FLOW:
			return M.NewFlow;
		case FLOW_PROPERTY:
			return M.NewFlowProperty;
		case IMPACT_METHOD:
			return M.NewLCIAMethod;
		case IMPACT_CATEGORY:
			return M.NewImpactCategory;
		case PROCESS:
			return M.NewProcess;
		case PRODUCT_SYSTEM:
			return M.NewProductSystem;
		case PROJECT:
			return M.NewProject;
		case SOCIAL_INDICATOR:
			return M.NewSocialIndicator;
		case SOURCE:
			return M.NewSource;
		case UNIT_GROUP:
			return M.NewUnitGroup;
		case LOCATION:
			return M.NewLocation;
		case PARAMETER:
			return M.NewParameter;
		case DQ_SYSTEM:
			return M.NewDataQualitySystem;
		default:
			return M.Unknown + "?";
		}
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		if (type == null)
			return null;
		return Images.descriptor(type, Overlay.NEW);
	}

}
