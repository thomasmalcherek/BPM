
package saveDataCaseXSD.bw.test.poc.tibco.com.impl;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage;
import saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType;

import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSTypeConversions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Case ID Request From BPM Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestFromBPMTypeImpl#getCaseID <em>Case ID</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestFromBPMTypeImpl#getAHVNummer <em>AHV Nummer</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestFromBPMTypeImpl#getDokumentenArt <em>Dokumenten Art</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestFromBPMTypeImpl#getGeschaeftsfall <em>Geschaeftsfall</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDRequestFromBPMTypeImpl#getAnzahl_der_Dokumente <em>Anzahl der Dokumente</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class CreateCaseIDRequestFromBPMTypeImpl extends EObjectImpl implements CreateCaseIDRequestFromBPMType
{
  /**
   * The default value of the '{@link #getCaseID() <em>Case ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseID()
   * @generated
   * @ordered
   */
  protected static final String CASE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCaseID() <em>Case ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseID()
   * @generated
   * @ordered
   */
  protected String caseID = CASE_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getAHVNummer() <em>AHV Nummer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAHVNummer()
   * @generated
   * @ordered
   */
  protected static final String AHV_NUMMER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAHVNummer() <em>AHV Nummer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAHVNummer()
   * @generated
   * @ordered
   */
  protected String ahvNummer = AHV_NUMMER_EDEFAULT;

  /**
   * The default value of the '{@link #getDokumentenArt() <em>Dokumenten Art</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDokumentenArt()
   * @generated
   * @ordered
   */
  protected static final String DOKUMENTEN_ART_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDokumentenArt() <em>Dokumenten Art</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDokumentenArt()
   * @generated
   * @ordered
   */
  protected String dokumentenArt = DOKUMENTEN_ART_EDEFAULT;

  /**
   * The default value of the '{@link #getGeschaeftsfall() <em>Geschaeftsfall</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeschaeftsfall()
   * @generated
   * @ordered
   */
  protected static final String GESCHAEFTSFALL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGeschaeftsfall() <em>Geschaeftsfall</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeschaeftsfall()
   * @generated
   * @ordered
   */
  protected String geschaeftsfall = GESCHAEFTSFALL_EDEFAULT;

  /**
   * The default value of the '{@link #getAnzahl_der_Dokumente() <em>Anzahl der Dokumente</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnzahl_der_Dokumente()
   * @generated
   * @ordered
   */
  protected static final BigInteger ANZAHL_DER_DOKUMENTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAnzahl_der_Dokumente() <em>Anzahl der Dokumente</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnzahl_der_Dokumente()
   * @generated
   * @ordered
   */
  protected BigInteger anzahl_der_Dokumente = ANZAHL_DER_DOKUMENTE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateCaseIDRequestFromBPMTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ComPackage.Literals.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCaseID()
  {
    return caseID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseID(String newCaseID)
  {
    String oldCaseID = caseID;
    caseID = newCaseID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__CASE_ID, oldCaseID, caseID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAHVNummer()
  {
    return ahvNummer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAHVNummer(String newAHVNummer)
  {
    String oldAHVNummer = ahvNummer;
    ahvNummer = newAHVNummer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__AHV_NUMMER, oldAHVNummer, ahvNummer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDokumentenArt()
  {
    return dokumentenArt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDokumentenArt(String newDokumentenArt)
  {
    String oldDokumentenArt = dokumentenArt;
    dokumentenArt = newDokumentenArt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__DOKUMENTEN_ART, oldDokumentenArt, dokumentenArt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGeschaeftsfall()
  {
    return geschaeftsfall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeschaeftsfall(String newGeschaeftsfall)
  {
    String oldGeschaeftsfall = geschaeftsfall;
    geschaeftsfall = newGeschaeftsfall;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__GESCHAEFTSFALL, oldGeschaeftsfall, geschaeftsfall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getAnzahl_der_Dokumente()
  {
    return anzahl_der_Dokumente;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnzahl_der_Dokumente(BigInteger newAnzahl_der_Dokumente)
  {
    BigInteger oldAnzahl_der_Dokumente = anzahl_der_Dokumente;
    anzahl_der_Dokumente = newAnzahl_der_Dokumente;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__ANZAHL_DER_DOKUMENTE, oldAnzahl_der_Dokumente, anzahl_der_Dokumente));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__CASE_ID:
        return getCaseID();
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__AHV_NUMMER:
        return getAHVNummer();
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__DOKUMENTEN_ART:
        return getDokumentenArt();
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__GESCHAEFTSFALL:
        return getGeschaeftsfall();
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__ANZAHL_DER_DOKUMENTE:
        return getAnzahl_der_Dokumente();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__CASE_ID:
        setCaseID((String)newValue);
        return;
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__AHV_NUMMER:
        setAHVNummer((String)newValue);
        return;
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__DOKUMENTEN_ART:
        setDokumentenArt((String)newValue);
        return;
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__GESCHAEFTSFALL:
        setGeschaeftsfall((String)newValue);
        return;
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__ANZAHL_DER_DOKUMENTE:
        setAnzahl_der_Dokumente((BigInteger)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__CASE_ID:
        setCaseID(CASE_ID_EDEFAULT);
        return;
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__AHV_NUMMER:
        setAHVNummer(AHV_NUMMER_EDEFAULT);
        return;
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__DOKUMENTEN_ART:
        setDokumentenArt(DOKUMENTEN_ART_EDEFAULT);
        return;
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__GESCHAEFTSFALL:
        setGeschaeftsfall(GESCHAEFTSFALL_EDEFAULT);
        return;
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__ANZAHL_DER_DOKUMENTE:
        setAnzahl_der_Dokumente(ANZAHL_DER_DOKUMENTE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__CASE_ID:
        return CASE_ID_EDEFAULT == null ? caseID != null : !CASE_ID_EDEFAULT.equals(caseID);
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__AHV_NUMMER:
        return AHV_NUMMER_EDEFAULT == null ? ahvNummer != null : !AHV_NUMMER_EDEFAULT.equals(ahvNummer);
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__DOKUMENTEN_ART:
        return DOKUMENTEN_ART_EDEFAULT == null ? dokumentenArt != null : !DOKUMENTEN_ART_EDEFAULT.equals(dokumentenArt);
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__GESCHAEFTSFALL:
        return GESCHAEFTSFALL_EDEFAULT == null ? geschaeftsfall != null : !GESCHAEFTSFALL_EDEFAULT.equals(geschaeftsfall);
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE__ANZAHL_DER_DOKUMENTE:
        return ANZAHL_DER_DOKUMENTE_EDEFAULT == null ? anzahl_der_Dokumente != null : !ANZAHL_DER_DOKUMENTE_EDEFAULT.equals(anzahl_der_Dokumente);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (caseID: ");
    result.append(caseID);
    result.append(", AHVNummer: ");
    result.append(ahvNummer);
    result.append(", dokumentenArt: ");
    result.append(dokumentenArt);
    result.append(", geschaeftsfall: ");
    result.append(geschaeftsfall);
    result.append(", anzahl_der_Dokumente: ");
    result.append(anzahl_der_Dokumente);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setCaseID(Object value)
  {
    // Call the default set, passing in the converted value
    setCaseID(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setAHVNummer(Object value)
  {
    // Call the default set, passing in the converted value
    setAHVNummer(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setDokumentenArt(Object value)
  {
    // Call the default set, passing in the converted value
    setDokumentenArt(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setGeschaeftsfall(Object value)
  {
    // Call the default set, passing in the converted value
    setGeschaeftsfall(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setAnzahl_der_Dokumente(Object value)
  {
    // Call the default set, passing in the converted value
    setAnzahl_der_Dokumente(BDSTypeConversions.convertToBigInteger(value));
  }
} //CreateCaseIDRequestFromBPMTypeImpl
