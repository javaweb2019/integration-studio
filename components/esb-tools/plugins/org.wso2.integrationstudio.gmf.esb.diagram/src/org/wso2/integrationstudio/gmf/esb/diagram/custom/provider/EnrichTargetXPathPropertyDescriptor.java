package org.wso2.integrationstudio.gmf.esb.diagram.custom.provider;

import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.wso2.integrationstudio.gmf.esb.EnrichMediator;
import org.wso2.integrationstudio.gmf.esb.diagram.custom.configure.ui.NamespacedPropertyEditorDialog;

public class EnrichTargetXPathPropertyDescriptor extends PropertyDescriptor {

    public EnrichTargetXPathPropertyDescriptor(Object object, IItemPropertyDescriptor itemPropertyDescriptor) {
        super(object, itemPropertyDescriptor);
    }

    public CellEditor createPropertyEditor(Composite parent) {
        return new ExtendedDialogCellEditor(parent, getLabelProvider()) {

            protected Object openDialogBox(Control cellEditorWindow) {
                Shell shell = Display.getDefault().getActiveShell();
                EnrichMediator enrichMediator = (EnrichMediator) object;
                // .getEditingDomain()
                NamespacedPropertyEditorDialog enrichMediatorConfigurationDialog = new NamespacedPropertyEditorDialog(
                        shell, enrichMediator.getTargetXpath());
                // enrichMediatorConfigurationDialog.setBlockOnOpen(true);
                enrichMediatorConfigurationDialog.open();
                return null;
            }
        };
    }

}
