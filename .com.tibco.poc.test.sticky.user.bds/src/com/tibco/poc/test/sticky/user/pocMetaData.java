package com.tibco.poc.test.sticky.user;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>poc Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.poc.test.sticky.user.pocMetaData#getWFCaseID <em>WF Case ID</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.pocMetaData#getAHVNummer <em>AHV Nummer</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.pocMetaData#getPartnerID <em>Partner ID</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.pocMetaData#getDokumentenArt <em>Dokumenten Art</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.pocMetaData#getKanton <em>Kanton</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.pocMetaData#getFrist <em>Frist</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.poc.test.sticky.user.UserPackage#getpocMetaData()
 * @model extendedMetaData="name='pocMetaData' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface pocMetaData extends EObject
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
   * @see com.tibco.poc.test.sticky.user.UserPackage#getpocMetaData_WFCaseID()
   * @model dataType="com.tibco.poc.test.sticky.user.WFCaseID_pocMetaDataType"
   *        extendedMetaData="kind='element' name='WFCaseID'"
   * @generated
   */
  String getWFCaseID();

  /**
   * Sets the value of the '{@link com.tibco.poc.test.sticky.user.pocMetaData#getWFCaseID <em>WF Case ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>WF Case ID</em>' attribute.
   * @see #getWFCaseID()
   * @generated
   */
  void setWFCaseID(String value);

  /**
   * Returns the value of the '<em><b>AHV Nummer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>AHV Nummer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>AHV Nummer</em>' attribute.
   * @see #setAHVNummer(String)
   * @see com.tibco.poc.test.sticky.user.UserPackage#getpocMetaData_AHVNummer()
   * @model dataType="com.tibco.poc.test.sticky.user.AHVNummer_pocMetaDataType" required="true"
   *        extendedMetaData="kind='element' name='AHVNummer'"
   * @generated
   */
  String getAHVNummer();

  /**
   * Sets the value of the '{@link com.tibco.poc.test.sticky.user.pocMetaData#getAHVNummer <em>AHV Nummer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AHV Nummer</em>' attribute.
   * @see #getAHVNummer()
   * @generated
   */
  void setAHVNummer(String value);

  /**
   * Returns the value of the '<em><b>Partner ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partner ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partner ID</em>' attribute.
   * @see #setPartnerID(String)
   * @see com.tibco.poc.test.sticky.user.UserPackage#getpocMetaData_PartnerID()
   * @model dataType="com.tibco.poc.test.sticky.user.partnerID_pocMetaDataType" required="true"
   *        extendedMetaData="kind='element' name='partnerID'"
   * @generated
   */
  String getPartnerID();

  /**
   * Sets the value of the '{@link com.tibco.poc.test.sticky.user.pocMetaData#getPartnerID <em>Partner ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partner ID</em>' attribute.
   * @see #getPartnerID()
   * @generated
   */
  void setPartnerID(String value);

  /**
   * Returns the value of the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dokumenten Art</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dokumenten Art</em>' attribute.
   * @see #setDokumentenArt(String)
   * @see com.tibco.poc.test.sticky.user.UserPackage#getpocMetaData_DokumentenArt()
   * @model dataType="com.tibco.poc.test.sticky.user.dokumentenArt_pocMetaDataType"
   *        extendedMetaData="kind='element' name='dokumentenArt'"
   * @generated
   */
  String getDokumentenArt();

  /**
   * Sets the value of the '{@link com.tibco.poc.test.sticky.user.pocMetaData#getDokumentenArt <em>Dokumenten Art</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dokumenten Art</em>' attribute.
   * @see #getDokumentenArt()
   * @generated
   */
  void setDokumentenArt(String value);

  /**
   * Returns the value of the '<em><b>Kanton</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kanton</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kanton</em>' attribute.
   * @see #setKanton(String)
   * @see com.tibco.poc.test.sticky.user.UserPackage#getpocMetaData_Kanton()
   * @model dataType="com.tibco.poc.test.sticky.user.kanton_pocMetaDataType" required="true"
   *        extendedMetaData="kind='element' name='kanton'"
   * @generated
   */
  String getKanton();

  /**
   * Sets the value of the '{@link com.tibco.poc.test.sticky.user.pocMetaData#getKanton <em>Kanton</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kanton</em>' attribute.
   * @see #getKanton()
   * @generated
   */
  void setKanton(String value);

  /**
   * Returns the value of the '<em><b>Frist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Frist</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Frist</em>' attribute.
   * @see #setFrist(XMLGregorianCalendar)
   * @see com.tibco.poc.test.sticky.user.UserPackage#getpocMetaData_Frist()
   * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
   *        extendedMetaData="kind='element' name='frist'"
   * @generated
   */
  XMLGregorianCalendar getFrist();

  /**
   * Sets the value of the '{@link com.tibco.poc.test.sticky.user.pocMetaData#getFrist <em>Frist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Frist</em>' attribute.
   * @see #getFrist()
   * @generated
   */
  void setFrist(XMLGregorianCalendar value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getWFCaseID()
   * @generated
   */
  void setWFCaseID(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getAHVNummer()
   * @generated
   */
  void setAHVNummer(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getPartnerID()
   * @generated
   */
  void setPartnerID(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getDokumentenArt()
   * @generated
   */
  void setDokumentenArt(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getKanton()
   * @generated
   */
  void setKanton(Object value);

} // pocMetaData
