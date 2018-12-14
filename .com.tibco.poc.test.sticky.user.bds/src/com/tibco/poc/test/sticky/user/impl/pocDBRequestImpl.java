
package com.tibco.poc.test.sticky.user.impl;

import com.tibco.poc.test.sticky.user.UserPackage;

import com.tibco.poc.test.sticky.user.bdsutil.BDSTypeConversions;

import com.tibco.poc.test.sticky.user.pocDBRequest;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>poc DB Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.poc.test.sticky.user.impl.pocDBRequestImpl#getWFCaseID <em>WF Case ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class pocDBRequestImpl extends EObjectImpl implements pocDBRequest
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected pocDBRequestImpl()
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
    return UserPackage.Literals.POC_DB_REQUEST;
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
      eNotify(new ENotificationImpl(this, Notification.SET, UserPackage.POC_DB_REQUEST__WF_CASE_ID, oldWFCaseID, wfCaseID));
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
      case UserPackage.POC_DB_REQUEST__WF_CASE_ID:
        return getWFCaseID();
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
      case UserPackage.POC_DB_REQUEST__WF_CASE_ID:
        setWFCaseID((String)newValue);
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
      case UserPackage.POC_DB_REQUEST__WF_CASE_ID:
        setWFCaseID(WF_CASE_ID_EDEFAULT);
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
      case UserPackage.POC_DB_REQUEST__WF_CASE_ID:
        return WF_CASE_ID_EDEFAULT == null ? wfCaseID != null : !WF_CASE_ID_EDEFAULT.equals(wfCaseID);
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
} //pocDBRequestImpl
