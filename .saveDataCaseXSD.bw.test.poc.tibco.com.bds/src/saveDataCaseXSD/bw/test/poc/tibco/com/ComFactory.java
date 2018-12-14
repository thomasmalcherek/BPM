

package saveDataCaseXSD.bw.test.poc.tibco.com;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage
 * @generated
 */
public interface ComFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ComFactory eINSTANCE = saveDataCaseXSD.bw.test.poc.tibco.com.impl.ComFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Create Case ID Request From BPM Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Case ID Request From BPM Type</em>'.
   * @generated
   */
  CreateCaseIDRequestFromBPMType createCreateCaseIDRequestFromBPMType();

  /**
   * Returns a new object of class '<em>Create Case ID Request Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Case ID Request Type</em>'.
   * @generated
   */
  CreateCaseIDRequestType createCreateCaseIDRequestType();

  /**
   * Returns a new object of class '<em>Create Case ID Response From BPM Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Case ID Response From BPM Type</em>'.
   * @generated
   */
  CreateCaseIDResponseFromBPMType createCreateCaseIDResponseFromBPMType();

  /**
   * Returns a new object of class '<em>Create Case ID Response Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Case ID Response Type</em>'.
   * @generated
   */
  CreateCaseIDResponseType createCreateCaseIDResponseType();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Get Data Request From Case ID Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get Data Request From Case ID Type</em>'.
   * @generated
   */
  GetDataRequestFromCaseIDType createGetDataRequestFromCaseIDType();

  /**
   * Returns a new object of class '<em>Get Data WF Case ID Response Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get Data WF Case ID Response Type</em>'.
   * @generated
   */
  GetDataWFCaseIDResponseType createGetDataWFCaseIDResponseType();

  /**
   * Returns a new object of class '<em>Search Data Request Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Search Data Request Type</em>'.
   * @generated
   */
  SearchDataRequestType createSearchDataRequestType();

  /**
   * Returns a new object of class '<em>Search Data Responses Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Search Data Responses Type</em>'.
   * @generated
   */
  SearchDataResponsesType createSearchDataResponsesType();

  /**
   * Returns a new object of class '<em>Search Data Response Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Search Data Response Type</em>'.
   * @generated
   */
  SearchDataResponseType createSearchDataResponseType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ComPackage getComPackage();

} //ComFactory
