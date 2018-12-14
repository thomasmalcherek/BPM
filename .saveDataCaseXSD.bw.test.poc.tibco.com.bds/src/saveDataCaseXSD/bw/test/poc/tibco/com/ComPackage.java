
package saveDataCaseXSD.bw.test.poc.tibco.com;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSValidationUtils;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * BOMORIGIN::/com.igs.fak.001/Generated Business Objects/saveDataCaseXSD.bw.test.poc.tibco.com.bom
 * <!-- end-model-doc -->
 * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComFactory
 * @model kind="package"
 * @generated
 */
public interface ComPackage extends EPackage
{
  /**
  * Static Member variable that points to the BDS Validation Class
  * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
  * @generated
  */
  BDSValidationUtils bdsValidationUtils = BDSValidationUtils.init();

  /** 
    * Exposes bundle version number, or null if not instantiated via OSGi
    * @generated
    */
  public String getBundleVersion();
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "com";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://com.tibco.poc.test.bw.saveDataCaseXSD";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "com";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ComPackage eINSTANCE = saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl.init();

  /**
   * The meta object id for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestFromBPMTypeImpl <em>Create Case ID Request From BPM Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestFromBPMTypeImpl
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getCreateCaseIDRequestFromBPMType()
   * @generated
   */
  int CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE = 0;

  /**
   * The feature id for the '<em><b>Case ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__CASE_ID = 0;

  /**
   * The feature id for the '<em><b>AHV Nummer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__AHV_NUMMER = 1;

  /**
   * The feature id for the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__DOKUMENTEN_ART = 2;

  /**
   * The feature id for the '<em><b>Geschaeftsfall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__GESCHAEFTSFALL = 3;

  /**
   * The feature id for the '<em><b>Anzahl der Dokumente</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__ANZAHL_DER_DOKUMENTE = 4;

  /**
   * The number of structural features of the '<em>Create Case ID Request From BPM Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestTypeImpl <em>Create Case ID Request Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestTypeImpl
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getCreateCaseIDRequestType()
   * @generated
   */
  int CREATE_CASE_ID_REQUEST_TYPE = 1;

  /**
   * The feature id for the '<em><b>AHV Nummer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_TYPE__AHV_NUMMER = 0;

  /**
   * The feature id for the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_TYPE__DOKUMENTEN_ART = 1;

  /**
   * The feature id for the '<em><b>Geschaeftsfall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_TYPE__GESCHAEFTSFALL = 2;

  /**
   * The feature id for the '<em><b>Anzahl der Dokumente</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_TYPE__ANZAHL_DER_DOKUMENTE = 3;

  /**
   * The number of structural features of the '<em>Create Case ID Request Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDResponseFromBPMTypeImpl <em>Create Case ID Response From BPM Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDResponseFromBPMTypeImpl
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getCreateCaseIDResponseFromBPMType()
   * @generated
   */
  int CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE = 2;

  /**
   * The feature id for the '<em><b>Acknowledgement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE__ACKNOWLEDGEMENT = 0;

  /**
   * The number of structural features of the '<em>Create Case ID Response From BPM Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDResponseTypeImpl <em>Create Case ID Response Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDResponseTypeImpl
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getCreateCaseIDResponseType()
   * @generated
   */
  int CREATE_CASE_ID_RESPONSE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Case ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_RESPONSE_TYPE__CASE_ID = 0;

  /**
   * The number of structural features of the '<em>Create Case ID Response Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_RESPONSE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 4;

  /**
   * The feature id for the '<em><b>Mixed</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__MIXED = 0;

  /**
   * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

  /**
   * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

  /**
   * The feature id for the '<em><b>Create Case ID Request</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST = 3;

  /**
   * The feature id for the '<em><b>Create Case ID Request From BPM</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM = 4;

  /**
   * The feature id for the '<em><b>Create Case ID Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE = 5;

  /**
   * The feature id for the '<em><b>Create Case ID Response From BPM</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM = 6;

  /**
   * The feature id for the '<em><b>Get Data Request From Case ID</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID = 7;

  /**
   * The feature id for the '<em><b>Get Data WF Case ID Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE = 8;

  /**
   * The feature id for the '<em><b>Search Data Request</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEARCH_DATA_REQUEST = 9;

  /**
   * The feature id for the '<em><b>Search Data Responses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEARCH_DATA_RESPONSES = 10;

  /**
   * The feature id for the '<em><b>Create Case ID Request From BPM Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 11;

  /**
   * The feature id for the '<em><b>Create Case ID Request Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 12;

  /**
   * The feature id for the '<em><b>Create Case ID Response From BPM Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 13;

  /**
   * The feature id for the '<em><b>Create Case ID Response Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 14;

  /**
   * The feature id for the '<em><b>Get Data Request From Case ID Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 15;

  /**
   * The feature id for the '<em><b>Get Data WF Case ID Response Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 16;

  /**
   * The feature id for the '<em><b>Search Data Request Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEARCH_DATA_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 17;

  /**
   * The feature id for the '<em><b>Search Data Responses Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEARCH_DATA_RESPONSES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 18;

  /**
   * The feature id for the '<em><b>Search Data Response Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__SEARCH_DATA_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 19;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 20;

  /**
   * The meta object id for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataRequestFromCaseIDTypeImpl <em>Get Data Request From Case ID Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataRequestFromCaseIDTypeImpl
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getGetDataRequestFromCaseIDType()
   * @generated
   */
  int GET_DATA_REQUEST_FROM_CASE_ID_TYPE = 5;

  /**
   * The feature id for the '<em><b>Case ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_REQUEST_FROM_CASE_ID_TYPE__CASE_ID = 0;

  /**
   * The number of structural features of the '<em>Get Data Request From Case ID Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_REQUEST_FROM_CASE_ID_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataWFCaseIDResponseTypeImpl <em>Get Data WF Case ID Response Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataWFCaseIDResponseTypeImpl
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getGetDataWFCaseIDResponseType()
   * @generated
   */
  int GET_DATA_WF_CASE_ID_RESPONSE_TYPE = 6;

  /**
   * The feature id for the '<em><b>Case ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_WF_CASE_ID_RESPONSE_TYPE__CASE_ID = 0;

  /**
   * The feature id for the '<em><b>AHV Nummer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_WF_CASE_ID_RESPONSE_TYPE__AHV_NUMMER = 1;

  /**
   * The feature id for the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_WF_CASE_ID_RESPONSE_TYPE__DOKUMENTEN_ART = 2;

  /**
   * The feature id for the '<em><b>Geschaeftsfall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_WF_CASE_ID_RESPONSE_TYPE__GESCHAEFTSFALL = 3;

  /**
   * The feature id for the '<em><b>Anzahl der Dokumente</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_WF_CASE_ID_RESPONSE_TYPE__ANZAHL_DER_DOKUMENTE = 4;

  /**
   * The number of structural features of the '<em>Get Data WF Case ID Response Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_WF_CASE_ID_RESPONSE_TYPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataRequestTypeImpl <em>Search Data Request Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataRequestTypeImpl
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getSearchDataRequestType()
   * @generated
   */
  int SEARCH_DATA_REQUEST_TYPE = 7;

  /**
   * The feature id for the '<em><b>AHV Nummer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_REQUEST_TYPE__AHV_NUMMER = 0;

  /**
   * The feature id for the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_REQUEST_TYPE__DOKUMENTEN_ART = 1;

  /**
   * The feature id for the '<em><b>Geschaeftsfall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_REQUEST_TYPE__GESCHAEFTSFALL = 2;

  /**
   * The number of structural features of the '<em>Search Data Request Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_REQUEST_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataResponsesTypeImpl <em>Search Data Responses Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataResponsesTypeImpl
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getSearchDataResponsesType()
   * @generated
   */
  int SEARCH_DATA_RESPONSES_TYPE = 8;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_RESPONSES_TYPE__GROUP = 0;

  /**
   * The feature id for the '<em><b>Search Data Response</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_RESPONSES_TYPE__SEARCH_DATA_RESPONSE = 1;

  /**
   * The number of structural features of the '<em>Search Data Responses Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_RESPONSES_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataResponseTypeImpl <em>Search Data Response Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataResponseTypeImpl
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getSearchDataResponseType()
   * @generated
   */
  int SEARCH_DATA_RESPONSE_TYPE = 9;

  /**
   * The feature id for the '<em><b>Case ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_RESPONSE_TYPE__CASE_ID = 0;

  /**
   * The feature id for the '<em><b>AHV Nummer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_RESPONSE_TYPE__AHV_NUMMER = 1;

  /**
   * The feature id for the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_RESPONSE_TYPE__DOKUMENTEN_ART = 2;

  /**
   * The feature id for the '<em><b>Geschaeftsfall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_RESPONSE_TYPE__GESCHAEFTSFALL = 3;

  /**
   * The feature id for the '<em><b>Anzahl der Dokumente</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_RESPONSE_TYPE__ANZAHL_DER_DOKUMENTE = 4;

  /**
   * The number of structural features of the '<em>Search Data Response Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEARCH_DATA_RESPONSE_TYPE_FEATURE_COUNT = 5;


  /**
   * Returns the meta object for class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType <em>Create Case ID Request From BPM Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Case ID Request From BPM Type</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType
   * @generated
   */
  EClass getCreateCaseIDRequestFromBPMType();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getCaseID <em>Case ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Case ID</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getCaseID()
   * @see #getCreateCaseIDRequestFromBPMType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestFromBPMType_CaseID();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getAHVNummer <em>AHV Nummer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AHV Nummer</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getAHVNummer()
   * @see #getCreateCaseIDRequestFromBPMType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestFromBPMType_AHVNummer();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getDokumentenArt <em>Dokumenten Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dokumenten Art</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getDokumentenArt()
   * @see #getCreateCaseIDRequestFromBPMType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestFromBPMType_DokumentenArt();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getGeschaeftsfall <em>Geschaeftsfall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Geschaeftsfall</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getGeschaeftsfall()
   * @see #getCreateCaseIDRequestFromBPMType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestFromBPMType_Geschaeftsfall();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getAnzahl_der_Dokumente <em>Anzahl der Dokumente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Anzahl der Dokumente</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getAnzahl_der_Dokumente()
   * @see #getCreateCaseIDRequestFromBPMType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestFromBPMType_Anzahl_der_Dokumente();

  /**
   * Returns the meta object for class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType <em>Create Case ID Request Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Case ID Request Type</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType
   * @generated
   */
  EClass getCreateCaseIDRequestType();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getAHVNummer <em>AHV Nummer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AHV Nummer</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getAHVNummer()
   * @see #getCreateCaseIDRequestType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestType_AHVNummer();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getDokumentenArt <em>Dokumenten Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dokumenten Art</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getDokumentenArt()
   * @see #getCreateCaseIDRequestType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestType_DokumentenArt();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getGeschaeftsfall <em>Geschaeftsfall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Geschaeftsfall</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getGeschaeftsfall()
   * @see #getCreateCaseIDRequestType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestType_Geschaeftsfall();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getAnzahl_der_Dokumente <em>Anzahl der Dokumente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Anzahl der Dokumente</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getAnzahl_der_Dokumente()
   * @see #getCreateCaseIDRequestType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestType_Anzahl_der_Dokumente();

  /**
   * Returns the meta object for class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType <em>Create Case ID Response From BPM Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Case ID Response From BPM Type</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType
   * @generated
   */
  EClass getCreateCaseIDResponseFromBPMType();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType#getAcknowledgement <em>Acknowledgement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Acknowledgement</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType#getAcknowledgement()
   * @see #getCreateCaseIDResponseFromBPMType()
   * @generated
   */
  EAttribute getCreateCaseIDResponseFromBPMType_Acknowledgement();

  /**
   * Returns the meta object for class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseType <em>Create Case ID Response Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Create Case ID Response Type</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseType
   * @generated
   */
  EClass getCreateCaseIDResponseType();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseType#getCaseID <em>Case ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Case ID</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseType#getCaseID()
   * @see #getCreateCaseIDResponseType()
   * @generated
   */
  EAttribute getCreateCaseIDResponseType_CaseID();

  /**
   * Returns the meta object for class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequest <em>Create Case ID Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Case ID Request</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequest()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CreateCaseIDRequest();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestFromBPM <em>Create Case ID Request From BPM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Case ID Request From BPM</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestFromBPM()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CreateCaseIDRequestFromBPM();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponse <em>Create Case ID Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Case ID Response</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponse()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CreateCaseIDResponse();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseFromBPM <em>Create Case ID Response From BPM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Case ID Response From BPM</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseFromBPM()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CreateCaseIDResponseFromBPM();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataRequestFromCaseID <em>Get Data Request From Case ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Get Data Request From Case ID</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataRequestFromCaseID()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_GetDataRequestFromCaseID();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataWFCaseIDResponse <em>Get Data WF Case ID Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Get Data WF Case ID Response</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataWFCaseIDResponse()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_GetDataWFCaseIDResponse();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataRequest <em>Search Data Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Search Data Request</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataRequest()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SearchDataRequest();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataResponses <em>Search Data Responses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Search Data Responses</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataResponses()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SearchDataResponses();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement <em>Create Case ID Request From BPM Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Case ID Request From BPM Type BDS Internal Serialization Element</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestTypeBDSInternalSerializationElement <em>Create Case ID Request Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Case ID Request Type BDS Internal Serialization Element</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDRequestTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CreateCaseIDRequestTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement <em>Create Case ID Response From BPM Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Case ID Response From BPM Type BDS Internal Serialization Element</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseTypeBDSInternalSerializationElement <em>Create Case ID Response Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Create Case ID Response Type BDS Internal Serialization Element</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getCreateCaseIDResponseTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_CreateCaseIDResponseTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataRequestFromCaseIDTypeBDSInternalSerializationElement <em>Get Data Request From Case ID Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Get Data Request From Case ID Type BDS Internal Serialization Element</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataRequestFromCaseIDTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_GetDataRequestFromCaseIDTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataWFCaseIDResponseTypeBDSInternalSerializationElement <em>Get Data WF Case ID Response Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Get Data WF Case ID Response Type BDS Internal Serialization Element</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataWFCaseIDResponseTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_GetDataWFCaseIDResponseTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataRequestTypeBDSInternalSerializationElement <em>Search Data Request Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Search Data Request Type BDS Internal Serialization Element</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataRequestTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SearchDataRequestTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataResponsesTypeBDSInternalSerializationElement <em>Search Data Responses Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Search Data Responses Type BDS Internal Serialization Element</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataResponsesTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SearchDataResponsesTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataResponseTypeBDSInternalSerializationElement <em>Search Data Response Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Search Data Response Type BDS Internal Serialization Element</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getSearchDataResponseTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_SearchDataResponseTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataRequestFromCaseIDType <em>Get Data Request From Case ID Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Data Request From Case ID Type</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataRequestFromCaseIDType
   * @generated
   */
  EClass getGetDataRequestFromCaseIDType();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataRequestFromCaseIDType#getCaseID <em>Case ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Case ID</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataRequestFromCaseIDType#getCaseID()
   * @see #getGetDataRequestFromCaseIDType()
   * @generated
   */
  EAttribute getGetDataRequestFromCaseIDType_CaseID();

  /**
   * Returns the meta object for class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType <em>Get Data WF Case ID Response Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Data WF Case ID Response Type</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType
   * @generated
   */
  EClass getGetDataWFCaseIDResponseType();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType#getCaseID <em>Case ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Case ID</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType#getCaseID()
   * @see #getGetDataWFCaseIDResponseType()
   * @generated
   */
  EAttribute getGetDataWFCaseIDResponseType_CaseID();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType#getAHVNummer <em>AHV Nummer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AHV Nummer</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType#getAHVNummer()
   * @see #getGetDataWFCaseIDResponseType()
   * @generated
   */
  EAttribute getGetDataWFCaseIDResponseType_AHVNummer();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType#getDokumentenArt <em>Dokumenten Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dokumenten Art</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType#getDokumentenArt()
   * @see #getGetDataWFCaseIDResponseType()
   * @generated
   */
  EAttribute getGetDataWFCaseIDResponseType_DokumentenArt();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType#getGeschaeftsfall <em>Geschaeftsfall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Geschaeftsfall</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType#getGeschaeftsfall()
   * @see #getGetDataWFCaseIDResponseType()
   * @generated
   */
  EAttribute getGetDataWFCaseIDResponseType_Geschaeftsfall();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType#getAnzahl_der_Dokumente <em>Anzahl der Dokumente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Anzahl der Dokumente</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataWFCaseIDResponseType#getAnzahl_der_Dokumente()
   * @see #getGetDataWFCaseIDResponseType()
   * @generated
   */
  EAttribute getGetDataWFCaseIDResponseType_Anzahl_der_Dokumente();

  /**
   * Returns the meta object for class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType <em>Search Data Request Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Search Data Request Type</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType
   * @generated
   */
  EClass getSearchDataRequestType();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType#getAHVNummer <em>AHV Nummer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AHV Nummer</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType#getAHVNummer()
   * @see #getSearchDataRequestType()
   * @generated
   */
  EAttribute getSearchDataRequestType_AHVNummer();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType#getDokumentenArt <em>Dokumenten Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dokumenten Art</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType#getDokumentenArt()
   * @see #getSearchDataRequestType()
   * @generated
   */
  EAttribute getSearchDataRequestType_DokumentenArt();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType#getGeschaeftsfall <em>Geschaeftsfall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Geschaeftsfall</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType#getGeschaeftsfall()
   * @see #getSearchDataRequestType()
   * @generated
   */
  EAttribute getSearchDataRequestType_Geschaeftsfall();

  /**
   * Returns the meta object for class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponsesType <em>Search Data Responses Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Search Data Responses Type</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponsesType
   * @generated
   */
  EClass getSearchDataResponsesType();

  /**
   * Returns the meta object for the attribute list '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponsesType#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponsesType#getGroup()
   * @see #getSearchDataResponsesType()
   * @generated
   */
  EAttribute getSearchDataResponsesType_Group();

  /**
   * Returns the meta object for the containment reference list '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponsesType#getSearchDataResponse <em>Search Data Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Search Data Response</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponsesType#getSearchDataResponse()
   * @see #getSearchDataResponsesType()
   * @generated
   */
  EReference getSearchDataResponsesType_SearchDataResponse();

  /**
   * Returns the meta object for class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType <em>Search Data Response Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Search Data Response Type</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType
   * @generated
   */
  EClass getSearchDataResponseType();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType#getCaseID <em>Case ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Case ID</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType#getCaseID()
   * @see #getSearchDataResponseType()
   * @generated
   */
  EAttribute getSearchDataResponseType_CaseID();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType#getAHVNummer <em>AHV Nummer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AHV Nummer</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType#getAHVNummer()
   * @see #getSearchDataResponseType()
   * @generated
   */
  EAttribute getSearchDataResponseType_AHVNummer();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType#getDokumentenArt <em>Dokumenten Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dokumenten Art</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType#getDokumentenArt()
   * @see #getSearchDataResponseType()
   * @generated
   */
  EAttribute getSearchDataResponseType_DokumentenArt();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType#getGeschaeftsfall <em>Geschaeftsfall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Geschaeftsfall</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType#getGeschaeftsfall()
   * @see #getSearchDataResponseType()
   * @generated
   */
  EAttribute getSearchDataResponseType_Geschaeftsfall();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType#getAnzahl_der_Dokumente <em>Anzahl der Dokumente</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Anzahl der Dokumente</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType#getAnzahl_der_Dokumente()
   * @see #getSearchDataResponseType()
   * @generated
   */
  EAttribute getSearchDataResponseType_Anzahl_der_Dokumente();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ComFactory getComFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestFromBPMTypeImpl <em>Create Case ID Request From BPM Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestFromBPMTypeImpl
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getCreateCaseIDRequestFromBPMType()
     * @generated
     */
    EClass CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE = eINSTANCE.getCreateCaseIDRequestFromBPMType();

    /**
     * The meta object literal for the '<em><b>Case ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__CASE_ID = eINSTANCE.getCreateCaseIDRequestFromBPMType_CaseID();

    /**
     * The meta object literal for the '<em><b>AHV Nummer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__AHV_NUMMER = eINSTANCE.getCreateCaseIDRequestFromBPMType_AHVNummer();

    /**
     * The meta object literal for the '<em><b>Dokumenten Art</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__DOKUMENTEN_ART = eINSTANCE.getCreateCaseIDRequestFromBPMType_DokumentenArt();

    /**
     * The meta object literal for the '<em><b>Geschaeftsfall</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__GESCHAEFTSFALL = eINSTANCE.getCreateCaseIDRequestFromBPMType_Geschaeftsfall();

    /**
     * The meta object literal for the '<em><b>Anzahl der Dokumente</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__ANZAHL_DER_DOKUMENTE = eINSTANCE.getCreateCaseIDRequestFromBPMType_Anzahl_der_Dokumente();

    /**
     * The meta object literal for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestTypeImpl <em>Create Case ID Request Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestTypeImpl
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getCreateCaseIDRequestType()
     * @generated
     */
    EClass CREATE_CASE_ID_REQUEST_TYPE = eINSTANCE.getCreateCaseIDRequestType();

    /**
     * The meta object literal for the '<em><b>AHV Nummer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_TYPE__AHV_NUMMER = eINSTANCE.getCreateCaseIDRequestType_AHVNummer();

    /**
     * The meta object literal for the '<em><b>Dokumenten Art</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_TYPE__DOKUMENTEN_ART = eINSTANCE.getCreateCaseIDRequestType_DokumentenArt();

    /**
     * The meta object literal for the '<em><b>Geschaeftsfall</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_TYPE__GESCHAEFTSFALL = eINSTANCE.getCreateCaseIDRequestType_Geschaeftsfall();

    /**
     * The meta object literal for the '<em><b>Anzahl der Dokumente</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_TYPE__ANZAHL_DER_DOKUMENTE = eINSTANCE.getCreateCaseIDRequestType_Anzahl_der_Dokumente();

    /**
     * The meta object literal for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDResponseFromBPMTypeImpl <em>Create Case ID Response From BPM Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDResponseFromBPMTypeImpl
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getCreateCaseIDResponseFromBPMType()
     * @generated
     */
    EClass CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE = eINSTANCE.getCreateCaseIDResponseFromBPMType();

    /**
     * The meta object literal for the '<em><b>Acknowledgement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE__ACKNOWLEDGEMENT = eINSTANCE.getCreateCaseIDResponseFromBPMType_Acknowledgement();

    /**
     * The meta object literal for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDResponseTypeImpl <em>Create Case ID Response Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDResponseTypeImpl
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getCreateCaseIDResponseType()
     * @generated
     */
    EClass CREATE_CASE_ID_RESPONSE_TYPE = eINSTANCE.getCreateCaseIDResponseType();

    /**
     * The meta object literal for the '<em><b>Case ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_RESPONSE_TYPE__CASE_ID = eINSTANCE.getCreateCaseIDResponseType_CaseID();

    /**
     * The meta object literal for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.DocumentRootImpl
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getDocumentRoot()
     * @generated
     */
    EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

    /**
     * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

    /**
     * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

    /**
     * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

    /**
     * The meta object literal for the '<em><b>Create Case ID Request</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST = eINSTANCE.getDocumentRoot_CreateCaseIDRequest();

    /**
     * The meta object literal for the '<em><b>Create Case ID Request From BPM</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM = eINSTANCE.getDocumentRoot_CreateCaseIDRequestFromBPM();

    /**
     * The meta object literal for the '<em><b>Create Case ID Response</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE = eINSTANCE.getDocumentRoot_CreateCaseIDResponse();

    /**
     * The meta object literal for the '<em><b>Create Case ID Response From BPM</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM = eINSTANCE.getDocumentRoot_CreateCaseIDResponseFromBPM();

    /**
     * The meta object literal for the '<em><b>Get Data Request From Case ID</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID = eINSTANCE.getDocumentRoot_GetDataRequestFromCaseID();

    /**
     * The meta object literal for the '<em><b>Get Data WF Case ID Response</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE = eINSTANCE.getDocumentRoot_GetDataWFCaseIDResponse();

    /**
     * The meta object literal for the '<em><b>Search Data Request</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SEARCH_DATA_REQUEST = eINSTANCE.getDocumentRoot_SearchDataRequest();

    /**
     * The meta object literal for the '<em><b>Search Data Responses</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SEARCH_DATA_RESPONSES = eINSTANCE.getDocumentRoot_SearchDataResponses();

    /**
     * The meta object literal for the '<em><b>Create Case ID Request From BPM Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_CreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Create Case ID Request Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_CreateCaseIDRequestTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Create Case ID Response From BPM Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_CreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Create Case ID Response Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_CreateCaseIDResponseTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Get Data Request From Case ID Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_GetDataRequestFromCaseIDTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Get Data WF Case ID Response Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_GetDataWFCaseIDResponseTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Search Data Request Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SEARCH_DATA_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_SearchDataRequestTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Search Data Responses Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SEARCH_DATA_RESPONSES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_SearchDataResponsesTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Search Data Response Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__SEARCH_DATA_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_SearchDataResponseTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataRequestFromCaseIDTypeImpl <em>Get Data Request From Case ID Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataRequestFromCaseIDTypeImpl
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getGetDataRequestFromCaseIDType()
     * @generated
     */
    EClass GET_DATA_REQUEST_FROM_CASE_ID_TYPE = eINSTANCE.getGetDataRequestFromCaseIDType();

    /**
     * The meta object literal for the '<em><b>Case ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DATA_REQUEST_FROM_CASE_ID_TYPE__CASE_ID = eINSTANCE.getGetDataRequestFromCaseIDType_CaseID();

    /**
     * The meta object literal for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataWFCaseIDResponseTypeImpl <em>Get Data WF Case ID Response Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataWFCaseIDResponseTypeImpl
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getGetDataWFCaseIDResponseType()
     * @generated
     */
    EClass GET_DATA_WF_CASE_ID_RESPONSE_TYPE = eINSTANCE.getGetDataWFCaseIDResponseType();

    /**
     * The meta object literal for the '<em><b>Case ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DATA_WF_CASE_ID_RESPONSE_TYPE__CASE_ID = eINSTANCE.getGetDataWFCaseIDResponseType_CaseID();

    /**
     * The meta object literal for the '<em><b>AHV Nummer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DATA_WF_CASE_ID_RESPONSE_TYPE__AHV_NUMMER = eINSTANCE.getGetDataWFCaseIDResponseType_AHVNummer();

    /**
     * The meta object literal for the '<em><b>Dokumenten Art</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DATA_WF_CASE_ID_RESPONSE_TYPE__DOKUMENTEN_ART = eINSTANCE.getGetDataWFCaseIDResponseType_DokumentenArt();

    /**
     * The meta object literal for the '<em><b>Geschaeftsfall</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DATA_WF_CASE_ID_RESPONSE_TYPE__GESCHAEFTSFALL = eINSTANCE.getGetDataWFCaseIDResponseType_Geschaeftsfall();

    /**
     * The meta object literal for the '<em><b>Anzahl der Dokumente</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DATA_WF_CASE_ID_RESPONSE_TYPE__ANZAHL_DER_DOKUMENTE = eINSTANCE.getGetDataWFCaseIDResponseType_Anzahl_der_Dokumente();

    /**
     * The meta object literal for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataRequestTypeImpl <em>Search Data Request Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataRequestTypeImpl
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getSearchDataRequestType()
     * @generated
     */
    EClass SEARCH_DATA_REQUEST_TYPE = eINSTANCE.getSearchDataRequestType();

    /**
     * The meta object literal for the '<em><b>AHV Nummer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCH_DATA_REQUEST_TYPE__AHV_NUMMER = eINSTANCE.getSearchDataRequestType_AHVNummer();

    /**
     * The meta object literal for the '<em><b>Dokumenten Art</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCH_DATA_REQUEST_TYPE__DOKUMENTEN_ART = eINSTANCE.getSearchDataRequestType_DokumentenArt();

    /**
     * The meta object literal for the '<em><b>Geschaeftsfall</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCH_DATA_REQUEST_TYPE__GESCHAEFTSFALL = eINSTANCE.getSearchDataRequestType_Geschaeftsfall();

    /**
     * The meta object literal for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataResponsesTypeImpl <em>Search Data Responses Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataResponsesTypeImpl
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getSearchDataResponsesType()
     * @generated
     */
    EClass SEARCH_DATA_RESPONSES_TYPE = eINSTANCE.getSearchDataResponsesType();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCH_DATA_RESPONSES_TYPE__GROUP = eINSTANCE.getSearchDataResponsesType_Group();

    /**
     * The meta object literal for the '<em><b>Search Data Response</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEARCH_DATA_RESPONSES_TYPE__SEARCH_DATA_RESPONSE = eINSTANCE.getSearchDataResponsesType_SearchDataResponse();

    /**
     * The meta object literal for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataResponseTypeImpl <em>Search Data Response Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataResponseTypeImpl
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getSearchDataResponseType()
     * @generated
     */
    EClass SEARCH_DATA_RESPONSE_TYPE = eINSTANCE.getSearchDataResponseType();

    /**
     * The meta object literal for the '<em><b>Case ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCH_DATA_RESPONSE_TYPE__CASE_ID = eINSTANCE.getSearchDataResponseType_CaseID();

    /**
     * The meta object literal for the '<em><b>AHV Nummer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCH_DATA_RESPONSE_TYPE__AHV_NUMMER = eINSTANCE.getSearchDataResponseType_AHVNummer();

    /**
     * The meta object literal for the '<em><b>Dokumenten Art</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCH_DATA_RESPONSE_TYPE__DOKUMENTEN_ART = eINSTANCE.getSearchDataResponseType_DokumentenArt();

    /**
     * The meta object literal for the '<em><b>Geschaeftsfall</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCH_DATA_RESPONSE_TYPE__GESCHAEFTSFALL = eINSTANCE.getSearchDataResponseType_Geschaeftsfall();

    /**
     * The meta object literal for the '<em><b>Anzahl der Dokumente</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SEARCH_DATA_RESPONSE_TYPE__ANZAHL_DER_DOKUMENTE = eINSTANCE.getSearchDataResponseType_Anzahl_der_Dokumente();

  }

} //ComPackage
