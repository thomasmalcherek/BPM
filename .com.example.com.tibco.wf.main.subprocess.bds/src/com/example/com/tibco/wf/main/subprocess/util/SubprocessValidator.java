

/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.example.com.tibco.wf.main.subprocess.util;

import com.example.com.tibco.wf.main.subprocess.*;

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
 * @see com.example.com.tibco.wf.main.subprocess.SubprocessPackage
 * @generated
 */
public class SubprocessValidator extends EObjectValidator
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final SubprocessValidator INSTANCE = new SubprocessValidator();

  /**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
  public static final String DIAGNOSTIC_SOURCE = "com.example.com.tibco.wf.main.subprocess";

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
  public SubprocessValidator()
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
    return SubprocessPackage.eINSTANCE;
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
      case SubprocessPackage.DOCUMENT_ROOT:
        return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
      case SubprocessPackage.META_DATA:
        return validateMetaData((MetaData)value, diagnostics, context);
      case SubprocessPackage.AHV_NUMMER_META_DATA_TYPE:
        return validateAHVNummer_MetaDataType((String)value, diagnostics, context);
      case SubprocessPackage.DOKUMENTEN_ART_META_DATA_TYPE:
        return validatedokumentenArt_MetaDataType((String)value, diagnostics, context);
      case SubprocessPackage.KANTON_META_DATA_TYPE:
        return validatekanton_MetaDataType((String)value, diagnostics, context);
      case SubprocessPackage.PARTNER_ID_META_DATA_TYPE:
        return validatepartnerID_MetaDataType((String)value, diagnostics, context);
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
  public boolean validateMetaData(MetaData metaData, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return validate_EveryDefaultConstraint(metaData, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAHVNummer_MetaDataType(String ahvNummer_MetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validateAHVNummer_MetaDataType_MaxLength(ahvNummer_MetaDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>AHV Nummer Meta Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateAHVNummer_MetaDataType_MaxLength(String ahvNummer_MetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = ahvNummer_MetaDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(SubprocessPackage.Literals.AHV_NUMMER_META_DATA_TYPE, ahvNummer_MetaDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedokumentenArt_MetaDataType(String dokumentenArt_MetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatedokumentenArt_MetaDataType_MaxLength(dokumentenArt_MetaDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>dokumenten Art Meta Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatedokumentenArt_MetaDataType_MaxLength(String dokumentenArt_MetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = dokumentenArt_MetaDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(SubprocessPackage.Literals.DOKUMENTEN_ART_META_DATA_TYPE, dokumentenArt_MetaDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatekanton_MetaDataType(String kanton_MetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatekanton_MetaDataType_MaxLength(kanton_MetaDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>kanton Meta Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatekanton_MetaDataType_MaxLength(String kanton_MetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = kanton_MetaDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(SubprocessPackage.Literals.KANTON_META_DATA_TYPE, kanton_MetaDataType, length, 50, diagnostics, context);
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatepartnerID_MetaDataType(String partnerID_MetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    boolean result = validatepartnerID_MetaDataType_MaxLength(partnerID_MetaDataType, diagnostics, context);
    return result;
  }

  /**
   * Validates the MaxLength constraint of '<em>partner ID Meta Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatepartnerID_MetaDataType_MaxLength(String partnerID_MetaDataType, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    int length = partnerID_MetaDataType.length();
    boolean result = length <= 50;
    if (!result && diagnostics != null)
      reportMaxLengthViolation(SubprocessPackage.Literals.PARTNER_ID_META_DATA_TYPE, partnerID_MetaDataType, length, 50, diagnostics, context);
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

} //SubprocessValidator
