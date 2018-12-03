package saveDataCaseXSD.bw.test.poc.tibco.com;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Case ID Response From BPM Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType#getAcknowledgement <em>Acknowledgement</em>}</li>
 * </ul>
 * </p>
 *
 * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDResponseFromBPMType()
 * @model extendedMetaData="name='CreateCaseIDResponseFromBPM_._type' kind='elementOnly'"
 * @generated
 */
@SuppressWarnings("all")
public interface CreateCaseIDResponseFromBPMType extends EObject
{
  /**
   * Returns the value of the '<em><b>Acknowledgement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Acknowledgement</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acknowledgement</em>' attribute.
   * @see #setAcknowledgement(Boolean)
   * @see saveDataCaseXSD.bw.test.poc.tibco.com.ComPackage#getCreateCaseIDResponseFromBPMType_Acknowledgement()
   * @model dataType="org.eclipse.emf.ecore.xml.type.BooleanObject" required="true"
   *        extendedMetaData="kind='element' name='Acknowledgement'"
   * @generated
   */
  Boolean getAcknowledgement();

  /**
   * Sets the value of the '{@link saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType#getAcknowledgement <em>Acknowledgement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acknowledgement</em>' attribute.
   * @see #getAcknowledgement()
   * @generated
   */
  void setAcknowledgement(Boolean value);

} // CreateCaseIDResponseFromBPMType
