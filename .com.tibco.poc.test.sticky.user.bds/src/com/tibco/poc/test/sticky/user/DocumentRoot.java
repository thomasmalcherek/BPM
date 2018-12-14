package com.tibco.poc.test.sticky.user;

import com.tibco.poc.test.sticky.user.bdsutil.BDSFeatureMap;

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
 *   <li>{@link com.tibco.poc.test.sticky.user.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.DocumentRoot#getPocDBRequestElement <em>Poc DB Request Element</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.DocumentRoot#getPocMetaDataElement <em>Poc Meta Data Element</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.DocumentRoot#getPocDBRequestBDSInternalSerializationElement <em>Poc DB Request BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.DocumentRoot#getPocMetaDataBDSInternalSerializationElement <em>Poc Meta Data BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.poc.test.sticky.user.UserPackage#getDocumentRoot()
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
   * @see com.tibco.poc.test.sticky.user.UserPackage#getDocumentRoot_Mixed()
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
   * @see com.tibco.poc.test.sticky.user.UserPackage#getDocumentRoot_XMLNSPrefixMap()
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
   * @see com.tibco.poc.test.sticky.user.UserPackage#getDocumentRoot_XSISchemaLocation()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
   * @generated
   */
  EMap<String, String> getXSISchemaLocation();

  /**
   * Returns the value of the '<em><b>Poc DB Request Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Poc DB Request Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Poc DB Request Element</em>' containment reference.
   * @see #setPocDBRequestElement(pocDBRequest)
   * @see com.tibco.poc.test.sticky.user.UserPackage#getDocumentRoot_PocDBRequestElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='pocDBRequestElement' namespace='##targetNamespace'"
   * @generated
   */
  pocDBRequest getPocDBRequestElement();

  /**
   * Sets the value of the '{@link com.tibco.poc.test.sticky.user.DocumentRoot#getPocDBRequestElement <em>Poc DB Request Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Poc DB Request Element</em>' containment reference.
   * @see #getPocDBRequestElement()
   * @generated
   */
  void setPocDBRequestElement(pocDBRequest value);

  /**
   * Returns the value of the '<em><b>Poc Meta Data Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Poc Meta Data Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Poc Meta Data Element</em>' containment reference.
   * @see #setPocMetaDataElement(pocMetaData)
   * @see com.tibco.poc.test.sticky.user.UserPackage#getDocumentRoot_PocMetaDataElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='pocMetaDataElement' namespace='##targetNamespace'"
   * @generated
   */
  pocMetaData getPocMetaDataElement();

  /**
   * Sets the value of the '{@link com.tibco.poc.test.sticky.user.DocumentRoot#getPocMetaDataElement <em>Poc Meta Data Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Poc Meta Data Element</em>' containment reference.
   * @see #getPocMetaDataElement()
   * @generated
   */
  void setPocMetaDataElement(pocMetaData value);

  /**
   * Returns the value of the '<em><b>Poc DB Request BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Poc DB Request BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Poc DB Request BDS Internal Serialization Element</em>' containment reference.
   * @see #setPocDBRequestBDSInternalSerializationElement(pocDBRequest)
   * @see com.tibco.poc.test.sticky.user.UserPackage#getDocumentRoot_PocDBRequestBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='pocDBRequest' namespace='##targetNamespace'"
   * @generated
   */
  pocDBRequest getPocDBRequestBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.tibco.poc.test.sticky.user.DocumentRoot#getPocDBRequestBDSInternalSerializationElement <em>Poc DB Request BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Poc DB Request BDS Internal Serialization Element</em>' containment reference.
   * @see #getPocDBRequestBDSInternalSerializationElement()
   * @generated
   */
  void setPocDBRequestBDSInternalSerializationElement(pocDBRequest value);

  /**
   * Returns the value of the '<em><b>Poc Meta Data BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Poc Meta Data BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Poc Meta Data BDS Internal Serialization Element</em>' containment reference.
   * @see #setPocMetaDataBDSInternalSerializationElement(pocMetaData)
   * @see com.tibco.poc.test.sticky.user.UserPackage#getDocumentRoot_PocMetaDataBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='pocMetaData' namespace='##targetNamespace'"
   * @generated
   */
  pocMetaData getPocMetaDataBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.tibco.poc.test.sticky.user.DocumentRoot#getPocMetaDataBDSInternalSerializationElement <em>Poc Meta Data BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Poc Meta Data BDS Internal Serialization Element</em>' containment reference.
   * @see #getPocMetaDataBDSInternalSerializationElement()
   * @generated
   */
  void setPocMetaDataBDSInternalSerializationElement(pocMetaData value);

} // DocumentRoot
