
package com.example.comigsfak001.impl;

import com.example.comigsfak001.Comigsfak001Package;
import com.example.comigsfak001.DocumentRoot;
import com.example.comigsfak001.Geschaeftsvorfall;

import com.example.comigsfak001.bdsutil.BDSFeatureMap;
import com.example.comigsfak001.bdsutil.BDSFeatureMapImpl;

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
 *   <li>{@link com.example.comigsfak001.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.example.comigsfak001.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.example.comigsfak001.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.example.comigsfak001.impl.DocumentRootImpl#getGeschaeftsvorfallElement <em>Geschaeftsvorfall Element</em>}</li>
 *   <li>{@link com.example.comigsfak001.impl.DocumentRootImpl#getGeschaeftsvorfallBDSInternalSerializationElement <em>Geschaeftsvorfall BDS Internal Serialization Element</em>}</li>
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
    return Comigsfak001Package.Literals.DOCUMENT_ROOT;
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
      mixed = new BDSFeatureMapImpl(new BasicFeatureMap(this, Comigsfak001Package.DOCUMENT_ROOT__MIXED));
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
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Comigsfak001Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, Comigsfak001Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Geschaeftsvorfall getGeschaeftsvorfallElement()
  {
    return (Geschaeftsvorfall)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Comigsfak001Package.Literals.DOCUMENT_ROOT__GESCHAEFTSVORFALL_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeschaeftsvorfallElement(Geschaeftsvorfall newGeschaeftsvorfallElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Comigsfak001Package.Literals.DOCUMENT_ROOT__GESCHAEFTSVORFALL_ELEMENT, newGeschaeftsvorfallElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeschaeftsvorfallElement(Geschaeftsvorfall newGeschaeftsvorfallElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Comigsfak001Package.Literals.DOCUMENT_ROOT__GESCHAEFTSVORFALL_ELEMENT, newGeschaeftsvorfallElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Geschaeftsvorfall getGeschaeftsvorfallBDSInternalSerializationElement()
  {
    return (Geschaeftsvorfall)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(Comigsfak001Package.Literals.DOCUMENT_ROOT__GESCHAEFTSVORFALL_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGeschaeftsvorfallBDSInternalSerializationElement(Geschaeftsvorfall newGeschaeftsvorfallBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(Comigsfak001Package.Literals.DOCUMENT_ROOT__GESCHAEFTSVORFALL_BDS_INTERNAL_SERIALIZATION_ELEMENT, newGeschaeftsvorfallBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeschaeftsvorfallBDSInternalSerializationElement(Geschaeftsvorfall newGeschaeftsvorfallBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(Comigsfak001Package.Literals.DOCUMENT_ROOT__GESCHAEFTSVORFALL_BDS_INTERNAL_SERIALIZATION_ELEMENT, newGeschaeftsvorfallBDSInternalSerializationElement);
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
      case Comigsfak001Package.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicRemove(otherEnd, msgs);
      case Comigsfak001Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case Comigsfak001Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case Comigsfak001Package.DOCUMENT_ROOT__GESCHAEFTSVORFALL_ELEMENT:
        return basicSetGeschaeftsvorfallElement(null, msgs);
      case Comigsfak001Package.DOCUMENT_ROOT__GESCHAEFTSVORFALL_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetGeschaeftsvorfallBDSInternalSerializationElement(null, msgs);
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
      case Comigsfak001Package.DOCUMENT_ROOT__MIXED:
        if (coreType) return ((FeatureMap.Internal.Wrapper)getMixed()).featureMap();
        return getMixed();
      case Comigsfak001Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case Comigsfak001Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case Comigsfak001Package.DOCUMENT_ROOT__GESCHAEFTSVORFALL_ELEMENT:
        return getGeschaeftsvorfallElement();
      case Comigsfak001Package.DOCUMENT_ROOT__GESCHAEFTSVORFALL_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getGeschaeftsvorfallBDSInternalSerializationElement();
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
      case Comigsfak001Package.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(newValue);
        return;
      case Comigsfak001Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case Comigsfak001Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case Comigsfak001Package.DOCUMENT_ROOT__GESCHAEFTSVORFALL_ELEMENT:
        setGeschaeftsvorfallElement((Geschaeftsvorfall)newValue);
        return;
      case Comigsfak001Package.DOCUMENT_ROOT__GESCHAEFTSVORFALL_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setGeschaeftsvorfallBDSInternalSerializationElement((Geschaeftsvorfall)newValue);
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
      case Comigsfak001Package.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal.Wrapper)getMixed()).featureMap().clear();
        return;
      case Comigsfak001Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case Comigsfak001Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case Comigsfak001Package.DOCUMENT_ROOT__GESCHAEFTSVORFALL_ELEMENT:
        setGeschaeftsvorfallElement((Geschaeftsvorfall)null);
        return;
      case Comigsfak001Package.DOCUMENT_ROOT__GESCHAEFTSVORFALL_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setGeschaeftsvorfallBDSInternalSerializationElement((Geschaeftsvorfall)null);
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
      case Comigsfak001Package.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.featureMap().isEmpty();
      case Comigsfak001Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case Comigsfak001Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case Comigsfak001Package.DOCUMENT_ROOT__GESCHAEFTSVORFALL_ELEMENT:
        return getGeschaeftsvorfallElement() != null;
      case Comigsfak001Package.DOCUMENT_ROOT__GESCHAEFTSVORFALL_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getGeschaeftsvorfallBDSInternalSerializationElement() != null;
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
