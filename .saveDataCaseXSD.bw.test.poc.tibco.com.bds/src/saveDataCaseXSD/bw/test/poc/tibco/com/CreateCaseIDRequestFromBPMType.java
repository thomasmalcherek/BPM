package saveDataCaseXSD.bw.test.poc.tibco.com;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Case ID Request From BPM Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getCaseID <em>Case ID</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getAHVNummer <em>AHV Nummer</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getPartnerID <em>Partner ID</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getDokumentenArt <em>Dokumenten Art</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getKanton <em>Kanton</em>}</li>
 * </ul>
 * </p>
 *
 * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDRequestFromBPMType()
 * @model extendedMetaData="name='CreateCaseIDRequestFromBPM_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface CreateCaseIDRequestFromBPMType extends EObject
{
  /**
   * Returns the value of the '<em><b>Case ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case ID</em>' attribute.
   * @see #setCaseID(String)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDRequestFromBPMType_CaseID()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='CaseID'"
   * @generated
   */
  String getCaseID();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getCaseID <em>Case ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case ID</em>' attribute.
   * @see #getCaseID()
   * @generated
   */
  void setCaseID(String value);

  /**
   * Returns the value of the '<em><b>AHV Nummer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>AHV Nummer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>AHV Nummer</em>' attribute.
   * @see #setAHVNummer(String)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDRequestFromBPMType_AHVNummer()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='AHV-Nummer'"
   * @generated
   */
  String getAHVNummer();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getAHVNummer <em>AHV Nummer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AHV Nummer</em>' attribute.
   * @see #getAHVNummer()
   * @generated
   */
  void setAHVNummer(String value);

  /**
   * Returns the value of the '<em><b>Partner ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partner ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partner ID</em>' attribute.
   * @see #setPartnerID(String)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDRequestFromBPMType_PartnerID()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='Partner-ID'"
   * @generated
   */
  String getPartnerID();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getPartnerID <em>Partner ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partner ID</em>' attribute.
   * @see #getPartnerID()
   * @generated
   */
  void setPartnerID(String value);

  /**
   * Returns the value of the '<em><b>Dokumenten Art</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dokumenten Art</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dokumenten Art</em>' attribute.
   * @see #setDokumentenArt(String)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDRequestFromBPMType_DokumentenArt()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='Dokumenten-Art'"
   * @generated
   */
  String getDokumentenArt();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getDokumentenArt <em>Dokumenten Art</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dokumenten Art</em>' attribute.
   * @see #getDokumentenArt()
   * @generated
   */
  void setDokumentenArt(String value);

  /**
   * Returns the value of the '<em><b>Kanton</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kanton</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kanton</em>' attribute.
   * @see #setKanton(String)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDRequestFromBPMType_Kanton()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='Kanton'"
   * @generated
   */
  String getKanton();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType#getKanton <em>Kanton</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kanton</em>' attribute.
   * @see #getKanton()
   * @generated
   */
  void setKanton(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getCaseID()
   * @generated
   */
  void setCaseID(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getAHVNummer()
   * @generated
   */
  void setAHVNummer(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getPartnerID()
   * @generated
   */
  void setPartnerID(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getDokumentenArt()
   * @generated
   */
  void setDokumentenArt(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getKanton()
   * @generated
   */
  void setKanton(Object value);

} // CreateCaseIDRequestFromBPMType
