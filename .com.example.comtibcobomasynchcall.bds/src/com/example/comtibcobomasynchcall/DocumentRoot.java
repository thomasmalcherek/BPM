package com.example.comtibcobomasynchcall;

import com.example.comtibcobomasynchcall.bdsutil.BDSFeatureMap;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.comtibcobomasynchcall.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.example.comtibcobomasynchcall.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.example.comtibcobomasynchcall.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.example.comtibcobomasynchcall.DocumentRoot#getMetaDataElement <em>Meta Data Element</em>}</li>
 *   <li>{@link com.example.comtibcobomasynchcall.DocumentRoot#getMetaDataBDSInternalSerializationElement <em>Meta Data BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@SuppressWarnings("all")
public interface DocumentRoot extends EObject
{
  /**
   * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mixed</em>' attribute list.
   * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage#getDocumentRoot_Mixed()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='elementWildcard' name=':mixed'"
   * @generated
   */
  BDSFeatureMap getMixed();

  /**
   * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XMLNS Prefix Map</em>' map.
   * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage#getDocumentRoot_XMLNSPrefixMap()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
   * @generated
   */
  EMap<String, String> getXMLNSPrefixMap();

  /**
   * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>XSI Schema Location</em>' map.
   * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage#getDocumentRoot_XSISchemaLocation()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
   * @generated
   */
  EMap<String, String> getXSISchemaLocation();

  /**
   * Returns the value of the '<em><b>Meta Data Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Data Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Data Element</em>' containment reference.
   * @see #setMetaDataElement(MetaData)
   * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage#getDocumentRoot_MetaDataElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='MetaDataElement' namespace='##targetNamespace'"
   * @generated
   */
  MetaData getMetaDataElement();

  /**
   * Sets the value of the '{@link com.example.comtibcobomasynchcall.DocumentRoot#getMetaDataElement <em>Meta Data Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Data Element</em>' containment reference.
   * @see #getMetaDataElement()
   * @generated
   */
  void setMetaDataElement(MetaData value);

  /**
   * Returns the value of the '<em><b>Meta Data BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta Data BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta Data BDS Internal Serialization Element</em>' containment reference.
   * @see #setMetaDataBDSInternalSerializationElement(MetaData)
   * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage#getDocumentRoot_MetaDataBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='MetaData' namespace='##targetNamespace'"
   * @generated
   */
  MetaData getMetaDataBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.example.comtibcobomasynchcall.DocumentRoot#getMetaDataBDSInternalSerializationElement <em>Meta Data BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Meta Data BDS Internal Serialization Element</em>' containment reference.
   * @see #getMetaDataBDSInternalSerializationElement()
   * @generated
   */
  void setMetaDataBDSInternalSerializationElement(MetaData value);

} // DocumentRoot
