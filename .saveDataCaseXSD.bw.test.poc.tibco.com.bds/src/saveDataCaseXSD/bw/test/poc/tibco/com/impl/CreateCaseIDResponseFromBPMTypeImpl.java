
package saveDataCaseXSD.bw.test.poc.tibco.com.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage;
import saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Case ID Response From BPM Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.CreateCaseIDResponseFromBPMTypeImpl#getAcknowledgement <em>Acknowledgement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class CreateCaseIDResponseFromBPMTypeImpl extends EObjectImpl implements CreateCaseIDResponseFromBPMType
{
  /**
   * The default value of the '{@link #getAcknowledgement() <em>Acknowledgement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcknowledgement()
   * @generated
   * @ordered
   */
  protected static final Boolean ACKNOWLEDGEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAcknowledgement() <em>Acknowledgement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcknowledgement()
   * @generated
   * @ordered
   */
  protected Boolean acknowledgement = ACKNOWLEDGEMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CreateCaseIDResponseFromBPMTypeImpl()
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
    return ComPackage.Literals.CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean getAcknowledgement()
  {
    return acknowledgement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAcknowledgement(Boolean newAcknowledgement)
  {
    Boolean oldAcknowledgement = acknowledgement;
    acknowledgement = newAcknowledgement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComPackage.CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE__ACKNOWLEDGEMENT, oldAcknowledgement, acknowledgement));
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
      case ComPackage.CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE__ACKNOWLEDGEMENT:
        return getAcknowledgement();
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
      case ComPackage.CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE__ACKNOWLEDGEMENT:
        setAcknowledgement((Boolean)newValue);
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
      case ComPackage.CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE__ACKNOWLEDGEMENT:
        setAcknowledgement(ACKNOWLEDGEMENT_EDEFAULT);
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
      case ComPackage.CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE__ACKNOWLEDGEMENT:
        return ACKNOWLEDGEMENT_EDEFAULT == null ? acknowledgement != null : !ACKNOWLEDGEMENT_EDEFAULT.equals(acknowledgement);
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
    result.append(" (acknowledgement: ");
    result.append(acknowledgement);
    result.append(')');
    return result.toString();
  }

} //CreateCaseIDResponseFromBPMTypeImpl
