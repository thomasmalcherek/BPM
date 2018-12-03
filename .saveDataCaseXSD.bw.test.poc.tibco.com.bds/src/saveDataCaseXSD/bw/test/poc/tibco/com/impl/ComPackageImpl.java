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
import saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType;

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
  private EClass getDataResponseFromCaseIDTypeEClass = null;

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
  public EAttribute getCreateCaseIDRequestFromBPMType_PartnerID()
  {
    return (EAttribute)createCaseIDRequestFromBPMTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestFromBPMType_DokumentenArt()
  {
    return (EAttribute)createCaseIDRequestFromBPMTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestFromBPMType_Kanton()
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
  public EAttribute getCreateCaseIDRequestType_PartnerID()
  {
    return (EAttribute)createCaseIDRequestTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestType_DokumentenArt()
  {
    return (EAttribute)createCaseIDRequestTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreateCaseIDRequestType_Kanton()
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
  public EReference getDocumentRoot_GetDataResponseFromCaseID()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateCaseIDRequestTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_CreateCaseIDResponseTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_GetDataRequestFromCaseIDTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_GetDataResponseFromCaseIDTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
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
  public EClass getGetDataResponseFromCaseIDType()
  {
    return getDataResponseFromCaseIDTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDataResponseFromCaseIDType_CaseID()
  {
    return (EAttribute)getDataResponseFromCaseIDTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDataResponseFromCaseIDType_AHVNummer()
  {
    return (EAttribute)getDataResponseFromCaseIDTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDataResponseFromCaseIDType_PartnerID()
  {
    return (EAttribute)getDataResponseFromCaseIDTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDataResponseFromCaseIDType_DokumentenArt()
  {
    return (EAttribute)getDataResponseFromCaseIDTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGetDataResponseFromCaseIDType_Kanton()
  {
    return (EAttribute)getDataResponseFromCaseIDTypeEClass.getEStructuralFeatures().get(4);
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
    createEAttribute(createCaseIDRequestFromBPMTypeEClass, CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__PARTNER_ID);
    createEAttribute(createCaseIDRequestFromBPMTypeEClass, CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__DOKUMENTEN_ART);
    createEAttribute(createCaseIDRequestFromBPMTypeEClass, CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__KANTON);

    createCaseIDRequestTypeEClass = createEClass(CREATE_CASE_ID_REQUEST_TYPE);
    createEAttribute(createCaseIDRequestTypeEClass, CREATE_CASE_ID_REQUEST_TYPE__AHV_NUMMER);
    createEAttribute(createCaseIDRequestTypeEClass, CREATE_CASE_ID_REQUEST_TYPE__PARTNER_ID);
    createEAttribute(createCaseIDRequestTypeEClass, CREATE_CASE_ID_REQUEST_TYPE__DOKUMENTEN_ART);
    createEAttribute(createCaseIDRequestTypeEClass, CREATE_CASE_ID_REQUEST_TYPE__KANTON);

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
    createEReference(documentRootEClass, DOCUMENT_ROOT__GET_DATA_RESPONSE_FROM_CASE_ID);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATE_CASE_ID_REQUEST_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__CREATE_CASE_ID_RESPONSE_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GET_DATA_REQUEST_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GET_DATA_RESPONSE_FROM_CASE_ID_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);

    getDataRequestFromCaseIDTypeEClass = createEClass(GET_DATA_REQUEST_FROM_CASE_ID_TYPE);
    createEAttribute(getDataRequestFromCaseIDTypeEClass, GET_DATA_REQUEST_FROM_CASE_ID_TYPE__CASE_ID);

    getDataResponseFromCaseIDTypeEClass = createEClass(GET_DATA_RESPONSE_FROM_CASE_ID_TYPE);
    createEAttribute(getDataResponseFromCaseIDTypeEClass, GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__CASE_ID);
    createEAttribute(getDataResponseFromCaseIDTypeEClass, GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__AHV_NUMMER);
    createEAttribute(getDataResponseFromCaseIDTypeEClass, GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__PARTNER_ID);
    createEAttribute(getDataResponseFromCaseIDTypeEClass, GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__DOKUMENTEN_ART);
    createEAttribute(getDataResponseFromCaseIDTypeEClass, GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__KANTON);
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
    initEAttribute(getCreateCaseIDRequestFromBPMType_PartnerID(), theXMLTypePackage.getString(), "partnerID", null, 1, 1, CreateCaseIDRequestFromBPMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateCaseIDRequestFromBPMType_DokumentenArt(), theXMLTypePackage.getString(), "dokumentenArt", null, 1, 1, CreateCaseIDRequestFromBPMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateCaseIDRequestFromBPMType_Kanton(), theXMLTypePackage.getString(), "kanton", null, 1, 1, CreateCaseIDRequestFromBPMType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(createCaseIDRequestTypeEClass, CreateCaseIDRequestType.class, "CreateCaseIDRequestType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreateCaseIDRequestType_AHVNummer(), theXMLTypePackage.getString(), "AHVNummer", null, 1, 1, CreateCaseIDRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateCaseIDRequestType_PartnerID(), theXMLTypePackage.getString(), "partnerID", null, 1, 1, CreateCaseIDRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateCaseIDRequestType_DokumentenArt(), theXMLTypePackage.getString(), "dokumentenArt", null, 1, 1, CreateCaseIDRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCreateCaseIDRequestType_Kanton(), theXMLTypePackage.getString(), "kanton", null, 1, 1, CreateCaseIDRequestType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEReference(getDocumentRoot_GetDataResponseFromCaseID(), this.getGetDataResponseFromCaseIDType(), null, "getDataResponseFromCaseID", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateCaseIDRequestFromBPMTypeBDSInternalSerializationElement(), this.getCreateCaseIDRequestFromBPMType(), null, "createCaseIDRequestFromBPMTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateCaseIDRequestTypeBDSInternalSerializationElement(), this.getCreateCaseIDRequestType(), null, "createCaseIDRequestTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateCaseIDResponseFromBPMTypeBDSInternalSerializationElement(), this.getCreateCaseIDResponseFromBPMType(), null, "createCaseIDResponseFromBPMTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_CreateCaseIDResponseTypeBDSInternalSerializationElement(), this.getCreateCaseIDResponseType(), null, "createCaseIDResponseTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_GetDataRequestFromCaseIDTypeBDSInternalSerializationElement(), this.getGetDataRequestFromCaseIDType(), null, "getDataRequestFromCaseIDTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_GetDataResponseFromCaseIDTypeBDSInternalSerializationElement(), this.getGetDataResponseFromCaseIDType(), null, "getDataResponseFromCaseIDTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(getDataRequestFromCaseIDTypeEClass, GetDataRequestFromCaseIDType.class, "GetDataRequestFromCaseIDType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGetDataRequestFromCaseIDType_CaseID(), theXMLTypePackage.getString(), "caseID", null, 1, 1, GetDataRequestFromCaseIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getDataResponseFromCaseIDTypeEClass, GetDataResponseFromCaseIDType.class, "GetDataResponseFromCaseIDType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGetDataResponseFromCaseIDType_CaseID(), theXMLTypePackage.getString(), "caseID", null, 1, 1, GetDataResponseFromCaseIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDataResponseFromCaseIDType_AHVNummer(), theXMLTypePackage.getString(), "AHVNummer", null, 1, 1, GetDataResponseFromCaseIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDataResponseFromCaseIDType_PartnerID(), theXMLTypePackage.getString(), "partnerID", null, 1, 1, GetDataResponseFromCaseIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDataResponseFromCaseIDType_DokumentenArt(), theXMLTypePackage.getString(), "dokumentenArt", null, 1, 1, GetDataResponseFromCaseIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGetDataResponseFromCaseIDType_Kanton(), theXMLTypePackage.getString(), "kanton", null, 1, 1, GetDataResponseFromCaseIDType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
      (getCreateCaseIDRequestFromBPMType_PartnerID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Partner-ID"
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
      (getCreateCaseIDRequestFromBPMType_Kanton(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Kanton"
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
      (getCreateCaseIDRequestType_PartnerID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Partner-ID"
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
      (getCreateCaseIDRequestType_Kanton(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Kanton"
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
      (getDocumentRoot_GetDataResponseFromCaseID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "GetDataResponseFromCaseID",
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
      (getDocumentRoot_GetDataResponseFromCaseIDTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "GetDataResponseFromCaseID_._type",
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
      (getDataResponseFromCaseIDTypeEClass, 
       source, 
       new String[] 
       {
       "name", "GetDataResponseFromCaseID_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getGetDataResponseFromCaseIDType_CaseID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "CaseID"
       });		
    addAnnotation
      (getGetDataResponseFromCaseIDType_AHVNummer(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AHV-Nummer"
       });		
    addAnnotation
      (getGetDataResponseFromCaseIDType_PartnerID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Partner-ID"
       });		
    addAnnotation
      (getGetDataResponseFromCaseIDType_DokumentenArt(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Dokumenten-Art"
       });		
    addAnnotation
      (getGetDataResponseFromCaseIDType_Kanton(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Kanton"
       });
  }

} //ComPackageImpl
