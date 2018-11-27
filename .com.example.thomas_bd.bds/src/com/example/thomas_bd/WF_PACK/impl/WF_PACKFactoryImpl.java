

package com.example.thomas_bd.WF_PACK.impl;

import com.example.thomas_bd.WF_PACK.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WF_PACKFactoryImpl extends EFactoryImpl implements WF_PACKFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WF_PACKFactory init()
  {
    try
    {
      WF_PACKFactory theWF_PACKFactory = (WF_PACKFactory)EPackage.Registry.INSTANCE.getEFactory("http://example.com/thomas_bd/WF_PACK"); 
      if (theWF_PACKFactory != null)
      {
        return theWF_PACKFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WF_PACKFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WF_PACKFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WF_PACKPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case WF_PACKPackage.WF_DATA: return createWF_DATA();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case WF_PACKPackage.EXPLANATION_WF_DATA_TYPE:
        return createEXPLANATION_WF_DATATypeFromString(eDataType, initialValue);
      case WF_PACKPackage.HEADER_WF_DATA_TYPE:
        return createHEADER_WF_DATATypeFromString(eDataType, initialValue);
      case WF_PACKPackage.POSTALCODE_WF_DATA_TYPE:
        return createPOSTALCODE_WF_DATATypeFromString(eDataType, initialValue);
      case WF_PACKPackage.VALUE_WF_DATA_TYPE:
        return createVALUE_WF_DATATypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case WF_PACKPackage.EXPLANATION_WF_DATA_TYPE:
        return convertEXPLANATION_WF_DATATypeToString(eDataType, instanceValue);
      case WF_PACKPackage.HEADER_WF_DATA_TYPE:
        return convertHEADER_WF_DATATypeToString(eDataType, instanceValue);
      case WF_PACKPackage.POSTALCODE_WF_DATA_TYPE:
        return convertPOSTALCODE_WF_DATATypeToString(eDataType, instanceValue);
      case WF_PACKPackage.VALUE_WF_DATA_TYPE:
        return convertVALUE_WF_DATATypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentRoot createDocumentRoot()
  {
    DocumentRootImpl documentRoot = new DocumentRootImpl();
    return documentRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WF_DATA createWF_DATA()
  {
    WF_DATAImpl wF_DATA = new WF_DATAImpl();
    return wF_DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createEXPLANATION_WF_DATATypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEXPLANATION_WF_DATATypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createHEADER_WF_DATATypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertHEADER_WF_DATATypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createPOSTALCODE_WF_DATATypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPOSTALCODE_WF_DATATypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createVALUE_WF_DATATypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVALUE_WF_DATATypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WF_PACKPackage getWF_PACKPackage()
  {
    return (WF_PACKPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WF_PACKPackage getPackage()
  {
    return WF_PACKPackage.eINSTANCE;
  }

} //WF_PACKFactoryImpl
