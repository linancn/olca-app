package org.openlca.app.db.tables;

import java.util.Collections;
import java.util.List;

import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormPage;
import org.openlca.app.M;
import org.openlca.app.db.Database;
import org.openlca.app.editors.Editors;
import org.openlca.app.editors.SimpleEditorInput;
import org.openlca.app.editors.SimpleFormEditor;
import org.openlca.app.util.ErrorReporter;
import org.openlca.app.util.MsgBox;
import org.openlca.app.util.UI;
import org.openlca.app.viewers.Viewers;
import org.openlca.app.viewers.tables.Tables;
import org.openlca.core.model.Flow;

public class DbFlowTable extends SimpleFormEditor {

	private List<Flow> flows;

	public static void show() {
		if (Database.get() == null) {
			MsgBox.info(M.NoDatabaseOpened, M.NeedOpenDatabase);
			return;
		}
		var id = "DbFlowTable";
		Editors.open(new SimpleEditorInput(id, M.Parameters), id);
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
		throws PartInitException {
		try {
			flows = Database.get().allOf(Flow.class);
		} catch (Exception e) {
			ErrorReporter.on("failed to load flows", e);
		}
		super.init(site, input);
	}

	@Override
	protected FormPage getPage() {
		return new Page(this);
	}

	private static class Page extends FormPage {

		private final List<Flow> flows;

		private TableViewer table;
		private Text filter;

		Page(DbFlowTable table) {
			super(table, "DbFlowTable", M.Flows);
			flows = table.flows != null
				? table.flows
				: Collections.emptyList();
		}

		@Override
		protected void createFormContent(IManagedForm mform) {
			var form = UI.formHeader(mform, M.Flows);
			var tk = mform.getToolkit();
			var body = UI.formBody(form, tk);

			var filterComp = tk.createComposite(body);
			UI.gridLayout(filterComp, 2);
			UI.gridData(filterComp, true, false);
			filter = UI.formText(filterComp, tk, M.Filter);

			table = Tables.createViewer(body,
				M.FlowType,
				M.Name,
				M.Category,
				M.ReferenceUnit,
				M.ReferenceFlowProperty,
				M.CASNumber,
				"Chemical formula");
			Tables.bindColumnWidths(table, 0.1, 0.3, 0.3, 0.1, 0.1, 0.1);

			var label = new FlowLabel(Database.get());
			table.setLabelProvider(label);
			Viewers.sortByLabels(table, label, 0, 1, 2, 3, 4, 5, 6);
			table.setInput(flows);
		}
	}
}