package org.wso2.integrationstudio.datamapper.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.wso2.integrationstudio.datamapper.diagram.providers.DataMapperElementTypes;
import org.wso2.integrationstudio.datamapper.diagram.providers.DataMapperModelingAssistantProvider;

/**
 * @generated
 */
public class DataMapperModelingAssistantProviderOfNOTEditPart extends DataMapperModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(DataMapperElementTypes.OperatorBasicContainer_3012);
		return types;
	}

}
