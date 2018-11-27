
package com.tibco.bwse.simpleaddresslookup;

import com.tibco.bwse.simpleaddresslookup.bdsutil.BDSValidationUtils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * BOMORIGIN::/Thomas_WF/Generated Business Objects/com.tibco.bwse.simpleaddresslookup.bom
 * <!-- end-model-doc -->
 * @see com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleaddresslookupPackage extends EPackage
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
  String eNAME = "simpleaddresslookup";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.tibco.com/bwse/simpleaddresslookup";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "simpleaddresslookup";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimpleaddresslookupPackage eINSTANCE = com.tibco.bwse.simpleaddresslookup.impl.SimpleaddresslookupPackageImpl.init();

  /**
   * The meta object id for the '{@link com.tibco.bwse.simpleaddresslookup.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.bwse.simpleaddresslookup.impl.DocumentRootImpl
   * @see com.tibco.bwse.simpleaddresslookup.impl.SimpleaddresslookupPackageImpl#getDocumentRoot()
   * @generated
   */
  int DOCUMENT_ROOT = 0;

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
   * The feature id for the '<em><b>Fault</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__FAULT = 3;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__INPUT = 4;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__OUTPUT = 5;

  /**
   * The feature id for the '<em><b>Input Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Output Type BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__OUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = 7;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link com.tibco.bwse.simpleaddresslookup.impl.InputTypeImpl <em>Input Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.bwse.simpleaddresslookup.impl.InputTypeImpl
   * @see com.tibco.bwse.simpleaddresslookup.impl.SimpleaddresslookupPackageImpl#getInputType()
   * @generated
   */
  int INPUT_TYPE = 1;

  /**
   * The feature id for the '<em><b>Postal Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE__POSTAL_CODE = 0;

  /**
   * The number of structural features of the '<em>Input Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tibco.bwse.simpleaddresslookup.impl.OutputTypeImpl <em>Output Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.bwse.simpleaddresslookup.impl.OutputTypeImpl
   * @see com.tibco.bwse.simpleaddresslookup.impl.SimpleaddresslookupPackageImpl#getOutputType()
   * @generated
   */
  int OUTPUT_TYPE = 2;

  /**
   * The feature id for the '<em><b>Address Line1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TYPE__ADDRESS_LINE1 = 0;

  /**
   * The feature id for the '<em><b>Address Line2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TYPE__ADDRESS_LINE2 = 1;

  /**
   * The feature id for the '<em><b>City</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TYPE__CITY = 2;

  /**
   * The feature id for the '<em><b>Country</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TYPE__COUNTRY = 3;

  /**
   * The feature id for the '<em><b>Province</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TYPE__PROVINCE = 4;

  /**
   * The feature id for the '<em><b>Postal Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TYPE__POSTAL_CODE = 5;

  /**
   * The number of structural features of the '<em>Output Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_TYPE_FEATURE_COUNT = 6;


  /**
   * Returns the meta object for class '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getFault <em>Fault</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fault</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.DocumentRoot#getFault()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Fault();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.DocumentRoot#getInput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Input();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.DocumentRoot#getOutput()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_Output();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getInputTypeBDSInternalSerializationElement <em>Input Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.DocumentRoot#getInputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_InputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.bwse.simpleaddresslookup.DocumentRoot#getOutputTypeBDSInternalSerializationElement <em>Output Type BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Type BDS Internal Serialization Element</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.DocumentRoot#getOutputTypeBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_OutputTypeBDSInternalSerializationElement();

  /**
   * Returns the meta object for class '{@link com.tibco.bwse.simpleaddresslookup.InputType <em>Input Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Type</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.InputType
   * @generated
   */
  EClass getInputType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.bwse.simpleaddresslookup.InputType#getPostalCode <em>Postal Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Postal Code</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.InputType#getPostalCode()
   * @see #getInputType()
   * @generated
   */
  EAttribute getInputType_PostalCode();

  /**
   * Returns the meta object for class '{@link com.tibco.bwse.simpleaddresslookup.OutputType <em>Output Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Type</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.OutputType
   * @generated
   */
  EClass getOutputType();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.bwse.simpleaddresslookup.OutputType#getAddressLine1 <em>Address Line1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address Line1</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.OutputType#getAddressLine1()
   * @see #getOutputType()
   * @generated
   */
  EAttribute getOutputType_AddressLine1();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.bwse.simpleaddresslookup.OutputType#getAddressLine2 <em>Address Line2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address Line2</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.OutputType#getAddressLine2()
   * @see #getOutputType()
   * @generated
   */
  EAttribute getOutputType_AddressLine2();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.bwse.simpleaddresslookup.OutputType#getCity <em>City</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>City</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.OutputType#getCity()
   * @see #getOutputType()
   * @generated
   */
  EAttribute getOutputType_City();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.bwse.simpleaddresslookup.OutputType#getCountry <em>Country</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Country</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.OutputType#getCountry()
   * @see #getOutputType()
   * @generated
   */
  EAttribute getOutputType_Country();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.bwse.simpleaddresslookup.OutputType#getProvince <em>Province</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Province</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.OutputType#getProvince()
   * @see #getOutputType()
   * @generated
   */
  EAttribute getOutputType_Province();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.bwse.simpleaddresslookup.OutputType#getPostalCode <em>Postal Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Postal Code</em>'.
   * @see com.tibco.bwse.simpleaddresslookup.OutputType#getPostalCode()
   * @see #getOutputType()
   * @generated
   */
  EAttribute getOutputType_PostalCode();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimpleaddresslookupFactory getSimpleaddresslookupFactory();

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
     * The meta object literal for the '{@link com.tibco.bwse.simpleaddresslookup.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.bwse.simpleaddresslookup.impl.DocumentRootImpl
     * @see com.tibco.bwse.simpleaddresslookup.impl.SimpleaddresslookupPackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Fault</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT_ROOT__FAULT = eINSTANCE.getDocumentRoot_Fault();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__INPUT = eINSTANCE.getDocumentRoot_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__OUTPUT = eINSTANCE.getDocumentRoot_Output();

    /**
     * The meta object literal for the '<em><b>Input Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_InputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Output Type BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__OUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_OutputTypeBDSInternalSerializationElement();

    /**
     * The meta object literal for the '{@link com.tibco.bwse.simpleaddresslookup.impl.InputTypeImpl <em>Input Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.bwse.simpleaddresslookup.impl.InputTypeImpl
     * @see com.tibco.bwse.simpleaddresslookup.impl.SimpleaddresslookupPackageImpl#getInputType()
     * @generated
     */
    EClass INPUT_TYPE = eINSTANCE.getInputType();

    /**
     * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INPUT_TYPE__POSTAL_CODE = eINSTANCE.getInputType_PostalCode();

    /**
     * The meta object literal for the '{@link com.tibco.bwse.simpleaddresslookup.impl.OutputTypeImpl <em>Output Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.bwse.simpleaddresslookup.impl.OutputTypeImpl
     * @see com.tibco.bwse.simpleaddresslookup.impl.SimpleaddresslookupPackageImpl#getOutputType()
     * @generated
     */
    EClass OUTPUT_TYPE = eINSTANCE.getOutputType();

    /**
     * The meta object literal for the '<em><b>Address Line1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_TYPE__ADDRESS_LINE1 = eINSTANCE.getOutputType_AddressLine1();

    /**
     * The meta object literal for the '<em><b>Address Line2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_TYPE__ADDRESS_LINE2 = eINSTANCE.getOutputType_AddressLine2();

    /**
     * The meta object literal for the '<em><b>City</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_TYPE__CITY = eINSTANCE.getOutputType_City();

    /**
     * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_TYPE__COUNTRY = eINSTANCE.getOutputType_Country();

    /**
     * The meta object literal for the '<em><b>Province</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_TYPE__PROVINCE = eINSTANCE.getOutputType_Province();

    /**
     * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OUTPUT_TYPE__POSTAL_CODE = eINSTANCE.getOutputType_PostalCode();

  }

} //SimpleaddresslookupPackage
