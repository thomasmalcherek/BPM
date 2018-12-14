

package com.example.comigsfak001.impl;

import com.example.comigsfak001.*;

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
public class Comigsfak001FactoryImpl extends EFactoryImpl implements Comigsfak001Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Comigsfak001Factory init()
  {
    try
    {
      Comigsfak001Factory theComigsfak001Factory = (Comigsfak001Factory)EPackage.Registry.INSTANCE.getEFactory("http://example.com/comigsfak001"); 
      if (theComigsfak001Factory != null)
      {
        return theComigsfak001Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Comigsfak001FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comigsfak001FactoryImpl()
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
      case Comigsfak001Package.DOCUMENT_ROOT: return createDocumentRoot();
      case Comigsfak001Package.GESCHAEFTSVORFALL: return createGeschaeftsvorfall();
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
      case Comigsfak001Package.AHV_NUMMER_GESCHAEFTSVORFALL_TYPE:
        return createAHVNummer_GeschaeftsvorfallTypeFromString(eDataType, initialValue);
      case Comigsfak001Package.DOKUMENTEN_ART_GESCHAEFTSVORFALL_TYPE:
        return createdokumentenArt_GeschaeftsvorfallTypeFromString(eDataType, initialValue);
      case Comigsfak001Package.GESCHAEFTSFALL_GESCHAEFTSVORFALL_TYPE:
        return creategeschaeftsfall_GeschaeftsvorfallTypeFromString(eDataType, initialValue);
      case Comigsfak001Package.PARTNER_ID_GESCHAEFTSVORFALL_TYPE:
        return createpartnerID_GeschaeftsvorfallTypeFromString(eDataType, initialValue);
      case Comigsfak001Package.WF_CASE_ID_GESCHAEFTSVORFALL_TYPE:
        return createWFCaseID_GeschaeftsvorfallTypeFromString(eDataType, initialValue);
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
      case Comigsfak001Package.AHV_NUMMER_GESCHAEFTSVORFALL_TYPE:
        return convertAHVNummer_GeschaeftsvorfallTypeToString(eDataType, instanceValue);
      case Comigsfak001Package.DOKUMENTEN_ART_GESCHAEFTSVORFALL_TYPE:
        return convertdokumentenArt_GeschaeftsvorfallTypeToString(eDataType, instanceValue);
      case Comigsfak001Package.GESCHAEFTSFALL_GESCHAEFTSVORFALL_TYPE:
        return convertgeschaeftsfall_GeschaeftsvorfallTypeToString(eDataType, instanceValue);
      case Comigsfak001Package.PARTNER_ID_GESCHAEFTSVORFALL_TYPE:
        return convertpartnerID_GeschaeftsvorfallTypeToString(eDataType, instanceValue);
      case Comigsfak001Package.WF_CASE_ID_GESCHAEFTSVORFALL_TYPE:
        return convertWFCaseID_GeschaeftsvorfallTypeToString(eDataType, instanceValue);
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
  public Geschaeftsvorfall createGeschaeftsvorfall()
  {
    GeschaeftsvorfallImpl geschaeftsvorfall = new GeschaeftsvorfallImpl();
    return geschaeftsvorfall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createAHVNummer_GeschaeftsvorfallTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAHVNummer_GeschaeftsvorfallTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createdokumentenArt_GeschaeftsvorfallTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertdokumentenArt_GeschaeftsvorfallTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String creategeschaeftsfall_GeschaeftsvorfallTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertgeschaeftsfall_GeschaeftsvorfallTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createpartnerID_GeschaeftsvorfallTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertpartnerID_GeschaeftsvorfallTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createWFCaseID_GeschaeftsvorfallTypeFromString(EDataType eDataType, String initialValue)
  {
    return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertWFCaseID_GeschaeftsvorfallTypeToString(EDataType eDataType, Object instanceValue)
  {
    return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comigsfak001Package getComigsfak001Package()
  {
    return (Comigsfak001Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Comigsfak001Package getPackage()
  {
    return Comigsfak001Package.eINSTANCE;
  }

} //Comigsfak001FactoryImpl
