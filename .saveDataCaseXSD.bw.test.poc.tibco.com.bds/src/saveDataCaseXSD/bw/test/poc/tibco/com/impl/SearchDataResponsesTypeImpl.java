
package saveDataCaseXSD.bw.test.poc.tibco.com.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;

import org.eclipse.emf.ecore.util.FeatureMap.Entry;

import org.eclipse.emf.ecore.util.InternalEList;

import saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage;
import saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType;
import saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponsesType;

import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSFeatureMap;
import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSFeatureMapImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Search Data Responses Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataResponsesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.impl.SearchDataResponsesTypeImpl#getSearchDataResponse <em>Search Data Response</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class SearchDataResponsesTypeImpl extends EObjectImpl implements SearchDataResponsesType
{
  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected BDSFeatureMap group;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SearchDataResponsesTypeImpl()
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
    return ComPackage.Literals.SEARCH_DATA_RESPONSES_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDSFeatureMap getGroup()
  {
    if (group == null)
    {
      group = new BDSFeatureMapImpl(new BasicFeatureMap(this, ComPackage.SEARCH_DATA_RESPONSES_TYPE__GROUP));
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SearchDataResponseType> getSearchDataResponse()
  {
    return ((FeatureMap.Internal.Wrapper)getGroup()).featureMap().list(ComPackage.Literals.SEARCH_DATA_RESPONSES_TYPE__SEARCH_DATA_RESPONSE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ComPackage.SEARCH_DATA_RESPONSES_TYPE__GROUP:
        return ((InternalEList<?>)((FeatureMap.Internal.Wrapper)getGroup()).featureMap()).basicRemove(otherEnd, msgs);
      case ComPackage.SEARCH_DATA_RESPONSES_TYPE__SEARCH_DATA_RESPONSE:
        return ((InternalEList<?>)getSearchDataResponse()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ComPackage.SEARCH_DATA_RESPONSES_TYPE__GROUP:
        if (coreType) return ((FeatureMap.Internal.Wrapper)getGroup()).featureMap();
        return getGroup();
      case ComPackage.SEARCH_DATA_RESPONSES_TYPE__SEARCH_DATA_RESPONSE:
        return getSearchDataResponse();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ComPackage.SEARCH_DATA_RESPONSES_TYPE__GROUP:
        ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getGroup()).featureMap()).set(newValue);
        return;
      case ComPackage.SEARCH_DATA_RESPONSES_TYPE__SEARCH_DATA_RESPONSE:
        getSearchDataResponse().clear();
        getSearchDataResponse().addAll((Collection<? extends SearchDataResponseType>)newValue);
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
      case ComPackage.SEARCH_DATA_RESPONSES_TYPE__GROUP:
        ((FeatureMap.Internal.Wrapper)getGroup()).featureMap().clear();
        return;
      case ComPackage.SEARCH_DATA_RESPONSES_TYPE__SEARCH_DATA_RESPONSE:
        getSearchDataResponse().clear();
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
      case ComPackage.SEARCH_DATA_RESPONSES_TYPE__GROUP:
        return group != null && !group.featureMap().isEmpty();
      case ComPackage.SEARCH_DATA_RESPONSES_TYPE__SEARCH_DATA_RESPONSE:
        return !getSearchDataResponse().isEmpty();
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
    result.append(" (group: ");
    result.append(group);
    result.append(')');
    return result.toString();
  }

    
    /**
   * @generated
   */
  public void setGroup(Object value)
  {
    // Get the FeatureMap we will be setting
    BDSFeatureMap bdsFeatureMap = getGroup();

    // Default behaviour is to overwrite existing data
    // So clear the existing map
    bdsFeatureMap.clear();
    
    if( value != null )
    {
      if( value instanceof FeatureMap )
      {
        bdsFeatureMap.add((FeatureMap)value);		
      }
      else if( value instanceof EObject)
      {
        bdsFeatureMap.add((EObject)value);
      }
      else if( value instanceof Entry )
      {
        bdsFeatureMap.add((Entry)value);
      }
    }
  }
} //SearchDataResponsesTypeImpl
