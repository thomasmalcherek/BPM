
package saveDataCaseXSD.bw.test.poc.tibco.com.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage;
import saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseType;

import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSTypeConversions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Case ID Response Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDResponseTypeImpl#getCaseID <em>Case ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class CreateCaseIDResponseTypeImpl extends EObjectImpl implements CreateCaseIDResponseType
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateCaseIDResponseTypeImpl()
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
    return ComPackage.Literals.CREATE_CASE_ID_RESPONSE_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.CREATE_CASE_ID_RESPONSE_TYPE__CASE_ID, oldCaseID, caseID));
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
      case ComPackage.CREATE_CASE_ID_RESPONSE_TYPE__CASE_ID:
        return getCaseID();
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
      case ComPackage.CREATE_CASE_ID_RESPONSE_TYPE__CASE_ID:
        setCaseID((String)newValue);
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
      case ComPackage.CREATE_CASE_ID_RESPONSE_TYPE__CASE_ID:
        setCaseID(CASE_ID_EDEFAULT);
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
      case ComPackage.CREATE_CASE_ID_RESPONSE_TYPE__CASE_ID:
        return CASE_ID_EDEFAULT == null ? caseID != null : !CASE_ID_EDEFAULT.equals(caseID);
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
} //CreateCaseIDResponseTypeImpl
