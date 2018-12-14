package saveDataCaseXSD.bw.test.poc.tibco.com;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Data Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType#getAHVNummer <em>AHV Nummer</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType#getDokumentenArt <em>Dokumenten Art</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType#getGeschaeftsfall <em>Geschaeftsfall</em>}</li>
 * </ul>
 * </p>
 *
 * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getSearchDataRequestType()
 * @model extendedMetaData="name='SearchDataRequest_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface SearchDataRequestType extends EObject
{
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
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getSearchDataRequestType_AHVNummer()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='AHV-Nummer'"
   * @generated
   */
  String getAHVNummer();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType#getAHVNummer <em>AHV Nummer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>AHV Nummer</em>' attribute.
   * @see #getAHVNummer()
   * @generated
   */
  void setAHVNummer(String value);

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
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getSearchDataRequestType_DokumentenArt()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='Dokumenten-Art'"
   * @generated
   */
  String getDokumentenArt();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType#getDokumentenArt <em>Dokumenten Art</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dokumenten Art</em>' attribute.
   * @see #getDokumentenArt()
   * @generated
   */
  void setDokumentenArt(String value);

  /**
   * Returns the value of the '<em><b>Geschaeftsfall</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Geschaeftsfall</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Geschaeftsfall</em>' attribute.
   * @see #setGeschaeftsfall(String)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getSearchDataRequestType_Geschaeftsfall()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='Geschaeftsfall'"
   * @generated
   */
  String getGeschaeftsfall();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType#getGeschaeftsfall <em>Geschaeftsfall</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geschaeftsfall</em>' attribute.
   * @see #getGeschaeftsfall()
   * @generated
   */
  void setGeschaeftsfall(String value);

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
   * @see #getDokumentenArt()
   * @generated
   */
  void setDokumentenArt(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getGeschaeftsfall()
   * @generated
   */
  void setGeschaeftsfall(Object value);

} // SearchDataRequestType
