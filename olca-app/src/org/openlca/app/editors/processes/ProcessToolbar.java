package org.openlca.app.editors.processes;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.part.EditorActionBarContributor;
import org.openlca.app.App;
import org.openlca.app.M;
import org.openlca.app.components.FileChooser;
import org.openlca.app.db.Database;
import org.openlca.app.editors.Editors;
import org.openlca.app.rcp.images.Images;
import org.openlca.app.rcp.images.Overlay;
import org.openlca.app.util.FileType;
import org.openlca.app.util.InformationPopup;
import org.openlca.core.model.ModelType;
import org.openlca.core.model.Process;
import org.openlca.core.model.descriptors.Descriptors;
import org.openlca.core.model.descriptors.ProcessDescriptor;
import org.openlca.io.xls.process.output.ExcelExport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessToolbar extends EditorActionBarContributor {

	private Logger log = LoggerFactory.getLogger(getClass());

	@Override
	public void contributeToToolBar(IToolBarManager manager) {
		manager.add(new MakeSystemAction());
		manager.add(new ExcelExportAction());
	}

	private Process getProcess() {
		ProcessEditor editor = Editors.getActive();
		if (editor == null) {
			log.error("unexpected error: process editor is not active");
			return null;
		}
		return editor.getModel();
	}

	private class MakeSystemAction extends Action {

		public MakeSystemAction() {
			setImageDescriptor(Images.descriptor(ModelType.PRODUCT_SYSTEM, Overlay.NEW));
			setToolTipText(M.CreateProductSystem);
		}

		@Override
		public void run() {
			Process process = getProcess();
			if (process == null)
				return;
			SystemCreation.run(process);
		}
	}

	private class ExcelExportAction extends Action {

		public ExcelExportAction() {
			setImageDescriptor(Images.descriptor(FileType.EXCEL));
			setToolTipText(M.ExportToExcel);
		}

		@Override
		public void run() {
			File dir = FileChooser.forExport(FileChooser.DIRECTORY_DIALOG);
			if (dir == null)
				return;
			Process process = getProcess();
			if (process == null)
				return;
			List<ProcessDescriptor> list = Arrays.asList(
					Descriptors.toDescriptor(process));
			ExcelExport export = new ExcelExport(dir, Database.get(), list);
			App.run(M.ExportProcess, export, () -> {
				InformationPopup.show(M.ExportDone);
			});
		}
	}

}
