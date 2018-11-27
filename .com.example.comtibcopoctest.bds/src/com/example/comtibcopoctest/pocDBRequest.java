package com.example.comtibcopoctest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>poc DB Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.comtibcopoctest.pocDBRequest#getWFCaseID <em>WF Case ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.comtibcopoctest.ComtibcopoctestPackage#getpocDBRequest()
 * @model extendedMetaData="name='pocDBRequest' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface pocDBRequest extends EObject
{
  /**
   * Returns the value of the '<em><b>WF Case ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>WF Case ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>WF Case ID</em>' attribute.
   * @see #setWFCaseID(String)
   * @see com.example.comtibcopoctest.ComtibcopoctestPackage#getpocDBRequest_WFCaseID()
   * @model dataType="com.example.comtibcopoctest.WFCaseID_pocDBRequestType" required="true"
   *        extendedMetaData="kind='element' name='WFCaseID'"
   * @generated
   */
  String getWFCaseID();

  /**
   * Sets the value of the '{@link com.example.comtibcopoctest.pocDBRequest#getWFCaseID <em>WF Case ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>WF Case ID</em>' attribute.
   * @see #getWFCaseID()
   * @generated
   */
  void setWFCaseID(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getWFCaseID()
   * @generated
   */
  void setWFCaseID(Object value);

} // pocDBRequest
