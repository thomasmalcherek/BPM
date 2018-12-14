package saveDataCaseXSD.bw.test.poc.tibco.com.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import saveDataCaseXSD.bw.test.poc.tibco.com.ComFactory;
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

import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSActivator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComPackageImpl extends EPackageImpl implements ComPackage
{

  /** 
    * Exposes bundle version number, or null if not instantiated via OSGi
    * @generated
    */
  public String getBundleVersion()
  {
    String result = BDSActivator.getBundleVersion();
    return result;
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createCaseIDRequestFromBPMTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createCaseIDRequestTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createCaseIDResponseFromBPMTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass createCaseIDResponseTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getDataRequestFromCaseIDTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getDataWFCaseIDResponseTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchDataRequestTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchDataResponsesTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchDataResponseTypeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ComPackageImpl()
  {
    super(eNS_URI, ComFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link ComPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ComPackage init()
  {
    if (isInited) return (ComPackage)EPackage.Registry.INSTANCE.getEPackage(ComPackage.eNS_URI);

    // Obtain or create and register package
    ComPackageImpl theComPackage = (ComPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theComPackage.createPackageContents();

    // Initialize created meta-data
    theComPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theComPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ComPackage.eNS_URI, theComPackage);
    return theComPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateCaseIDRequestFromBPMType()
  {
    return createCaseIDRequestFromBPMTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestFromBPMType_CaseID()
  {
    return (EAttribute)createCaseIDRequestFromBPMTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestFromBPMType_AHVNummer()
  {
    return (EAttribute)createCaseIDRequestFromBPMTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestFromBPMType_DokumentenArt()
  {
    return (EAttribute)createCaseIDRequestFromBPMTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestFromBPMType_Geschaeftsfall()
  {
    return (EAttribute)createCaseIDRequestFromBPMTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestFromBPMType_Anzahl_der_Dokumente()
  {
    return (EAttribute)createCaseIDRequestFromBPMTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateCaseIDRequestType()
  {
    return createCaseIDRequestTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestType_AHVNummer()
  {
    return (EAttribute)createCaseIDRequestTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestType_DokumentenArt()
  {
    return (EAttribute)createCaseIDRequestTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestType_Geschaeftsfall()
  {
    return (EAttribute)createCaseIDRequestTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestType_Anzahl_der_Dokumente()
  {
    return (EAttribute)createCaseIDRequestTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateCaseIDResponseFromBPMType()
  {
    return createCaseIDResponseFromBPMTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDResponseFromBPMType_Acknowledgement()
  {
    return (EAttribute)createCaseIDResponseFromBPMTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreateCaseIDResponseType()
  {
    return createCaseIDResponseTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDResponseType_CaseID()
  {
    return (EAttribute)createCaseIDResponseTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentRoot()
  {
    return documentRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentRoot_Mixed()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XMLNSPrefixMap()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_XSISchemaLocation()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateCaseIDRequest()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateCaseIDRequestFromBPM()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateCaseIDResponse()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateCaseIDResponseFromBPM()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_GetDataRequestFromCaseID()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_GetDataWFCaseIDResponse()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SearchDataRequest()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SearchDataResponses()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateCaseIDRequestTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateCaseIDResponseTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_GetDataRequestFromCaseIDTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_GetDataWFCaseIDResponseTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SearchDataRequestTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SearchDataResponsesTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_SearchDataResponseTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetDataRequestFromCaseIDType()
  {
    return getDataRequestFromCaseIDTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDataRequestFromCaseIDType_CaseID()
  {
    return (EAttribute)getDataRequestFromCaseIDTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetDataWFCaseIDResponseType()
  {
    return getDataWFCaseIDResponseTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDataWFCaseIDResponseType_CaseID()
  {
    return (EAttribute)getDataWFCaseIDResponseTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDataWFCaseIDResponseType_AHVNummer()
  {
    return (EAttribute)getDataWFCaseIDResponseTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDataWFCaseIDResponseType_DokumentenArt()
  {
    return (EAttribute)getDataWFCaseIDResponseTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDataWFCaseIDResponseType_Geschaeftsfall()
  {
    return (EAttribute)getDataWFCaseIDResponseTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDataWFCaseIDResponseType_Anzahl_der_Dokumente()
  {
    return (EAttribute)getDataWFCaseIDResponseTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSearchDataRequestType()
  {
    return searchDataRequestTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchDataRequestType_AHVNummer()
  {
    return (EAttribute)searchDataRequestTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchDataRequestType_DokumentenArt()
  {
    return (EAttribute)searchDataRequestTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchDataRequestType_Geschaeftsfall()
  {
    return (EAttribute)searchDataRequestTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSearchDataResponsesType()
  {
    return searchDataResponsesTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchDataResponsesType_Group()
  {
    return (EAttribute)searchDataResponsesTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSearchDataResponsesType_SearchDataResponse()
  {
    return (EReference)searchDataResponsesTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSearchDataResponseType()
  {
    return searchDataResponseTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchDataResponseType_CaseID()
  {
    return (EAttribute)searchDataResponseTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchDataResponseType_AHVNummer()
  {
    return (EAttribute)searchDataResponseTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchDataResponseType_DokumentenArt()
  {
    return (EAttribute)searchDataResponseTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchDataResponseType_Geschaeftsfall()
  {
    return (EAttribute)searchDataResponseTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSearchDataResponseType_Anzahl_der_Dokumente()
  {
    return (EAttribute)searchDataResponseTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComFactory getComFactory()
  {
    return (ComFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    createCaseIDRequestFromBPMTypeEClass = createEClass(CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE);
    createEAttribute(createCaseIDRequestFromBPMTypeEClass, CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__CASE_ID);
    createEAttribute(createCaseIDRequestFromBPMTypeEClass, CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__AHV_NUMMER);
    createEAttribute(createCaseIDRequestFromBPMTypeEClass, CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__DOKUMENTEN_ART);
    createEAttribute(createCaseIDRequestFromBPMTypeEClass, CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__GESCHAEFTSFALL);
    createEAttribute(createCaseIDRequestFromBPMTypeEClass, CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__ANZAHL_DER_DOKUMENTE);

    createCaseIDRequestTypeEClass = createEClass(CREATE_CASE_ID_REQUEST_TYPE);
    createEAttribute(createCaseIDRequestTypeEClass, CREATE_CASE_ID_REQUEST_TYPE__AHV_NUMMER);
    createEAttribute(createCaseIDRequestTypeEClass, CREATE_CASE_ID_REQUEST_TYPE__DOKUMENTEN_ART);
    createEAttribute(createCaseIDRequestTypeEClass, CREATE_CASE_ID_REQUEST_TYPE__GESCHAEFTSFALL);
    createEAttribute(createCaseIDRequestTypeEClass, CREATE_CASE_ID_REQUEST_TYPE__ANZAHL_DER_DOKUMENTE);

    createCaseIDResponseFromBPMTypeEClass = createEClass(CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE);
    createEAttribute(createCaseIDResponseFromBPMTypeEClass, CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE__ACKNOWLEDGEMENT);

    createCaseIDResponseTypeEClass = createEClass(CREATE_CASE_ID_RESPONSE_TYPE);
    createEAttribute(createCaseIDResponseTypeEClass, CREATE_CASE_ID_RESPONSE_TYPE__CASE_ID);

    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SEARCH_DATA_REQUEST);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SEARCH_DATA_RESPONSES);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GET_DATA_WF_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SEARCH_DATA_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SEARCH_DATA_RESPONSES_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__SEARCH_DATA_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);

    getDataRequestFromCaseIDTypeEClass = createEClass(GET_DATA_REQUEST_FROM_CASE_ID_TYPE);
    createEAttribute(getDataRequestFromCaseIDTypeEClass, GET_DATA_REQUEST_FROM_CASE_ID_TYPE__CASE_ID);

    getDataWFCaseIDResponseTypeEClass = createEClass(GET_DATA_WF_CASE_ID_RESPONSE_TYPE);
    createEAttribute(getDataWFCaseIDResponseTypeEClass, GET_DATA_WF_CASE_ID_RESPONSE_TYPE__CASE_ID);
    createEAttribute(getDataWFCaseIDResponseTypeEClass, GET_DATA_WF_CASE_ID_RESPONSE_TYPE__AHV_NUMMER);
    createEAttribute(getDataWFCaseIDResponseTypeEClass, GET_DATA_WF_CASE_ID_RESPONSE_TYPE__DOKUMENTEN_ART);
    createEAttribute(getDataWFCaseIDResponseTypeEClass, GET_DATA_WF_CASE_ID_RESPONSE_TYPE__GESCHAEFTSFALL);
    createEAttribute(getDataWFCaseIDResponseTypeEClass, GET_DATA_WF_CASE_ID_RESPONSE_TYPE__ANZAHL_DER_DOKUMENTE);

    searchDataRequestTypeEClass = createEClass(SEARCH_DATA_REQUEST_TYPE);
    createEAttribute(searchDataRequestTypeEClass, SEARCH_DATA_REQUEST_TYPE__AHV_NUMMER);
    createEAttribute(searchDataRequestTypeEClass, SEARCH_DATA_REQUEST_TYPE__DOKUMENTEN_ART);
    createEAttribute(searchDataRequestTypeEClass, SEARCH_DATA_REQUEST_TYPE__GESCHAEFTSFALL);

    searchDataResponsesTypeEClass = createEClass(SEARCH_DATA_RESPONSES_TYPE);
    createEAttribute(searchDataResponsesTypeEClass, SEARCH_DATA_RESPONSES_TYPE__GROUP);
    createEReference(searchDataResponsesTypeEClass, SEARCH_DATA_RESPONSES_TYPE__SEARCH_DATA_RESPONSE);

    searchDataResponseTypeEClass = createEClass(SEARCH_DATA_RESPONSE_TYPE);
    createEAttribute(searchDataResponseTypeEClass, SEARCH_DATA_RESPONSE_TYPE__CASE_ID);
    createEAttribute(searchDataResponseTypeEClass, SEARCH_DATA_RESPONSE_TYPE__AHV_NUMMER);
    createEAttribute(searchDataResponseTypeEClass, SEARCH_DATA_RESPONSE_TYPE__DOKUMENTEN_ART);
    createEAttribute(searchDataResponseTypeEClass, SEARCH_DATA_RESPONSE_TYPE__GESCHAEFTSFALL);
    createEAttribute(searchDataResponseTypeEClass, SEARCH_DATA_RESPONSE_TYPE__ANZAHL_DER_DOKUMENTE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(createCaseIDRequestFromBPMTypeEClass, CreateCaseIDRequestFromBPMType.class, "CreateCaseIDRequestFromBPMType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateCaseIDRequestFromBPMType_CaseID(), theXMLTypePackage.getString(), "caseID", null, 1, 1, CreateCaseIDRequestFromBPMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateCaseIDRequestFromBPMType_AHVNummer(), theXMLTypePackage.getString(), "AHVNummer", null, 1, 1, CreateCaseIDRequestFromBPMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateCaseIDRequestFromBPMType_DokumentenArt(), theXMLTypePackage.getString(), "dokumentenArt", null, 1, 1, CreateCaseIDRequestFromBPMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateCaseIDRequestFromBPMType_Geschaeftsfall(), theXMLTypePackage.getString(), "geschaeftsfall", null, 1, 1, CreateCaseIDRequestFromBPMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateCaseIDRequestFromBPMType_Anzahl_der_Dokumente(), theXMLTypePackage.getInteger(), "anzahl_der_Dokumente", null, 1, 1, CreateCaseIDRequestFromBPMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createCaseIDRequestTypeEClass, CreateCaseIDRequestType.class, "CreateCaseIDRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateCaseIDRequestType_AHVNummer(), theXMLTypePackage.getString(), "AHVNummer", null, 1, 1, CreateCaseIDRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateCaseIDRequestType_DokumentenArt(), theXMLTypePackage.getString(), "dokumentenArt", null, 1, 1, CreateCaseIDRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateCaseIDRequestType_Geschaeftsfall(), theXMLTypePackage.getString(), "geschaeftsfall", null, 1, 1, CreateCaseIDRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateCaseIDRequestType_Anzahl_der_Dokumente(), theXMLTypePackage.getInteger(), "anzahl_der_Dokumente", null, 1, 1, CreateCaseIDRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createCaseIDResponseFromBPMTypeEClass, CreateCaseIDResponseFromBPMType.class, "CreateCaseIDResponseFromBPMType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateCaseIDResponseFromBPMType_Acknowledgement(), theXMLTypePackage.getBooleanObject(), "acknowledgement", null, 1, 1, CreateCaseIDResponseFromBPMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createCaseIDResponseTypeEClass, CreateCaseIDResponseType.class, "CreateCaseIDResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateCaseIDResponseType_CaseID(), theXMLTypePackage.getString(), "caseID", null, 1, 1, CreateCaseIDResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateCaseIDRequest(), this.getCreateCaseIDRequestType(), null, "createCaseIDRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateCaseIDRequestFromBPM(), this.getCreateCaseIDRequestFromBPMType(), null, "createCaseIDRequestFromBPM", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateCaseIDResponse(), this.getCreateCaseIDResponseType(), null, "createCaseIDResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateCaseIDResponseFromBPM(), this.getCreateCaseIDResponseFromBPMType(), null, "createCaseIDResponseFromBPM", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_GetDataRequestFromCaseID(), this.getGetDataRequestFromCaseIDType(), null, "getDataRequestFromCaseID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_GetDataWFCaseIDResponse(), this.getGetDataWFCaseIDResponseType(), null, "getDataWFCaseIDResponse", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SearchDataRequest(), this.getSearchDataRequestType(), null, "searchDataRequest", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SearchDataResponses(), this.getSearchDataResponsesType(), null, "searchDataResponses", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement(), this.getCreateCaseIDRequestFromBPMType(), null, "createCaseIDRequestFromBPMTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateCaseIDRequestTypeBDSInternalSerializationElement(), this.getCreateCaseIDRequestType(), null, "createCaseIDRequestTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement(), this.getCreateCaseIDResponseFromBPMType(), null, "createCaseIDResponseFromBPMTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateCaseIDResponseTypeBDSInternalSerializationElement(), this.getCreateCaseIDResponseType(), null, "createCaseIDResponseTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_GetDataRequestFromCaseIDTypeBDSInternalSerializationElement(), this.getGetDataRequestFromCaseIDType(), null, "getDataRequestFromCaseIDTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_GetDataWFCaseIDResponseTypeBDSInternalSerializationElement(), this.getGetDataWFCaseIDResponseType(), null, "getDataWFCaseIDResponseTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SearchDataRequestTypeBDSInternalSerializationElement(), this.getSearchDataRequestType(), null, "searchDataRequestTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SearchDataResponsesTypeBDSInternalSerializationElement(), this.getSearchDataResponsesType(), null, "searchDataResponsesTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_SearchDataResponseTypeBDSInternalSerializationElement(), this.getSearchDataResponseType(), null, "searchDataResponseTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(getDataRequestFromCaseIDTypeEClass, GetDataRequestFromCaseIDType.class, "GetDataRequestFromCaseIDType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGetDataRequestFromCaseIDType_CaseID(), theXMLTypePackage.getString(), "caseID", null, 1, 1, GetDataRequestFromCaseIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getDataWFCaseIDResponseTypeEClass, GetDataWFCaseIDResponseType.class, "GetDataWFCaseIDResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGetDataWFCaseIDResponseType_CaseID(), theXMLTypePackage.getString(), "caseID", null, 1, 1, GetDataWFCaseIDResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDataWFCaseIDResponseType_AHVNummer(), theXMLTypePackage.getString(), "AHVNummer", null, 1, 1, GetDataWFCaseIDResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDataWFCaseIDResponseType_DokumentenArt(), theXMLTypePackage.getString(), "dokumentenArt", null, 1, 1, GetDataWFCaseIDResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDataWFCaseIDResponseType_Geschaeftsfall(), theXMLTypePackage.getString(), "geschaeftsfall", null, 1, 1, GetDataWFCaseIDResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDataWFCaseIDResponseType_Anzahl_der_Dokumente(), theXMLTypePackage.getInteger(), "anzahl_der_Dokumente", null, 1, 1, GetDataWFCaseIDResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(searchDataRequestTypeEClass, SearchDataRequestType.class, "SearchDataRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSearchDataRequestType_AHVNummer(), theXMLTypePackage.getString(), "AHVNummer", null, 1, 1, SearchDataRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSearchDataRequestType_DokumentenArt(), theXMLTypePackage.getString(), "dokumentenArt", null, 1, 1, SearchDataRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSearchDataRequestType_Geschaeftsfall(), theXMLTypePackage.getString(), "geschaeftsfall", null, 1, 1, SearchDataRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(searchDataResponsesTypeEClass, SearchDataResponsesType.class, "SearchDataResponsesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSearchDataResponsesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SearchDataResponsesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSearchDataResponsesType_SearchDataResponse(), this.getSearchDataResponseType(), null, "searchDataResponse", null, 0, -1, SearchDataResponsesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(searchDataResponseTypeEClass, SearchDataResponseType.class, "SearchDataResponseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSearchDataResponseType_CaseID(), theXMLTypePackage.getString(), "caseID", null, 1, 1, SearchDataResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSearchDataResponseType_AHVNummer(), theXMLTypePackage.getString(), "AHVNummer", null, 1, 1, SearchDataResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSearchDataResponseType_DokumentenArt(), theXMLTypePackage.getString(), "dokumentenArt", null, 1, 1, SearchDataResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSearchDataResponseType_Geschaeftsfall(), theXMLTypePackage.getString(), "geschaeftsfall", null, 1, 1, SearchDataResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSearchDataResponseType_Anzahl_der_Dokumente(), theXMLTypePackage.getInteger(), "anzahl_der_Dokumente", null, 1, 1, SearchDataResponseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExtendedMetaDataAnnotations()
  {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
    addAnnotation
      (createCaseIDRequestFromBPMTypeEClass, 
       source, 
       new String[] 
       {
       "name", "CreateCaseIDRequestFromBPM_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getCreateCaseIDRequestFromBPMType_CaseID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CaseID"
       });		
    addAnnotation
      (getCreateCaseIDRequestFromBPMType_AHVNummer(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AHV-Nummer"
       });		
    addAnnotation
      (getCreateCaseIDRequestFromBPMType_DokumentenArt(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Dokumenten-Art"
       });		
    addAnnotation
      (getCreateCaseIDRequestFromBPMType_Geschaeftsfall(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Geschaeftsfall"
       });		
    addAnnotation
      (getCreateCaseIDRequestFromBPMType_Anzahl_der_Dokumente(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Anzahl_der_Dokumente"
       });		
    addAnnotation
      (createCaseIDRequestTypeEClass, 
       source, 
       new String[] 
       {
       "name", "CreateCaseIDRequest_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getCreateCaseIDRequestType_AHVNummer(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AHV-Nummer"
       });		
    addAnnotation
      (getCreateCaseIDRequestType_DokumentenArt(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Dokumenten-Art"
       });		
    addAnnotation
      (getCreateCaseIDRequestType_Geschaeftsfall(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Geschaeftsfall"
       });		
    addAnnotation
      (getCreateCaseIDRequestType_Anzahl_der_Dokumente(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Anzahl_der_Dokumente"
       });		
    addAnnotation
      (createCaseIDResponseFromBPMTypeEClass, 
       source, 
       new String[] 
       {
       "name", "CreateCaseIDResponseFromBPM_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getCreateCaseIDResponseFromBPMType_Acknowledgement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Acknowledgement"
       });		
    addAnnotation
      (createCaseIDResponseTypeEClass, 
       source, 
       new String[] 
       {
       "name", "CreateCaseIDResponse_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getCreateCaseIDResponseType_CaseID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CaseID"
       });		
    addAnnotation
      (documentRootEClass, 
       source, 
       new String[] 
       {
       "name", "",
       "kind", "mixed"
       });		
    addAnnotation
      (getDocumentRoot_Mixed(), 
       source, 
       new String[] 
       {
       "kind", "elementWildcard",
       "name", ":mixed"
       });		
    addAnnotation
      (getDocumentRoot_XMLNSPrefixMap(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xmlns:prefix"
       });		
    addAnnotation
      (getDocumentRoot_XSISchemaLocation(), 
       source, 
       new String[] 
       {
       "kind", "attribute",
       "name", "xsi:schemaLocation"
       });		
    addAnnotation
      (getDocumentRoot_CreateCaseIDRequest(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CreateCaseIDRequest",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CreateCaseIDRequestFromBPM(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CreateCaseIDRequestFromBPM",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CreateCaseIDResponse(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CreateCaseIDResponse",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CreateCaseIDResponseFromBPM(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CreateCaseIDResponseFromBPM",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_GetDataRequestFromCaseID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "GetDataRequestFromCaseID",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_GetDataWFCaseIDResponse(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "GetDataWFCaseIDResponse",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SearchDataRequest(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SearchDataRequest",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SearchDataResponses(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SearchDataResponses",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CreateCaseIDRequestFromBPM_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CreateCaseIDRequestTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CreateCaseIDRequest_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CreateCaseIDResponseFromBPM_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_CreateCaseIDResponseTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CreateCaseIDResponse_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_GetDataRequestFromCaseIDTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "GetDataRequestFromCaseID_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_GetDataWFCaseIDResponseTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "GetDataWFCaseIDResponse_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SearchDataRequestTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SearchDataRequest_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SearchDataResponsesTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SearchDataResponses_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_SearchDataResponseTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SearchDataResponse_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDataRequestFromCaseIDTypeEClass, 
       source, 
       new String[] 
       {
       "name", "GetDataRequestFromCaseID_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getGetDataRequestFromCaseIDType_CaseID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CaseID"
       });		
    addAnnotation
      (getDataWFCaseIDResponseTypeEClass, 
       source, 
       new String[] 
       {
       "name", "GetDataWFCaseIDResponse_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getGetDataWFCaseIDResponseType_CaseID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CaseID"
       });		
    addAnnotation
      (getGetDataWFCaseIDResponseType_AHVNummer(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AHV-Nummer"
       });		
    addAnnotation
      (getGetDataWFCaseIDResponseType_DokumentenArt(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Dokumenten-Art"
       });		
    addAnnotation
      (getGetDataWFCaseIDResponseType_Geschaeftsfall(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Geschaeftsfall"
       });		
    addAnnotation
      (getGetDataWFCaseIDResponseType_Anzahl_der_Dokumente(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Anzahl_der_Dokumente"
       });		
    addAnnotation
      (searchDataRequestTypeEClass, 
       source, 
       new String[] 
       {
       "name", "SearchDataRequest_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getSearchDataRequestType_AHVNummer(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AHV-Nummer"
       });		
    addAnnotation
      (getSearchDataRequestType_DokumentenArt(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Dokumenten-Art"
       });		
    addAnnotation
      (getSearchDataRequestType_Geschaeftsfall(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Geschaeftsfall"
       });		
    addAnnotation
      (searchDataResponsesTypeEClass, 
       source, 
       new String[] 
       {
       "name", "SearchDataResponses_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getSearchDataResponsesType_Group(), 
       source, 
       new String[] 
       {
       "kind", "group",
       "name", "group:0"
       });		
    addAnnotation
      (getSearchDataResponsesType_SearchDataResponse(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "SearchDataResponse",
       "group", "#group:0"
       });		
    addAnnotation
      (searchDataResponseTypeEClass, 
       source, 
       new String[] 
       {
       "name", "SearchDataResponse_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getSearchDataResponseType_CaseID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CaseID"
       });		
    addAnnotation
      (getSearchDataResponseType_AHVNummer(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AHV-Nummer"
       });		
    addAnnotation
      (getSearchDataResponseType_DokumentenArt(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Dokumenten-Art"
       });		
    addAnnotation
      (getSearchDataResponseType_Geschaeftsfall(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Geschaeftsfall"
       });		
    addAnnotation
      (getSearchDataResponseType_Anzahl_der_Dokumente(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Anzahl_der_Dokumente"
       });
  }

} //ComPackageImpl
