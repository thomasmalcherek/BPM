

package com.tibco.bwse.simpleaddresslookup.impl;

import com.tibco.bwse.simpleaddresslookup.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleaddresslookupFactoryImpl extends EFactoryImpl implements SimpleaddresslookupFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SimpleaddresslookupFactory init()
  {
    try
    {
      SimpleaddresslookupFactory theSimpleaddresslookupFactory = (SimpleaddresslookupFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.tibco.com/bwse/simpleaddresslookup"); 
      if (theSimpleaddresslookupFactory != null)
      {
        return theSimpleaddresslookupFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SimpleaddresslookupFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleaddresslookupFactoryImpl()
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
      case SimpleaddresslookupPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case SimpleaddresslookupPackage.INPUT_TYPE: return createInputType();
      case SimpleaddresslookupPackage.OUTPUT_TYPE: return createOutputType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
  public InputType createInputType()
  {
    InputTypeImpl inputType = new InputTypeImpl();
    return inputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputType createOutputType()
  {
    OutputTypeImpl outputType = new OutputTypeImpl();
    return outputType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleaddresslookupPackage getSimpleaddresslookupPackage()
  {
    return (SimpleaddresslookupPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SimpleaddresslookupPackage getPackage()
  {
    return SimpleaddresslookupPackage.eINSTANCE;
  }

} //SimpleaddresslookupFactoryImpl
