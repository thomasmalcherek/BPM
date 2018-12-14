package com.example.comigsfak001;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geschaeftsvorfall</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.comigsfak001.Geschaeftsvorfall#getWFCaseID <em>WF Case ID</em>}</li>
 *   <li>{@link com.example.comigsfak001.Geschaeftsvorfall#getAHVNummer <em>AHV Nummer</em>}</li>
 *   <li>{@link com.example.comigsfak001.Geschaeftsvorfall#getPartnerID <em>Partner ID</em>}</li>
 *   <li>{@link com.example.comigsfak001.Geschaeftsvorfall#getDokumentenArt <em>Dokumenten Art</em>}</li>
 *   <li>{@link com.example.comigsfak001.Geschaeftsvorfall#getGeschaeftsfall <em>Geschaeftsfall</em>}</li>
 *   <li>{@link com.example.comigsfak001.Geschaeftsvorfall#getFrist <em>Frist</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.comigsfak001.Comigsfak001Package#getGeschaeftsvorfall()
 * @model extendedMetaData="name='Geschaeftsvorfall' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface Geschaeftsvorfall extends EObject
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
   * @see com.example.comigsfak001.Comigsfak001Package#getGeschaeftsvorfall_WFCaseID()
   * @model dataType="com.example.comigsfak001.WFCaseID_GeschaeftsvorfallType" required="true"
   *        extendedMetaData="kind='element' name='WFCaseID'"
   * @generated
   */
  String getWFCaseID();

  /**
   * Sets the value of the '{@link com.example.comigsfak001.Geschaeftsvorfall#getWFCaseID <em>WF Case ID</em>}' attribute.
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
   * @see com.example.comigsfak001.Comigsfak001Package#getGeschaeftsvorfall_AHVNummer()
   * @model dataType="com.example.comigsfak001.AHVNummer_GeschaeftsvorfallType"
   *        extendedMetaData="kind='element' name='AHVNummer'"
   * @generated
   */
  String getAHVNummer();

  /**
   * Sets the value of the '{@link com.example.comigsfak001.Geschaeftsvorfall#getAHVNummer <em>AHV Nummer</em>}' attribute.
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
   * @see com.example.comigsfak001.Comigsfak001Package#getGeschaeftsvorfall_PartnerID()
   * @model dataType="com.example.comigsfak001.partnerID_GeschaeftsvorfallType"
   *        extendedMetaData="kind='element' name='partnerID'"
   * @generated
   */
  String getPartnerID();

  /**
   * Sets the value of the '{@link com.example.comigsfak001.Geschaeftsvorfall#getPartnerID <em>Partner ID</em>}' attribute.
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
   * @see com.example.comigsfak001.Comigsfak001Package#getGeschaeftsvorfall_DokumentenArt()
   * @model dataType="com.example.comigsfak001.dokumentenArt_GeschaeftsvorfallType"
   *        extendedMetaData="kind='element' name='dokumentenArt'"
   * @generated
   */
  String getDokumentenArt();

  /**
   * Sets the value of the '{@link com.example.comigsfak001.Geschaeftsvorfall#getDokumentenArt <em>Dokumenten Art</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dokumenten Art</em>' attribute.
   * @see #getDokumentenArt()
   * @generated
   */
  void setDokumentenArt(String value);

  /**
   * Returns the value of the '<em><b>Geschaeftsfall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geschaeftsfall</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Geschaeftsfall</em>' attribute.
   * @see #setGeschaeftsfall(String)
   * @see com.example.comigsfak001.Comigsfak001Package#getGeschaeftsvorfall_Geschaeftsfall()
   * @model dataType="com.example.comigsfak001.geschaeftsfall_GeschaeftsvorfallType"
   *        extendedMetaData="kind='element' name='geschaeftsfall'"
   * @generated
   */
  String getGeschaeftsfall();

  /**
   * Sets the value of the '{@link com.example.comigsfak001.Geschaeftsvorfall#getGeschaeftsfall <em>Geschaeftsfall</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geschaeftsfall</em>' attribute.
   * @see #getGeschaeftsfall()
   * @generated
   */
  void setGeschaeftsfall(String value);

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
   * @see com.example.comigsfak001.Comigsfak001Package#getGeschaeftsvorfall_Frist()
   * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
   *        extendedMetaData="kind='element' name='frist'"
   * @generated
   */
  XMLGregorianCalendar getFrist();

  /**
   * Sets the value of the '{@link com.example.comigsfak001.Geschaeftsvorfall#getFrist <em>Frist</em>}' attribute.
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
   * @see #getGeschaeftsfall()
   * @generated
   */
  void setGeschaeftsfall(Object value);

} // Geschaeftsvorfall
