package saveDataCaseXSD.bw.test.poc.tibco.com;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Data Request From Case ID Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataRequestFromCaseIDType#getCaseID <em>Case ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getGetDataRequestFromCaseIDType()
 * @model extendedMetaData="name='GetDataRequestFromCaseID_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface GetDataRequestFromCaseIDType extends EObject
{
  /**
   * Returns the value of the '<em><b>Case ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case ID</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case ID</em>' attribute.
   * @see #setCaseID(String)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getGetDataRequestFromCaseIDType_CaseID()
   * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
   *        extendedMetaData="kind='element' name='CaseID'"
   * @generated
   */
  String getCaseID();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.GetDataRequestFromCaseIDType#getCaseID <em>Case ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case ID</em>' attribute.
   * @see #getCaseID()
   * @generated
   */
  void setCaseID(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getCaseID()
   * @generated
   */
  void setCaseID(Object value);

} // GetDataRequestFromCaseIDType
