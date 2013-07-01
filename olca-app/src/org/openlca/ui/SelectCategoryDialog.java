/*******************************************************************************
 * Copyright (c) 2007 - 2010 GreenDeltaTC. All rights reserved. This program and
 * the accompanying materials are made available under the terms of the Mozilla
 * Public License v1.1 which accompanies this distribution, and is available at
 * http://www.openlca.org/uploads/media/MPL-1.1.html
 * 
 * Contributors: GreenDeltaTC - initial API and implementation
 * www.greendeltatc.com tel.: +49 30 4849 6030 mail: gdtc@greendeltatc.com
 ******************************************************************************/
package org.openlca.ui;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.openlca.app.navigation.CategoryElement;
import org.openlca.app.navigation.NavigationRoot;
import org.openlca.app.navigation.NavigationTree;
import org.openlca.core.model.Category;
import org.openlca.core.model.ModelType;

/**
 * This dialog should be used to select an openLCA category
 * 
 */
public class SelectCategoryDialog extends Dialog {

	private Category category;
	private final ModelType modelType;
	private final NavigationRoot root;
	private final String title;

	public SelectCategoryDialog(Shell parentShell, String title,
			ModelType modelType, NavigationRoot root) {
		super(parentShell);
		this.root = root;
		this.title = title;
		this.modelType = modelType;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout());
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		new Label(composite, SWT.NONE).setText(title);

		// create category viewer
		final TreeViewer categoryViewer = new NavigationTree(composite, false,
				true, root, modelType);
		categoryViewer.getTree().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));

		// add category selection changed listener
		categoryViewer
				.addSelectionChangedListener(new ISelectionChangedListener() {

					@Override
					public void selectionChanged(
							final SelectionChangedEvent event) {
						category = !event.getSelection().isEmpty() ? (Category) ((CategoryElement) ((IStructuredSelection) event
								.getSelection()).getFirstElement())
								.getContent() : null;
					}
				});

		return parent;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(400, 400);
	}

	public Category getSelectedCategory() {
		return category;
	}

}
