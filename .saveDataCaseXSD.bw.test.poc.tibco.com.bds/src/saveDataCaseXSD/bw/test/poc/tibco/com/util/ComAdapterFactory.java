/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package saveDataCaseXSD.bw.test.poc.tibco.com.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import saveDataCaseXSD.bw.test.poc.tibco.com.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage
 * @generated
 */
public class ComAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ComPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = ComPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComSwitch<Adapter> modelSwitch =
    new ComSwitch<Adapter>()
    {
      @Override
      public Adapter caseCreateCaseIDRequestFromBPMType(CreateCaseIDRequestFromBPMType object)
      {
        return createCreateCaseIDRequestFromBPMTypeAdapter();
      }
      @Override
      public Adapter caseCreateCaseIDRequestType(CreateCaseIDRequestType object)
      {
        return createCreateCaseIDRequestTypeAdapter();
      }
      @Override
      public Adapter caseCreateCaseIDResponseFromBPMType(CreateCaseIDResponseFromBPMType object)
      {
        return createCreateCaseIDResponseFromBPMTypeAdapter();
      }
      @Override
      public Adapter caseCreateCaseIDResponseType(CreateCaseIDResponseType object)
      {
        return createCreateCaseIDResponseTypeAdapter();
      }
      @Override
      public Adapter caseDocumentRoot(DocumentRoot object)
      {
        return createDocumentRootAdapter();
      }
      @Override
      public Adapter caseGetDataRequestFromCaseIDType(GetDataRequestFromCaseIDType object)
      {
        return createGetDataRequestFromCaseIDTypeAdapter();
      }
      @Override
      public Adapter caseGetDataResponseFromCaseIDType(GetDataResponseFromCaseIDType object)
      {
        return createGetDataResponseFromCaseIDTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType <em>Create Case ID Request From BPM Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType
   * @generated
   */
  public Adapter createCreateCaseIDRequestFromBPMTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType <em>Create Case ID Request Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType
   * @generated
   */
  public Adapter createCreateCaseIDRequestTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType <em>Create Case ID Response From BPM Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType
   * @generated
   */
  public Adapter createCreateCaseIDResponseFromBPMTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseType <em>Create Case ID Response Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseType
   * @generated
   */
  public Adapter createCreateCaseIDResponseTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot <em>Document Root</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.DocumentRoot
   * @generated
   */
  public Adapter createDocumentRootAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataRequestFromCaseIDType <em>Get Data Request From Case ID Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataRequestFromCaseIDType
   * @generated
   */
  public Adapter createGetDataRequestFromCaseIDTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType <em>Get Data Response From Case ID Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType
   * @generated
   */
  public Adapter createGetDataResponseFromCaseIDTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //ComAdapterFactory
