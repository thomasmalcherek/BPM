package saveDataCaseXSD.bw.test.poc.tibco.com;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Case ID Request Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getAHVNummer <em>AHV Nummer</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getDokumentenArt <em>Dokumenten Art</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getGeschaeftsfall <em>Geschaeftsfall</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getAnzahl_der_Dokumente <em>Anzahl der Dokumente</em>}</li>
 * </ul>
 * </p>
 *
 * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDRequestType()
 * @model extendedMetaData="name='CreateCaseIDRequest_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface CreateCaseIDRequestType extends EObject
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
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDRequestType_AHVNummer()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='AHV-Nummer'"
   * @generated
   */
  String getAHVNummer();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getAHVNummer <em>AHV Nummer</em>}' attribute.
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
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDRequestType_DokumentenArt()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='Dokumenten-Art'"
   * @generated
   */
  String getDokumentenArt();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getDokumentenArt <em>Dokumenten Art</em>}' attribute.
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
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDRequestType_Geschaeftsfall()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='Geschaeftsfall'"
   * @generated
   */
  String getGeschaeftsfall();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getGeschaeftsfall <em>Geschaeftsfall</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Geschaeftsfall</em>' attribute.
   * @see #getGeschaeftsfall()
   * @generated
   */
  void setGeschaeftsfall(String value);

  /**
   * Returns the value of the '<em><b>Anzahl der Dokumente</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anzahl der Dokumente</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anzahl der Dokumente</em>' attribute.
   * @see #setAnzahl_der_Dokumente(BigInteger)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDRequestType_Anzahl_der_Dokumente()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
   *        extendedMetaData="kind='element' name='Anzahl_der_Dokumente'"
   * @generated
   */
  BigInteger getAnzahl_der_Dokumente();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType#getAnzahl_der_Dokumente <em>Anzahl der Dokumente</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anzahl der Dokumente</em>' attribute.
   * @see #getAnzahl_der_Dokumente()
   * @generated
   */
  void setAnzahl_der_Dokumente(BigInteger value);

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

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getAnzahl_der_Dokumente()
   * @generated
   */
  void setAnzahl_der_Dokumente(Object value);

} // CreateCaseIDRequestType
