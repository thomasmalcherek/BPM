
package com.example.thomas_bd.WF_PACK.impl;

import com.example.thomas_bd.WF_PACK.DocumentRoot;
import com.example.thomas_bd.WF_PACK.WF_DATA;
import com.example.thomas_bd.WF_PACK.WF_PACKPackage;

import com.example.thomas_bd.WF_PACK.bdsutil.BDSFeatureMap;
import com.example.thomas_bd.WF_PACK.bdsutil.BDSFeatureMapImpl;

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
 *   <li>{@link com.example.thomas_bd.WF_PACK.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.example.thomas_bd.WF_PACK.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.example.thomas_bd.WF_PACK.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.example.thomas_bd.WF_PACK.impl.DocumentRootImpl#getWFDATAElement <em>WFDATA Element</em>}</li>
 *   <li>{@link com.example.thomas_bd.WF_PACK.impl.DocumentRootImpl#getWF_DATABDSInternalSerializationElement <em>WF DATABDS Internal Serialization Element</em>}</li>
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
    return WF_PACKPackage.Literals.DOCUMENT_ROOT;
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
      mixed = new BDSFeatureMapImpl(new BasicFeatureMap(this, WF_PACKPackage.DOCUMENT_ROOT__MIXED));
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
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, WF_PACKPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, WF_PACKPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WF_DATA getWFDATAElement()
  {
    return (WF_DATA)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(WF_PACKPackage.Literals.DOCUMENT_ROOT__WFDATA_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWFDATAElement(WF_DATA newWFDATAElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(WF_PACKPackage.Literals.DOCUMENT_ROOT__WFDATA_ELEMENT, newWFDATAElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWFDATAElement(WF_DATA newWFDATAElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(WF_PACKPackage.Literals.DOCUMENT_ROOT__WFDATA_ELEMENT, newWFDATAElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WF_DATA getWF_DATABDSInternalSerializationElement()
  {
    return (WF_DATA)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(WF_PACKPackage.Literals.DOCUMENT_ROOT__WF_DATABDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWF_DATABDSInternalSerializationElement(WF_DATA newWF_DATABDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(WF_PACKPackage.Literals.DOCUMENT_ROOT__WF_DATABDS_INTERNAL_SERIALIZATION_ELEMENT, newWF_DATABDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWF_DATABDSInternalSerializationElement(WF_DATA newWF_DATABDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(WF_PACKPackage.Literals.DOCUMENT_ROOT__WF_DATABDS_INTERNAL_SERIALIZATION_ELEMENT, newWF_DATABDSInternalSerializationElement);
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
      case WF_PACKPackage.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicRemove(otherEnd, msgs);
      case WF_PACKPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case WF_PACKPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case WF_PACKPackage.DOCUMENT_ROOT__WFDATA_ELEMENT:
        return basicSetWFDATAElement(null, msgs);
      case WF_PACKPackage.DOCUMENT_ROOT__WF_DATABDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetWF_DATABDSInternalSerializationElement(null, msgs);
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
      case WF_PACKPackage.DOCUMENT_ROOT__MIXED:
        if (coreType) return ((FeatureMap.Internal.Wrapper)getMixed()).featureMap();
        return getMixed();
      case WF_PACKPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case WF_PACKPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case WF_PACKPackage.DOCUMENT_ROOT__WFDATA_ELEMENT:
        return getWFDATAElement();
      case WF_PACKPackage.DOCUMENT_ROOT__WF_DATABDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getWF_DATABDSInternalSerializationElement();
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
      case WF_PACKPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(newValue);
        return;
      case WF_PACKPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case WF_PACKPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case WF_PACKPackage.DOCUMENT_ROOT__WFDATA_ELEMENT:
        setWFDATAElement((WF_DATA)newValue);
        return;
      case WF_PACKPackage.DOCUMENT_ROOT__WF_DATABDS_INTERNAL_SERIALIZATION_ELEMENT:
        setWF_DATABDSInternalSerializationElement((WF_DATA)newValue);
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
      case WF_PACKPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal.Wrapper)getMixed()).featureMap().clear();
        return;
      case WF_PACKPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case WF_PACKPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case WF_PACKPackage.DOCUMENT_ROOT__WFDATA_ELEMENT:
        setWFDATAElement((WF_DATA)null);
        return;
      case WF_PACKPackage.DOCUMENT_ROOT__WF_DATABDS_INTERNAL_SERIALIZATION_ELEMENT:
        setWF_DATABDSInternalSerializationElement((WF_DATA)null);
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
      case WF_PACKPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.featureMap().isEmpty();
      case WF_PACKPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case WF_PACKPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case WF_PACKPackage.DOCUMENT_ROOT__WFDATA_ELEMENT:
        return getWFDATAElement() != null;
      case WF_PACKPackage.DOCUMENT_ROOT__WF_DATABDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getWF_DATABDSInternalSerializationElement() != null;
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
