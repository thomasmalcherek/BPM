
package saveDataCaseXSD.bw.test.poc.tibco.com.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage;
import saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataRequestType;

import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSTypeConversions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Data Request Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataRequestTypeImpl#getAHVNummer <em>AHV Nummer</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataRequestTypeImpl#getDokumentenArt <em>Dokumenten Art</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataRequestTypeImpl#getGeschaeftsfall <em>Geschaeftsfall</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class SearchDataRequestTypeImpl extends EObjectImpl implements SearchDataRequestType
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SearchDataRequestTypeImpl()
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
    return ComPackage.Literals.SEARCH_DATA_REQUEST_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.SEARCH_DATA_REQUEST_TYPE__AHV_NUMMER, oldAHVNummer, ahvNummer));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.SEARCH_DATA_REQUEST_TYPE__DOKUMENTEN_ART, oldDokumentenArt, dokumentenArt));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.SEARCH_DATA_REQUEST_TYPE__GESCHAEFTSFALL, oldGeschaeftsfall, geschaeftsfall));
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
      case ComPackage.SEARCH_DATA_REQUEST_TYPE__AHV_NUMMER:
        return getAHVNummer();
      case ComPackage.SEARCH_DATA_REQUEST_TYPE__DOKUMENTEN_ART:
        return getDokumentenArt();
      case ComPackage.SEARCH_DATA_REQUEST_TYPE__GESCHAEFTSFALL:
        return getGeschaeftsfall();
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
      case ComPackage.SEARCH_DATA_REQUEST_TYPE__AHV_NUMMER:
        setAHVNummer((String)newValue);
        return;
      case ComPackage.SEARCH_DATA_REQUEST_TYPE__DOKUMENTEN_ART:
        setDokumentenArt((String)newValue);
        return;
      case ComPackage.SEARCH_DATA_REQUEST_TYPE__GESCHAEFTSFALL:
        setGeschaeftsfall((String)newValue);
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
      case ComPackage.SEARCH_DATA_REQUEST_TYPE__AHV_NUMMER:
        setAHVNummer(AHV_NUMMER_EDEFAULT);
        return;
      case ComPackage.SEARCH_DATA_REQUEST_TYPE__DOKUMENTEN_ART:
        setDokumentenArt(DOKUMENTEN_ART_EDEFAULT);
        return;
      case ComPackage.SEARCH_DATA_REQUEST_TYPE__GESCHAEFTSFALL:
        setGeschaeftsfall(GESCHAEFTSFALL_EDEFAULT);
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
      case ComPackage.SEARCH_DATA_REQUEST_TYPE__AHV_NUMMER:
        return AHV_NUMMER_EDEFAULT == null ? ahvNummer != null : !AHV_NUMMER_EDEFAULT.equals(ahvNummer);
      case ComPackage.SEARCH_DATA_REQUEST_TYPE__DOKUMENTEN_ART:
        return DOKUMENTEN_ART_EDEFAULT == null ? dokumentenArt != null : !DOKUMENTEN_ART_EDEFAULT.equals(dokumentenArt);
      case ComPackage.SEARCH_DATA_REQUEST_TYPE__GESCHAEFTSFALL:
        return GESCHAEFTSFALL_EDEFAULT == null ? geschaeftsfall != null : !GESCHAEFTSFALL_EDEFAULT.equals(geschaeftsfall);
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
    result.append(" (AHVNummer: ");
    result.append(ahvNummer);
    result.append(", dokumentenArt: ");
    result.append(dokumentenArt);
    result.append(", geschaeftsfall: ");
    result.append(geschaeftsfall);
    result.append(')');
    return result.toString();
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
} //SearchDataRequestTypeImpl
