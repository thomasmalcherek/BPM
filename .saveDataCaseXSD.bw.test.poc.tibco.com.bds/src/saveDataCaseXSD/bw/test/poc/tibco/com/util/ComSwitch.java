/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package saveDataCaseXSD.bw.test.poc.tibco.com.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import saveDataCaseXSD.bw.test.poc.tibco.com.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage
 * @generated
 */
public class ComSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ComPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ComPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE:
      {
        CreateCaseIDRequestFromBPMType createCaseIDRequestFromBPMType = (CreateCaseIDRequestFromBPMType)theEObject;
        T result = caseCreateCaseIDRequestFromBPMType(createCaseIDRequestFromBPMType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComPackage.CREATE_CASE_ID_REQUEST_TYPE:
      {
        CreateCaseIDRequestType createCaseIDRequestType = (CreateCaseIDRequestType)theEObject;
        T result = caseCreateCaseIDRequestType(createCaseIDRequestType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComPackage.CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE:
      {
        CreateCaseIDResponseFromBPMType createCaseIDResponseFromBPMType = (CreateCaseIDResponseFromBPMType)theEObject;
        T result = caseCreateCaseIDResponseFromBPMType(createCaseIDResponseFromBPMType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComPackage.CREATE_CASE_ID_RESPONSE_TYPE:
      {
        CreateCaseIDResponseType createCaseIDResponseType = (CreateCaseIDResponseType)theEObject;
        T result = caseCreateCaseIDResponseType(createCaseIDResponseType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComPackage.DOCUMENT_ROOT:
      {
        DocumentRoot documentRoot = (DocumentRoot)theEObject;
        T result = caseDocumentRoot(documentRoot);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComPackage.GET_DATA_REQUEST_FROM_CASE_ID_TYPE:
      {
        GetDataRequestFromCaseIDType getDataRequestFromCaseIDType = (GetDataRequestFromCaseIDType)theEObject;
        T result = caseGetDataRequestFromCaseIDType(getDataRequestFromCaseIDType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ComPackage.GET_DATA_RESPONSE_FROM_CASE_ID_TYPE:
      {
        GetDataResponseFromCaseIDType getDataResponseFromCaseIDType = (GetDataResponseFromCaseIDType)theEObject;
        T result = caseGetDataResponseFromCaseIDType(getDataResponseFromCaseIDType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Case ID Request From BPM Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Case ID Request From BPM Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateCaseIDRequestFromBPMType(CreateCaseIDRequestFromBPMType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Case ID Request Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Case ID Request Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateCaseIDRequestType(CreateCaseIDRequestType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Case ID Response From BPM Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Case ID Response From BPM Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateCaseIDResponseFromBPMType(CreateCaseIDResponseFromBPMType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Create Case ID Response Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Create Case ID Response Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreateCaseIDResponseType(CreateCaseIDResponseType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentRoot(DocumentRoot object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Data Request From Case ID Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Data Request From Case ID Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetDataRequestFromCaseIDType(GetDataRequestFromCaseIDType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Data Response From Case ID Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Data Response From Case ID Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetDataResponseFromCaseIDType(GetDataResponseFromCaseIDType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ComSwitch
