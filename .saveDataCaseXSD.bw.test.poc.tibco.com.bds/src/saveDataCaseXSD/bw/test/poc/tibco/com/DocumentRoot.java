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
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataWFCaseIDResponse <em>Get Data WF Case ID Response</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataRequest <em>Search Data Request</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataResponses <em>Search Data Responses</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement <em>Create Case ID Request From BPM Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestTypeBDSInternalSerializationElement <em>Create Case ID Request Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement <em>Create Case ID Response From BPM Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseTypeBDSInternalSerializationElement <em>Create Case ID Response Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataRequestFromCaseIDTypeBDSInternalSerializationElement <em>Get Data Request From Case ID Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataWFCaseIDResponseTypeBDSInternalSerializationElement <em>Get Data WF Case ID Response Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataRequestTypeBDSInternalSerializationElement <em>Search Data Request Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataResponsesTypeBDSInternalSerializationElement <em>Search Data Responses Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataResponseTypeBDSInternalSerializationElement <em>Search Data Response Type BDS Internal Serialization Element</em>}</li>
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
   * Returns the value of the '<em><b>Get Data WF Case ID Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Data WF Case ID Response</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Data WF Case ID Response</em>' containment reference.
   * @see #setGetDataWFCaseIDResponse(GetDataWFCaseIDResponseType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_GetDataWFCaseIDResponse()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='GetDataWFCaseIDResponse' namespace='##targetNamespace'"
   * @generated
   */
  GetDataWFCaseIDResponseType getGetDataWFCaseIDResponse();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataWFCaseIDResponse <em>Get Data WF Case ID Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get Data WF Case ID Response</em>' containment reference.
   * @see #getGetDataWFCaseIDResponse()
   * @generated
   */
  void setGetDataWFCaseIDResponse(GetDataWFCaseIDResponseType value);

  /**
   * Returns the value of the '<em><b>Search Data Request</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Search Data Request</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Search Data Request</em>' containment reference.
   * @see #setSearchDataRequest(SearchDataRequestType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_SearchDataRequest()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='SearchDataRequest' namespace='##targetNamespace'"
   * @generated
   */
  SearchDataRequestType getSearchDataRequest();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataRequest <em>Search Data Request</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Search Data Request</em>' containment reference.
   * @see #getSearchDataRequest()
   * @generated
   */
  void setSearchDataRequest(SearchDataRequestType value);

  /**
   * Returns the value of the '<em><b>Search Data Responses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Search Data Responses</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Search Data Responses</em>' containment reference.
   * @see #setSearchDataResponses(SearchDataResponsesType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_SearchDataResponses()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='SearchDataResponses' namespace='##targetNamespace'"
   * @generated
   */
  SearchDataResponsesType getSearchDataResponses();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataResponses <em>Search Data Responses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Search Data Responses</em>' containment reference.
   * @see #getSearchDataResponses()
   * @generated
   */
  void setSearchDataResponses(SearchDataResponsesType value);

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
   * Returns the value of the '<em><b>Get Data WF Case ID Response Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Data WF Case ID Response Type BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Data WF Case ID Response Type BDS Internal Serialization Element</em>' containment reference.
   * @see #setGetDataWFCaseIDResponseTypeBDSInternalSerializationElement(GetDataWFCaseIDResponseType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_GetDataWFCaseIDResponseTypeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='GetDataWFCaseIDResponse_._type' namespace='##targetNamespace'"
   * @generated
   */
  GetDataWFCaseIDResponseType getGetDataWFCaseIDResponseTypeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataWFCaseIDResponseTypeBDSInternalSerializationElement <em>Get Data WF Case ID Response Type BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get Data WF Case ID Response Type BDS Internal Serialization Element</em>' containment reference.
   * @see #getGetDataWFCaseIDResponseTypeBDSInternalSerializationElement()
   * @generated
   */
  void setGetDataWFCaseIDResponseTypeBDSInternalSerializationElement(GetDataWFCaseIDResponseType value);

  /**
   * Returns the value of the '<em><b>Search Data Request Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Search Data Request Type BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Search Data Request Type BDS Internal Serialization Element</em>' containment reference.
   * @see #setSearchDataRequestTypeBDSInternalSerializationElement(SearchDataRequestType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_SearchDataRequestTypeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='SearchDataRequest_._type' namespace='##targetNamespace'"
   * @generated
   */
  SearchDataRequestType getSearchDataRequestTypeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataRequestTypeBDSInternalSerializationElement <em>Search Data Request Type BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Search Data Request Type BDS Internal Serialization Element</em>' containment reference.
   * @see #getSearchDataRequestTypeBDSInternalSerializationElement()
   * @generated
   */
  void setSearchDataRequestTypeBDSInternalSerializationElement(SearchDataRequestType value);

  /**
   * Returns the value of the '<em><b>Search Data Responses Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Search Data Responses Type BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Search Data Responses Type BDS Internal Serialization Element</em>' containment reference.
   * @see #setSearchDataResponsesTypeBDSInternalSerializationElement(SearchDataResponsesType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_SearchDataResponsesTypeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='SearchDataResponses_._type' namespace='##targetNamespace'"
   * @generated
   */
  SearchDataResponsesType getSearchDataResponsesTypeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataResponsesTypeBDSInternalSerializationElement <em>Search Data Responses Type BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Search Data Responses Type BDS Internal Serialization Element</em>' containment reference.
   * @see #getSearchDataResponsesTypeBDSInternalSerializationElement()
   * @generated
   */
  void setSearchDataResponsesTypeBDSInternalSerializationElement(SearchDataResponsesType value);

  /**
   * Returns the value of the '<em><b>Search Data Response Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Search Data Response Type BDS Internal Serialization Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Search Data Response Type BDS Internal Serialization Element</em>' containment reference.
   * @see #setSearchDataResponseTypeBDSInternalSerializationElement(SearchDataResponseType)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getDocumentRoot_SearchDataResponseTypeBDSInternalSerializationElement()
   * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='SearchDataResponse_._type' namespace='##targetNamespace'"
   * @generated
   */
  SearchDataResponseType getSearchDataResponseTypeBDSInternalSerializationElement();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataResponseTypeBDSInternalSerializationElement <em>Search Data Response Type BDS Internal Serialization Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Search Data Response Type BDS Internal Serialization Element</em>' containment reference.
   * @see #getSearchDataResponseTypeBDSInternalSerializationElement()
   * @generated
   */
  void setSearchDataResponseTypeBDSInternalSerializationElement(SearchDataResponseType value);

} // DocumentRoot
