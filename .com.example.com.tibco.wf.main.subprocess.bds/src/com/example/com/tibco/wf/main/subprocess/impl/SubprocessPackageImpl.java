package com.example.com.tibco.wf.main.subprocess.impl;

import com.example.com.tibco.wf.main.subprocess.DocumentRoot;
import com.example.com.tibco.wf.main.subprocess.MetaData;
import com.example.com.tibco.wf.main.subprocess.SubprocessFactory;
import com.example.com.tibco.wf.main.subprocess.SubprocessPackage;

import com.example.com.tibco.wf.main.subprocess.bdsutil.BDSActivator;

import com.example.com.tibco.wf.main.subprocess.util.SubprocessValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubprocessPackageImpl extends EPackageImpl implements SubprocessPackage
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
  private EClass metaDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType ahvNummer_MetaDataTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType dokumentenArt_MetaDataTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType kanton_MetaDataTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType partnerID_MetaDataTypeEDataType = null;

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
   * @see com.example.com.tibco.wf.main.subprocess.SubprocessPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SubprocessPackageImpl()
  {
    super(eNS_URI, SubprocessFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SubprocessPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SubprocessPackage init()
  {
    if (isInited) return (SubprocessPackage)EPackage.Registry.INSTANCE.getEPackage(SubprocessPackage.eNS_URI);

    // Obtain or create and register package
    SubprocessPackageImpl theSubprocessPackage = (SubprocessPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SubprocessPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SubprocessPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSubprocessPackage.createPackageContents();

    // Initialize created meta-data
    theSubprocessPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theSubprocessPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return SubprocessValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theSubprocessPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SubprocessPackage.eNS_URI, theSubprocessPackage);
    return theSubprocessPackage;
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
  public EReference getDocumentRoot_MetaDataElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_MetaDataBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaData()
  {
    return metaDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaData_AHVNummer()
  {
    return (EAttribute)metaDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaData_PartnerID()
  {
    return (EAttribute)metaDataEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaData_DokumentenArt()
  {
    return (EAttribute)metaDataEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetaData_Kanton()
  {
    return (EAttribute)metaDataEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getAHVNummer_MetaDataType()
  {
    return ahvNummer_MetaDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getdokumentenArt_MetaDataType()
  {
    return dokumentenArt_MetaDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getkanton_MetaDataType()
  {
    return kanton_MetaDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getpartnerID_MetaDataType()
  {
    return partnerID_MetaDataTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubprocessFactory getSubprocessFactory()
  {
    return (SubprocessFactory)getEFactoryInstance();
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
    createEReference(documentRootEClass, DOCUMENT_ROOT__META_DATA_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT);

    metaDataEClass = createEClass(META_DATA);
    createEAttribute(metaDataEClass, META_DATA__AHV_NUMMER);
    createEAttribute(metaDataEClass, META_DATA__PARTNER_ID);
    createEAttribute(metaDataEClass, META_DATA__DOKUMENTEN_ART);
    createEAttribute(metaDataEClass, META_DATA__KANTON);

    // Create data types
    ahvNummer_MetaDataTypeEDataType = createEDataType(AHV_NUMMER_META_DATA_TYPE);
    dokumentenArt_MetaDataTypeEDataType = createEDataType(DOKUMENTEN_ART_META_DATA_TYPE);
    kanton_MetaDataTypeEDataType = createEDataType(KANTON_META_DATA_TYPE);
    partnerID_MetaDataTypeEDataType = createEDataType(PARTNER_ID_META_DATA_TYPE);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_MetaDataElement(), this.getMetaData(), null, "metaDataElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_MetaDataBDSInternalSerializationElement(), this.getMetaData(), null, "metaDataBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(metaDataEClass, MetaData.class, "MetaData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMetaData_AHVNummer(), this.getAHVNummer_MetaDataType(), "AHVNummer", null, 1, 1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaData_PartnerID(), this.getpartnerID_MetaDataType(), "partnerID", null, 1, 1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaData_DokumentenArt(), this.getdokumentenArt_MetaDataType(), "dokumentenArt", null, 0, 1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetaData_Kanton(), this.getkanton_MetaDataType(), "kanton", null, 1, 1, MetaData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(ahvNummer_MetaDataTypeEDataType, String.class, "AHVNummer_MetaDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(dokumentenArt_MetaDataTypeEDataType, String.class, "dokumentenArt_MetaDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(kanton_MetaDataTypeEDataType, String.class, "kanton_MetaDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(partnerID_MetaDataTypeEDataType, String.class, "partnerID_MetaDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
      (ahvNummer_MetaDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "AHVNummer_MetaData_._type",
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
      (getDocumentRoot_MetaDataElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "MetaDataElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_MetaDataBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "MetaData",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (dokumentenArt_MetaDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "dokumentenArt_MetaData_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (kanton_MetaDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "kanton_MetaData_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (metaDataEClass, 
       source, 
       new String[] 
       {
       "name", "MetaData",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getMetaData_AHVNummer(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AHVNummer"
       });		
    addAnnotation
      (getMetaData_PartnerID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "partnerID"
       });		
    addAnnotation
      (getMetaData_DokumentenArt(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "dokumentenArt"
       });		
    addAnnotation
      (getMetaData_Kanton(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "kanton"
       });		
    addAnnotation
      (partnerID_MetaDataTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "partnerID_MetaData_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });
  }

} //SubprocessPackageImpl
