package saveDataCaseXSD.bw.test.poc.tibco.com;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;

import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSFeatureMap;
import saveDataCaseXSD.bw.test.poc.tibco.com.bdsutil.BDSFeatureMapImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Search Data Responses Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponsesType#getGroup <em>Group</em>}</li>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponsesType#getSearchDataResponse <em>Search Data Response</em>}</li>
 * </ul>
 * </p>
 *
 * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getSearchDataResponsesType()
 * @model extendedMetaData="name='SearchDataResponses_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface SearchDataResponsesType extends EObject
{
  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getSearchDataResponsesType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:0'"
   * @generated
   */
  BDSFeatureMap getGroup();

  /**
   * Returns the value of the '<em><b>Search Data Response</b></em>' containment reference list.
   * The list contents are of type {@link saveDataCaseXSD.bw.test.poc.tibco.com.SearchDataResponseType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Search Data Response</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Search Data Response</em>' containment reference list.
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getSearchDataResponsesType_SearchDataResponse()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='SearchDataResponse' group='#group:0'"
   * @generated
   */
  EList<SearchDataResponseType> getSearchDataResponse();

  /**
   * Method that allows for an "any" type to be set to another "any" type
   * or an EObject (ComplexType).
   * It will overwrite the existing data
   *
   * @param value		The "any" type or EObject to copy from
   * @see #getGroup()
   * @generated
   */
  void setGroup(Object value);

} // SearchDataResponsesType
