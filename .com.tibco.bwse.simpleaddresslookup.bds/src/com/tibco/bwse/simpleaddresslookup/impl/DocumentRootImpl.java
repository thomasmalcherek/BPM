
package com.tibco.bwse.simpleaddresslookup.impl;

import com.tibco.bwse.simpleaddresslookup.DocumentRoot;
import com.tibco.bwse.simpleaddresslookup.InputType;
import com.tibco.bwse.simpleaddresslookup.OutputType;
import com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage;

import com.tibco.bwse.simpleaddresslookup.bdsutil.BDSFeatureMap;
import com.tibco.bwse.simpleaddresslookup.bdsutil.BDSFeatureMapImpl;

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
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.DocumentRootImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.DocumentRootImpl#getInput <em>Input</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.DocumentRootImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.DocumentRootImpl#getInputTypeBDSInternalSerializationElement <em>Input Type BDS Internal Serialization Element</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.DocumentRootImpl#getOutputTypeBDSInternalSerializationElement <em>Output Type BDS Internal Serialization Element</em>}</li>
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
   * The default value of the '{@link #getFault() <em>Fault</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFault()
   * @generated
   * @ordered
   */
  protected static final String FAULT_EDEFAULT = null;

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
    return SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT;
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
      mixed = new BDSFeatureMapImpl(new BasicFeatureMap(this, SimpleaddresslookupPackage.DOCUMENT_ROOT__MIXED));
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
      xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SimpleaddresslookupPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
      xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, SimpleaddresslookupPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
    }
    return xSISchemaLocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFault()
  {
    return (String)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__FAULT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFault(String newFault)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__FAULT, newFault);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputType getInput()
  {
    return (InputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__INPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInput(InputType newInput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__INPUT, newInput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInput(InputType newInput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__INPUT, newInput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputType getOutput()
  {
    return (OutputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__OUTPUT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutput(OutputType newOutput, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__OUTPUT, newOutput, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutput(OutputType newOutput)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__OUTPUT, newOutput);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputType getInputTypeBDSInternalSerializationElement()
  {
    return (InputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInputTypeBDSInternalSerializationElement(InputType newInputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newInputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInputTypeBDSInternalSerializationElement(InputType newInputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newInputTypeBDSInternalSerializationElement);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputType getOutputTypeBDSInternalSerializationElement()
  {
    return (OutputType)((FeatureMap.Internal.Wrapper)getMixed()).featureMap().get(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__OUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, true);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOutputTypeBDSInternalSerializationElement(OutputType newOutputTypeBDSInternalSerializationElement, NotificationChain msgs)
  {
    return ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicAdd(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__OUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newOutputTypeBDSInternalSerializationElement, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOutputTypeBDSInternalSerializationElement(OutputType newOutputTypeBDSInternalSerializationElement)
  {
    ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(SimpleaddresslookupPackage.Literals.DOCUMENT_ROOT__OUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT, newOutputTypeBDSInternalSerializationElement);
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
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__MIXED:
        return ((InternalEList<?>)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).basicRemove(otherEnd, msgs);
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__INPUT:
        return basicSetInput(null, msgs);
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__OUTPUT:
        return basicSetOutput(null, msgs);
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetInputTypeBDSInternalSerializationElement(null, msgs);
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__OUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return basicSetOutputTypeBDSInternalSerializationElement(null, msgs);
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
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__MIXED:
        if (coreType) return ((FeatureMap.Internal.Wrapper)getMixed()).featureMap();
        return getMixed();
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        if (coreType) return getXMLNSPrefixMap();
        else return getXMLNSPrefixMap().map();
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        if (coreType) return getXSISchemaLocation();
        else return getXSISchemaLocation().map();
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__FAULT:
        return getFault();
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__INPUT:
        return getInput();
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__OUTPUT:
        return getOutput();
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getInputTypeBDSInternalSerializationElement();
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__OUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getOutputTypeBDSInternalSerializationElement();
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
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal)((FeatureMap.Internal.Wrapper)getMixed()).featureMap()).set(newValue);
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__FAULT:
        setFault((String)newValue);
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__INPUT:
        setInput((InputType)newValue);
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__OUTPUT:
        setOutput((OutputType)newValue);
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setInputTypeBDSInternalSerializationElement((InputType)newValue);
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__OUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setOutputTypeBDSInternalSerializationElement((OutputType)newValue);
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
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__MIXED:
        ((FeatureMap.Internal.Wrapper)getMixed()).featureMap().clear();
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        getXMLNSPrefixMap().clear();
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        getXSISchemaLocation().clear();
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__FAULT:
        setFault(FAULT_EDEFAULT);
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__INPUT:
        setInput((InputType)null);
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__OUTPUT:
        setOutput((OutputType)null);
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setInputTypeBDSInternalSerializationElement((InputType)null);
        return;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__OUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        setOutputTypeBDSInternalSerializationElement((OutputType)null);
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
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__MIXED:
        return mixed != null && !mixed.featureMap().isEmpty();
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
        return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
        return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__FAULT:
        return FAULT_EDEFAULT == null ? getFault() != null : !FAULT_EDEFAULT.equals(getFault());
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__INPUT:
        return getInput() != null;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__OUTPUT:
        return getOutput() != null;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__INPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getInputTypeBDSInternalSerializationElement() != null;
      case SimpleaddresslookupPackage.DOCUMENT_ROOT__OUTPUT_TYPE_BDS_INTERNAL_SERIALIZATION_ELEMENT:
        return getOutputTypeBDSInternalSerializationElement() != null;
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
