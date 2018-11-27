package com.tibco.bwse.simpleaddresslookup;

import com.tibco.bwse.simpleaddresslookup.bdsutil.BDSFeatureMap;

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
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getFault <em>Fault</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getInput <em>Input</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getOutput <em>Output</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getInputTypeBDSInternalSerializationElement <em>Input Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getOutputTypeBDSInternalSerializationElement <em>Output Type BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage#getDocumentRoot()
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
   * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage#getDocumentRoot_Mixed()
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
   * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage#getDocumentRoot_XMLNSPrefixMap()
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
   * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage#getDocumentRoot_XSISchemaLocation()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
   * @generated
   */
  EMap<String, String> getXSISchemaLocation();

  /**
   * Returns the value of the '<em><b>Fault</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fault</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fault</em>' attribute.
   * @see #setFault(String)
   * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage#getDocumentRoot_Fault()
   * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Fault' namespace='##targetNamespace'"
   * @generated
   */
  String getFault();

  /**
   * Sets the value of the '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getFault <em>Fault</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fault</em>' attribute.
   * @see #getFault()
   * @generated
   */
  void setFault(String value);

  /**
   * Returns the value of the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input</em>' containment reference.
   * @see #setInput(InputType)
   * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage#getDocumentRoot_Input()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Input' namespace='##targetNamespace'"
   * @generated
   */
  InputType getInput();

  /**
   * Sets the value of the '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getInput <em>Input</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input</em>' containment reference.
   * @see #getInput()
   * @generated
   */
  void setInput(InputType value);

  /**
   * Returns the value of the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output</em>' containment reference.
   * @see #setOutput(OutputType)
   * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage#getDocumentRoot_Output()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Output' namespace='##targetNamespace'"
   * @generated
   */
  OutputType getOutput();

  /**
   * Sets the value of the '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getOutput <em>Output</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output</em>' containment reference.
   * @see #getOutput()
   * @generated
   */
  void setOutput(OutputType value);

  /**
   * Returns the value of the '<em><b>Input Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Type BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Type BDS Internal Serialization Element</em>' containment reference.
   * @see #setInputTypeBDSInternalSerializationElement(InputType)
   * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage#getDocumentRoot_InputTypeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Input_._type' namespace='##targetNamespace'"
   * @generated
   */
  InputType getInputTypeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getInputTypeBDSInternalSerializationElement <em>Input Type BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Type BDS Internal Serialization Element</em>' containment reference.
   * @see #getInputTypeBDSInternalSerializationElement()
   * @generated
   */
  void setInputTypeBDSInternalSerializationElement(InputType value);

  /**
   * Returns the value of the '<em><b>Output Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Type BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Type BDS Internal Serialization Element</em>' containment reference.
   * @see #setOutputTypeBDSInternalSerializationElement(OutputType)
   * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage#getDocumentRoot_OutputTypeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='Output_._type' namespace='##targetNamespace'"
   * @generated
   */
  OutputType getOutputTypeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getOutputTypeBDSInternalSerializationElement <em>Output Type BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Type BDS Internal Serialization Element</em>' containment reference.
   * @see #getOutputTypeBDSInternalSerializationElement()
   * @generated
   */
  void setOutputTypeBDSInternalSerializationElement(OutputType value);

} // DocumentRoot
