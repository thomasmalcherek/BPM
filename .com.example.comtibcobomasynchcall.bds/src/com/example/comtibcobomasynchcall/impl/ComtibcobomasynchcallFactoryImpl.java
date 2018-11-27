

package com.example.comtibcobomasynchcall.impl;

import com.example.comtibcobomasynchcall.*;

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
public class ComtibcobomasynchcallFactoryImpl extends EFactoryImpl implements ComtibcobomasynchcallFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ComtibcobomasynchcallFactory init()
  {
    try
    {
      ComtibcobomasynchcallFactory theComtibcobomasynchcallFactory = (ComtibcobomasynchcallFactory)EPackage.Registry.INSTANCE.getEFactory("http://example.com/comtibcobomasynchcall"); 
      if (theComtibcobomasynchcallFactory != null)
      {
        return theComtibcobomasynchcallFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ComtibcobomasynchcallFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComtibcobomasynchcallFactoryImpl()
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
      case ComtibcobomasynchcallPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case ComtibcobomasynchcallPackage.META_DATA: return createMetaData();
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
      case ComtibcobomasynchcallPackage.AHV_NUMMER_META_DATA_TYPE:
        return createAHVNummer_MetaDataTypeFromString(eDataType, initialValue);
      case ComtibcobomasynchcallPackage.DOKUMENTEN_ART_META_DATA_TYPE:
        return createdokumentenArt_MetaDataTypeFromString(eDataType, initialValue);
      case ComtibcobomasynchcallPackage.KANTON_META_DATA_TYPE:
        return createkanton_MetaDataTypeFromString(eDataType, initialValue);
      case ComtibcobomasynchcallPackage.PARTNER_ID_META_DATA_TYPE:
        return createpartnerID_MetaDataTypeFromString(eDataType, initialValue);
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
      case ComtibcobomasynchcallPackage.AHV_NUMMER_META_DATA_TYPE:
        return convertAHVNummer_MetaDataTypeToString(eDataType, instanceValue);
      case ComtibcobomasynchcallPackage.DOKUMENTEN_ART_META_DATA_TYPE:
        return convertdokumentenArt_MetaDataTypeToString(eDataType, instanceValue);
      case ComtibcobomasynchcallPackage.KANTON_META_DATA_TYPE:
        return convertkanton_MetaDataTypeToString(eDataType, instanceValue);
      case ComtibcobomasynchcallPackage.PARTNER_ID_META_DATA_TYPE:
        return convertpartnerID_MetaDataTypeToString(eDataType, instanceValue);
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
  public MetaData createMetaData()
  {
    MetaDataImpl metaData = new MetaDataImpl();
    return metaData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createAHVNummer_MetaDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAHVNummer_MetaDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createdokumentenArt_MetaDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertdokumentenArt_MetaDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createkanton_MetaDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertkanton_MetaDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createpartnerID_MetaDataTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertpartnerID_MetaDataTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComtibcobomasynchcallPackage getComtibcobomasynchcallPackage()
  {
    return (ComtibcobomasynchcallPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ComtibcobomasynchcallPackage getPackage()
  {
    return ComtibcobomasynchcallPackage.eINSTANCE;
  }

} //ComtibcobomasynchcallFactoryImpl
