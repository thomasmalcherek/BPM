
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
 * BOMORIGIN::/com.tibco.poc.test/Generated Business Objects/saveDataCaseXSD.bw.test.poc.tibco.com.bom
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
   * The feature id for the '<em><b>Partner ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__PARTNER_ID = 2;

  /**
   * The feature id for the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__DOKUMENTEN_ART = 3;

  /**
   * The feature id for the '<em><b>Kanton</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__KANTON = 4;

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
   * The feature id for the '<em><b>Partner ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_TYPE__PARTNER_ID = 1;

  /**
   * The feature id for the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_TYPE__DOKUMENTEN_ART = 2;

  /**
   * The feature id for the '<em><b>Kanton</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATE_CASE_ID_REQUEST_TYPE__KANTON = 3;

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
   * The feature id for the '<em><b>Get Data Response From Case ID</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GET_DATA_RESPONSE_FROM_CASE_ID = 8;

  /**
   * The feature id for the '<em><b>Create Case ID Request From BPM Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 9;

  /**
   * The feature id for the '<em><b>Create Case ID Request Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 10;

  /**
   * The feature id for the '<em><b>Create Case ID Response From BPM Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 11;

  /**
   * The feature id for the '<em><b>Create Case ID Response Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 12;

  /**
   * The feature id for the '<em><b>Get Data Request From Case ID Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 13;

  /**
   * The feature id for the '<em><b>Get Data Response From Case ID Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GET_DATA_RESPONSE_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 14;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 15;

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
   * The meta object id for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataResponseFromCaseIDTypeImpl <em>Get Data Response From Case ID Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataResponseFromCaseIDTypeImpl
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getGetDataResponseFromCaseIDType()
   * @generated
   */
  int GET_DATA_RESPONSE_FROM_CASE_ID_TYPE = 6;

  /**
   * The feature id for the '<em><b>Case ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__CASE_ID = 0;

  /**
   * The feature id for the '<em><b>AHV Nummer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__AHV_NUMMER = 1;

  /**
   * The feature id for the '<em><b>Partner ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__PARTNER_ID = 2;

  /**
   * The feature id for the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__DOKUMENTEN_ART = 3;

  /**
   * The feature id for the '<em><b>Kanton</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__KANTON = 4;

  /**
   * The number of structural features of the '<em>Get Data Response From Case ID Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_DATA_RESPONSE_FROM_CASE_ID_TYPE_FEATURE_COUNT = 5;


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
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getPartnerID <em>Partner ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partner ID</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getPartnerID()
   * @see #getCreateCaseIDRequestFromBPMType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestFromBPMType_PartnerID();

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
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getKanton <em>Kanton</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kanton</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getKanton()
   * @see #getCreateCaseIDRequestFromBPMType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestFromBPMType_Kanton();

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
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getPartnerID <em>Partner ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partner ID</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getPartnerID()
   * @see #getCreateCaseIDRequestType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestType_PartnerID();

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
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getKanton <em>Kanton</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kanton</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getKanton()
   * @see #getCreateCaseIDRequestType()
   * @generated
   */
  EAttribute getCreateCaseIDRequestType_Kanton();

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
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataResponseFromCaseID <em>Get Data Response From Case ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Get Data Response From Case ID</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataResponseFromCaseID()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_GetDataResponseFromCaseID();

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
   * Returns the meta object for the containment reference '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataResponseFromCaseIDTypeBDSInternalSerializationElement <em>Get Data Response From Case ID Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Get Data Response From Case ID Type BDS Internal Serialization Element</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot#getGetDataResponseFromCaseIDTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_GetDataResponseFromCaseIDTypeBDSInternalSerializationElement();

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
   * Returns the meta object for class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType <em>Get Data Response From Case ID Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Data Response From Case ID Type</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType
   * @generated
   */
  EClass getGetDataResponseFromCaseIDType();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType#getCaseID <em>Case ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Case ID</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType#getCaseID()
   * @see #getGetDataResponseFromCaseIDType()
   * @generated
   */
  EAttribute getGetDataResponseFromCaseIDType_CaseID();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType#getAHVNummer <em>AHV Nummer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AHV Nummer</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType#getAHVNummer()
   * @see #getGetDataResponseFromCaseIDType()
   * @generated
   */
  EAttribute getGetDataResponseFromCaseIDType_AHVNummer();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType#getPartnerID <em>Partner ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partner ID</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType#getPartnerID()
   * @see #getGetDataResponseFromCaseIDType()
   * @generated
   */
  EAttribute getGetDataResponseFromCaseIDType_PartnerID();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType#getDokumentenArt <em>Dokumenten Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dokumenten Art</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType#getDokumentenArt()
   * @see #getGetDataResponseFromCaseIDType()
   * @generated
   */
  EAttribute getGetDataResponseFromCaseIDType_DokumentenArt();

  /**
   * Returns the meta object for the attribute '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType#getKanton <em>Kanton</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kanton</em>'.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType#getKanton()
   * @see #getGetDataResponseFromCaseIDType()
   * @generated
   */
  EAttribute getGetDataResponseFromCaseIDType_Kanton();

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
     * The meta object literal for the '<em><b>Partner ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__PARTNER_ID = eINSTANCE.getCreateCaseIDRequestFromBPMType_PartnerID();

    /**
     * The meta object literal for the '<em><b>Dokumenten Art</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__DOKUMENTEN_ART = eINSTANCE.getCreateCaseIDRequestFromBPMType_DokumentenArt();

    /**
     * The meta object literal for the '<em><b>Kanton</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__KANTON = eINSTANCE.getCreateCaseIDRequestFromBPMType_Kanton();

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
     * The meta object literal for the '<em><b>Partner ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_TYPE__PARTNER_ID = eINSTANCE.getCreateCaseIDRequestType_PartnerID();

    /**
     * The meta object literal for the '<em><b>Dokumenten Art</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_TYPE__DOKUMENTEN_ART = eINSTANCE.getCreateCaseIDRequestType_DokumentenArt();

    /**
     * The meta object literal for the '<em><b>Kanton</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATE_CASE_ID_REQUEST_TYPE__KANTON = eINSTANCE.getCreateCaseIDRequestType_Kanton();

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
     * The meta object literal for the '<em><b>Get Data Response From Case ID</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GET_DATA_RESPONSE_FROM_CASE_ID = eINSTANCE.getDocumentRoot_GetDataResponseFromCaseID();

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
     * The meta object literal for the '<em><b>Get Data Response From Case ID Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GET_DATA_RESPONSE_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_GetDataResponseFromCaseIDTypeBDSInternalSerializationElement();

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
     * The meta object literal for the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataResponseFromCaseIDTypeImpl <em>Get Data Response From Case ID Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataResponseFromCaseIDTypeImpl
     * @see saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComPackageImpl#getGetDataResponseFromCaseIDType()
     * @generated
     */
    EClass GET_DATA_RESPONSE_FROM_CASE_ID_TYPE = eINSTANCE.getGetDataResponseFromCaseIDType();

    /**
     * The meta object literal for the '<em><b>Case ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__CASE_ID = eINSTANCE.getGetDataResponseFromCaseIDType_CaseID();

    /**
     * The meta object literal for the '<em><b>AHV Nummer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__AHV_NUMMER = eINSTANCE.getGetDataResponseFromCaseIDType_AHVNummer();

    /**
     * The meta object literal for the '<em><b>Partner ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__PARTNER_ID = eINSTANCE.getGetDataResponseFromCaseIDType_PartnerID();

    /**
     * The meta object literal for the '<em><b>Dokumenten Art</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__DOKUMENTEN_ART = eINSTANCE.getGetDataResponseFromCaseIDType_DokumentenArt();

    /**
     * The meta object literal for the '<em><b>Kanton</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__KANTON = eINSTANCE.getGetDataResponseFromCaseIDType_Kanton();

  }

} //ComPackage
