
package com.example.comtibcobomasynchcall;

import com.example.comtibcobomasynchcall.bdsutil.BDSValidationUtils;

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
 * BOMORIGIN::/com.tibco.bom.asynchCall/Business Objects/comtibcobomasynchCall.bom
 * <!-- end-model-doc -->
 * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallFactory
 * @model kind="package"
 *        annotation="bds BomFileName='L/com.tibco.bom.asynchCall/Business Objects/comtibcobomasynchCall.bom' majorVersion='1' ecoreFormat='1' label='com.example.comtibcobomasynchcall'"
 *        annotation="teneo.jpa value='@GenericGenerator(name=\"bdsIdGenerator\", strategy=\"native\")'"
 * @generated
 */
public interface ComtibcobomasynchcallPackage extends EPackage
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
  String eNAME = "comtibcobomasynchcall";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://example.com/comtibcobomasynchcall";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "comtibcobomasynchcall";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ComtibcobomasynchcallPackage eINSTANCE = com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl.init();

  /**
   * The meta object id for the '{@link com.example.comtibcobomasynchcall.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.comtibcobomasynchcall.impl.DocumentRootImpl
   * @see com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl#getDocumentRoot()
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
   * The feature id for the '<em><b>Meta Data Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__META_DATA_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Meta Data BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT = 4;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.example.comtibcobomasynchcall.impl.MetaDataImpl <em>Meta Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.comtibcobomasynchcall.impl.MetaDataImpl
   * @see com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl#getMetaData()
   * @generated
   */
  int META_DATA = 1;

  /**
   * The feature id for the '<em><b>AHV Nummer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA__AHV_NUMMER = 0;

  /**
   * The feature id for the '<em><b>Partner ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA__PARTNER_ID = 1;

  /**
   * The feature id for the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA__DOKUMENTEN_ART = 2;

  /**
   * The feature id for the '<em><b>Kanton</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA__KANTON = 3;

  /**
   * The number of structural features of the '<em>Meta Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_DATA_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '<em>AHV Nummer Meta Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl#getAHVNummer_MetaDataType()
   * @generated
   */
  int AHV_NUMMER_META_DATA_TYPE = 2;

  /**
   * The meta object id for the '<em>dokumenten Art Meta Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl#getdokumentenArt_MetaDataType()
   * @generated
   */
  int DOKUMENTEN_ART_META_DATA_TYPE = 3;

  /**
   * The meta object id for the '<em>kanton Meta Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl#getkanton_MetaDataType()
   * @generated
   */
  int KANTON_META_DATA_TYPE = 4;

  /**
   * The meta object id for the '<em>partner ID Meta Data Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl#getpartnerID_MetaDataType()
   * @generated
   */
  int PARTNER_ID_META_DATA_TYPE = 5;


  /**
   * Returns the meta object for class '{@link com.example.comtibcobomasynchcall.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.example.comtibcobomasynchcall.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.example.comtibcobomasynchcall.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.example.comtibcobomasynchcall.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.example.comtibcobomasynchcall.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.example.comtibcobomasynchcall.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.example.comtibcobomasynchcall.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.example.comtibcobomasynchcall.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.example.comtibcobomasynchcall.DocumentRoot#getMetaDataElement <em>Meta Data Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta Data Element</em>'.
   * @see com.example.comtibcobomasynchcall.DocumentRoot#getMetaDataElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_MetaDataElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.comtibcobomasynchcall.DocumentRoot#getMetaDataBDSInternalSerializationElement <em>Meta Data BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Meta Data BDS Internal Serialization Element</em>'.
   * @see com.example.comtibcobomasynchcall.DocumentRoot#getMetaDataBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_MetaDataBDSInternalSerializationElement();

  /**
   * Returns the meta object for class '{@link com.example.comtibcobomasynchcall.MetaData <em>Meta Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Data</em>'.
   * @see com.example.comtibcobomasynchcall.MetaData
   * @generated
   */
  EClass getMetaData();

  /**
   * Returns the meta object for the attribute '{@link com.example.comtibcobomasynchcall.MetaData#getAHVNummer <em>AHV Nummer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AHV Nummer</em>'.
   * @see com.example.comtibcobomasynchcall.MetaData#getAHVNummer()
   * @see #getMetaData()
   * @generated
   */
  EAttribute getMetaData_AHVNummer();

  /**
   * Returns the meta object for the attribute '{@link com.example.comtibcobomasynchcall.MetaData#getPartnerID <em>Partner ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partner ID</em>'.
   * @see com.example.comtibcobomasynchcall.MetaData#getPartnerID()
   * @see #getMetaData()
   * @generated
   */
  EAttribute getMetaData_PartnerID();

  /**
   * Returns the meta object for the attribute '{@link com.example.comtibcobomasynchcall.MetaData#getDokumentenArt <em>Dokumenten Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dokumenten Art</em>'.
   * @see com.example.comtibcobomasynchcall.MetaData#getDokumentenArt()
   * @see #getMetaData()
   * @generated
   */
  EAttribute getMetaData_DokumentenArt();

  /**
   * Returns the meta object for the attribute '{@link com.example.comtibcobomasynchcall.MetaData#getKanton <em>Kanton</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kanton</em>'.
   * @see com.example.comtibcobomasynchcall.MetaData#getKanton()
   * @see #getMetaData()
   * @generated
   */
  EAttribute getMetaData_Kanton();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>AHV Nummer Meta Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>AHV Nummer Meta Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='AHVNummer_MetaData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getAHVNummer_MetaDataType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>dokumenten Art Meta Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>dokumenten Art Meta Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='dokumentenArt_MetaData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getdokumentenArt_MetaDataType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>kanton Meta Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>kanton Meta Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='kanton_MetaData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getkanton_MetaDataType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>partner ID Meta Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>partner ID Meta Data Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='partnerID_MetaData_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getpartnerID_MetaDataType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ComtibcobomasynchcallFactory getComtibcobomasynchcallFactory();

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
     * The meta object literal for the '{@link com.example.comtibcobomasynchcall.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.comtibcobomasynchcall.impl.DocumentRootImpl
     * @see com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Meta Data Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__META_DATA_ELEMENT = eINSTANCE.getDocumentRoot_MetaDataElement();

    /**
     * The meta object literal for the '<em><b>Meta Data BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_MetaDataBDSInternalSerializationElement();

    /**
     * The meta object literal for the '{@link com.example.comtibcobomasynchcall.impl.MetaDataImpl <em>Meta Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.comtibcobomasynchcall.impl.MetaDataImpl
     * @see com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl#getMetaData()
     * @generated
     */
    EClass META_DATA = eINSTANCE.getMetaData();

    /**
     * The meta object literal for the '<em><b>AHV Nummer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_DATA__AHV_NUMMER = eINSTANCE.getMetaData_AHVNummer();

    /**
     * The meta object literal for the '<em><b>Partner ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_DATA__PARTNER_ID = eINSTANCE.getMetaData_PartnerID();

    /**
     * The meta object literal for the '<em><b>Dokumenten Art</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_DATA__DOKUMENTEN_ART = eINSTANCE.getMetaData_DokumentenArt();

    /**
     * The meta object literal for the '<em><b>Kanton</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_DATA__KANTON = eINSTANCE.getMetaData_Kanton();

    /**
     * The meta object literal for the '<em>AHV Nummer Meta Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl#getAHVNummer_MetaDataType()
     * @generated
     */
    EDataType AHV_NUMMER_META_DATA_TYPE = eINSTANCE.getAHVNummer_MetaDataType();

    /**
     * The meta object literal for the '<em>dokumenten Art Meta Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl#getdokumentenArt_MetaDataType()
     * @generated
     */
    EDataType DOKUMENTEN_ART_META_DATA_TYPE = eINSTANCE.getdokumentenArt_MetaDataType();

    /**
     * The meta object literal for the '<em>kanton Meta Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl#getkanton_MetaDataType()
     * @generated
     */
    EDataType KANTON_META_DATA_TYPE = eINSTANCE.getkanton_MetaDataType();

    /**
     * The meta object literal for the '<em>partner ID Meta Data Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallPackageImpl#getpartnerID_MetaDataType()
     * @generated
     */
    EDataType PARTNER_ID_META_DATA_TYPE = eINSTANCE.getpartnerID_MetaDataType();

  }

} //ComtibcobomasynchcallPackage
