
package saveDataCaseXSD.bw.test.poc.tibco.com.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage;
import saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType;

import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSTypeConversions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Data Response From Case ID Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataResponseFromCaseIDTypeImpl#getCaseID <em>Case ID</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataResponseFromCaseIDTypeImpl#getAHVNummer <em>AHV Nummer</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataResponseFromCaseIDTypeImpl#getPartnerID <em>Partner ID</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataResponseFromCaseIDTypeImpl#getDokumentenArt <em>Dokumenten Art</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.GetDataResponseFromCaseIDTypeImpl#getKanton <em>Kanton</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class GetDataResponseFromCaseIDTypeImpl extends EObjectImpl implements GetDataResponseFromCaseIDType
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
   * The default value of the '{@link #getPartnerID() <em>Partner ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartnerID()
   * @generated
   * @ordered
   */
  protected static final String PARTNER_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPartnerID() <em>Partner ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartnerID()
   * @generated
   * @ordered
   */
  protected String partnerID = PARTNER_ID_EDEFAULT;

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
   * The default value of the '{@link #getKanton() <em>Kanton</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKanton()
   * @generated
   * @ordered
   */
  protected static final String KANTON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKanton() <em>Kanton</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKanton()
   * @generated
   * @ordered
   */
  protected String kanton = KANTON_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetDataResponseFromCaseIDTypeImpl()
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
    return ComPackage.Literals.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__CASE_ID, oldCaseID, caseID));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__AHV_NUMMER, oldAHVNummer, ahvNummer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPartnerID()
  {
    return partnerID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartnerID(String newPartnerID)
  {
    String oldPartnerID = partnerID;
    partnerID = newPartnerID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__PARTNER_ID, oldPartnerID, partnerID));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__DOKUMENTEN_ART, oldDokumentenArt, dokumentenArt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKanton()
  {
    return kanton;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKanton(String newKanton)
  {
    String oldKanton = kanton;
    kanton = newKanton;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__KANTON, oldKanton, kanton));
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
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__CASE_ID:
        return getCaseID();
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__AHV_NUMMER:
        return getAHVNummer();
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__PARTNER_ID:
        return getPartnerID();
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__DOKUMENTEN_ART:
        return getDokumentenArt();
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__KANTON:
        return getKanton();
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
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__CASE_ID:
        setCaseID((String)newValue);
        return;
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__AHV_NUMMER:
        setAHVNummer((String)newValue);
        return;
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__PARTNER_ID:
        setPartnerID((String)newValue);
        return;
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__DOKUMENTEN_ART:
        setDokumentenArt((String)newValue);
        return;
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__KANTON:
        setKanton((String)newValue);
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
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__CASE_ID:
        setCaseID(CASE_ID_EDEFAULT);
        return;
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__AHV_NUMMER:
        setAHVNummer(AHV_NUMMER_EDEFAULT);
        return;
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__PARTNER_ID:
        setPartnerID(PARTNER_ID_EDEFAULT);
        return;
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__DOKUMENTEN_ART:
        setDokumentenArt(DOKUMENTEN_ART_EDEFAULT);
        return;
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__KANTON:
        setKanton(KANTON_EDEFAULT);
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
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__CASE_ID:
        return CASE_ID_EDEFAULT == null ? caseID != null : !CASE_ID_EDEFAULT.equals(caseID);
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__AHV_NUMMER:
        return AHV_NUMMER_EDEFAULT == null ? ahvNummer != null : !AHV_NUMMER_EDEFAULT.equals(ahvNummer);
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__PARTNER_ID:
        return PARTNER_ID_EDEFAULT == null ? partnerID != null : !PARTNER_ID_EDEFAULT.equals(partnerID);
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__DOKUMENTEN_ART:
        return DOKUMENTEN_ART_EDEFAULT == null ? dokumentenArt != null : !DOKUMENTEN_ART_EDEFAULT.equals(dokumentenArt);
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE__KANTON:
        return KANTON_EDEFAULT == null ? kanton != null : !KANTON_EDEFAULT.equals(kanton);
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
    result.append(", partnerID: ");
    result.append(partnerID);
    result.append(", dokumentenArt: ");
    result.append(dokumentenArt);
    result.append(", kanton: ");
    result.append(kanton);
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
  public void setPartnerID(Object value)
  {
    // Call the default set, passing in the converted value
    setPartnerID(BDSTypeConversions.convertToString(value));
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
  public void setKanton(Object value)
  {
    // Call the default set, passing in the converted value
    setKanton(BDSTypeConversions.convertToString(value));
  }
} //GetDataResponseFromCaseIDTypeImpl
