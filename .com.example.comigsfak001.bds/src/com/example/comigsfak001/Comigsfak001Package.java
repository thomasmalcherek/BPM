
package com.example.comigsfak001;

import com.example.comigsfak001.bdsutil.BDSValidationUtils;

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
 * BOMORIGIN::/com.igs.fak.001/Business Objects/comigsfak001.bom
 * <!-- end-model-doc -->
 * @see com.example.comigsfak001.Comigsfak001Factory
 * @model kind="package"
 * @generated
 */
public interface Comigsfak001Package extends EPackage
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
  String eNAME = "comigsfak001";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://example.com/comigsfak001";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "comigsfak001";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Comigsfak001Package eINSTANCE = com.example.comigsfak001.impl.Comigsfak001PackageImpl.init();

  /**
   * The meta object id for the '{@link com.example.comigsfak001.impl.DocumentRootImpl <em>Document Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.comigsfak001.impl.DocumentRootImpl
   * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getDocumentRoot()
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
   * The feature id for the '<em><b>Geschaeftsvorfall Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GESCHAEFTSVORFALL_ELEMENT = 3;

  /**
   * The feature id for the '<em><b>Geschaeftsvorfall BDS Internal Serialization Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT__GESCHAEFTSVORFALL_BDS_INTERNAL_SERIALIZATION_ELEMENT = 4;

  /**
   * The number of structural features of the '<em>Document Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_ROOT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.example.comigsfak001.impl.GeschaeftsvorfallImpl <em>Geschaeftsvorfall</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.example.comigsfak001.impl.GeschaeftsvorfallImpl
   * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getGeschaeftsvorfall()
   * @generated
   */
  int GESCHAEFTSVORFALL = 1;

  /**
   * The feature id for the '<em><b>WF Case ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GESCHAEFTSVORFALL__WF_CASE_ID = 0;

  /**
   * The feature id for the '<em><b>AHV Nummer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GESCHAEFTSVORFALL__AHV_NUMMER = 1;

  /**
   * The feature id for the '<em><b>Partner ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GESCHAEFTSVORFALL__PARTNER_ID = 2;

  /**
   * The feature id for the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GESCHAEFTSVORFALL__DOKUMENTEN_ART = 3;

  /**
   * The feature id for the '<em><b>Geschaeftsfall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GESCHAEFTSVORFALL__GESCHAEFTSFALL = 4;

  /**
   * The feature id for the '<em><b>Frist</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GESCHAEFTSVORFALL__FRIST = 5;

  /**
   * The number of structural features of the '<em>Geschaeftsvorfall</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GESCHAEFTSVORFALL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '<em>AHV Nummer Geschaeftsvorfall Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getAHVNummer_GeschaeftsvorfallType()
   * @generated
   */
  int AHV_NUMMER_GESCHAEFTSVORFALL_TYPE = 2;

  /**
   * The meta object id for the '<em>dokumenten Art Geschaeftsvorfall Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getdokumentenArt_GeschaeftsvorfallType()
   * @generated
   */
  int DOKUMENTEN_ART_GESCHAEFTSVORFALL_TYPE = 3;

  /**
   * The meta object id for the '<em>geschaeftsfall Geschaeftsvorfall Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getgeschaeftsfall_GeschaeftsvorfallType()
   * @generated
   */
  int GESCHAEFTSFALL_GESCHAEFTSVORFALL_TYPE = 4;

  /**
   * The meta object id for the '<em>partner ID Geschaeftsvorfall Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getpartnerID_GeschaeftsvorfallType()
   * @generated
   */
  int PARTNER_ID_GESCHAEFTSVORFALL_TYPE = 5;

  /**
   * The meta object id for the '<em>WF Case ID Geschaeftsvorfall Type</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getWFCaseID_GeschaeftsvorfallType()
   * @generated
   */
  int WF_CASE_ID_GESCHAEFTSVORFALL_TYPE = 6;


  /**
   * Returns the meta object for class '{@link com.example.comigsfak001.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document Root</em>'.
   * @see com.example.comigsfak001.DocumentRoot
   * @generated
   */
  EClass getDocumentRoot();

  /**
   * Returns the meta object for the attribute list '{@link com.example.comigsfak001.DocumentRoot#getMixed <em>Mixed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Mixed</em>'.
   * @see com.example.comigsfak001.DocumentRoot#getMixed()
   * @see #getDocumentRoot()
   * @generated
   */
  EAttribute getDocumentRoot_Mixed();

  /**
   * Returns the meta object for the map '{@link com.example.comigsfak001.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
   * @see com.example.comigsfak001.DocumentRoot#getXMLNSPrefixMap()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XMLNSPrefixMap();

  /**
   * Returns the meta object for the map '{@link com.example.comigsfak001.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>XSI Schema Location</em>'.
   * @see com.example.comigsfak001.DocumentRoot#getXSISchemaLocation()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_XSISchemaLocation();

  /**
   * Returns the meta object for the containment reference '{@link com.example.comigsfak001.DocumentRoot#getGeschaeftsvorfallElement <em>Geschaeftsvorfall Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Geschaeftsvorfall Element</em>'.
   * @see com.example.comigsfak001.DocumentRoot#getGeschaeftsvorfallElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_GeschaeftsvorfallElement();

  /**
   * Returns the meta object for the containment reference '{@link com.example.comigsfak001.DocumentRoot#getGeschaeftsvorfallBDSInternalSerializationElement <em>Geschaeftsvorfall BDS Internal Serialization Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Geschaeftsvorfall BDS Internal Serialization Element</em>'.
   * @see com.example.comigsfak001.DocumentRoot#getGeschaeftsvorfallBDSInternalSerializationElement()
   * @see #getDocumentRoot()
   * @generated
   */
  EReference getDocumentRoot_GeschaeftsvorfallBDSInternalSerializationElement();

  /**
   * Returns the meta object for class '{@link com.example.comigsfak001.Geschaeftsvorfall <em>Geschaeftsvorfall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geschaeftsvorfall</em>'.
   * @see com.example.comigsfak001.Geschaeftsvorfall
   * @generated
   */
  EClass getGeschaeftsvorfall();

  /**
   * Returns the meta object for the attribute '{@link com.example.comigsfak001.Geschaeftsvorfall#getWFCaseID <em>WF Case ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>WF Case ID</em>'.
   * @see com.example.comigsfak001.Geschaeftsvorfall#getWFCaseID()
   * @see #getGeschaeftsvorfall()
   * @generated
   */
  EAttribute getGeschaeftsvorfall_WFCaseID();

  /**
   * Returns the meta object for the attribute '{@link com.example.comigsfak001.Geschaeftsvorfall#getAHVNummer <em>AHV Nummer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>AHV Nummer</em>'.
   * @see com.example.comigsfak001.Geschaeftsvorfall#getAHVNummer()
   * @see #getGeschaeftsvorfall()
   * @generated
   */
  EAttribute getGeschaeftsvorfall_AHVNummer();

  /**
   * Returns the meta object for the attribute '{@link com.example.comigsfak001.Geschaeftsvorfall#getPartnerID <em>Partner ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Partner ID</em>'.
   * @see com.example.comigsfak001.Geschaeftsvorfall#getPartnerID()
   * @see #getGeschaeftsvorfall()
   * @generated
   */
  EAttribute getGeschaeftsvorfall_PartnerID();

  /**
   * Returns the meta object for the attribute '{@link com.example.comigsfak001.Geschaeftsvorfall#getDokumentenArt <em>Dokumenten Art</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dokumenten Art</em>'.
   * @see com.example.comigsfak001.Geschaeftsvorfall#getDokumentenArt()
   * @see #getGeschaeftsvorfall()
   * @generated
   */
  EAttribute getGeschaeftsvorfall_DokumentenArt();

  /**
   * Returns the meta object for the attribute '{@link com.example.comigsfak001.Geschaeftsvorfall#getGeschaeftsfall <em>Geschaeftsfall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Geschaeftsfall</em>'.
   * @see com.example.comigsfak001.Geschaeftsvorfall#getGeschaeftsfall()
   * @see #getGeschaeftsvorfall()
   * @generated
   */
  EAttribute getGeschaeftsvorfall_Geschaeftsfall();

  /**
   * Returns the meta object for the attribute '{@link com.example.comigsfak001.Geschaeftsvorfall#getFrist <em>Frist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Frist</em>'.
   * @see com.example.comigsfak001.Geschaeftsvorfall#getFrist()
   * @see #getGeschaeftsvorfall()
   * @generated
   */
  EAttribute getGeschaeftsvorfall_Frist();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>AHV Nummer Geschaeftsvorfall Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>AHV Nummer Geschaeftsvorfall Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='AHVNummer_Geschaeftsvorfall_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getAHVNummer_GeschaeftsvorfallType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>dokumenten Art Geschaeftsvorfall Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>dokumenten Art Geschaeftsvorfall Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='dokumentenArt_Geschaeftsvorfall_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getdokumentenArt_GeschaeftsvorfallType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>geschaeftsfall Geschaeftsvorfall Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>geschaeftsfall Geschaeftsvorfall Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='geschaeftsfall_Geschaeftsvorfall_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='500'"
   * @generated
   */
  EDataType getgeschaeftsfall_GeschaeftsvorfallType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>partner ID Geschaeftsvorfall Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>partner ID Geschaeftsvorfall Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='partnerID_Geschaeftsvorfall_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getpartnerID_GeschaeftsvorfallType();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>WF Case ID Geschaeftsvorfall Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>WF Case ID Geschaeftsvorfall Type</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   *        extendedMetaData="name='WFCaseID_Geschaeftsvorfall_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' maxLength='50'"
   * @generated
   */
  EDataType getWFCaseID_GeschaeftsvorfallType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  Comigsfak001Factory getComigsfak001Factory();

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
     * The meta object literal for the '{@link com.example.comigsfak001.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.comigsfak001.impl.DocumentRootImpl
     * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getDocumentRoot()
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
     * The meta object literal for the '<em><b>Geschaeftsvorfall Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GESCHAEFTSVORFALL_ELEMENT = eINSTANCE.getDocumentRoot_GeschaeftsvorfallElement();

    /**
     * The meta object literal for the '<em><b>Geschaeftsvorfall BDS Internal Serialization Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENT_ROOT__GESCHAEFTSVORFALL_BDS_INTERNAL_SERIALIZATION_ELEMENT = eINSTANCE.getDocumentRoot_GeschaeftsvorfallBDSInternalSerializationElement();

    /**
     * The meta object literal for the '{@link com.example.comigsfak001.impl.GeschaeftsvorfallImpl <em>Geschaeftsvorfall</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.example.comigsfak001.impl.GeschaeftsvorfallImpl
     * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getGeschaeftsvorfall()
     * @generated
     */
    EClass GESCHAEFTSVORFALL = eINSTANCE.getGeschaeftsvorfall();

    /**
     * The meta object literal for the '<em><b>WF Case ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GESCHAEFTSVORFALL__WF_CASE_ID = eINSTANCE.getGeschaeftsvorfall_WFCaseID();

    /**
     * The meta object literal for the '<em><b>AHV Nummer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GESCHAEFTSVORFALL__AHV_NUMMER = eINSTANCE.getGeschaeftsvorfall_AHVNummer();

    /**
     * The meta object literal for the '<em><b>Partner ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GESCHAEFTSVORFALL__PARTNER_ID = eINSTANCE.getGeschaeftsvorfall_PartnerID();

    /**
     * The meta object literal for the '<em><b>Dokumenten Art</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GESCHAEFTSVORFALL__DOKUMENTEN_ART = eINSTANCE.getGeschaeftsvorfall_DokumentenArt();

    /**
     * The meta object literal for the '<em><b>Geschaeftsfall</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GESCHAEFTSVORFALL__GESCHAEFTSFALL = eINSTANCE.getGeschaeftsvorfall_Geschaeftsfall();

    /**
     * The meta object literal for the '<em><b>Frist</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GESCHAEFTSVORFALL__FRIST = eINSTANCE.getGeschaeftsvorfall_Frist();

    /**
     * The meta object literal for the '<em>AHV Nummer Geschaeftsvorfall Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getAHVNummer_GeschaeftsvorfallType()
     * @generated
     */
    EDataType AHV_NUMMER_GESCHAEFTSVORFALL_TYPE = eINSTANCE.getAHVNummer_GeschaeftsvorfallType();

    /**
     * The meta object literal for the '<em>dokumenten Art Geschaeftsvorfall Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getdokumentenArt_GeschaeftsvorfallType()
     * @generated
     */
    EDataType DOKUMENTEN_ART_GESCHAEFTSVORFALL_TYPE = eINSTANCE.getdokumentenArt_GeschaeftsvorfallType();

    /**
     * The meta object literal for the '<em>geschaeftsfall Geschaeftsvorfall Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getgeschaeftsfall_GeschaeftsvorfallType()
     * @generated
     */
    EDataType GESCHAEFTSFALL_GESCHAEFTSVORFALL_TYPE = eINSTANCE.getgeschaeftsfall_GeschaeftsvorfallType();

    /**
     * The meta object literal for the '<em>partner ID Geschaeftsvorfall Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getpartnerID_GeschaeftsvorfallType()
     * @generated
     */
    EDataType PARTNER_ID_GESCHAEFTSVORFALL_TYPE = eINSTANCE.getpartnerID_GeschaeftsvorfallType();

    /**
     * The meta object literal for the '<em>WF Case ID Geschaeftsvorfall Type</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see com.example.comigsfak001.impl.Comigsfak001PackageImpl#getWFCaseID_GeschaeftsvorfallType()
     * @generated
     */
    EDataType WF_CASE_ID_GESCHAEFTSVORFALL_TYPE = eINSTANCE.getWFCaseID_GeschaeftsvorfallType();

  }

} //Comigsfak001Package
