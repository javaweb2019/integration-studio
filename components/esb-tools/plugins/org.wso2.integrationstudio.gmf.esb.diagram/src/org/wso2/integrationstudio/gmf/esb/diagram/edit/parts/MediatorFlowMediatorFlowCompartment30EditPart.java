package org.wso2.integrationstudio.gmf.esb.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.wso2.integrationstudio.gmf.esb.diagram.custom.AbstractMediatorCompartmentEditPart;
import org.wso2.integrationstudio.gmf.esb.diagram.custom.editpolicy.FeedbackIndicateDragDropEditPolicy;
import org.wso2.integrationstudio.gmf.esb.diagram.custom.utils.SwitchMediatorUtils;
import org.wso2.integrationstudio.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment30CanonicalEditPolicy;
import org.wso2.integrationstudio.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment30ItemSemanticEditPolicy;

/**
 * @generated NOT
 */
public class MediatorFlowMediatorFlowCompartment30EditPart extends AbstractMediatorCompartmentEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 7057;

    /**
     * @generated NOT
     */
    public MediatorFlowMediatorFlowCompartment30EditPart(View view) {
        super(view);
        complexity = Complexity.SINGLE;
    }

    /**
     * @generated NOT
     */
    public String getCompartmentName() {
        // return Messages.MediatorFlowMediatorFlowCompartment30EditPart_title;
        // return "Target";
        return null;
    }

    public IFigure createFigure() {
        ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
        result.setTitleVisibility(false);
        // Override default border.
        LineBorder border = new LineBorder(new Color(null, 224, 224, 224), 1, SWT.BORDER_DASH);
        result.setBorder(border);
        result.setToolTip((String) null);
        return result;
    }

    /**
     * @generated NOT
     */
    protected void createDefaultEditPolicies() {
        super.createDefaultEditPolicies();
        installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
                new MediatorFlowMediatorFlowCompartment30ItemSemanticEditPolicy());
        installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
        installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
        installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new FeedbackIndicateDragDropEditPolicy());
        installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
                new MediatorFlowMediatorFlowCompartment30CanonicalEditPolicy());
        removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

    }

    protected void addChild(EditPart child, int index) {
        // TODO Auto-generated method stub
        super.addChild(child, index);

        if (child instanceof SwitchMediatorEditPart) {
            SwitchMediatorEditPart switchMediatorEditPart = (SwitchMediatorEditPart) child;
            SwitchMediatorUtils.addCaseBranchInitially(switchMediatorEditPart, getEditingDomain());
        }
    }

    public boolean isSelectable() {
        // TODO This or using ResizableEditpolicy?
        return false;
    }

    /**
     * @generated
     */
    protected void setRatio(Double ratio) {
        if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
            super.setRatio(ratio);
        }
    }

}
