/**
 * Generated with Acceleo
 */
package org.wso2.integrationstudio.gmf.esb.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.resource.ResourceSet;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.eef.runtime.api.notify.EStructuralFeatureNotificationFilter;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.notify.NotificationFilter;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;

import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;

import org.wso2.integrationstudio.gmf.esb.EsbPackage;
import org.wso2.integrationstudio.gmf.esb.ValidateFeature;

import org.wso2.integrationstudio.gmf.esb.parts.EsbViewsRepository;
import org.wso2.integrationstudio.gmf.esb.parts.ValidateFeaturePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class ValidateFeaturePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public ValidateFeaturePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject validateFeature, String editing_mode) {
		super(editingContext, validateFeature, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = EsbViewsRepository.class;
		partKey = EsbViewsRepository.ValidateFeature.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			
			final ValidateFeature validateFeature = (ValidateFeature)elt;
			final ValidateFeaturePropertiesEditionPart basePart = (ValidateFeaturePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(EsbViewsRepository.ValidateFeature.Properties.featureName))
				basePart.setFeatureName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, validateFeature.getFeatureName()));
			
			if (isAccessible(EsbViewsRepository.ValidateFeature.Properties.featureEnabled)) {
				basePart.setFeatureEnabled(validateFeature.isFeatureEnabled());
			}
			// init filters
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}





	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == EsbViewsRepository.ValidateFeature.Properties.featureName) {
			return EsbPackage.eINSTANCE.getAbstractBooleanFeature_FeatureName();
		}
		if (editorKey == EsbViewsRepository.ValidateFeature.Properties.featureEnabled) {
			return EsbPackage.eINSTANCE.getAbstractBooleanFeature_FeatureEnabled();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		ValidateFeature validateFeature = (ValidateFeature)semanticObject;
		if (EsbViewsRepository.ValidateFeature.Properties.featureName == event.getAffectedEditor()) {
			validateFeature.setFeatureName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (EsbViewsRepository.ValidateFeature.Properties.featureEnabled == event.getAffectedEditor()) {
			validateFeature.setFeatureEnabled((Boolean)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		super.updatePart(msg);
		if (editingPart.isVisible()) {
			ValidateFeaturePropertiesEditionPart basePart = (ValidateFeaturePropertiesEditionPart)editingPart;
			if (EsbPackage.eINSTANCE.getAbstractBooleanFeature_FeatureName().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EsbViewsRepository.ValidateFeature.Properties.featureName)) {
				if (msg.getNewValue() != null) {
					basePart.setFeatureName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setFeatureName("");
				}
			}
			if (EsbPackage.eINSTANCE.getAbstractBooleanFeature_FeatureEnabled().equals(msg.getFeature()) && msg.getNotifier().equals(semanticObject) && basePart != null && isAccessible(EsbViewsRepository.ValidateFeature.Properties.featureEnabled))
				basePart.setFeatureEnabled((Boolean)msg.getNewValue());
			
			
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#getNotificationFilters()
	 */
	@Override
	protected NotificationFilter[] getNotificationFilters() {
		NotificationFilter filter = new EStructuralFeatureNotificationFilter(
			EsbPackage.eINSTANCE.getAbstractBooleanFeature_FeatureName(),
			EsbPackage.eINSTANCE.getAbstractBooleanFeature_FeatureEnabled()		);
		return new NotificationFilter[] {filter,};
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (EsbViewsRepository.ValidateFeature.Properties.featureName == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EsbPackage.eINSTANCE.getAbstractBooleanFeature_FeatureName().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getAbstractBooleanFeature_FeatureName().getEAttributeType(), newValue);
				}
				if (EsbViewsRepository.ValidateFeature.Properties.featureEnabled == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(EsbPackage.eINSTANCE.getAbstractBooleanFeature_FeatureEnabled().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(EsbPackage.eINSTANCE.getAbstractBooleanFeature_FeatureEnabled().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}


	

	

}
