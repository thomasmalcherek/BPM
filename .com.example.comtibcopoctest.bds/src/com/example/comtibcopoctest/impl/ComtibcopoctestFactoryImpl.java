

package com.example.comtibcopoctest.impl;

import com.example.comtibcopoctest.*;

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
public class ComtibcopoctestFactoryImpl extends EFactoryImpl implements ComtibcopoctestFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ComtibcopoctestFactory init()
  {
    try
    {
      ComtibcopoctestFactory theComtibcopoctestFactory = (ComtibcopoctestFactory)EPackage.Registry.INSTANCE.getEFactory("http://example.com/comtibcopoctest"); 
      if (theComtibcopoctestFactory != null)
      {
        return theComtibcopoctestFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ComtibcopoctestFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComtibcopoctestFactoryImpl()
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
      case ComtibcopoctestPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case ComtibcopoctestPackage.POC_DB_REQUEST: return createpocDBRequest();
      case ComtibcopoctestPackage.POC_META_DATA: return createpocMetaData();
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
      case ComtibcopoctestPackage.AHV_NUMMER_POC_META_DATA_TYPE:
        return createAHVNummer_pocMetaDataTypeFromString(eDataType, initialValue);
      case ComtibcopoctestPackage.DOKUMENTEN_ART_POC_META_DATA_TYPE:
        return createdokumentenArt_pocMetaDataTypeFromString(eDataType, initialValue);
      case ComtibcopoctestPackage.KANTON_POC_META_DATA_TYPE:
        return createkanton_pocMetaDataTypeFromString(eDataType, initialValue);
      case ComtibcopoctestPackage.PARTNER_ID_POC_META_DATA_TYPE:
        return createpartnerID_pocMetaDataTypeFromString(eDataType, initialValue);
      case ComtibcopoctestPackage.WF_CASE_ID_POC_META_DATA_TYPE:
        return createWFCaseID_pocMetaDataTypeFromString(eDataType, initialValue);
      case ComtibcopoctestPackage.WF_CASE_ID_POC_DB_REQUEST_TYPE:
        return createWFCaseID_pocDBRequestTypeFromString(eDataType, initialValue);
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
      case ComtibcopoctestPackage.AHV_NUMMER_POC_META_DATA_TYPE:
        return convertAHVNummer_pocMetaDataTypeToString(eDataType, instanceValue);
      case ComtibcopoctestPackage.DOKUMENTEN_ART_POC_META_DATA_TYPE:
        return convertdokumentenArt_pocMetaDataTypeToString(eDataType, instanceValue);
      case ComtibcopoctestPackage.KANTON_POC_META_DATA_TYPE:
        return convertkanton_pocMetaDataTypeToString(eDataType, instanceValue);
      case ComtibcopoctestPackage.PARTNER_ID_POC_META_DATA_TYPE:
        return convertpartnerID_pocMetaDataTypeToString(eDataType, instanceValue);
      case ComtibcopoctestPackage.WF_CASE_ID_POC_META_DATA_TYPE:
        return convertWFCaseID_pocMetaDataTypeToString(eDataType, instanceValue);
      case ComtibcopoctestPackage.WF_CASE_ID_POC_DB_REQUEST_TYPE:
        return convertWFCaseID_pocDBRequestTypeToString(eDataType, instanceValue);
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
  public pocDBRequest createpocDBRequest()
  {
    pocDBRequestImpl pocDBRequest = new pocDBRequestImpl();
    return pocDBRequest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pocMetaData createpocMetaData()
  {
    pocMetaDataImpl pocMetaData = new pocMetaDataImpl();
    return pocMetaData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createAHVNummer_pocMetaDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAHVNummer_pocMetaDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createdokumentenArt_pocMetaDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertdokumentenArt_pocMetaDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createkanton_pocMetaDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertkanton_pocMetaDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createpartnerID_pocMetaDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertpartnerID_pocMetaDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createWFCaseID_pocMetaDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWFCaseID_pocMetaDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createWFCaseID_pocDBRequestTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWFCaseID_pocDBRequestTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComtibcopoctestPackage getComtibcopoctestPackage()
  {
    return (ComtibcopoctestPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ComtibcopoctestPackage getPackage()
  {
    return ComtibcopoctestPackage.eINSTANCE;
  }

} //ComtibcopoctestFactoryImpl
