

package com.tibco.bwse.simpleaddresslookup;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage
 * @generated
 */
public interface SimpleaddresslookupFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimpleaddresslookupFactory eINSTANCE = com.tibco.bwse.simpleaddresslookup.impl.SimpleaddresslookupFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Input Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Type</em>'.
   * @generated
   */
  InputType createInputType();

  /**
   * Returns a new object of class '<em>Output Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Type</em>'.
   * @generated
   */
  OutputType createOutputType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SimpleaddresslookupPackage getSimpleaddresslookupPackage();

} //SimpleaddresslookupFactory
