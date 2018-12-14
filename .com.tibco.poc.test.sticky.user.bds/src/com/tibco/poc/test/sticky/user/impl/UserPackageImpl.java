package com.tibco.poc.test.sticky.user.impl;

import com.tibco.poc.test.sticky.user.DocumentRoot;
import com.tibco.poc.test.sticky.user.UserFactory;
import com.tibco.poc.test.sticky.user.UserPackage;

import com.tibco.poc.test.sticky.user.bdsutil.BDSActivator;

import com.tibco.poc.test.sticky.user.pocDBRequest;
import com.tibco.poc.test.sticky.user.pocMetaData;

import com.tibco.poc.test.sticky.user.util.UserValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserPackageImpl extends EPackageImpl implements UserPackage
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
  private EClass documentRootEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pocDBRequestEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pocMetaDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType ahvNummer_pocMetaDataTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType dokumentenArt_pocMetaDataTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType kanton_pocMetaDataTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType partnerID_pocMetaDataTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType wfCaseID_pocMetaDataTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType wfCaseID_pocDBRequestTypeEDataType = null;

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
   * @see com.tibco.poc.test.sticky.user.UserPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UserPackageImpl()
  {
    super(eNS_URI, UserFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link UserPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static UserPackage init()
  {
    if (isInited) return (UserPackage)EPackage.Registry.INSTANCE.getEPackage(UserPackage.eNS_URI);

    // Obtain or create and register package
    UserPackageImpl theUserPackage = (UserPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UserPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UserPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theUserPackage.createPackageContents();

    // Initialize created meta-data
    theUserPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theUserPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return UserValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theUserPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(UserPackage.eNS_URI, theUserPackage);
    return theUserPackage;
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
  public EReference getDocumentRoot_PocDBRequestElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_PocMetaDataElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_PocDBRequestBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_PocMetaDataBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpocDBRequest()
  {
    return pocDBRequestEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpocDBRequest_WFCaseID()
  {
    return (EAttribute)pocDBRequestEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getpocMetaData()
  {
    return pocMetaDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpocMetaData_WFCaseID()
  {
    return (EAttribute)pocMetaDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpocMetaData_AHVNummer()
  {
    return (EAttribute)pocMetaDataEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpocMetaData_PartnerID()
  {
    return (EAttribute)pocMetaDataEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpocMetaData_DokumentenArt()
  {
    return (EAttribute)pocMetaDataEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpocMetaData_Kanton()
  {
    return (EAttribute)pocMetaDataEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getpocMetaData_Frist()
  {
    return (EAttribute)pocMetaDataEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getAHVNummer_pocMetaDataType()
  {
    return ahvNummer_pocMetaDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getdokumentenArt_pocMetaDataType()
  {
    return dokumentenArt_pocMetaDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getkanton_pocMetaDataType()
  {
    return kanton_pocMetaDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getpartnerID_pocMetaDataType()
  {
    return partnerID_pocMetaDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getWFCaseID_pocMetaDataType()
  {
    return wfCaseID_pocMetaDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getWFCaseID_pocDBRequestType()
  {
    return wfCaseID_pocDBRequestTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UserFactory getUserFactory()
  {
    return (UserFactory)getEFactoryInstance();
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
    documentRootEClass = createEClass(DOCUMENT_ROOT);
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    createEReference(documentRootEClass, DOCUMENT_ROOT__POC_DB_REQUEST_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__POC_META_DATA_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__POC_DB_REQUEST_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__POC_META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT);

    pocDBRequestEClass = createEClass(POC_DB_REQUEST);
    createEAttribute(pocDBRequestEClass, POC_DB_REQUEST__WF_CASE_ID);

    pocMetaDataEClass = createEClass(POC_META_DATA);
    createEAttribute(pocMetaDataEClass, POC_META_DATA__WF_CASE_ID);
    createEAttribute(pocMetaDataEClass, POC_META_DATA__AHV_NUMMER);
    createEAttribute(pocMetaDataEClass, POC_META_DATA__PARTNER_ID);
    createEAttribute(pocMetaDataEClass, POC_META_DATA__DOKUMENTEN_ART);
    createEAttribute(pocMetaDataEClass, POC_META_DATA__KANTON);
    createEAttribute(pocMetaDataEClass, POC_META_DATA__FRIST);

    // Create data types
    ahvNummer_pocMetaDataTypeEDataType = createEDataType(AHV_NUMMER_POC_META_DATA_TYPE);
    dokumentenArt_pocMetaDataTypeEDataType = createEDataType(DOKUMENTEN_ART_POC_META_DATA_TYPE);
    kanton_pocMetaDataTypeEDataType = createEDataType(KANTON_POC_META_DATA_TYPE);
    partnerID_pocMetaDataTypeEDataType = createEDataType(PARTNER_ID_POC_META_DATA_TYPE);
    wfCaseID_pocMetaDataTypeEDataType = createEDataType(WF_CASE_ID_POC_META_DATA_TYPE);
    wfCaseID_pocDBRequestTypeEDataType = createEDataType(WF_CASE_ID_POC_DB_REQUEST_TYPE);
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
    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_PocDBRequestElement(), this.getpocDBRequest(), null, "pocDBRequestElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_PocMetaDataElement(), this.getpocMetaData(), null, "pocMetaDataElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_PocDBRequestBDSInternalSerializationElement(), this.getpocDBRequest(), null, "pocDBRequestBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_PocMetaDataBDSInternalSerializationElement(), this.getpocMetaData(), null, "pocMetaDataBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(pocDBRequestEClass, pocDBRequest.class, "pocDBRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpocDBRequest_WFCaseID(), this.getWFCaseID_pocDBRequestType(), "WFCaseID", null, 1, 1, pocDBRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pocMetaDataEClass, pocMetaData.class, "pocMetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getpocMetaData_WFCaseID(), this.getWFCaseID_pocMetaDataType(), "WFCaseID", null, 0, 1, pocMetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpocMetaData_AHVNummer(), this.getAHVNummer_pocMetaDataType(), "AHVNummer", null, 1, 1, pocMetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpocMetaData_PartnerID(), this.getpartnerID_pocMetaDataType(), "partnerID", null, 1, 1, pocMetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpocMetaData_DokumentenArt(), this.getdokumentenArt_pocMetaDataType(), "dokumentenArt", null, 0, 1, pocMetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpocMetaData_Kanton(), this.getkanton_pocMetaDataType(), "kanton", null, 1, 1, pocMetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getpocMetaData_Frist(), theXMLTypePackage.getDateTime(), "frist", null, 0, 1, pocMetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(ahvNummer_pocMetaDataTypeEDataType, String.class, "AHVNummer_pocMetaDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(dokumentenArt_pocMetaDataTypeEDataType, String.class, "dokumentenArt_pocMetaDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(kanton_pocMetaDataTypeEDataType, String.class, "kanton_pocMetaDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(partnerID_pocMetaDataTypeEDataType, String.class, "partnerID_pocMetaDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(wfCaseID_pocMetaDataTypeEDataType, String.class, "WFCaseID_pocMetaDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(wfCaseID_pocDBRequestTypeEDataType, String.class, "WFCaseID_pocDBRequestType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
      (ahvNummer_pocMetaDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "AHVNummer_pocMetaData_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
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
      (getDocumentRoot_PocDBRequestElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "pocDBRequestElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_PocMetaDataElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "pocMetaDataElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_PocDBRequestBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "pocDBRequest",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_PocMetaDataBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "pocMetaData",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (dokumentenArt_pocMetaDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "dokumentenArt_pocMetaData_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (kanton_pocMetaDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "kanton_pocMetaData_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (partnerID_pocMetaDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "partnerID_pocMetaData_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (pocDBRequestEClass, 
       source, 
       new String[] 
       {
       "name", "pocDBRequest",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getpocDBRequest_WFCaseID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "WFCaseID"
       });		
    addAnnotation
      (pocMetaDataEClass, 
       source, 
       new String[] 
       {
       "name", "pocMetaData",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getpocMetaData_WFCaseID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "WFCaseID"
       });		
    addAnnotation
      (getpocMetaData_AHVNummer(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AHVNummer"
       });		
    addAnnotation
      (getpocMetaData_PartnerID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "partnerID"
       });		
    addAnnotation
      (getpocMetaData_DokumentenArt(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "dokumentenArt"
       });		
    addAnnotation
      (getpocMetaData_Kanton(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "kanton"
       });		
    addAnnotation
      (getpocMetaData_Frist(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "frist"
       });		
    addAnnotation
      (wfCaseID_pocMetaDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "WFCaseID_pocMetaData_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (wfCaseID_pocDBRequestTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "WFCaseID_pocDBRequest_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });
  }

} //UserPackageImpl
