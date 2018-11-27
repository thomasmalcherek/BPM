package com.example.thomas_bd.WF_PACK;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WF DATA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.thomas_bd.WF_PACK.WF_DATA#getHEADER <em>HEADER</em>}</li>
 *   <li>{@link com.example.thomas_bd.WF_PACK.WF_DATA#getVALUE <em>VALUE</em>}</li>
 *   <li>{@link com.example.thomas_bd.WF_PACK.WF_DATA#getDATE <em>DATE</em>}</li>
 *   <li>{@link com.example.thomas_bd.WF_PACK.WF_DATA#getEXPLANATION <em>EXPLANATION</em>}</li>
 *   <li>{@link com.example.thomas_bd.WF_PACK.WF_DATA#getPOSTALCODE <em>POSTALCODE</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.thomas_bd.WF_PACK.WF_PACKPackage#getWF_DATA()
 * @model extendedMetaData="name='WF_DATA' kind='elementOnly'"
 *        annotation="bds label='WF_DATA'"
 *        annotation="teneo.jpa value='@Transient'"
 * @generated
 */
@SuppressWarnings("all")
public interface WF_DATA extends EObject
{
  /**
   * Returns the value of the '<em><b>HEADER</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>HEADER</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>HEADER</em>' attribute.
   * @see #setHEADER(String)
   * @see com.example.thomas_bd.WF_PACK.WF_PACKPackage#getWF_DATA_HEADER()
   * @model dataType="com.example.thomas_bd.WF_PACK.HEADER_WF_DATAType" required="true"
   *        extendedMetaData="kind='element' name='HEADER'"
   * @generated
   */
  String getHEADER();

  /**
   * Sets the value of the '{@link com.example.thomas_bd.WF_PACK.WF_DATA#getHEADER <em>HEADER</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>HEADER</em>' attribute.
   * @see #getHEADER()
   * @generated
   */
  void setHEADER(String value);

  /**
   * Returns the value of the '<em><b>VALUE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>VALUE</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>VALUE</em>' attribute.
   * @see #setVALUE(String)
   * @see com.example.thomas_bd.WF_PACK.WF_PACKPackage#getWF_DATA_VALUE()
   * @model dataType="com.example.thomas_bd.WF_PACK.VALUE_WF_DATAType" required="true"
   *        extendedMetaData="kind='element' name='VALUE'"
   * @generated
   */
  String getVALUE();

  /**
   * Sets the value of the '{@link com.example.thomas_bd.WF_PACK.WF_DATA#getVALUE <em>VALUE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>VALUE</em>' attribute.
   * @see #getVALUE()
   * @generated
   */
  void setVALUE(String value);

  /**
   * Returns the value of the '<em><b>DATE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DATE</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DATE</em>' attribute.
   * @see #setDATE(XMLGregorianCalendar)
   * @see com.example.thomas_bd.WF_PACK.WF_PACKPackage#getWF_DATA_DATE()
   * @model dataType="org.eclipse.emf.ecore.xml.type.Date" required="true"
   *        extendedMetaData="kind='element' name='DATE'"
   * @generated
   */
  XMLGregorianCalendar getDATE();

  /**
   * Sets the value of the '{@link com.example.thomas_bd.WF_PACK.WF_DATA#getDATE <em>DATE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>DATE</em>' attribute.
   * @see #getDATE()
   * @generated
   */
  void setDATE(XMLGregorianCalendar value);

  /**
   * Returns the value of the '<em><b>EXPLANATION</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>EXPLANATION</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>EXPLANATION</em>' attribute.
   * @see #setEXPLANATION(String)
   * @see com.example.thomas_bd.WF_PACK.WF_PACKPackage#getWF_DATA_EXPLANATION()
   * @model dataType="com.example.thomas_bd.WF_PACK.EXPLANATION_WF_DATAType"
   *        extendedMetaData="kind='element' name='EXPLANATION'"
   * @generated
   */
  String getEXPLANATION();

  /**
   * Sets the value of the '{@link com.example.thomas_bd.WF_PACK.WF_DATA#getEXPLANATION <em>EXPLANATION</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>EXPLANATION</em>' attribute.
   * @see #getEXPLANATION()
   * @generated
   */
  void setEXPLANATION(String value);

  /**
   * Returns the value of the '<em><b>POSTALCODE</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>POSTALCODE</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>POSTALCODE</em>' attribute.
   * @see #setPOSTALCODE(String)
   * @see com.example.thomas_bd.WF_PACK.WF_PACKPackage#getWF_DATA_POSTALCODE()
   * @model dataType="com.example.thomas_bd.WF_PACK.POSTALCODE_WF_DATAType" required="true"
   *        extendedMetaData="kind='element' name='POSTALCODE'"
   * @generated
   */
  String getPOSTALCODE();

  /**
   * Sets the value of the '{@link com.example.thomas_bd.WF_PACK.WF_DATA#getPOSTALCODE <em>POSTALCODE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>POSTALCODE</em>' attribute.
   * @see #getPOSTALCODE()
   * @generated
   */
  void setPOSTALCODE(String value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getHEADER()
   * @generated
   */
  void setHEADER(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getVALUE()
   * @generated
   */
  void setVALUE(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getEXPLANATION()
   * @generated
   */
  void setEXPLANATION(Object value);

  /**
   * Automatic type conversion method
   *
   * @param value		The value to set
   * @see #getPOSTALCODE()
   * @generated
   */
  void setPOSTALCODE(Object value);

} // WF_DATA
