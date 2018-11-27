package com.tibco.bwse.simpleaddresslookup;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.InputType#getPostalCode <em>Postal Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage#getInputType()
 * @model extendedMetaData="name='Input_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface InputType extends EObject
{
  /**
   * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Postal Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postal Code</em>' attribute.
   * @see #setPostalCode(String)
   * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage#getInputType_PostalCode()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='PostalCode' namespace='##targetNamespace'"
   * @generated
   */
  String getPostalCode();

  /**
   * Sets the value of the '{@link com.tibco.bwse.simpleaddresslookup.InputType#getPostalCode <em>Postal Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postal Code</em>' attribute.
   * @see #getPostalCode()
   * @generated
   */
  void setPostalCode(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getPostalCode()
   * @generated
   */
  void setPostalCode(Object value);

} // InputType
