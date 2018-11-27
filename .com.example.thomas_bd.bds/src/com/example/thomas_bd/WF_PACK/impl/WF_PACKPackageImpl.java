package com.example.thomas_bd.WF_PACK.impl;

import com.example.thomas_bd.WF_PACK.DocumentRoot;
import com.example.thomas_bd.WF_PACK.WF_PACKFactory;
import com.example.thomas_bd.WF_PACK.WF_PACKPackage;

import com.example.thomas_bd.WF_PACK.bdsutil.BDSActivator;

import com.example.thomas_bd.WF_PACK.util.WF_PACKValidator;

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
public class WF_PACKPackageImpl extends EPackageImpl implements WF_PACKPackage
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
  private EClass wF_DATAEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType explanatioN_WF_DATATypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType headeR_WF_DATATypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType postalcodE_WF_DATATypeEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType valuE_WF_DATATypeEDataType = null;

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
   * @see com.example.thomas_bd.WF_PACK.WF_PACKPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WF_PACKPackageImpl()
  {
    super(eNS_URI, WF_PACKFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link WF_PACKPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WF_PACKPackage init()
  {
    if (isInited) return (WF_PACKPackage)EPackage.Registry.INSTANCE.getEPackage(WF_PACKPackage.eNS_URI);

    // Obtain or create and register package
    WF_PACKPackageImpl theWF_PACKPackage = (WF_PACKPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WF_PACKPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WF_PACKPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theWF_PACKPackage.createPackageContents();

    // Initialize created meta-data
    theWF_PACKPackage.initializePackageContents();

    // Register package validator
    EValidator.Registry.INSTANCE.put
      (theWF_PACKPackage, 
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
           return WF_PACKValidator.INSTANCE;
         }
       });

    // Mark meta-data to indicate it can't be changed
    theWF_PACKPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WF_PACKPackage.eNS_URI, theWF_PACKPackage);
    return theWF_PACKPackage;
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
  public EReference getDocumentRoot_WFDATAElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_WF_DATABDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWF_DATA()
  {
    return wF_DATAEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWF_DATA_HEADER()
  {
    return (EAttribute)wF_DATAEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWF_DATA_VALUE()
  {
    return (EAttribute)wF_DATAEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWF_DATA_DATE()
  {
    return (EAttribute)wF_DATAEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWF_DATA_EXPLANATION()
  {
    return (EAttribute)wF_DATAEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWF_DATA_POSTALCODE()
  {
    return (EAttribute)wF_DATAEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getEXPLANATION_WF_DATAType()
  {
    return explanatioN_WF_DATATypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getHEADER_WF_DATAType()
  {
    return headeR_WF_DATATypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getPOSTALCODE_WF_DATAType()
  {
    return postalcodE_WF_DATATypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getVALUE_WF_DATAType()
  {
    return valuE_WF_DATATypeEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WF_PACKFactory getWF_PACKFactory()
  {
    return (WF_PACKFactory)getEFactoryInstance();
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
    createEReference(documentRootEClass, DOCUMENT_ROOT__WFDATA_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__WF_DATABDS_INTERNAL_SERIALIZATION_ELEMENT);

    wF_DATAEClass = createEClass(WF_DATA);
    createEAttribute(wF_DATAEClass, WF_DATA__HEADER);
    createEAttribute(wF_DATAEClass, WF_DATA__VALUE);
    createEAttribute(wF_DATAEClass, WF_DATA__DATE);
    createEAttribute(wF_DATAEClass, WF_DATA__EXPLANATION);
    createEAttribute(wF_DATAEClass, WF_DATA__POSTALCODE);

    // Create data types
    explanatioN_WF_DATATypeEDataType = createEDataType(EXPLANATION_WF_DATA_TYPE);
    headeR_WF_DATATypeEDataType = createEDataType(HEADER_WF_DATA_TYPE);
    postalcodE_WF_DATATypeEDataType = createEDataType(POSTALCODE_WF_DATA_TYPE);
    valuE_WF_DATATypeEDataType = createEDataType(VALUE_WF_DATA_TYPE);
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
    initEReference(getDocumentRoot_WFDATAElement(), this.getWF_DATA(), null, "wFDATAElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_WF_DATABDSInternalSerializationElement(), this.getWF_DATA(), null, "wF_DATABDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(wF_DATAEClass, com.example.thomas_bd.WF_PACK.WF_DATA.class, "WF_DATA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWF_DATA_HEADER(), this.getHEADER_WF_DATAType(), "HEADER", null, 1, 1, com.example.thomas_bd.WF_PACK.WF_DATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWF_DATA_VALUE(), this.getVALUE_WF_DATAType(), "VALUE", null, 1, 1, com.example.thomas_bd.WF_PACK.WF_DATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWF_DATA_DATE(), theXMLTypePackage.getDate(), "DATE", null, 1, 1, com.example.thomas_bd.WF_PACK.WF_DATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWF_DATA_EXPLANATION(), this.getEXPLANATION_WF_DATAType(), "EXPLANATION", null, 0, 1, com.example.thomas_bd.WF_PACK.WF_DATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWF_DATA_POSTALCODE(), this.getPOSTALCODE_WF_DATAType(), "POSTALCODE", null, 1, 1, com.example.thomas_bd.WF_PACK.WF_DATA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize data types
    initEDataType(explanatioN_WF_DATATypeEDataType, String.class, "EXPLANATION_WF_DATAType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(headeR_WF_DATATypeEDataType, String.class, "HEADER_WF_DATAType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(postalcodE_WF_DATATypeEDataType, String.class, "POSTALCODE_WF_DATAType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(valuE_WF_DATATypeEDataType, String.class, "VALUE_WF_DATAType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // bds
    createBdsAnnotations();
    // teneo.jpa
    createTeneoAnnotations();
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>bds</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createBdsAnnotations()
  {
    String source = "bds";			
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "BomFileName", "L/Thomas_BD/Business Objects/Thomas_BD.bom",
       "majorVersion", "1",
       "ecoreFormat", "1",
       "label", "WF_PACK"
       });														
    addAnnotation
      (wF_DATAEClass, 
       source, 
       new String[] 
       {
       "label", "WF_DATA"
       });						
  }

  /**
   * Initializes the annotations for <b>teneo.jpa</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createTeneoAnnotations()
  {
    String source = "teneo.jpa";				
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "value", "@GenericGenerator(name=\"bdsIdGenerator\", strategy=\"native\")"
       });														
    addAnnotation
      (wF_DATAEClass, 
       source, 
       new String[] 
       {
       "value", "@Transient"
       });					
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
      (getDocumentRoot_WFDATAElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "WF_DATAElement",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_WF_DATABDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "WF_DATA",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (explanatioN_WF_DATATypeEDataType, 
       source, 
       new String[] 
       {
       "name", "EXPLANATION_WF_DATA_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "500"
       });		
    addAnnotation
      (headeR_WF_DATATypeEDataType, 
       source, 
       new String[] 
       {
       "name", "HEADER_WF_DATA_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (postalcodE_WF_DATATypeEDataType, 
       source, 
       new String[] 
       {
       "name", "POSTALCODE_WF_DATA_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (valuE_WF_DATATypeEDataType, 
       source, 
       new String[] 
       {
       "name", "VALUE_WF_DATA_._type",
       "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
       "maxLength", "50"
       });		
    addAnnotation
      (wF_DATAEClass, 
       source, 
       new String[] 
       {
       "name", "WF_DATA",
       "kind", "elementOnly"
       });				
    addAnnotation
      (getWF_DATA_HEADER(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "HEADER"
       });		
    addAnnotation
      (getWF_DATA_VALUE(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "VALUE"
       });		
    addAnnotation
      (getWF_DATA_DATE(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "DATE"
       });		
    addAnnotation
      (getWF_DATA_EXPLANATION(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "EXPLANATION"
       });		
    addAnnotation
      (getWF_DATA_POSTALCODE(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "POSTALCODE"
       });
  }

} //WF_PACKPackageImpl
