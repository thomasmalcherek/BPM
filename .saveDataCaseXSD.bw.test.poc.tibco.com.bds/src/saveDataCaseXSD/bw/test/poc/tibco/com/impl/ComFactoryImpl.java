

package saveDataCaseXSD.bw.test.poc.tibco.com.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import saveDataCaseXSD.bw.test.poc.tibco.com.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComFactoryImpl extends EFactoryImpl implements ComFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ComFactory init()
  {
    try
    {
      ComFactory theComFactory = (ComFactory)EPackage.Registry.INSTANCE.getEFactory("http://com.tibco.poc.test.bw.saveDataCaseXSD"); 
      if (theComFactory != null)
      {
        return theComFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ComFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComFactoryImpl()
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
      case ComPackage.CREATE_CASE_ID_REQUEST_FROM_BPM_TYPE: return createCreateCaseIDRequestFromBPMType();
      case ComPackage.CREATE_CASE_ID_REQUEST_TYPE: return createCreateCaseIDRequestType();
      case ComPackage.CREATE_CASE_ID_RESPONSE_FROM_BPM_TYPE: return createCreateCaseIDResponseFromBPMType();
      case ComPackage.CREATE_CASE_ID_RESPONSE_TYPE: return createCreateCaseIDResponseType();
      case ComPackage.DOCUMENT_ROOT: return createDocumentRoot();
      case ComPackage.GET_DATA_REQUEST_FROM_CASE_ID_TYPE: return createGetDataRequestFromCaseIDType();
      case ComPackage.GET_DATA_WF_CASE_ID_RESPONSE_TYPE: return createGetDataWFCaseIDResponseType();
      case ComPackage.SEARCH_DATA_REQUEST_TYPE: return createSearchDataRequestType();
      case ComPackage.SEARCH_DATA_RESPONSES_TYPE: return createSearchDataResponsesType();
      case ComPackage.SEARCH_DATA_RESPONSE_TYPE: return createSearchDataResponseType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateCaseIDRequestFromBPMType createCreateCaseIDRequestFromBPMType()
  {
    CreateCaseIDRequestFromBPMTypeImpl createCaseIDRequestFromBPMType = new CreateCaseIDRequestFromBPMTypeImpl();
    return createCaseIDRequestFromBPMType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateCaseIDRequestType createCreateCaseIDRequestType()
  {
    CreateCaseIDRequestTypeImpl createCaseIDRequestType = new CreateCaseIDRequestTypeImpl();
    return createCaseIDRequestType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateCaseIDResponseFromBPMType createCreateCaseIDResponseFromBPMType()
  {
    CreateCaseIDResponseFromBPMTypeImpl createCaseIDResponseFromBPMType = new CreateCaseIDResponseFromBPMTypeImpl();
    return createCaseIDResponseFromBPMType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CreateCaseIDResponseType createCreateCaseIDResponseType()
  {
    CreateCaseIDResponseTypeImpl createCaseIDResponseType = new CreateCaseIDResponseTypeImpl();
    return createCaseIDResponseType;
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
  public GetDataRequestFromCaseIDType createGetDataRequestFromCaseIDType()
  {
    GetDataRequestFromCaseIDTypeImpl getDataRequestFromCaseIDType = new GetDataRequestFromCaseIDTypeImpl();
    return getDataRequestFromCaseIDType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetDataWFCaseIDResponseType createGetDataWFCaseIDResponseType()
  {
    GetDataWFCaseIDResponseTypeImpl getDataWFCaseIDResponseType = new GetDataWFCaseIDResponseTypeImpl();
    return getDataWFCaseIDResponseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchDataRequestType createSearchDataRequestType()
  {
    SearchDataRequestTypeImpl searchDataRequestType = new SearchDataRequestTypeImpl();
    return searchDataRequestType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchDataResponsesType createSearchDataResponsesType()
  {
    SearchDataResponsesTypeImpl searchDataResponsesType = new SearchDataResponsesTypeImpl();
    return searchDataResponsesType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SearchDataResponseType createSearchDataResponseType()
  {
    SearchDataResponseTypeImpl searchDataResponseType = new SearchDataResponseTypeImpl();
    return searchDataResponseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComPackage getComPackage()
  {
    return (ComPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ComPackage getPackage()
  {
    return ComPackage.eINSTANCE;
  }

} //ComFactoryImpl
