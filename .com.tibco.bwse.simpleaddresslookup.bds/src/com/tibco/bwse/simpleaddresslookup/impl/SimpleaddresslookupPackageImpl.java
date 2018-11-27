package com.tibco.bwse.simpleaddresslookup.impl;

import com.tibco.bwse.simpleaddresslookup.DocumentRoot;
import com.tibco.bwse.simpleaddresslookup.InputType;
import com.tibco.bwse.simpleaddresslookup.OutputType;
import com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupFactory;
import com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage;

import com.tibco.bwse.simpleaddresslookup.bdsutil.BDSActivator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleaddresslookupPackageImpl extends EPackageImpl implements SimpleaddresslookupPackage
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
  private EClass inputTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputTypeEClass = null;

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
   * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimpleaddresslookupPackageImpl()
  {
    super(eNS_URI, SimpleaddresslookupFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SimpleaddresslookupPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimpleaddresslookupPackage init()
  {
    if (isInited) return (SimpleaddresslookupPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleaddresslookupPackage.eNS_URI);

    // Obtain or create and register package
    SimpleaddresslookupPackageImpl theSimpleaddresslookupPackage = (SimpleaddresslookupPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimpleaddresslookupPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimpleaddresslookupPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    XMLTypePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSimpleaddresslookupPackage.createPackageContents();

    // Initialize created meta-data
    theSimpleaddresslookupPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimpleaddresslookupPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimpleaddresslookupPackage.eNS_URI, theSimpleaddresslookupPackage);
    return theSimpleaddresslookupPackage;
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
  public EAttribute getDocumentRoot_Fault()
  {
    return (EAttribute)documentRootEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Input()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_Output()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_InputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentRoot_OutputTypeBDSInternalSerializationElement()
  {
    return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputType()
  {
    return inputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInputType_PostalCode()
  {
    return (EAttribute)inputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputType()
  {
    return outputTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputType_AddressLine1()
  {
    return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputType_AddressLine2()
  {
    return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputType_City()
  {
    return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputType_Country()
  {
    return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputType_Province()
  {
    return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOutputType_PostalCode()
  {
    return (EAttribute)outputTypeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleaddresslookupFactory getSimpleaddresslookupFactory()
  {
    return (SimpleaddresslookupFactory)getEFactoryInstance();
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
    createEAttribute(documentRootEClass, DOCUMENT_ROOT__FAULT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__INPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__OUTPUT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);
    createEReference(documentRootEClass, DOCUMENT_ROOT__OUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT);

    inputTypeEClass = createEClass(INPUT_TYPE);
    createEAttribute(inputTypeEClass, INPUT_TYPE__POSTAL_CODE);

    outputTypeEClass = createEClass(OUTPUT_TYPE);
    createEAttribute(outputTypeEClass, OUTPUT_TYPE__ADDRESS_LINE1);
    createEAttribute(outputTypeEClass, OUTPUT_TYPE__ADDRESS_LINE2);
    createEAttribute(outputTypeEClass, OUTPUT_TYPE__CITY);
    createEAttribute(outputTypeEClass, OUTPUT_TYPE__COUNTRY);
    createEAttribute(outputTypeEClass, OUTPUT_TYPE__PROVINCE);
    createEAttribute(outputTypeEClass, OUTPUT_TYPE__POSTAL_CODE);
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
    initEAttribute(getDocumentRoot_Fault(), theXMLTypePackage.getString(), "fault", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Input(), this.getInputType(), null, "input", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_Output(), this.getOutputType(), null, "output", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_InputTypeBDSInternalSerializationElement(), this.getInputType(), null, "inputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentRoot_OutputTypeBDSInternalSerializationElement(), this.getOutputType(), null, "outputTypeBDSInternalSerializationElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(inputTypeEClass, InputType.class, "InputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInputType_PostalCode(), theXMLTypePackage.getString(), "postalCode", null, 1, 1, InputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(outputTypeEClass, OutputType.class, "OutputType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOutputType_AddressLine1(), theXMLTypePackage.getString(), "addressLine1", null, 1, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutputType_AddressLine2(), theXMLTypePackage.getString(), "addressLine2", null, 1, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutputType_City(), theXMLTypePackage.getString(), "city", null, 1, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutputType_Country(), theXMLTypePackage.getString(), "country", null, 1, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutputType_Province(), theXMLTypePackage.getString(), "province", null, 1, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOutputType_PostalCode(), theXMLTypePackage.getString(), "postalCode", null, 1, 1, OutputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
      (getDocumentRoot_Fault(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Fault",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Input(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Input",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_Output(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Output",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_InputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Input_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getDocumentRoot_OutputTypeBDSInternalSerializationElement(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Output_._type",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (inputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "Input_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getInputType_PostalCode(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "PostalCode",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (outputTypeEClass, 
       source, 
       new String[] 
       {
       "name", "Output_._type",
       "kind", "elementOnly"
       });		
    addAnnotation
      (getOutputType_AddressLine1(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AddressLine1",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getOutputType_AddressLine2(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "AddressLine2",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getOutputType_City(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "City",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getOutputType_Country(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Country",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getOutputType_Province(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "Province",
       "namespace", "##targetNamespace"
       });		
    addAnnotation
      (getOutputType_PostalCode(), 
       source, 
       new String[] 
       {
       "kind", "element",
       "name", "PostalCode",
       "namespace", "##targetNamespace"
       });
  }

} //SimpleaddresslookupPackageImpl
