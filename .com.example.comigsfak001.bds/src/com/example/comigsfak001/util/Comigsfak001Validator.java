

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.example.comigsfak001.util;

import com.example.comigsfak001.*;

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
 * @see com.example.comigsfak001.Comigsfak001Package
 * @generated
 */
public class Comigsfak001Validator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final Comigsfak001Validator INSTANCE = new Comigsfak001Validator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "com.example.comigsfak001";

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
  public Comigsfak001Validator()
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
    return Comigsfak001Package.eINSTANCE;
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
      case Comigsfak001Package.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case Comigsfak001Package.GESCHAEFTSVORFALL:
        return validateGeschaeftsvorfall((Geschaeftsvorfall)value, diagnostics, context);
      case Comigsfak001Package.AHV_NUMMER_GESCHAEFTSVORFALL_TYPE:
        return validateAHVNummer_GeschaeftsvorfallType((String)value, diagnostics, context);
      case Comigsfak001Package.DOKUMENTEN_ART_GESCHAEFTSVORFALL_TYPE:
        return validatedokumentenArt_GeschaeftsvorfallType((String)value, diagnostics, context);
      case Comigsfak001Package.GESCHAEFTSFALL_GESCHAEFTSVORFALL_TYPE:
        return validategeschaeftsfall_GeschaeftsvorfallType((String)value, diagnostics, context);
      case Comigsfak001Package.PARTNER_ID_GESCHAEFTSVORFALL_TYPE:
        return validatepartnerID_GeschaeftsvorfallType((String)value, diagnostics, context);
      case Comigsfak001Package.WF_CASE_ID_GESCHAEFTSVORFALL_TYPE:
        return validateWFCaseID_GeschaeftsvorfallType((String)value, diagnostics, context);
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
  public boolean validateGeschaeftsvorfall(Geschaeftsvorfall geschaeftsvorfall, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(geschaeftsvorfall, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAHVNummer_GeschaeftsvorfallType(String ahvNummer_GeschaeftsvorfallType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateAHVNummer_GeschaeftsvorfallType_MaxLength(ahvNummer_GeschaeftsvorfallType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>AHV Nummer Geschaeftsvorfall Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAHVNummer_GeschaeftsvorfallType_MaxLength(String ahvNummer_GeschaeftsvorfallType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = ahvNummer_GeschaeftsvorfallType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Comigsfak001Package.Literals.AHV_NUMMER_GESCHAEFTSVORFALL_TYPE, ahvNummer_GeschaeftsvorfallType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedokumentenArt_GeschaeftsvorfallType(String dokumentenArt_GeschaeftsvorfallType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatedokumentenArt_GeschaeftsvorfallType_MaxLength(dokumentenArt_GeschaeftsvorfallType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>dokumenten Art Geschaeftsvorfall Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedokumentenArt_GeschaeftsvorfallType_MaxLength(String dokumentenArt_GeschaeftsvorfallType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = dokumentenArt_GeschaeftsvorfallType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Comigsfak001Package.Literals.DOKUMENTEN_ART_GESCHAEFTSVORFALL_TYPE, dokumentenArt_GeschaeftsvorfallType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validategeschaeftsfall_GeschaeftsvorfallType(String geschaeftsfall_GeschaeftsvorfallType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validategeschaeftsfall_GeschaeftsvorfallType_MaxLength(geschaeftsfall_GeschaeftsvorfallType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>geschaeftsfall Geschaeftsvorfall Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validategeschaeftsfall_GeschaeftsvorfallType_MaxLength(String geschaeftsfall_GeschaeftsvorfallType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = geschaeftsfall_GeschaeftsvorfallType.length();
    boolean result = length <= 500;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Comigsfak001Package.Literals.GESCHAEFTSFALL_GESCHAEFTSVORFALL_TYPE, geschaeftsfall_GeschaeftsvorfallType, length, 500, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatepartnerID_GeschaeftsvorfallType(String partnerID_GeschaeftsvorfallType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatepartnerID_GeschaeftsvorfallType_MaxLength(partnerID_GeschaeftsvorfallType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>partner ID Geschaeftsvorfall Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatepartnerID_GeschaeftsvorfallType_MaxLength(String partnerID_GeschaeftsvorfallType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = partnerID_GeschaeftsvorfallType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Comigsfak001Package.Literals.PARTNER_ID_GESCHAEFTSVORFALL_TYPE, partnerID_GeschaeftsvorfallType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWFCaseID_GeschaeftsvorfallType(String wfCaseID_GeschaeftsvorfallType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateWFCaseID_GeschaeftsvorfallType_MaxLength(wfCaseID_GeschaeftsvorfallType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>WF Case ID Geschaeftsvorfall Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWFCaseID_GeschaeftsvorfallType_MaxLength(String wfCaseID_GeschaeftsvorfallType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = wfCaseID_GeschaeftsvorfallType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(Comigsfak001Package.Literals.WF_CASE_ID_GESCHAEFTSVORFALL_TYPE, wfCaseID_GeschaeftsvorfallType, length, 50, diagnostics, context);
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

} //Comigsfak001Validator
