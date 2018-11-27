package saveDataCaseXSD.bw.test.poc.tibco.com;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSFeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequest <em>Create Case ID Request</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestFromBPM <em>Create Case ID Request From BPM</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponse <em>Create Case ID Response</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseFromBPM <em>Create Case ID Response From BPM</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataRequestFromCaseID <em>Get Data Request From Case ID</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataResponseFromCaseID <em>Get Data Response From Case ID</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement <em>Create Case ID Request From BPM Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestTypeBDSInternalSerializationElement <em>Create Case ID Request Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement <em>Create Case ID Response From BPM Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseTypeBDSInternalSerializationElement <em>Create Case ID Response Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataRequestFromCaseIDTypeBDSInternalSerializationElement <em>Get Data Request From Case ID Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataResponseFromCaseIDTypeBDSInternalSerializationElement <em>Get Data Response From Case ID Type BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot()
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
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_Mixed()
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
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_XMLNSPrefixMap()
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
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_XSISchemaLocation()
   * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
   *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
   * @generated
   */
  EMap<String, String> getXSISchemaLocation();

  /**
   * Returns the value of the '<em><b>Create Case ID Request</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Case ID Request</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Case ID Request</em>' containment reference.
   * @see #setCreateCaseIDRequest(CreateCaseIDRequestType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_CreateCaseIDRequest()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='CreateCaseIDRequest' namespace='##targetNamespace'"
   * @generated
   */
  CreateCaseIDRequestType getCreateCaseIDRequest();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequest <em>Create Case ID Request</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Case ID Request</em>' containment reference.
   * @see #getCreateCaseIDRequest()
   * @generated
   */
  void setCreateCaseIDRequest(CreateCaseIDRequestType value);

  /**
   * Returns the value of the '<em><b>Create Case ID Request From BPM</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Case ID Request From BPM</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Case ID Request From BPM</em>' containment reference.
   * @see #setCreateCaseIDRequestFromBPM(CreateCaseIDRequestFromBPMType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_CreateCaseIDRequestFromBPM()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='CreateCaseIDRequestFromBPM' namespace='##targetNamespace'"
   * @generated
   */
  CreateCaseIDRequestFromBPMType getCreateCaseIDRequestFromBPM();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestFromBPM <em>Create Case ID Request From BPM</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Case ID Request From BPM</em>' containment reference.
   * @see #getCreateCaseIDRequestFromBPM()
   * @generated
   */
  void setCreateCaseIDRequestFromBPM(CreateCaseIDRequestFromBPMType value);

  /**
   * Returns the value of the '<em><b>Create Case ID Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Case ID Response</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Case ID Response</em>' containment reference.
   * @see #setCreateCaseIDResponse(CreateCaseIDResponseType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_CreateCaseIDResponse()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='CreateCaseIDResponse' namespace='##targetNamespace'"
   * @generated
   */
  CreateCaseIDResponseType getCreateCaseIDResponse();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponse <em>Create Case ID Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Case ID Response</em>' containment reference.
   * @see #getCreateCaseIDResponse()
   * @generated
   */
  void setCreateCaseIDResponse(CreateCaseIDResponseType value);

  /**
   * Returns the value of the '<em><b>Create Case ID Response From BPM</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Case ID Response From BPM</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Case ID Response From BPM</em>' containment reference.
   * @see #setCreateCaseIDResponseFromBPM(CreateCaseIDResponseFromBPMType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_CreateCaseIDResponseFromBPM()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='CreateCaseIDResponseFromBPM' namespace='##targetNamespace'"
   * @generated
   */
  CreateCaseIDResponseFromBPMType getCreateCaseIDResponseFromBPM();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseFromBPM <em>Create Case ID Response From BPM</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Case ID Response From BPM</em>' containment reference.
   * @see #getCreateCaseIDResponseFromBPM()
   * @generated
   */
  void setCreateCaseIDResponseFromBPM(CreateCaseIDResponseFromBPMType value);

  /**
   * Returns the value of the '<em><b>Get Data Request From Case ID</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Data Request From Case ID</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Data Request From Case ID</em>' containment reference.
   * @see #setGetDataRequestFromCaseID(GetDataRequestFromCaseIDType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_GetDataRequestFromCaseID()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='GetDataRequestFromCaseID' namespace='##targetNamespace'"
   * @generated
   */
  GetDataRequestFromCaseIDType getGetDataRequestFromCaseID();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataRequestFromCaseID <em>Get Data Request From Case ID</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get Data Request From Case ID</em>' containment reference.
   * @see #getGetDataRequestFromCaseID()
   * @generated
   */
  void setGetDataRequestFromCaseID(GetDataRequestFromCaseIDType value);

  /**
   * Returns the value of the '<em><b>Get Data Response From Case ID</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Data Response From Case ID</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Data Response From Case ID</em>' containment reference.
   * @see #setGetDataResponseFromCaseID(GetDataResponseFromCaseIDType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_GetDataResponseFromCaseID()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='GetDataResponseFromCaseID' namespace='##targetNamespace'"
   * @generated
   */
  GetDataResponseFromCaseIDType getGetDataResponseFromCaseID();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataResponseFromCaseID <em>Get Data Response From Case ID</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get Data Response From Case ID</em>' containment reference.
   * @see #getGetDataResponseFromCaseID()
   * @generated
   */
  void setGetDataResponseFromCaseID(GetDataResponseFromCaseIDType value);

  /**
   * Returns the value of the '<em><b>Create Case ID Request From BPM Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Case ID Request From BPM Type BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Case ID Request From BPM Type BDS Internal Serialization Element</em>' containment reference.
   * @see #setCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement(CreateCaseIDRequestFromBPMType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_CreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='CreateCaseIDRequestFromBPM_._type' namespace='##targetNamespace'"
   * @generated
   */
  CreateCaseIDRequestFromBPMType getCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement <em>Create Case ID Request From BPM Type BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Case ID Request From BPM Type BDS Internal Serialization Element</em>' containment reference.
   * @see #getCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement()
   * @generated
   */
  void setCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement(CreateCaseIDRequestFromBPMType value);

  /**
   * Returns the value of the '<em><b>Create Case ID Request Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Case ID Request Type BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Case ID Request Type BDS Internal Serialization Element</em>' containment reference.
   * @see #setCreateCaseIDRequestTypeBDSInternalSerializationElement(CreateCaseIDRequestType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_CreateCaseIDRequestTypeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='CreateCaseIDRequest_._type' namespace='##targetNamespace'"
   * @generated
   */
  CreateCaseIDRequestType getCreateCaseIDRequestTypeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestTypeBDSInternalSerializationElement <em>Create Case ID Request Type BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Case ID Request Type BDS Internal Serialization Element</em>' containment reference.
   * @see #getCreateCaseIDRequestTypeBDSInternalSerializationElement()
   * @generated
   */
  void setCreateCaseIDRequestTypeBDSInternalSerializationElement(CreateCaseIDRequestType value);

  /**
   * Returns the value of the '<em><b>Create Case ID Response From BPM Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Case ID Response From BPM Type BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Case ID Response From BPM Type BDS Internal Serialization Element</em>' containment reference.
   * @see #setCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement(CreateCaseIDResponseFromBPMType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_CreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='CreateCaseIDResponseFromBPM_._type' namespace='##targetNamespace'"
   * @generated
   */
  CreateCaseIDResponseFromBPMType getCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement <em>Create Case ID Response From BPM Type BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Case ID Response From BPM Type BDS Internal Serialization Element</em>' containment reference.
   * @see #getCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement()
   * @generated
   */
  void setCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement(CreateCaseIDResponseFromBPMType value);

  /**
   * Returns the value of the '<em><b>Create Case ID Response Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Case ID Response Type BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Create Case ID Response Type BDS Internal Serialization Element</em>' containment reference.
   * @see #setCreateCaseIDResponseTypeBDSInternalSerializationElement(CreateCaseIDResponseType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_CreateCaseIDResponseTypeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='CreateCaseIDResponse_._type' namespace='##targetNamespace'"
   * @generated
   */
  CreateCaseIDResponseType getCreateCaseIDResponseTypeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseTypeBDSInternalSerializationElement <em>Create Case ID Response Type BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Create Case ID Response Type BDS Internal Serialization Element</em>' containment reference.
   * @see #getCreateCaseIDResponseTypeBDSInternalSerializationElement()
   * @generated
   */
  void setCreateCaseIDResponseTypeBDSInternalSerializationElement(CreateCaseIDResponseType value);

  /**
   * Returns the value of the '<em><b>Get Data Request From Case ID Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Data Request From Case ID Type BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Data Request From Case ID Type BDS Internal Serialization Element</em>' containment reference.
   * @see #setGetDataRequestFromCaseIDTypeBDSInternalSerializationElement(GetDataRequestFromCaseIDType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_GetDataRequestFromCaseIDTypeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='GetDataRequestFromCaseID_._type' namespace='##targetNamespace'"
   * @generated
   */
  GetDataRequestFromCaseIDType getGetDataRequestFromCaseIDTypeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataRequestFromCaseIDTypeBDSInternalSerializationElement <em>Get Data Request From Case ID Type BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get Data Request From Case ID Type BDS Internal Serialization Element</em>' containment reference.
   * @see #getGetDataRequestFromCaseIDTypeBDSInternalSerializationElement()
   * @generated
   */
  void setGetDataRequestFromCaseIDTypeBDSInternalSerializationElement(GetDataRequestFromCaseIDType value);

  /**
   * Returns the value of the '<em><b>Get Data Response From Case ID Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Data Response From Case ID Type BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Data Response From Case ID Type BDS Internal Serialization Element</em>' containment reference.
   * @see #setGetDataResponseFromCaseIDTypeBDSInternalSerializationElement(GetDataResponseFromCaseIDType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_GetDataResponseFromCaseIDTypeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='GetDataResponseFromCaseID_._type' namespace='##targetNamespace'"
   * @generated
   */
  GetDataResponseFromCaseIDType getGetDataResponseFromCaseIDTypeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataResponseFromCaseIDTypeBDSInternalSerializationElement <em>Get Data Response From Case ID Type BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get Data Response From Case ID Type BDS Internal Serialization Element</em>' containment reference.
   * @see #getGetDataResponseFromCaseIDTypeBDSInternalSerializationElement()
   * @generated
   */
  void setGetDataResponseFromCaseIDTypeBDSInternalSerializationElement(GetDataResponseFromCaseIDType value);

} // DocumentRoot
