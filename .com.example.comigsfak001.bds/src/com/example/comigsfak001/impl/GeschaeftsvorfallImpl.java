
package com.example.comigsfak001.impl;

import com.example.comigsfak001.Comigsfak001Package;
import com.example.comigsfak001.Geschaeftsvorfall;

import com.example.comigsfak001.bdsutil.BDSCopyUtil;
import com.example.comigsfak001.bdsutil.BDSNotifyingCalendar;
import com.example.comigsfak001.bdsutil.BDSTypeConversions;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geschaeftsvorfall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.comigsfak001.impl.GeschaeftsvorfallImpl#getWFCaseID <em>WF Case ID</em>}</li>
 *   <li>{@link com.example.comigsfak001.impl.GeschaeftsvorfallImpl#getAHVNummer <em>AHV Nummer</em>}</li>
 *   <li>{@link com.example.comigsfak001.impl.GeschaeftsvorfallImpl#getPartnerID <em>Partner ID</em>}</li>
 *   <li>{@link com.example.comigsfak001.impl.GeschaeftsvorfallImpl#getDokumentenArt <em>Dokumenten Art</em>}</li>
 *   <li>{@link com.example.comigsfak001.impl.GeschaeftsvorfallImpl#getGeschaeftsfall <em>Geschaeftsfall</em>}</li>
 *   <li>{@link com.example.comigsfak001.impl.GeschaeftsvorfallImpl#getFrist <em>Frist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class GeschaeftsvorfallImpl extends EObjectImpl implements Geschaeftsvorfall
{
  /**
   * The default value of the '{@link #getWFCaseID() <em>WF Case ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWFCaseID()
   * @generated
   * @ordered
   */
  protected static final String WF_CASE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWFCaseID() <em>WF Case ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWFCaseID()
   * @generated
   * @ordered
   */
  protected String wfCaseID = WF_CASE_ID_EDEFAULT;

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
   * The default value of the '{@link #getFrist() <em>Frist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrist()
   * @generated
   * @ordered
   */
  protected static final XMLGregorianCalendar FRIST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrist() <em>Frist</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrist()
   * @generated
   * @ordered
   */
  protected XMLGregorianCalendar frist = FRIST_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeschaeftsvorfallImpl()
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
    return Comigsfak001Package.Literals.GESCHAEFTSVORFALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWFCaseID()
  {
    return wfCaseID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWFCaseID(String newWFCaseID)
  {
    String oldWFCaseID = wfCaseID;
    wfCaseID = newWFCaseID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Comigsfak001Package.GESCHAEFTSVORFALL__WF_CASE_ID, oldWFCaseID, wfCaseID));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Comigsfak001Package.GESCHAEFTSVORFALL__AHV_NUMMER, oldAHVNummer, ahvNummer));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Comigsfak001Package.GESCHAEFTSVORFALL__PARTNER_ID, oldPartnerID, partnerID));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Comigsfak001Package.GESCHAEFTSVORFALL__DOKUMENTEN_ART, oldDokumentenArt, dokumentenArt));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Comigsfak001Package.GESCHAEFTSVORFALL__GESCHAEFTSFALL, oldGeschaeftsfall, geschaeftsfall));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLGregorianCalendar getFrist()
  {
    return frist;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrist(XMLGregorianCalendar newFrist)
  {
    // Object is mutable, so unless it's the already-set object, clone to give set-by-value semantics
    if (newFrist != frist)
    { 
      if (frist instanceof BDSNotifyingCalendar)
      {
        ((BDSNotifyingCalendar)frist).cancelNotification();
      }
      if (newFrist != null)
      {
        newFrist = new BDSNotifyingCalendar((XMLGregorianCalendar)BDSCopyUtil.copyIfMutable(newFrist), this, Comigsfak001Package.GESCHAEFTSVORFALL__FRIST);
      }
    }
    XMLGregorianCalendar oldFrist = frist;
    frist = newFrist;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Comigsfak001Package.GESCHAEFTSVORFALL__FRIST, oldFrist, frist));
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
      case Comigsfak001Package.GESCHAEFTSVORFALL__WF_CASE_ID:
        return getWFCaseID();
      case Comigsfak001Package.GESCHAEFTSVORFALL__AHV_NUMMER:
        return getAHVNummer();
      case Comigsfak001Package.GESCHAEFTSVORFALL__PARTNER_ID:
        return getPartnerID();
      case Comigsfak001Package.GESCHAEFTSVORFALL__DOKUMENTEN_ART:
        return getDokumentenArt();
      case Comigsfak001Package.GESCHAEFTSVORFALL__GESCHAEFTSFALL:
        return getGeschaeftsfall();
      case Comigsfak001Package.GESCHAEFTSVORFALL__FRIST:
        return getFrist();
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
      case Comigsfak001Package.GESCHAEFTSVORFALL__WF_CASE_ID:
        setWFCaseID((String)newValue);
        return;
      case Comigsfak001Package.GESCHAEFTSVORFALL__AHV_NUMMER:
        setAHVNummer((String)newValue);
        return;
      case Comigsfak001Package.GESCHAEFTSVORFALL__PARTNER_ID:
        setPartnerID((String)newValue);
        return;
      case Comigsfak001Package.GESCHAEFTSVORFALL__DOKUMENTEN_ART:
        setDokumentenArt((String)newValue);
        return;
      case Comigsfak001Package.GESCHAEFTSVORFALL__GESCHAEFTSFALL:
        setGeschaeftsfall((String)newValue);
        return;
      case Comigsfak001Package.GESCHAEFTSVORFALL__FRIST:
        setFrist((XMLGregorianCalendar)newValue);
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
      case Comigsfak001Package.GESCHAEFTSVORFALL__WF_CASE_ID:
        setWFCaseID(WF_CASE_ID_EDEFAULT);
        return;
      case Comigsfak001Package.GESCHAEFTSVORFALL__AHV_NUMMER:
        setAHVNummer(AHV_NUMMER_EDEFAULT);
        return;
      case Comigsfak001Package.GESCHAEFTSVORFALL__PARTNER_ID:
        setPartnerID(PARTNER_ID_EDEFAULT);
        return;
      case Comigsfak001Package.GESCHAEFTSVORFALL__DOKUMENTEN_ART:
        setDokumentenArt(DOKUMENTEN_ART_EDEFAULT);
        return;
      case Comigsfak001Package.GESCHAEFTSVORFALL__GESCHAEFTSFALL:
        setGeschaeftsfall(GESCHAEFTSFALL_EDEFAULT);
        return;
      case Comigsfak001Package.GESCHAEFTSVORFALL__FRIST:
        setFrist(FRIST_EDEFAULT);
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
      case Comigsfak001Package.GESCHAEFTSVORFALL__WF_CASE_ID:
        return WF_CASE_ID_EDEFAULT == null ? wfCaseID != null : !WF_CASE_ID_EDEFAULT.equals(wfCaseID);
      case Comigsfak001Package.GESCHAEFTSVORFALL__AHV_NUMMER:
        return AHV_NUMMER_EDEFAULT == null ? ahvNummer != null : !AHV_NUMMER_EDEFAULT.equals(ahvNummer);
      case Comigsfak001Package.GESCHAEFTSVORFALL__PARTNER_ID:
        return PARTNER_ID_EDEFAULT == null ? partnerID != null : !PARTNER_ID_EDEFAULT.equals(partnerID);
      case Comigsfak001Package.GESCHAEFTSVORFALL__DOKUMENTEN_ART:
        return DOKUMENTEN_ART_EDEFAULT == null ? dokumentenArt != null : !DOKUMENTEN_ART_EDEFAULT.equals(dokumentenArt);
      case Comigsfak001Package.GESCHAEFTSVORFALL__GESCHAEFTSFALL:
        return GESCHAEFTSFALL_EDEFAULT == null ? geschaeftsfall != null : !GESCHAEFTSFALL_EDEFAULT.equals(geschaeftsfall);
      case Comigsfak001Package.GESCHAEFTSVORFALL__FRIST:
        return FRIST_EDEFAULT == null ? frist != null : !FRIST_EDEFAULT.equals(frist);
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
    result.append(" (WFCaseID: ");
    result.append(wfCaseID);
    result.append(", AHVNummer: ");
    result.append(ahvNummer);
    result.append(", partnerID: ");
    result.append(partnerID);
    result.append(", dokumentenArt: ");
    result.append(dokumentenArt);
    result.append(", geschaeftsfall: ");
    result.append(geschaeftsfall);
    result.append(", frist: ");
    result.append(frist);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setWFCaseID(Object value)
  {
    // Call the default set, passing in the converted value
    setWFCaseID(BDSTypeConversions.convertToString(value));
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
  public void setGeschaeftsfall(Object value)
  {
    // Call the default set, passing in the converted value
    setGeschaeftsfall(BDSTypeConversions.convertToString(value));
  }
} //GeschaeftsvorfallImpl
