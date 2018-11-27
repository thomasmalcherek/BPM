
package com.example.thomas_bd.WF_PACK.impl;

import com.example.thomas_bd.WF_PACK.WF_DATA;
import com.example.thomas_bd.WF_PACK.WF_PACKPackage;

import com.example.thomas_bd.WF_PACK.bdsutil.BDSCopyUtil;
import com.example.thomas_bd.WF_PACK.bdsutil.BDSNotifyingCalendar;
import com.example.thomas_bd.WF_PACK.bdsutil.BDSTypeConversions;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WF DATA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.thomas_bd.WF_PACK.impl.WF_DATAImpl#getHEADER <em>HEADER</em>}</li>
 *   <li>{@link com.example.thomas_bd.WF_PACK.impl.WF_DATAImpl#getVALUE <em>VALUE</em>}</li>
 *   <li>{@link com.example.thomas_bd.WF_PACK.impl.WF_DATAImpl#getDATE <em>DATE</em>}</li>
 *   <li>{@link com.example.thomas_bd.WF_PACK.impl.WF_DATAImpl#getEXPLANATION <em>EXPLANATION</em>}</li>
 *   <li>{@link com.example.thomas_bd.WF_PACK.impl.WF_DATAImpl#getPOSTALCODE <em>POSTALCODE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class WF_DATAImpl extends EObjectImpl implements WF_DATA
{
  /**
   * The default value of the '{@link #getHEADER() <em>HEADER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHEADER()
   * @generated
   * @ordered
   */
  protected static final String HEADER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHEADER() <em>HEADER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHEADER()
   * @generated
   * @ordered
   */
  protected String header = HEADER_EDEFAULT;

  /**
   * The default value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVALUE()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVALUE() <em>VALUE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVALUE()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getDATE() <em>DATE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDATE()
   * @generated
   * @ordered
   */
  protected static final XMLGregorianCalendar DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDATE() <em>DATE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDATE()
   * @generated
   * @ordered
   */
  protected XMLGregorianCalendar date = DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getEXPLANATION() <em>EXPLANATION</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEXPLANATION()
   * @generated
   * @ordered
   */
  protected static final String EXPLANATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEXPLANATION() <em>EXPLANATION</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEXPLANATION()
   * @generated
   * @ordered
   */
  protected String explanation = EXPLANATION_EDEFAULT;

  /**
   * The default value of the '{@link #getPOSTALCODE() <em>POSTALCODE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPOSTALCODE()
   * @generated
   * @ordered
   */
  protected static final String POSTALCODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPOSTALCODE() <em>POSTALCODE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPOSTALCODE()
   * @generated
   * @ordered
   */
  protected String postalcode = POSTALCODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WF_DATAImpl()
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
    return WF_PACKPackage.Literals.WF_DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHEADER()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHEADER(String newHEADER)
  {
    String oldHEADER = header;
    header = newHEADER;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WF_PACKPackage.WF_DATA__HEADER, oldHEADER, header));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVALUE()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVALUE(String newVALUE)
  {
    String oldVALUE = value;
    value = newVALUE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WF_PACKPackage.WF_DATA__VALUE, oldVALUE, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XMLGregorianCalendar getDATE()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDATE(XMLGregorianCalendar newDATE)
  {
    // Object is mutable, so unless it's the already-set object, clone to give set-by-value semantics
    if (newDATE != date)
    { 
      if (date instanceof BDSNotifyingCalendar)
      {
        ((BDSNotifyingCalendar)date).cancelNotification();
      }
      if (newDATE != null)
      {
        newDATE = new BDSNotifyingCalendar((XMLGregorianCalendar)BDSCopyUtil.copyIfMutable(newDATE), this, WF_PACKPackage.WF_DATA__DATE);
      }
    }
    XMLGregorianCalendar oldDATE = date;
    date = newDATE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WF_PACKPackage.WF_DATA__DATE, oldDATE, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEXPLANATION()
  {
    return explanation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEXPLANATION(String newEXPLANATION)
  {
    String oldEXPLANATION = explanation;
    explanation = newEXPLANATION;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WF_PACKPackage.WF_DATA__EXPLANATION, oldEXPLANATION, explanation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPOSTALCODE()
  {
    return postalcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPOSTALCODE(String newPOSTALCODE)
  {
    String oldPOSTALCODE = postalcode;
    postalcode = newPOSTALCODE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WF_PACKPackage.WF_DATA__POSTALCODE, oldPOSTALCODE, postalcode));
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
      case WF_PACKPackage.WF_DATA__HEADER:
        return getHEADER();
      case WF_PACKPackage.WF_DATA__VALUE:
        return getVALUE();
      case WF_PACKPackage.WF_DATA__DATE:
        return getDATE();
      case WF_PACKPackage.WF_DATA__EXPLANATION:
        return getEXPLANATION();
      case WF_PACKPackage.WF_DATA__POSTALCODE:
        return getPOSTALCODE();
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
      case WF_PACKPackage.WF_DATA__HEADER:
        setHEADER((String)newValue);
        return;
      case WF_PACKPackage.WF_DATA__VALUE:
        setVALUE((String)newValue);
        return;
      case WF_PACKPackage.WF_DATA__DATE:
        setDATE((XMLGregorianCalendar)newValue);
        return;
      case WF_PACKPackage.WF_DATA__EXPLANATION:
        setEXPLANATION((String)newValue);
        return;
      case WF_PACKPackage.WF_DATA__POSTALCODE:
        setPOSTALCODE((String)newValue);
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
      case WF_PACKPackage.WF_DATA__HEADER:
        setHEADER(HEADER_EDEFAULT);
        return;
      case WF_PACKPackage.WF_DATA__VALUE:
        setVALUE(VALUE_EDEFAULT);
        return;
      case WF_PACKPackage.WF_DATA__DATE:
        setDATE(DATE_EDEFAULT);
        return;
      case WF_PACKPackage.WF_DATA__EXPLANATION:
        setEXPLANATION(EXPLANATION_EDEFAULT);
        return;
      case WF_PACKPackage.WF_DATA__POSTALCODE:
        setPOSTALCODE(POSTALCODE_EDEFAULT);
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
      case WF_PACKPackage.WF_DATA__HEADER:
        return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
      case WF_PACKPackage.WF_DATA__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case WF_PACKPackage.WF_DATA__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case WF_PACKPackage.WF_DATA__EXPLANATION:
        return EXPLANATION_EDEFAULT == null ? explanation != null : !EXPLANATION_EDEFAULT.equals(explanation);
      case WF_PACKPackage.WF_DATA__POSTALCODE:
        return POSTALCODE_EDEFAULT == null ? postalcode != null : !POSTALCODE_EDEFAULT.equals(postalcode);
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
    result.append(" (HEADER: ");
    result.append(header);
    result.append(", VALUE: ");
    result.append(value);
    result.append(", DATE: ");
    result.append(date);
    result.append(", EXPLANATION: ");
    result.append(explanation);
    result.append(", POSTALCODE: ");
    result.append(postalcode);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setHEADER(Object value)
  {
    // Call the default set, passing in the converted value
    setHEADER(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setVALUE(Object value)
  {
    // Call the default set, passing in the converted value
    setVALUE(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setEXPLANATION(Object value)
  {
    // Call the default set, passing in the converted value
    setEXPLANATION(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setPOSTALCODE(Object value)
  {
    // Call the default set, passing in the converted value
    setPOSTALCODE(BDSTypeConversions.convertToString(value));
  }
} //WF_DATAImpl
