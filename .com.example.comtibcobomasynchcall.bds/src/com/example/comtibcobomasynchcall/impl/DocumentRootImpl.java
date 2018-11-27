
package com.example.comtibcobomasynchcall.impl;

import com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage;
import com.example.comtibcobomasynchcall.DocumentRoot;
import com.example.comtibcobomasynchcall.MetaData;

import com.example.comtibcobomasynchcall.bdsutil.BDSFeatureMap;
import com.example.comtibcobomasynchcall.bdsutil.BDSFeatureMapImpl;

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
 *   <li>{@link com.example.comtibcobomasynchcall.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.example.comtibcobomasynchcall.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.example.comtibcobomasynchcall.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.example.comtibcobomasynchcall.impl.DocumentRootImpl#getMetaDataElement <em>Meta Data Element</em>}</li>
 *   <li>{@link com.example.comtibcobomasynchcall.impl.DocumentRootImpl#getMetaDataBDSInternalSerializationElement <em>Meta Data BDS Internal Serialization Element</em>}</li>
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
    return ComtibcobomasynchcallPackage.Literals.DOCUMENT_ROOT;
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
      mixed = new BDSFeatureMapImpl(new BasicFeatureMap(this, ComtibcobomasynchcallPackage.DOCUMENT_ROOT__MIXED));
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
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ComtibcobomasynchcallPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ComtibcobomasynchcallPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaData getMetaDataElement()
  {
    return (MetaData)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComtibcobomasynchcallPackage.Literals.DOCUMENT_ROOT__META_DATA_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetaDataElement(MetaData newMetaDataElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComtibcobomasynchcallPackage.Literals.DOCUMENT_ROOT__META_DATA_ELEMENT, newMetaDataElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaDataElement(MetaData newMetaDataElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComtibcobomasynchcallPackage.Literals.DOCUMENT_ROOT__META_DATA_ELEMENT, newMetaDataElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaData getMetaDataBDSInternalSerializationElement()
  {
    return (MetaData)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(ComtibcobomasynchcallPackage.Literals.DOCUMENT_ROOT__META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetaDataBDSInternalSerializationElement(MetaData newMetaDataBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(ComtibcobomasynchcallPackage.Literals.DOCUMENT_ROOT__META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT, newMetaDataBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaDataBDSInternalSerializationElement(MetaData newMetaDataBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(ComtibcobomasynchcallPackage.Literals.DOCUMENT_ROOT__META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT, newMetaDataBDSInternalSerializationElement);
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
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicRemove(otherEnd, msgs);
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__META_DATA_ELEMENT:
        return basicSetMetaDataElement(null, msgs);
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetMetaDataBDSInternalSerializationElement(null, msgs);
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
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__MIXED:
        if (coreType) return ((FeatureMap.Internal.Wrapper)getMixed()).featureMap();
        return getMixed();
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__META_DATA_ELEMENT:
        return getMetaDataElement();
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getMetaDataBDSInternalSerializationElement();
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
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(newValue);
        return;
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__META_DATA_ELEMENT:
        setMetaDataElement((MetaData)newValue);
        return;
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setMetaDataBDSInternalSerializationElement((MetaData)newValue);
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
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal.Wrapper)getMixed()).featureMap().clear();
        return;
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__META_DATA_ELEMENT:
        setMetaDataElement((MetaData)null);
        return;
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setMetaDataBDSInternalSerializationElement((MetaData)null);
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
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.featureMap().isEmpty();
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__META_DATA_ELEMENT:
        return getMetaDataElement() != null;
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT__META_DATA_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getMetaDataBDSInternalSerializationElement() != null;
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
