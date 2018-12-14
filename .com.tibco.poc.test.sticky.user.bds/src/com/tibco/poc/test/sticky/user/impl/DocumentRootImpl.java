
package com.tibco.poc.test.sticky.user.impl;

import com.tibco.poc.test.sticky.user.DocumentRoot;
import com.tibco.poc.test.sticky.user.UserPackage;

import com.tibco.poc.test.sticky.user.bdsutil.BDSFeatureMap;
import com.tibco.poc.test.sticky.user.bdsutil.BDSFeatureMapImpl;

import com.tibco.poc.test.sticky.user.pocDBRequest;
import com.tibco.poc.test.sticky.user.pocMetaData;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.poc.test.sticky.user.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.impl.DocumentRootImpl#getPocDBRequestElement <em>Poc DB Request Element</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.impl.DocumentRootImpl#getPocMetaDataElement <em>Poc Meta Data Element</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.impl.DocumentRootImpl#getPocDBRequestBDSInternalSerializationElement <em>Poc DB Request BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.poc.test.sticky.user.impl.DocumentRootImpl#getPocMetaDataBDSInternalSerializationElement <em>Poc Meta Data BDS Internal Serialization Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot
{
  /**
   * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMixed()
   * @generated
   * @ordered
   */
  protected BDSFeatureMap mixed;

  /**
   * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXMLNSPrefixMap()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xMLNSPrefixMap;

  /**
   * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXSISchemaLocation()
   * @generated
   * @ordered
   */
  protected EMap<String, String> xSISchemaLocation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentRootImpl()
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
    return UserPackage.Literals.DOCUMENT_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BDSFeatureMap getMixed()
  {
    if (mixed == null)
    {
      mixed = new BDSFeatureMapImpl(new BasicFeatureMap(this, UserPackage.DOCUMENT_ROOT__MIXED));
    }
    return mixed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXMLNSPrefixMap()
  {
    if (xMLNSPrefixMap == null)
    {
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, UserPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
    }
    return xMLNSPrefixMap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getXSISchemaLocation()
  {
    if (xSISchemaLocation == null)
    {
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, UserPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pocDBRequest getPocDBRequestElement()
  {
    return (pocDBRequest)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(UserPackage.Literals.DOCUMENT_ROOT__POC_DB_REQUEST_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPocDBRequestElement(pocDBRequest newPocDBRequestElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(UserPackage.Literals.DOCUMENT_ROOT__POC_DB_REQUEST_ELEMENT, newPocDBRequestElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPocDBRequestElement(pocDBRequest newPocDBRequestElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(UserPackage.Literals.DOCUMENT_ROOT__POC_DB_REQUEST_ELEMENT, newPocDBRequestElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pocMetaData getPocMetaDataElement()
  {
    return (pocMetaData)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(UserPackage.Literals.DOCUMENT_ROOT__POC_META_DATA_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPocMetaDataElement(pocMetaData newPocMetaDataElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(UserPackage.Literals.DOCUMENT_ROOT__POC_META_DATA_ELEMENT, newPocMetaDataElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPocMetaDataElement(pocMetaData newPocMetaDataElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(UserPackage.Literals.DOCUMENT_ROOT__POC_META_DATA_ELEMENT, newPocMetaDataElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pocDBRequest getPocDBRequestBDSInternalSerializationElement()
  {
    return (pocDBRequest)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(UserPackage.Literals.DOCUMENT_ROOT__POC_DB_REQUEST_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPocDBRequestBDSInternalSerializationElement(pocDBRequest newPocDBRequestBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(UserPackage.Literals.DOCUMENT_ROOT__POC_DB_REQUEST_BDS_INTERNAL_SERIALIZATION_ELEMENT, newPocDBRequestBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPocDBRequestBDSInternalSerializationElement(pocDBRequest newPocDBRequestBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(UserPackage.Literals.DOCUMENT_ROOT__POC_DB_REQUEST_BDS_INTERNAL_SERIALIZATION_ELEMENT, newPocDBRequestBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pocMetaData getPocMetaDataBDSInternalSerializationElement()
  {
    return (pocMetaData)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(UserPackage.Literals.DOCUMENT_ROOT__POC_META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPocMetaDataBDSInternalSerializationElement(pocMetaData newPocMetaDataBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(UserPackage.Literals.DOCUMENT_ROOT__POC_META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT, newPocMetaDataBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPocMetaDataBDSInternalSerializationElement(pocMetaData newPocMetaDataBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(UserPackage.Literals.DOCUMENT_ROOT__POC_META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT, newPocMetaDataBDSInternalSerializationElement);
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
      case UserPackage.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicRemove(otherEnd, msgs);
      case UserPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case UserPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case UserPackage.DOCUMENT_ROOT__POC_DB_REQUEST_ELEMENT:
        return basicSetPocDBRequestElement(null, msgs);
      case UserPackage.DOCUMENT_ROOT__POC_META_DATA_ELEMENT:
        return basicSetPocMetaDataElement(null, msgs);
      case UserPackage.DOCUMENT_ROOT__POC_DB_REQUEST_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetPocDBRequestBDSInternalSerializationElement(null, msgs);
      case UserPackage.DOCUMENT_ROOT__POC_META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetPocMetaDataBDSInternalSerializationElement(null, msgs);
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
      case UserPackage.DOCUMENT_ROOT__MIXED:
        if (coreType) return ((FeatureMap.Internal.Wrapper)getMixed()).featureMap();
        return getMixed();
      case UserPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case UserPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case UserPackage.DOCUMENT_ROOT__POC_DB_REQUEST_ELEMENT:
        return getPocDBRequestElement();
      case UserPackage.DOCUMENT_ROOT__POC_META_DATA_ELEMENT:
        return getPocMetaDataElement();
      case UserPackage.DOCUMENT_ROOT__POC_DB_REQUEST_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getPocDBRequestBDSInternalSerializationElement();
      case UserPackage.DOCUMENT_ROOT__POC_META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getPocMetaDataBDSInternalSerializationElement();
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
      case UserPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(newValue);
        return;
      case UserPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case UserPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case UserPackage.DOCUMENT_ROOT__POC_DB_REQUEST_ELEMENT:
        setPocDBRequestElement((pocDBRequest)newValue);
        return;
      case UserPackage.DOCUMENT_ROOT__POC_META_DATA_ELEMENT:
        setPocMetaDataElement((pocMetaData)newValue);
        return;
      case UserPackage.DOCUMENT_ROOT__POC_DB_REQUEST_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setPocDBRequestBDSInternalSerializationElement((pocDBRequest)newValue);
        return;
      case UserPackage.DOCUMENT_ROOT__POC_META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setPocMetaDataBDSInternalSerializationElement((pocMetaData)newValue);
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
      case UserPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal.Wrapper)getMixed()).featureMap().clear();
        return;
      case UserPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case UserPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case UserPackage.DOCUMENT_ROOT__POC_DB_REQUEST_ELEMENT:
        setPocDBRequestElement((pocDBRequest)null);
        return;
      case UserPackage.DOCUMENT_ROOT__POC_META_DATA_ELEMENT:
        setPocMetaDataElement((pocMetaData)null);
        return;
      case UserPackage.DOCUMENT_ROOT__POC_DB_REQUEST_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setPocDBRequestBDSInternalSerializationElement((pocDBRequest)null);
        return;
      case UserPackage.DOCUMENT_ROOT__POC_META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setPocMetaDataBDSInternalSerializationElement((pocMetaData)null);
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
      case UserPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.featureMap().isEmpty();
      case UserPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case UserPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case UserPackage.DOCUMENT_ROOT__POC_DB_REQUEST_ELEMENT:
        return getPocDBRequestElement() != null;
      case UserPackage.DOCUMENT_ROOT__POC_META_DATA_ELEMENT:
        return getPocMetaDataElement() != null;
      case UserPackage.DOCUMENT_ROOT__POC_DB_REQUEST_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getPocDBRequestBDSInternalSerializationElement() != null;
      case UserPackage.DOCUMENT_ROOT__POC_META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getPocMetaDataBDSInternalSerializationElement() != null;
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
    result.append(" (mixed: ");
    result.append(mixed);
    result.append(')');
    return result.toString();
  }

} //DocumentRootImpl
