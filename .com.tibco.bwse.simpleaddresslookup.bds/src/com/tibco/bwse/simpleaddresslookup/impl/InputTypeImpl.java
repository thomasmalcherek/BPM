
package com.tibco.bwse.simpleaddresslookup.impl;

import com.tibco.bwse.simpleaddresslookup.InputType;
import com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage;

import com.tibco.bwse.simpleaddresslookup.bdsutil.BDSTypeConversions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.InputTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class InputTypeImpl extends EObjectImpl implements InputType
{
  /**
   * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostalCode()
   * @generated
   * @ordered
   */
  protected static final String POSTAL_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostalCode()
   * @generated
   * @ordered
   */
  protected String postalCode = POSTAL_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputTypeImpl()
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
    return SimpleaddresslookupPackage.Literals.INPUT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPostalCode()
  {
    return postalCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostalCode(String newPostalCode)
  {
    String oldPostalCode = postalCode;
    postalCode = newPostalCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleaddresslookupPackage.INPUT_TYPE__POSTAL_CODE, oldPostalCode, postalCode));
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
      case SimpleaddresslookupPackage.INPUT_TYPE__POSTAL_CODE:
        return getPostalCode();
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
      case SimpleaddresslookupPackage.INPUT_TYPE__POSTAL_CODE:
        setPostalCode((String)newValue);
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
      case SimpleaddresslookupPackage.INPUT_TYPE__POSTAL_CODE:
        setPostalCode(POSTAL_CODE_EDEFAULT);
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
      case SimpleaddresslookupPackage.INPUT_TYPE__POSTAL_CODE:
        return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
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
    result.append(" (postalCode: ");
    result.append(postalCode);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setPostalCode(Object value)
  {
    // Call the default set, passing in the converted value
    setPostalCode(BDSTypeConversions.convertToString(value));
  }
} //InputTypeImpl
