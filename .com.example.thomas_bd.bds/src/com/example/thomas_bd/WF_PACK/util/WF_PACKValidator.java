

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.example.thomas_bd.WF_PACK.util;

import com.example.thomas_bd.WF_PACK.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.example.thomas_bd.WF_PACK.WF_PACKPackage
 * @generated
 */
public class WF_PACKValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final WF_PACKValidator INSTANCE = new WF_PACKValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "com.example.thomas_bd.WF_PACK";

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
   * The cached base package validator.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XMLTypeValidator xmlTypeValidator;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WF_PACKValidator()
  {
    super();
    xmlTypeValidator = XMLTypeValidator.INSTANCE;
  }

  /**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EPackage getEPackage()
  {
    return WF_PACKPackage.eINSTANCE;
  }

  /**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    switch (classifierID)
    {
      case WF_PACKPackage.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case WF_PACKPackage.WF_DATA:
        return validateWF_DATA((WF_DATA)value, diagnostics, context);
      case WF_PACKPackage.EXPLANATION_WF_DATA_TYPE:
        return validateEXPLANATION_WF_DATAType((String)value, diagnostics, context);
      case WF_PACKPackage.HEADER_WF_DATA_TYPE:
        return validateHEADER_WF_DATAType((String)value, diagnostics, context);
      case WF_PACKPackage.POSTALCODE_WF_DATA_TYPE:
        return validatePOSTALCODE_WF_DATAType((String)value, diagnostics, context);
      case WF_PACKPackage.VALUE_WF_DATA_TYPE:
        return validateVALUE_WF_DATAType((String)value, diagnostics, context);
      default:
        return true;
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWF_DATA(WF_DATA wF_DATA, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(wF_DATA, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEXPLANATION_WF_DATAType(String explanatioN_WF_DATAType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateEXPLANATION_WF_DATAType_MaxLength(explanatioN_WF_DATAType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>EXPLANATION WF DATA Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateEXPLANATION_WF_DATAType_MaxLength(String explanatioN_WF_DATAType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = explanatioN_WF_DATAType.length();
    boolean result = length <= 500;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(WF_PACKPackage.Literals.EXPLANATION_WF_DATA_TYPE, explanatioN_WF_DATAType, length, 500, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHEADER_WF_DATAType(String headeR_WF_DATAType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateHEADER_WF_DATAType_MaxLength(headeR_WF_DATAType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>HEADER WF DATA Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateHEADER_WF_DATAType_MaxLength(String headeR_WF_DATAType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = headeR_WF_DATAType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(WF_PACKPackage.Literals.HEADER_WF_DATA_TYPE, headeR_WF_DATAType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePOSTALCODE_WF_DATAType(String postalcodE_WF_DATAType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatePOSTALCODE_WF_DATAType_MaxLength(postalcodE_WF_DATAType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>POSTALCODE WF DATA Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePOSTALCODE_WF_DATAType_MaxLength(String postalcodE_WF_DATAType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = postalcodE_WF_DATAType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(WF_PACKPackage.Literals.POSTALCODE_WF_DATA_TYPE, postalcodE_WF_DATAType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVALUE_WF_DATAType(String valuE_WF_DATAType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateVALUE_WF_DATAType_MaxLength(valuE_WF_DATAType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>VALUE WF DATA Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateVALUE_WF_DATAType_MaxLength(String valuE_WF_DATAType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = valuE_WF_DATAType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(WF_PACKPackage.Literals.VALUE_WF_DATA_TYPE, valuE_WF_DATAType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResourceLocator getResourceLocator()
  {
    // TODO
    // Specialize this to return a resource locator for messages specific to this validator.
    // Ensure that you remove @generated or mark it @generated NOT
    return super.getResourceLocator();
  }

} //WF_PACKValidator
