/**
 *
 * $Id$
 */
package org.wso2.integrationstudio.ds.validation;


/**
 * A sample validator interface for {@link org.wso2.integrationstudio.ds.MaxRowCount}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MaxRowCountValidator {
	boolean validate();

	boolean validateValue(long value);
}