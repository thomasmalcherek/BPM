

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.example.comtibcopoctest.util;

import com.example.comtibcopoctest.*;

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
 * @see com.example.comtibcopoctest.ComtibcopoctestPackage
 * @generated
 */
public class ComtibcopoctestValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final ComtibcopoctestValidator INSTANCE = new ComtibcopoctestValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "com.example.comtibcopoctest";

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
  public ComtibcopoctestValidator()
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
    return ComtibcopoctestPackage.eINSTANCE;
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
      case ComtibcopoctestPackage.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case ComtibcopoctestPackage.POC_DB_REQUEST:
        return validatepocDBRequest((pocDBRequest)value, diagnostics, context);
      case ComtibcopoctestPackage.POC_META_DATA:
        return validatepocMetaData((pocMetaData)value, diagnostics, context);
      case ComtibcopoctestPackage.AHV_NUMMER_POC_META_DATA_TYPE:
        return validateAHVNummer_pocMetaDataType((String)value, diagnostics, context);
      case ComtibcopoctestPackage.DOKUMENTEN_ART_POC_META_DATA_TYPE:
        return validatedokumentenArt_pocMetaDataType((String)value, diagnostics, context);
      case ComtibcopoctestPackage.KANTON_POC_META_DATA_TYPE:
        return validatekanton_pocMetaDataType((String)value, diagnostics, context);
      case ComtibcopoctestPackage.PARTNER_ID_POC_META_DATA_TYPE:
        return validatepartnerID_pocMetaDataType((String)value, diagnostics, context);
      case ComtibcopoctestPackage.TASK_POC_META_DATA_TYPE:
        return validatetask_pocMetaDataType((String)value, diagnostics, context);
      case ComtibcopoctestPackage.WF_CASE_ID_POC_META_DATA_TYPE:
        return validateWFCaseID_pocMetaDataType((String)value, diagnostics, context);
      case ComtibcopoctestPackage.WF_CASE_ID_POC_DB_REQUEST_TYPE:
        return validateWFCaseID_pocDBRequestType((String)value, diagnostics, context);
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
  public boolean validatepocDBRequest(pocDBRequest pocDBRequest, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(pocDBRequest, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatepocMetaData(pocMetaData pocMetaData, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(pocMetaData, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAHVNummer_pocMetaDataType(String ahvNummer_pocMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateAHVNummer_pocMetaDataType_MaxLength(ahvNummer_pocMetaDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>AHV Nummer poc Meta Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAHVNummer_pocMetaDataType_MaxLength(String ahvNummer_pocMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = ahvNummer_pocMetaDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ComtibcopoctestPackage.Literals.AHV_NUMMER_POC_META_DATA_TYPE, ahvNummer_pocMetaDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedokumentenArt_pocMetaDataType(String dokumentenArt_pocMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatedokumentenArt_pocMetaDataType_MaxLength(dokumentenArt_pocMetaDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>dokumenten Art poc Meta Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedokumentenArt_pocMetaDataType_MaxLength(String dokumentenArt_pocMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = dokumentenArt_pocMetaDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ComtibcopoctestPackage.Literals.DOKUMENTEN_ART_POC_META_DATA_TYPE, dokumentenArt_pocMetaDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatekanton_pocMetaDataType(String kanton_pocMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatekanton_pocMetaDataType_MaxLength(kanton_pocMetaDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>kanton poc Meta Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatekanton_pocMetaDataType_MaxLength(String kanton_pocMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = kanton_pocMetaDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ComtibcopoctestPackage.Literals.KANTON_POC_META_DATA_TYPE, kanton_pocMetaDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatepartnerID_pocMetaDataType(String partnerID_pocMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatepartnerID_pocMetaDataType_MaxLength(partnerID_pocMetaDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>partner ID poc Meta Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatepartnerID_pocMetaDataType_MaxLength(String partnerID_pocMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = partnerID_pocMetaDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ComtibcopoctestPackage.Literals.PARTNER_ID_POC_META_DATA_TYPE, partnerID_pocMetaDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetask_pocMetaDataType(String task_pocMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatetask_pocMetaDataType_MaxLength(task_pocMetaDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>task poc Meta Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatetask_pocMetaDataType_MaxLength(String task_pocMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = task_pocMetaDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ComtibcopoctestPackage.Literals.TASK_POC_META_DATA_TYPE, task_pocMetaDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWFCaseID_pocMetaDataType(String wfCaseID_pocMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateWFCaseID_pocMetaDataType_MaxLength(wfCaseID_pocMetaDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>WF Case ID poc Meta Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWFCaseID_pocMetaDataType_MaxLength(String wfCaseID_pocMetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = wfCaseID_pocMetaDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ComtibcopoctestPackage.Literals.WF_CASE_ID_POC_META_DATA_TYPE, wfCaseID_pocMetaDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWFCaseID_pocDBRequestType(String wfCaseID_pocDBRequestType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateWFCaseID_pocDBRequestType_MaxLength(wfCaseID_pocDBRequestType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>WF Case ID poc DB Request Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateWFCaseID_pocDBRequestType_MaxLength(String wfCaseID_pocDBRequestType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = wfCaseID_pocDBRequestType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(ComtibcopoctestPackage.Literals.WF_CASE_ID_POC_DB_REQUEST_TYPE, wfCaseID_pocDBRequestType, length, 50, diagnostics, context);
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

} //ComtibcopoctestValidator
