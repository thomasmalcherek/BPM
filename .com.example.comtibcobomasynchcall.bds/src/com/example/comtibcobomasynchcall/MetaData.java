package com.example.comtibcobomasynchcall;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Meta Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.comtibcobomasynchcall.MetaData#getAHVNummer <em>AHV Nummer</em>}</li>
 *   <li>{@link com.example.comtibcobomasynchcall.MetaData#getPartnerID <em>Partner ID</em>}</li>
 *   <li>{@link com.example.comtibcobomasynchcall.MetaData#getDokumentenArt <em>Dokumenten Art</em>}</li>
 *   <li>{@link com.example.comtibcobomasynchcall.MetaData#getKanton <em>Kanton</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage#getMetaData()
 * @model extendedMetaData="name='MetaData' kind='elementOnly'"
 *        annotation="bds label='MetaData'"
 *        annotation="teneo.jpa value='@Transient'"
 * @generated
 */
@SuppressWarnings("all")
public interface MetaData extends EObject
{
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
   * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage#getMetaData_AHVNummer()
   * @model dataType="com.example.comtibcobomasynchcall.AHVNummer_MetaDataType" required="true"
   *        extendedMetaData="kind='element' name='AHVNummer'"
   * @generated
   */
  String getAHVNummer();

  /**
   * Sets the value of the '{@link com.example.comtibcobomasynchcall.MetaData#getAHVNummer <em>AHV Nummer</em>}' attribute.
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
   * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage#getMetaData_PartnerID()
   * @model dataType="com.example.comtibcobomasynchcall.partnerID_MetaDataType" required="true"
   *        extendedMetaData="kind='element' name='partnerID'"
   * @generated
   */
  String getPartnerID();

  /**
   * Sets the value of the '{@link com.example.comtibcobomasynchcall.MetaData#getPartnerID <em>Partner ID</em>}' attribute.
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
   * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage#getMetaData_DokumentenArt()
   * @model dataType="com.example.comtibcobomasynchcall.dokumentenArt_MetaDataType"
   *        extendedMetaData="kind='element' name='dokumentenArt'"
   * @generated
   */
  String getDokumentenArt();

  /**
   * Sets the value of the '{@link com.example.comtibcobomasynchcall.MetaData#getDokumentenArt <em>Dokumenten Art</em>}' attribute.
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
   * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage#getMetaData_Kanton()
   * @model dataType="com.example.comtibcobomasynchcall.kanton_MetaDataType" required="true"
   *        extendedMetaData="kind='element' name='kanton'"
   * @generated
   */
  String getKanton();

  /**
   * Sets the value of the '{@link com.example.comtibcobomasynchcall.MetaData#getKanton <em>Kanton</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kanton</em>' attribute.
   * @see #getKanton()
   * @generated
   */
  void setKanton(String value);

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

} // MetaData
