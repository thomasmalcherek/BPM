
package com.tibco.poc.test.sticky.user;

import com.tibco.poc.test.sticky.user.bdsutil.BDSValidationUtils;

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
 * BOMORIGIN::/com.tibco.poc.test.sticky.user/Business Objects/comtibcopoctest.bom
 * <!-- end-model-doc -->
 * @see com.tibco.poc.test.sticky.user.UserFactory
 * @model kind="package"
 * @generated
 */
public interface UserPackage extends EPackage
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
  String eNAME = "user";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://sticky.test.poc.tibco.com/user";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "user";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UserPackage eINSTANCE = com.tibco.poc.test.sticky.user.impl.UserPackageImpl.init();

  /**
   * The meta object id for the '{@link com.tibco.poc.test.sticky.user.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.poc.test.sticky.user.impl.DocumentRootImpl
   * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getDocumentRoot()
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
   * The feature id for the '<em><b>Poc DB Request Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__POC_DB_REQUEST_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Poc Meta Data Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__POC_META_DATA_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Poc DB Request BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__POC_DB_REQUEST_BDS_INTERNAL_SERIALIZATION_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Poc Meta Data BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__POC_META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT = 6;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link com.tibco.poc.test.sticky.user.impl.pocDBRequestImpl <em>poc DB Request</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.poc.test.sticky.user.impl.pocDBRequestImpl
   * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getpocDBRequest()
   * @generated
   */
  int POC_DB_REQUEST = 1;

  /**
   * The feature id for the '<em><b>WF Case ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POC_DB_REQUEST__WF_CASE_ID = 0;

  /**
   * The number of structural features of the '<em>poc DB Request</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POC_DB_REQUEST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.tibco.poc.test.sticky.user.impl.pocMetaDataImpl <em>poc Meta Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.tibco.poc.test.sticky.user.impl.pocMetaDataImpl
   * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getpocMetaData()
   * @generated
   */
  int POC_META_DATA = 2;

  /**
   * The feature id for the '<em><b>WF Case ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POC_META_DATA__WF_CASE_ID = 0;

  /**
   * The feature id for the '<em><b>AHV Nummer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POC_META_DATA__AHV_NUMMER = 1;

  /**
   * The feature id for the '<em><b>Partner ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POC_META_DATA__PARTNER_ID = 2;

  /**
   * The feature id for the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POC_META_DATA__DOKUMENTEN_ART = 3;

  /**
   * The feature id for the '<em><b>Kanton</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POC_META_DATA__KANTON = 4;

  /**
   * The feature id for the '<em><b>Frist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POC_META_DATA__FRIST = 5;

  /**
   * The number of structural features of the '<em>poc Meta Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POC_META_DATA_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '<em>AHV Nummer poc Meta Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getAHVNummer_pocMetaDataType()
   * @generated
   */
  int AHV_NUMMER_POC_META_DATA_TYPE = 3;

  /**
   * The meta object id for the '<em>dokumenten Art poc Meta Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getdokumentenArt_pocMetaDataType()
   * @generated
   */
  int DOKUMENTEN_ART_POC_META_DATA_TYPE = 4;

  /**
   * The meta object id for the '<em>kanton poc Meta Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getkanton_pocMetaDataType()
   * @generated
   */
  int KANTON_POC_META_DATA_TYPE = 5;

  /**
   * The meta object id for the '<em>partner ID poc Meta Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getpartnerID_pocMetaDataType()
   * @generated
   */
  int PARTNER_ID_POC_META_DATA_TYPE = 6;

  /**
   * The meta object id for the '<em>WF Case ID poc Meta Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getWFCaseID_pocMetaDataType()
   * @generated
   */
  int WF_CASE_ID_POC_META_DATA_TYPE = 7;

  /**
   * The meta object id for the '<em>WF Case ID poc DB Request Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getWFCaseID_pocDBRequestType()
   * @generated
   */
  int WF_CASE_ID_POC_DB_REQUEST_TYPE = 8;


  /**
   * Returns the meta object for class '{@link com.tibco.poc.test.sticky.user.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.tibco.poc.test.sticky.user.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.tibco.poc.test.sticky.user.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.tibco.poc.test.sticky.user.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.tibco.poc.test.sticky.user.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.tibco.poc.test.sticky.user.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.tibco.poc.test.sticky.user.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.tibco.poc.test.sticky.user.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.poc.test.sticky.user.DocumentRoot#getPocDBRequestElement <em>Poc DB Request Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Poc DB Request Element</em>'.
   * @see com.tibco.poc.test.sticky.user.DocumentRoot#getPocDBRequestElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_PocDBRequestElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.poc.test.sticky.user.DocumentRoot#getPocMetaDataElement <em>Poc Meta Data Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Poc Meta Data Element</em>'.
   * @see com.tibco.poc.test.sticky.user.DocumentRoot#getPocMetaDataElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_PocMetaDataElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.poc.test.sticky.user.DocumentRoot#getPocDBRequestBDSInternalSerializationElement <em>Poc DB Request BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Poc DB Request BDS Internal Serialization Element</em>'.
   * @see com.tibco.poc.test.sticky.user.DocumentRoot#getPocDBRequestBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_PocDBRequestBDSInternalSerializationElement();

  /**
   * Returns the meta object for the containment reference '{@link com.tibco.poc.test.sticky.user.DocumentRoot#getPocMetaDataBDSInternalSerializationElement <em>Poc Meta Data BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Poc Meta Data BDS Internal Serialization Element</em>'.
   * @see com.tibco.poc.test.sticky.user.DocumentRoot#getPocMetaDataBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_PocMetaDataBDSInternalSerializationElement();

  /**
   * Returns the meta object for class '{@link com.tibco.poc.test.sticky.user.pocDBRequest <em>poc DB Request</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>poc DB Request</em>'.
   * @see com.tibco.poc.test.sticky.user.pocDBRequest
   * @generated
   */
  EClass getpocDBRequest();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.poc.test.sticky.user.pocDBRequest#getWFCaseID <em>WF Case ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>WF Case ID</em>'.
   * @see com.tibco.poc.test.sticky.user.pocDBRequest#getWFCaseID()
   * @see #getpocDBRequest()
   * @generated
   */
  EAttribute getpocDBRequest_WFCaseID();

  /**
   * Returns the meta object for class '{@link com.tibco.poc.test.sticky.user.pocMetaData <em>poc Meta Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>poc Meta Data</em>'.
   * @see com.tibco.poc.test.sticky.user.pocMetaData
   * @generated
   */
  EClass getpocMetaData();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.poc.test.sticky.user.pocMetaData#getWFCaseID <em>WF Case ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>WF Case ID</em>'.
   * @see com.tibco.poc.test.sticky.user.pocMetaData#getWFCaseID()
   * @see #getpocMetaData()
   * @generated
   */
  EAttribute getpocMetaData_WFCaseID();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.poc.test.sticky.user.pocMetaData#getAHVNummer <em>AHV Nummer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AHV Nummer</em>'.
   * @see com.tibco.poc.test.sticky.user.pocMetaData#getAHVNummer()
   * @see #getpocMetaData()
   * @generated
   */
  EAttribute getpocMetaData_AHVNummer();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.poc.test.sticky.user.pocMetaData#getPartnerID <em>Partner ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partner ID</em>'.
   * @see com.tibco.poc.test.sticky.user.pocMetaData#getPartnerID()
   * @see #getpocMetaData()
   * @generated
   */
  EAttribute getpocMetaData_PartnerID();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.poc.test.sticky.user.pocMetaData#getDokumentenArt <em>Dokumenten Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dokumenten Art</em>'.
   * @see com.tibco.poc.test.sticky.user.pocMetaData#getDokumentenArt()
   * @see #getpocMetaData()
   * @generated
   */
  EAttribute getpocMetaData_DokumentenArt();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.poc.test.sticky.user.pocMetaData#getKanton <em>Kanton</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kanton</em>'.
   * @see com.tibco.poc.test.sticky.user.pocMetaData#getKanton()
   * @see #getpocMetaData()
   * @generated
   */
  EAttribute getpocMetaData_Kanton();

  /**
   * Returns the meta object for the attribute '{@link com.tibco.poc.test.sticky.user.pocMetaData#getFrist <em>Frist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Frist</em>'.
   * @see com.tibco.poc.test.sticky.user.pocMetaData#getFrist()
   * @see #getpocMetaData()
   * @generated
   */
  EAttribute getpocMetaData_Frist();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>AHV Nummer poc Meta Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>AHV Nummer poc Meta Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='AHVNummer_pocMetaData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getAHVNummer_pocMetaDataType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>dokumenten Art poc Meta Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>dokumenten Art poc Meta Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='dokumentenArt_pocMetaData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getdokumentenArt_pocMetaDataType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>kanton poc Meta Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>kanton poc Meta Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='kanton_pocMetaData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getkanton_pocMetaDataType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>partner ID poc Meta Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>partner ID poc Meta Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='partnerID_pocMetaData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getpartnerID_pocMetaDataType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>WF Case ID poc Meta Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>WF Case ID poc Meta Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='WFCaseID_pocMetaData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getWFCaseID_pocMetaDataType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>WF Case ID poc DB Request Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>WF Case ID poc DB Request Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='WFCaseID_pocDBRequest_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getWFCaseID_pocDBRequestType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UserFactory getUserFactory();

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
     * The meta object literal for the '{@link com.tibco.poc.test.sticky.user.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.poc.test.sticky.user.impl.DocumentRootImpl
     * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Poc DB Request Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__POC_DB_REQUEST_ELEMENT = eINSTANCE.getDocumentRoot_PocDBRequestElement();

    /**
     * The meta object literal for the '<em><b>Poc Meta Data Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__POC_META_DATA_ELEMENT = eINSTANCE.getDocumentRoot_PocMetaDataElement();

    /**
     * The meta object literal for the '<em><b>Poc DB Request BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__POC_DB_REQUEST_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_PocDBRequestBDSInternalSerializationElement();

    /**
     * The meta object literal for the '<em><b>Poc Meta Data BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__POC_META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_PocMetaDataBDSInternalSerializationElement();

    /**
     * The meta object literal for the '{@link com.tibco.poc.test.sticky.user.impl.pocDBRequestImpl <em>poc DB Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.poc.test.sticky.user.impl.pocDBRequestImpl
     * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getpocDBRequest()
     * @generated
     */
    EClass POC_DB_REQUEST = eINSTANCE.getpocDBRequest();

    /**
     * The meta object literal for the '<em><b>WF Case ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POC_DB_REQUEST__WF_CASE_ID = eINSTANCE.getpocDBRequest_WFCaseID();

    /**
     * The meta object literal for the '{@link com.tibco.poc.test.sticky.user.impl.pocMetaDataImpl <em>poc Meta Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.tibco.poc.test.sticky.user.impl.pocMetaDataImpl
     * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getpocMetaData()
     * @generated
     */
    EClass POC_META_DATA = eINSTANCE.getpocMetaData();

    /**
     * The meta object literal for the '<em><b>WF Case ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POC_META_DATA__WF_CASE_ID = eINSTANCE.getpocMetaData_WFCaseID();

    /**
     * The meta object literal for the '<em><b>AHV Nummer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POC_META_DATA__AHV_NUMMER = eINSTANCE.getpocMetaData_AHVNummer();

    /**
     * The meta object literal for the '<em><b>Partner ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POC_META_DATA__PARTNER_ID = eINSTANCE.getpocMetaData_PartnerID();

    /**
     * The meta object literal for the '<em><b>Dokumenten Art</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POC_META_DATA__DOKUMENTEN_ART = eINSTANCE.getpocMetaData_DokumentenArt();

    /**
     * The meta object literal for the '<em><b>Kanton</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POC_META_DATA__KANTON = eINSTANCE.getpocMetaData_Kanton();

    /**
     * The meta object literal for the '<em><b>Frist</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POC_META_DATA__FRIST = eINSTANCE.getpocMetaData_Frist();

    /**
     * The meta object literal for the '<em>AHV Nummer poc Meta Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getAHVNummer_pocMetaDataType()
     * @generated
     */
    EDataType AHV_NUMMER_POC_META_DATA_TYPE = eINSTANCE.getAHVNummer_pocMetaDataType();

    /**
     * The meta object literal for the '<em>dokumenten Art poc Meta Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getdokumentenArt_pocMetaDataType()
     * @generated
     */
    EDataType DOKUMENTEN_ART_POC_META_DATA_TYPE = eINSTANCE.getdokumentenArt_pocMetaDataType();

    /**
     * The meta object literal for the '<em>kanton poc Meta Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getkanton_pocMetaDataType()
     * @generated
     */
    EDataType KANTON_POC_META_DATA_TYPE = eINSTANCE.getkanton_pocMetaDataType();

    /**
     * The meta object literal for the '<em>partner ID poc Meta Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getpartnerID_pocMetaDataType()
     * @generated
     */
    EDataType PARTNER_ID_POC_META_DATA_TYPE = eINSTANCE.getpartnerID_pocMetaDataType();

    /**
     * The meta object literal for the '<em>WF Case ID poc Meta Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getWFCaseID_pocMetaDataType()
     * @generated
     */
    EDataType WF_CASE_ID_POC_META_DATA_TYPE = eINSTANCE.getWFCaseID_pocMetaDataType();

    /**
     * The meta object literal for the '<em>WF Case ID poc DB Request Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.tibco.poc.test.sticky.user.impl.UserPackageImpl#getWFCaseID_pocDBRequestType()
     * @generated
     */
    EDataType WF_CASE_ID_POC_DB_REQUEST_TYPE = eINSTANCE.getWFCaseID_pocDBRequestType();

  }

} //UserPackage
