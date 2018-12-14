package com.example.comigsfak001.impl;

import com.example.comigsfak001.Comigsfak001Factory;
import com.example.comigsfak001.Comigsfak001Package;
import com.example.comigsfak001.DocumentRoot;
import com.example.comigsfak001.Geschaeftsvorfall;

import com.example.comigsfak001.bdsutil.BDSActivator;

import com.example.comigsfak001.util.Comigsfak001Validator;

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
public class Comigsfak001PackageImpl extends EPackageImpl implements Comigsfak001Package
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
  private EClass geschaeftsvorfallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType ahvNummer_GeschaeftsvorfallTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType dokumentenArt_GeschaeftsvorfallTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType geschaeftsfall_GeschaeftsvorfallTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType partnerID_GeschaeftsvorfallTypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType wfCaseID_GeschaeftsvorfallTypeEDataType = null;

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
   * @see com.example.comigsfak001.Comigsfak001Package#eNS_URI
   * @see #init()
   * @generated
   */
  private Comigsfak001PackageImpl()
  {
    super(eNS_URI, Comigsfak001Factory.eINSTANCE);
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
   * <p>This method is used to initialize {@link Comigsfak001Package#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Comigsfak001Package init()
  {
    if (isInited) return (Comigsfak001Package)EPackage.Registry.INSTANCE.getEPackage(Comigsfak001Package.eNS_URI);

    // Obtain or create and register package
    Comigsfak001PackageImpl theComigsfak001Package = (Comigsfak001PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Comigsfak001PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Comigsfak001PackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theComigsfak001Package.createPackageContents();

    // Initialize created meta-data
    theComigsfak001Package.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theComigsfak001Package, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return Comigsfak001Validator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theComigsfak001Package.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Comigsfak001Package.eNS_URI, theComigsfak001Package);
    return theComigsfak001Package;
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
  public EReference getDocumentRoot_GeschaeftsvorfallElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_GeschaeftsvorfallBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeschaeftsvorfall()
  {
    return geschaeftsvorfallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeschaeftsvorfall_WFCaseID()
  {
    return (EAttribute)geschaeftsvorfallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeschaeftsvorfall_AHVNummer()
  {
    return (EAttribute)geschaeftsvorfallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeschaeftsvorfall_PartnerID()
  {
    return (EAttribute)geschaeftsvorfallEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeschaeftsvorfall_DokumentenArt()
  {
    return (EAttribute)geschaeftsvorfallEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeschaeftsvorfall_Geschaeftsfall()
  {
    return (EAttribute)geschaeftsvorfallEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeschaeftsvorfall_Frist()
  {
    return (EAttribute)geschaeftsvorfallEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getAHVNummer_GeschaeftsvorfallType()
  {
    return ahvNummer_GeschaeftsvorfallTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getdokumentenArt_GeschaeftsvorfallType()
  {
    return dokumentenArt_GeschaeftsvorfallTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getgeschaeftsfall_GeschaeftsvorfallType()
  {
    return geschaeftsfall_GeschaeftsvorfallTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getpartnerID_GeschaeftsvorfallType()
  {
    return partnerID_GeschaeftsvorfallTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getWFCaseID_GeschaeftsvorfallType()
  {
    return wfCaseID_GeschaeftsvorfallTypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comigsfak001Factory getComigsfak001Factory()
  {
    return (Comigsfak001Factory)getEFactoryInstance();
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
    createEReference(documentRootEClass, DOCUMENT_ROOT__GESCHAEFTSVORFALL_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__GESCHAEFTSVORFALL_BDS_INTERNAL_SERIALIZATION_ELEMENT);

    geschaeftsvorfallEClass = createEClass(GESCHAEFTSVORFALL);
    createEAttribute(geschaeftsvorfallEClass, GESCHAEFTSVORFALL__WF_CASE_ID);
    createEAttribute(geschaeftsvorfallEClass, GESCHAEFTSVORFALL__AHV_NUMMER);
    createEAttribute(geschaeftsvorfallEClass, GESCHAEFTSVORFALL__PARTNER_ID);
    createEAttribute(geschaeftsvorfallEClass, GESCHAEFTSVORFALL__DOKUMENTEN_ART);
    createEAttribute(geschaeftsvorfallEClass, GESCHAEFTSVORFALL__GESCHAEFTSFALL);
    createEAttribute(geschaeftsvorfallEClass, GESCHAEFTSVORFALL__FRIST);

    // Create data types
    ahvNummer_GeschaeftsvorfallTypeEDataType = createEDataType(AHV_NUMMER_GESCHAEFTSVORFALL_TYPE);
    dokumentenArt_GeschaeftsvorfallTypeEDataType = createEDataType(DOKUMENTEN_ART_GESCHAEFTSVORFALL_TYPE);
    geschaeftsfall_GeschaeftsvorfallTypeEDataType = createEDataType(GESCHAEFTSFALL_GESCHAEFTSVORFALL_TYPE);
    partnerID_GeschaeftsvorfallTypeEDataType = createEDataType(PARTNER_ID_GESCHAEFTSVORFALL_TYPE);
    wfCaseID_GeschaeftsvorfallTypeEDataType = createEDataType(WF_CASE_ID_GESCHAEFTSVORFALL_TYPE);
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
    initEReference(getDocumentRoot_GeschaeftsvorfallElement(), this.getGeschaeftsvorfall(), null, "geschaeftsvorfallElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_GeschaeftsvorfallBDSInternalSerializationElement(), this.getGeschaeftsvorfall(), null, "geschaeftsvorfallBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(geschaeftsvorfallEClass, Geschaeftsvorfall.class, "Geschaeftsvorfall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeschaeftsvorfall_WFCaseID(), this.getWFCaseID_GeschaeftsvorfallType(), "WFCaseID", null, 1, 1, Geschaeftsvorfall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeschaeftsvorfall_AHVNummer(), this.getAHVNummer_GeschaeftsvorfallType(), "AHVNummer", null, 0, 1, Geschaeftsvorfall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeschaeftsvorfall_PartnerID(), this.getpartnerID_GeschaeftsvorfallType(), "partnerID", null, 0, 1, Geschaeftsvorfall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeschaeftsvorfall_DokumentenArt(), this.getdokumentenArt_GeschaeftsvorfallType(), "dokumentenArt", null, 0, 1, Geschaeftsvorfall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeschaeftsvorfall_Geschaeftsfall(), this.getgeschaeftsfall_GeschaeftsvorfallType(), "geschaeftsfall", null, 0, 1, Geschaeftsvorfall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeschaeftsvorfall_Frist(), theXMLTypePackage.getDateTime(), "frist", null, 0, 1, Geschaeftsvorfall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(ahvNummer_GeschaeftsvorfallTypeEDataType, String.class, "AHVNummer_GeschaeftsvorfallType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(dokumentenArt_GeschaeftsvorfallTypeEDataType, String.class, "dokumentenArt_GeschaeftsvorfallType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(geschaeftsfall_GeschaeftsvorfallTypeEDataType, String.class, "geschaeftsfall_GeschaeftsvorfallType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(partnerID_GeschaeftsvorfallTypeEDataType, String.class, "partnerID_GeschaeftsvorfallType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(wfCaseID_GeschaeftsvorfallTypeEDataType, String.class, "WFCaseID_GeschaeftsvorfallType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
      (ahvNummer_GeschaeftsvorfallTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "AHVNummer_Geschaeftsvorfall_._type",
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
      (getDocumentRoot_GeschaeftsvorfallElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "GeschaeftsvorfallElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_GeschaeftsvorfallBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Geschaeftsvorfall",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (dokumentenArt_GeschaeftsvorfallTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "dokumentenArt_Geschaeftsvorfall_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (geschaeftsfall_GeschaeftsvorfallTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "geschaeftsfall_Geschaeftsvorfall_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "500"
       });		
    addAnnotation
      (geschaeftsvorfallEClass, 
       source, 
       new String[] 
       {
       "name", "Geschaeftsvorfall",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getGeschaeftsvorfall_WFCaseID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "WFCaseID"
       });		
    addAnnotation
      (getGeschaeftsvorfall_AHVNummer(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AHVNummer"
       });		
    addAnnotation
      (getGeschaeftsvorfall_PartnerID(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "partnerID"
       });		
    addAnnotation
      (getGeschaeftsvorfall_DokumentenArt(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "dokumentenArt"
       });		
    addAnnotation
      (getGeschaeftsvorfall_Geschaeftsfall(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "geschaeftsfall"
       });		
    addAnnotation
      (getGeschaeftsvorfall_Frist(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "frist"
       });		
    addAnnotation
      (partnerID_GeschaeftsvorfallTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "partnerID_Geschaeftsvorfall_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (wfCaseID_GeschaeftsvorfallTypeEDataType, 
       source, 
       new String[] 
       {
       "name", "WFCaseID_Geschaeftsvorfall_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });
  }

} //Comigsfak001PackageImpl
