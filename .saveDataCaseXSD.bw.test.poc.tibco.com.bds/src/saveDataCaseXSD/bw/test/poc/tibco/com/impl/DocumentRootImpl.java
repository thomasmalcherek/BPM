
package saveDataCaseXSD.bw.test.poc.tibco.com.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage;
import saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType;
import saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType;
import saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType;
import saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseType;
import saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot;
import saveDataCaseXSD.bw.test.poc.tibco.com.GetDataRequestFromCaseIDType;
import saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType;
import saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType;
import saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType;
import saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponsesType;

import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSFeatureMap;
import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSFeatureMapImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getCreateCaseIDRequest <em>Create Case ID Request</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getCreateCaseIDRequestFromBPM <em>Create Case ID Request From BPM</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getCreateCaseIDResponse <em>Create Case ID Response</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getCreateCaseIDResponseFromBPM <em>Create Case ID Response From BPM</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getGetDataRequestFromCaseID <em>Get Data Request From Case ID</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getGetDataWFCaseIDResponse <em>Get Data WF Case ID Response</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getSearchDataRequest <em>Search Data Request</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getSearchDataResponses <em>Search Data Responses</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement <em>Create Case ID Request From BPM Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getCreateCaseIDRequestTypeBDSInternalSerializationElement <em>Create Case ID Request Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement <em>Create Case ID Response From BPM Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getCreateCaseIDResponseTypeBDSInternalSerializationElement <em>Create Case ID Response Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getGetDataRequestFromCaseIDTypeBDSInternalSerializationElement <em>Get Data Request From Case ID Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getGetDataWFCaseIDResponseTypeBDSInternalSerializationElement <em>Get Data WF Case ID Response Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getSearchDataRequestTypeBDSInternalSerializationElement <em>Search Data Request Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getSearchDataResponsesTypeBDSInternalSerializationElement <em>Search Data Responses Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl#getSearchDataResponseTypeBDSInternalSerializationElement <em>Search Data Response Type BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot
{
  /**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
  protected BDSFeatureMap mixed;

  /**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xMLNSPrefixMap;

  /**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xSISchemaLocation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ComPackage.Literals.DOCUMENT_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDSFeatureMap getMixed()
  {
    if (mixed == null)
    {
      mixed = new BDSFeatureMapImpl(new BasicFeatureMap(this, ComPackage.DOCUMENT_ROOT__MIXED));
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXMLNSPrefixMap()
  {
    if (xMLNSPrefixMap == null)
    {
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ComPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXSISchemaLocation()
  {
    if (xSISchemaLocation == null)
    {
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ComPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateCaseIDRequestType getCreateCaseIDRequest()
  {
    return (CreateCaseIDRequestType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateCaseIDRequest(CreateCaseIDRequestType newCreateCaseIDRequest, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST, newCreateCaseIDRequest, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateCaseIDRequest(CreateCaseIDRequestType newCreateCaseIDRequest)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST, newCreateCaseIDRequest);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateCaseIDRequestFromBPMType getCreateCaseIDRequestFromBPM()
  {
    return (CreateCaseIDRequestFromBPMType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateCaseIDRequestFromBPM(CreateCaseIDRequestFromBPMType newCreateCaseIDRequestFromBPM, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM, newCreateCaseIDRequestFromBPM, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateCaseIDRequestFromBPM(CreateCaseIDRequestFromBPMType newCreateCaseIDRequestFromBPM)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM, newCreateCaseIDRequestFromBPM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateCaseIDResponseType getCreateCaseIDResponse()
  {
    return (CreateCaseIDResponseType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateCaseIDResponse(CreateCaseIDResponseType newCreateCaseIDResponse, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE, newCreateCaseIDResponse, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateCaseIDResponse(CreateCaseIDResponseType newCreateCaseIDResponse)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE, newCreateCaseIDResponse);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateCaseIDResponseFromBPMType getCreateCaseIDResponseFromBPM()
  {
    return (CreateCaseIDResponseFromBPMType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateCaseIDResponseFromBPM(CreateCaseIDResponseFromBPMType newCreateCaseIDResponseFromBPM, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM, newCreateCaseIDResponseFromBPM, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateCaseIDResponseFromBPM(CreateCaseIDResponseFromBPMType newCreateCaseIDResponseFromBPM)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM, newCreateCaseIDResponseFromBPM);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetDataRequestFromCaseIDType getGetDataRequestFromCaseID()
  {
    return (GetDataRequestFromCaseIDType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetDataRequestFromCaseID(GetDataRequestFromCaseIDType newGetDataRequestFromCaseID, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID, newGetDataRequestFromCaseID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetDataRequestFromCaseID(GetDataRequestFromCaseIDType newGetDataRequestFromCaseID)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID, newGetDataRequestFromCaseID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetDataWFCaseIDResponseType getGetDataWFCaseIDResponse()
  {
    return (GetDataWFCaseIDResponseType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetDataWFCaseIDResponse(GetDataWFCaseIDResponseType newGetDataWFCaseIDResponse, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE, newGetDataWFCaseIDResponse, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetDataWFCaseIDResponse(GetDataWFCaseIDResponseType newGetDataWFCaseIDResponse)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE, newGetDataWFCaseIDResponse);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchDataRequestType getSearchDataRequest()
  {
    return (SearchDataRequestType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_REQUEST, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchDataRequest(SearchDataRequestType newSearchDataRequest, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_REQUEST, newSearchDataRequest, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchDataRequest(SearchDataRequestType newSearchDataRequest)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_REQUEST, newSearchDataRequest);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchDataResponsesType getSearchDataResponses()
  {
    return (SearchDataResponsesType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchDataResponses(SearchDataResponsesType newSearchDataResponses, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES, newSearchDataResponses, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchDataResponses(SearchDataResponsesType newSearchDataResponses)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES, newSearchDataResponses);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateCaseIDRequestFromBPMType getCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement()
  {
    return (CreateCaseIDRequestFromBPMType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement(CreateCaseIDRequestFromBPMType newCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement(CreateCaseIDRequestFromBPMType newCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateCaseIDRequestType getCreateCaseIDRequestTypeBDSInternalSerializationElement()
  {
    return (CreateCaseIDRequestType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateCaseIDRequestTypeBDSInternalSerializationElement(CreateCaseIDRequestType newCreateCaseIDRequestTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateCaseIDRequestTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateCaseIDRequestTypeBDSInternalSerializationElement(CreateCaseIDRequestType newCreateCaseIDRequestTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateCaseIDRequestTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateCaseIDResponseFromBPMType getCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement()
  {
    return (CreateCaseIDResponseFromBPMType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement(CreateCaseIDResponseFromBPMType newCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement(CreateCaseIDResponseFromBPMType newCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateCaseIDResponseType getCreateCaseIDResponseTypeBDSInternalSerializationElement()
  {
    return (CreateCaseIDResponseType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCreateCaseIDResponseTypeBDSInternalSerializationElement(CreateCaseIDResponseType newCreateCaseIDResponseTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateCaseIDResponseTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCreateCaseIDResponseTypeBDSInternalSerializationElement(CreateCaseIDResponseType newCreateCaseIDResponseTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newCreateCaseIDResponseTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetDataRequestFromCaseIDType getGetDataRequestFromCaseIDTypeBDSInternalSerializationElement()
  {
    return (GetDataRequestFromCaseIDType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetDataRequestFromCaseIDTypeBDSInternalSerializationElement(GetDataRequestFromCaseIDType newGetDataRequestFromCaseIDTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newGetDataRequestFromCaseIDTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetDataRequestFromCaseIDTypeBDSInternalSerializationElement(GetDataRequestFromCaseIDType newGetDataRequestFromCaseIDTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newGetDataRequestFromCaseIDTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetDataWFCaseIDResponseType getGetDataWFCaseIDResponseTypeBDSInternalSerializationElement()
  {
    return (GetDataWFCaseIDResponseType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGetDataWFCaseIDResponseTypeBDSInternalSerializationElement(GetDataWFCaseIDResponseType newGetDataWFCaseIDResponseTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newGetDataWFCaseIDResponseTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetDataWFCaseIDResponseTypeBDSInternalSerializationElement(GetDataWFCaseIDResponseType newGetDataWFCaseIDResponseTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newGetDataWFCaseIDResponseTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchDataRequestType getSearchDataRequestTypeBDSInternalSerializationElement()
  {
    return (SearchDataRequestType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchDataRequestTypeBDSInternalSerializationElement(SearchDataRequestType newSearchDataRequestTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchDataRequestTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchDataRequestTypeBDSInternalSerializationElement(SearchDataRequestType newSearchDataRequestTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchDataRequestTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchDataResponsesType getSearchDataResponsesTypeBDSInternalSerializationElement()
  {
    return (SearchDataResponsesType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchDataResponsesTypeBDSInternalSerializationElement(SearchDataResponsesType newSearchDataResponsesTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchDataResponsesTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchDataResponsesTypeBDSInternalSerializationElement(SearchDataResponsesType newSearchDataResponsesTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchDataResponsesTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchDataResponseType getSearchDataResponseTypeBDSInternalSerializationElement()
  {
    return (SearchDataResponseType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSearchDataResponseTypeBDSInternalSerializationElement(SearchDataResponseType newSearchDataResponseTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchDataResponseTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSearchDataResponseTypeBDSInternalSerializationElement(SearchDataResponseType newSearchDataResponseTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComPackage.Literals.DOCUMENT_ROOT__SEARCH_DATA_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newSearchDataResponseTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ComPackage.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicRemove(otherEnd, msgs);
      case ComPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case ComPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST:
        return basicSetCreateCaseIDRequest(null, msgs);
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM:
        return basicSetCreateCaseIDRequestFromBPM(null, msgs);
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE:
        return basicSetCreateCaseIDResponse(null, msgs);
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM:
        return basicSetCreateCaseIDResponseFromBPM(null, msgs);
      case ComPackage.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID:
        return basicSetGetDataRequestFromCaseID(null, msgs);
      case ComPackage.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE:
        return basicSetGetDataWFCaseIDResponse(null, msgs);
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_REQUEST:
        return basicSetSearchDataRequest(null, msgs);
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES:
        return basicSetSearchDataResponses(null, msgs);
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement(null, msgs);
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetCreateCaseIDRequestTypeBDSInternalSerializationElement(null, msgs);
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement(null, msgs);
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetCreateCaseIDResponseTypeBDSInternalSerializationElement(null, msgs);
      case ComPackage.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetGetDataRequestFromCaseIDTypeBDSInternalSerializationElement(null, msgs);
      case ComPackage.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetGetDataWFCaseIDResponseTypeBDSInternalSerializationElement(null, msgs);
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetSearchDataRequestTypeBDSInternalSerializationElement(null, msgs);
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetSearchDataResponsesTypeBDSInternalSerializationElement(null, msgs);
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetSearchDataResponseTypeBDSInternalSerializationElement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ComPackage.DOCUMENT_ROOT__MIXED:
        if (coreType) return ((FeatureMap.Internal.Wrapper)getMixed()).featureMap();
        return getMixed();
      case ComPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case ComPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST:
        return getCreateCaseIDRequest();
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM:
        return getCreateCaseIDRequestFromBPM();
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE:
        return getCreateCaseIDResponse();
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM:
        return getCreateCaseIDResponseFromBPM();
      case ComPackage.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID:
        return getGetDataRequestFromCaseID();
      case ComPackage.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE:
        return getGetDataWFCaseIDResponse();
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_REQUEST:
        return getSearchDataRequest();
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES:
        return getSearchDataResponses();
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement();
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateCaseIDRequestTypeBDSInternalSerializationElement();
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement();
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateCaseIDResponseTypeBDSInternalSerializationElement();
      case ComPackage.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getGetDataRequestFromCaseIDTypeBDSInternalSerializationElement();
      case ComPackage.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getGetDataWFCaseIDResponseTypeBDSInternalSerializationElement();
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchDataRequestTypeBDSInternalSerializationElement();
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchDataResponsesTypeBDSInternalSerializationElement();
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchDataResponseTypeBDSInternalSerializationElement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ComPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST:
        setCreateCaseIDRequest((CreateCaseIDRequestType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM:
        setCreateCaseIDRequestFromBPM((CreateCaseIDRequestFromBPMType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE:
        setCreateCaseIDResponse((CreateCaseIDResponseType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM:
        setCreateCaseIDResponseFromBPM((CreateCaseIDResponseFromBPMType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID:
        setGetDataRequestFromCaseID((GetDataRequestFromCaseIDType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE:
        setGetDataWFCaseIDResponse((GetDataWFCaseIDResponseType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_REQUEST:
        setSearchDataRequest((SearchDataRequestType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES:
        setSearchDataResponses((SearchDataResponsesType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement((CreateCaseIDRequestFromBPMType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateCaseIDRequestTypeBDSInternalSerializationElement((CreateCaseIDRequestType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement((CreateCaseIDResponseFromBPMType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateCaseIDResponseTypeBDSInternalSerializationElement((CreateCaseIDResponseType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setGetDataRequestFromCaseIDTypeBDSInternalSerializationElement((GetDataRequestFromCaseIDType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setGetDataWFCaseIDResponseTypeBDSInternalSerializationElement((GetDataWFCaseIDResponseType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchDataRequestTypeBDSInternalSerializationElement((SearchDataRequestType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchDataResponsesTypeBDSInternalSerializationElement((SearchDataResponsesType)newValue);
        return;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchDataResponseTypeBDSInternalSerializationElement((SearchDataResponseType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ComPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal.Wrapper)getMixed()).featureMap().clear();
        return;
      case ComPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case ComPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST:
        setCreateCaseIDRequest((CreateCaseIDRequestType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM:
        setCreateCaseIDRequestFromBPM((CreateCaseIDRequestFromBPMType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE:
        setCreateCaseIDResponse((CreateCaseIDResponseType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM:
        setCreateCaseIDResponseFromBPM((CreateCaseIDResponseFromBPMType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID:
        setGetDataRequestFromCaseID((GetDataRequestFromCaseIDType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE:
        setGetDataWFCaseIDResponse((GetDataWFCaseIDResponseType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_REQUEST:
        setSearchDataRequest((SearchDataRequestType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES:
        setSearchDataResponses((SearchDataResponsesType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement((CreateCaseIDRequestFromBPMType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateCaseIDRequestTypeBDSInternalSerializationElement((CreateCaseIDRequestType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement((CreateCaseIDResponseFromBPMType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setCreateCaseIDResponseTypeBDSInternalSerializationElement((CreateCaseIDResponseType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setGetDataRequestFromCaseIDTypeBDSInternalSerializationElement((GetDataRequestFromCaseIDType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setGetDataWFCaseIDResponseTypeBDSInternalSerializationElement((GetDataWFCaseIDResponseType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchDataRequestTypeBDSInternalSerializationElement((SearchDataRequestType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchDataResponsesTypeBDSInternalSerializationElement((SearchDataResponsesType)null);
        return;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setSearchDataResponseTypeBDSInternalSerializationElement((SearchDataResponseType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ComPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.featureMap().isEmpty();
      case ComPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case ComPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST:
        return getCreateCaseIDRequest() != null;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM:
        return getCreateCaseIDRequestFromBPM() != null;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE:
        return getCreateCaseIDResponse() != null;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM:
        return getCreateCaseIDResponseFromBPM() != null;
      case ComPackage.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID:
        return getGetDataRequestFromCaseID() != null;
      case ComPackage.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE:
        return getGetDataWFCaseIDResponse() != null;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_REQUEST:
        return getSearchDataRequest() != null;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES:
        return getSearchDataResponses() != null;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement() != null;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateCaseIDRequestTypeBDSInternalSerializationElement() != null;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement() != null;
      case ComPackage.DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getCreateCaseIDResponseTypeBDSInternalSerializationElement() != null;
      case ComPackage.DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getGetDataRequestFromCaseIDTypeBDSInternalSerializationElement() != null;
      case ComPackage.DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getGetDataWFCaseIDResponseTypeBDSInternalSerializationElement() != null;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchDataRequestTypeBDSInternalSerializationElement() != null;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchDataResponsesTypeBDSInternalSerializationElement() != null;
      case ComPackage.DOCUMENT_ROOT__SEARCH_DATA_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getSearchDataResponseTypeBDSInternalSerializationElement() != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl
