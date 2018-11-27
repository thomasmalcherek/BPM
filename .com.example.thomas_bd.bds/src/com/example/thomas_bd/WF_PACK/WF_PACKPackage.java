
package com.example.thomas_bd.WF_PACK;

import com.example.thomas_bd.WF_PACK.bdsutil.BDSValidationUtils;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * BOMORIGIN::/Thomas_BD/Business Objects/Thomas_BD.bom
 * <!-- end-model-doc -->
 * @see com.example.thomas_bd.WF_PACK.WF_PACKFactory
 * @model kind="package"
 *        annotation="bds BomFileName='L/Thomas_BD/Business Objects/Thomas_BD.bom' majorVersion='1' ecoreFormat='1' label='WF_PACK'"
 *        annotation="teneo.jpa value='@GenericGenerator(name=\"bdsIdGenerator\", strategy=\"native\")'"
 * @generated
 */
public interface WF_PACKPackage extends EPackage
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
  String eNAME = "WF_PACK";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://example.com/thomas_bd/WF_PACK";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pack";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WF_PACKPackage eINSTANCE = com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl.init();

  /**
   * The meta object id for the '{@link com.example.thomas_bd.WF_PACK.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.thomas_bd.WF_PACK.impl.DocumentRootImpl
   * @see com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl#getDocumentRoot()
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
   * The feature id for the '<em><b>WFDATA Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__WFDATA_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>WF DATABDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__WF_DATABDS_INTERNAL_SERIALIZATION_ELEMENT = 4;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.example.thomas_bd.WF_PACK.impl.WF_DATAImpl <em>WF DATA</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.thomas_bd.WF_PACK.impl.WF_DATAImpl
   * @see com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl#getWF_DATA()
   * @generated
   */
  int WF_DATA = 1;

  /**
   * The feature id for the '<em><b>HEADER</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WF_DATA__HEADER = 0;

  /**
   * The feature id for the '<em><b>VALUE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WF_DATA__VALUE = 1;

  /**
   * The feature id for the '<em><b>DATE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WF_DATA__DATE = 2;

  /**
   * The feature id for the '<em><b>EXPLANATION</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WF_DATA__EXPLANATION = 3;

  /**
   * The feature id for the '<em><b>POSTALCODE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WF_DATA__POSTALCODE = 4;

  /**
   * The number of structural features of the '<em>WF DATA</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WF_DATA_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '<em>EXPLANATION WF DATA Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl#getEXPLANATION_WF_DATAType()
   * @generated
   */
  int EXPLANATION_WF_DATA_TYPE = 2;

  /**
   * The meta object id for the '<em>HEADER WF DATA Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl#getHEADER_WF_DATAType()
   * @generated
   */
  int HEADER_WF_DATA_TYPE = 3;

  /**
   * The meta object id for the '<em>POSTALCODE WF DATA Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl#getPOSTALCODE_WF_DATAType()
   * @generated
   */
  int POSTALCODE_WF_DATA_TYPE = 4;

  /**
   * The meta object id for the '<em>VALUE WF DATA Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl#getVALUE_WF_DATAType()
   * @generated
   */
  int VALUE_WF_DATA_TYPE = 5;


  /**
   * Returns the meta object for class '{@link com.example.thomas_bd.WF_PACK.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.example.thomas_bd.WF_PACK.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.example.thomas_bd.WF_PACK.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.example.thomas_bd.WF_PACK.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.example.thomas_bd.WF_PACK.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.example.thomas_bd.WF_PACK.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.example.thomas_bd.WF_PACK.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.example.thomas_bd.WF_PACK.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.example.thomas_bd.WF_PACK.DocumentRoot#getWFDATAElement <em>WFDATA Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>WFDATA Element</em>'.
   * @see com.example.thomas_bd.WF_PACK.DocumentRoot#getWFDATAElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_WFDATAElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.thomas_bd.WF_PACK.DocumentRoot#getWF_DATABDSInternalSerializationElement <em>WF DATABDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>WF DATABDS Internal Serialization Element</em>'.
   * @see com.example.thomas_bd.WF_PACK.DocumentRoot#getWF_DATABDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_WF_DATABDSInternalSerializationElement();

  /**
   * Returns the meta object for class '{@link com.example.thomas_bd.WF_PACK.WF_DATA <em>WF DATA</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>WF DATA</em>'.
   * @see com.example.thomas_bd.WF_PACK.WF_DATA
   * @generated
   */
  EClass getWF_DATA();

  /**
   * Returns the meta object for the attribute '{@link com.example.thomas_bd.WF_PACK.WF_DATA#getHEADER <em>HEADER</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>HEADER</em>'.
   * @see com.example.thomas_bd.WF_PACK.WF_DATA#getHEADER()
   * @see #getWF_DATA()
   * @generated
   */
  EAttribute getWF_DATA_HEADER();

  /**
   * Returns the meta object for the attribute '{@link com.example.thomas_bd.WF_PACK.WF_DATA#getVALUE <em>VALUE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>VALUE</em>'.
   * @see com.example.thomas_bd.WF_PACK.WF_DATA#getVALUE()
   * @see #getWF_DATA()
   * @generated
   */
  EAttribute getWF_DATA_VALUE();

  /**
   * Returns the meta object for the attribute '{@link com.example.thomas_bd.WF_PACK.WF_DATA#getDATE <em>DATE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>DATE</em>'.
   * @see com.example.thomas_bd.WF_PACK.WF_DATA#getDATE()
   * @see #getWF_DATA()
   * @generated
   */
  EAttribute getWF_DATA_DATE();

  /**
   * Returns the meta object for the attribute '{@link com.example.thomas_bd.WF_PACK.WF_DATA#getEXPLANATION <em>EXPLANATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>EXPLANATION</em>'.
   * @see com.example.thomas_bd.WF_PACK.WF_DATA#getEXPLANATION()
   * @see #getWF_DATA()
   * @generated
   */
  EAttribute getWF_DATA_EXPLANATION();

  /**
   * Returns the meta object for the attribute '{@link com.example.thomas_bd.WF_PACK.WF_DATA#getPOSTALCODE <em>POSTALCODE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>POSTALCODE</em>'.
   * @see com.example.thomas_bd.WF_PACK.WF_DATA#getPOSTALCODE()
   * @see #getWF_DATA()
   * @generated
   */
  EAttribute getWF_DATA_POSTALCODE();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>EXPLANATION WF DATA Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>EXPLANATION WF DATA Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='EXPLANATION_WF_DATA_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='500'"
   * @generated
   */
  EDataType getEXPLANATION_WF_DATAType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>HEADER WF DATA Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>HEADER WF DATA Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='HEADER_WF_DATA_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getHEADER_WF_DATAType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>POSTALCODE WF DATA Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>POSTALCODE WF DATA Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='POSTALCODE_WF_DATA_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getPOSTALCODE_WF_DATAType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>VALUE WF DATA Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>VALUE WF DATA Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='VALUE_WF_DATA_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getVALUE_WF_DATAType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WF_PACKFactory getWF_PACKFactory();

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
     * The meta object literal for the '{@link com.example.thomas_bd.WF_PACK.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.thomas_bd.WF_PACK.impl.DocumentRootImpl
     * @see com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>WFDATA Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__WFDATA_ELEMENT = eINSTANCE.getDocumentRoot_WFDATAElement();

    /**
     * The meta object literal for the '<em><b>WF DATABDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__WF_DATABDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_WF_DATABDSInternalSerializationElement();

    /**
     * The meta object literal for the '{@link com.example.thomas_bd.WF_PACK.impl.WF_DATAImpl <em>WF DATA</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.thomas_bd.WF_PACK.impl.WF_DATAImpl
     * @see com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl#getWF_DATA()
     * @generated
     */
    EClass WF_DATA = eINSTANCE.getWF_DATA();

    /**
     * The meta object literal for the '<em><b>HEADER</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WF_DATA__HEADER = eINSTANCE.getWF_DATA_HEADER();

    /**
     * The meta object literal for the '<em><b>VALUE</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WF_DATA__VALUE = eINSTANCE.getWF_DATA_VALUE();

    /**
     * The meta object literal for the '<em><b>DATE</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WF_DATA__DATE = eINSTANCE.getWF_DATA_DATE();

    /**
     * The meta object literal for the '<em><b>EXPLANATION</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WF_DATA__EXPLANATION = eINSTANCE.getWF_DATA_EXPLANATION();

    /**
     * The meta object literal for the '<em><b>POSTALCODE</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WF_DATA__POSTALCODE = eINSTANCE.getWF_DATA_POSTALCODE();

    /**
     * The meta object literal for the '<em>EXPLANATION WF DATA Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl#getEXPLANATION_WF_DATAType()
     * @generated
     */
    EDataType EXPLANATION_WF_DATA_TYPE = eINSTANCE.getEXPLANATION_WF_DATAType();

    /**
     * The meta object literal for the '<em>HEADER WF DATA Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl#getHEADER_WF_DATAType()
     * @generated
     */
    EDataType HEADER_WF_DATA_TYPE = eINSTANCE.getHEADER_WF_DATAType();

    /**
     * The meta object literal for the '<em>POSTALCODE WF DATA Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl#getPOSTALCODE_WF_DATAType()
     * @generated
     */
    EDataType POSTALCODE_WF_DATA_TYPE = eINSTANCE.getPOSTALCODE_WF_DATAType();

    /**
     * The meta object literal for the '<em>VALUE WF DATA Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.thomas_bd.WF_PACK.impl.WF_PACKPackageImpl#getVALUE_WF_DATAType()
     * @generated
     */
    EDataType VALUE_WF_DATA_TYPE = eINSTANCE.getVALUE_WF_DATAType();

  }

} //WF_PACKPackage
