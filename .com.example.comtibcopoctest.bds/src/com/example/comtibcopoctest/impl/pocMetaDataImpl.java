
package com.example.comtibcopoctest.impl;

import com.example.comtibcopoctest.ComtibcopoctestPackage;

import com.example.comtibcopoctest.bdsutil.BDSTypeConversions;

import com.example.comtibcopoctest.pocMetaData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>poc Meta Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.comtibcopoctest.impl.pocMetaDataImpl#getWFCaseID <em>WF Case ID</em>}</li>
 *   <li>{@link com.example.comtibcopoctest.impl.pocMetaDataImpl#getAHVNummer <em>AHV Nummer</em>}</li>
 *   <li>{@link com.example.comtibcopoctest.impl.pocMetaDataImpl#getPartnerID <em>Partner ID</em>}</li>
 *   <li>{@link com.example.comtibcopoctest.impl.pocMetaDataImpl#getDokumentenArt <em>Dokumenten Art</em>}</li>
 *   <li>{@link com.example.comtibcopoctest.impl.pocMetaDataImpl#getKanton <em>Kanton</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class pocMetaDataImpl extends EObjectImpl implements pocMetaData
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
  protected pocMetaDataImpl()
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
    return ComtibcopoctestPackage.Literals.POC_META_DATA;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComtibcopoctestPackage.POC_META_DATA__WF_CASE_ID, oldWFCaseID, wfCaseID));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComtibcopoctestPackage.POC_META_DATA__AHV_NUMMER, oldAHVNummer, ahvNummer));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComtibcopoctestPackage.POC_META_DATA__PARTNER_ID, oldPartnerID, partnerID));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComtibcopoctestPackage.POC_META_DATA__DOKUMENTEN_ART, oldDokumentenArt, dokumentenArt));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComtibcopoctestPackage.POC_META_DATA__KANTON, oldKanton, kanton));
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
      case ComtibcopoctestPackage.POC_META_DATA__WF_CASE_ID:
        return getWFCaseID();
      case ComtibcopoctestPackage.POC_META_DATA__AHV_NUMMER:
        return getAHVNummer();
      case ComtibcopoctestPackage.POC_META_DATA__PARTNER_ID:
        return getPartnerID();
      case ComtibcopoctestPackage.POC_META_DATA__DOKUMENTEN_ART:
        return getDokumentenArt();
      case ComtibcopoctestPackage.POC_META_DATA__KANTON:
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
      case ComtibcopoctestPackage.POC_META_DATA__WF_CASE_ID:
        setWFCaseID((String)newValue);
        return;
      case ComtibcopoctestPackage.POC_META_DATA__AHV_NUMMER:
        setAHVNummer((String)newValue);
        return;
      case ComtibcopoctestPackage.POC_META_DATA__PARTNER_ID:
        setPartnerID((String)newValue);
        return;
      case ComtibcopoctestPackage.POC_META_DATA__DOKUMENTEN_ART:
        setDokumentenArt((String)newValue);
        return;
      case ComtibcopoctestPackage.POC_META_DATA__KANTON:
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
      case ComtibcopoctestPackage.POC_META_DATA__WF_CASE_ID:
        setWFCaseID(WF_CASE_ID_EDEFAULT);
        return;
      case ComtibcopoctestPackage.POC_META_DATA__AHV_NUMMER:
        setAHVNummer(AHV_NUMMER_EDEFAULT);
        return;
      case ComtibcopoctestPackage.POC_META_DATA__PARTNER_ID:
        setPartnerID(PARTNER_ID_EDEFAULT);
        return;
      case ComtibcopoctestPackage.POC_META_DATA__DOKUMENTEN_ART:
        setDokumentenArt(DOKUMENTEN_ART_EDEFAULT);
        return;
      case ComtibcopoctestPackage.POC_META_DATA__KANTON:
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
      case ComtibcopoctestPackage.POC_META_DATA__WF_CASE_ID:
        return WF_CASE_ID_EDEFAULT == null ? wfCaseID != null : !WF_CASE_ID_EDEFAULT.equals(wfCaseID);
      case ComtibcopoctestPackage.POC_META_DATA__AHV_NUMMER:
        return AHV_NUMMER_EDEFAULT == null ? ahvNummer != null : !AHV_NUMMER_EDEFAULT.equals(ahvNummer);
      case ComtibcopoctestPackage.POC_META_DATA__PARTNER_ID:
        return PARTNER_ID_EDEFAULT == null ? partnerID != null : !PARTNER_ID_EDEFAULT.equals(partnerID);
      case ComtibcopoctestPackage.POC_META_DATA__DOKUMENTEN_ART:
        return DOKUMENTEN_ART_EDEFAULT == null ? dokumentenArt != null : !DOKUMENTEN_ART_EDEFAULT.equals(dokumentenArt);
      case ComtibcopoctestPackage.POC_META_DATA__KANTON:
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
    result.append(" (WFCaseID: ");
    result.append(wfCaseID);
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
  public void setKanton(Object value)
  {
    // Call the default set, passing in the converted value
    setKanton(BDSTypeConversions.convertToString(value));
  }
} //pocMetaDataImpl
