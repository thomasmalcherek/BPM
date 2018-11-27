
package com.tibco.bwse.simpleaddresslookup.impl;

import com.tibco.bwse.simpleaddresslookup.OutputType;
import com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupPackage;

import com.tibco.bwse.simpleaddresslookup.bdsutil.BDSTypeConversions;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.OutputTypeImpl#getAddressLine1 <em>Address Line1</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.OutputTypeImpl#getAddressLine2 <em>Address Line2</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.OutputTypeImpl#getCity <em>City</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.OutputTypeImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.OutputTypeImpl#getProvince <em>Province</em>}</li>
 *   <li>{@link com.tibco.bwse.simpleaddresslookup.impl.OutputTypeImpl#getPostalCode <em>Postal Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@SuppressWarnings("all")
public class OutputTypeImpl extends EObjectImpl implements OutputType
{
  /**
   * The default value of the '{@link #getAddressLine1() <em>Address Line1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressLine1()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_LINE1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddressLine1() <em>Address Line1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressLine1()
   * @generated
   * @ordered
   */
  protected String addressLine1 = ADDRESS_LINE1_EDEFAULT;

  /**
   * The default value of the '{@link #getAddressLine2() <em>Address Line2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressLine2()
   * @generated
   * @ordered
   */
  protected static final String ADDRESS_LINE2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddressLine2() <em>Address Line2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddressLine2()
   * @generated
   * @ordered
   */
  protected String addressLine2 = ADDRESS_LINE2_EDEFAULT;

  /**
   * The default value of the '{@link #getCity() <em>City</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCity()
   * @generated
   * @ordered
   */
  protected static final String CITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCity()
   * @generated
   * @ordered
   */
  protected String city = CITY_EDEFAULT;

  /**
   * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountry()
   * @generated
   * @ordered
   */
  protected static final String COUNTRY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountry()
   * @generated
   * @ordered
   */
  protected String country = COUNTRY_EDEFAULT;

  /**
   * The default value of the '{@link #getProvince() <em>Province</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvince()
   * @generated
   * @ordered
   */
  protected static final String PROVINCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProvince() <em>Province</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProvince()
   * @generated
   * @ordered
   */
  protected String province = PROVINCE_EDEFAULT;

  /**
   * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostalCode()
   * @generated
   * @ordered
   */
  protected static final String POSTAL_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostalCode()
   * @generated
   * @ordered
   */
  protected String postalCode = POSTAL_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutputTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SimpleaddresslookupPackage.Literals.OUTPUT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAddressLine1()
  {
    return addressLine1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddressLine1(String newAddressLine1)
  {
    String oldAddressLine1 = addressLine1;
    addressLine1 = newAddressLine1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleaddresslookupPackage.OUTPUT_TYPE__ADDRESS_LINE1, oldAddressLine1, addressLine1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAddressLine2()
  {
    return addressLine2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddressLine2(String newAddressLine2)
  {
    String oldAddressLine2 = addressLine2;
    addressLine2 = newAddressLine2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleaddresslookupPackage.OUTPUT_TYPE__ADDRESS_LINE2, oldAddressLine2, addressLine2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCity()
  {
    return city;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCity(String newCity)
  {
    String oldCity = city;
    city = newCity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleaddresslookupPackage.OUTPUT_TYPE__CITY, oldCity, city));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCountry()
  {
    return country;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCountry(String newCountry)
  {
    String oldCountry = country;
    country = newCountry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleaddresslookupPackage.OUTPUT_TYPE__COUNTRY, oldCountry, country));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProvince()
  {
    return province;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProvince(String newProvince)
  {
    String oldProvince = province;
    province = newProvince;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleaddresslookupPackage.OUTPUT_TYPE__PROVINCE, oldProvince, province));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPostalCode()
  {
    return postalCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostalCode(String newPostalCode)
  {
    String oldPostalCode = postalCode;
    postalCode = newPostalCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleaddresslookupPackage.OUTPUT_TYPE__POSTAL_CODE, oldPostalCode, postalCode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SimpleaddresslookupPackage.OUTPUT_TYPE__ADDRESS_LINE1:
        return getAddressLine1();
      case SimpleaddresslookupPackage.OUTPUT_TYPE__ADDRESS_LINE2:
        return getAddressLine2();
      case SimpleaddresslookupPackage.OUTPUT_TYPE__CITY:
        return getCity();
      case SimpleaddresslookupPackage.OUTPUT_TYPE__COUNTRY:
        return getCountry();
      case SimpleaddresslookupPackage.OUTPUT_TYPE__PROVINCE:
        return getProvince();
      case SimpleaddresslookupPackage.OUTPUT_TYPE__POSTAL_CODE:
        return getPostalCode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SimpleaddresslookupPackage.OUTPUT_TYPE__ADDRESS_LINE1:
        setAddressLine1((String)newValue);
        return;
      case SimpleaddresslookupPackage.OUTPUT_TYPE__ADDRESS_LINE2:
        setAddressLine2((String)newValue);
        return;
      case SimpleaddresslookupPackage.OUTPUT_TYPE__CITY:
        setCity((String)newValue);
        return;
      case SimpleaddresslookupPackage.OUTPUT_TYPE__COUNTRY:
        setCountry((String)newValue);
        return;
      case SimpleaddresslookupPackage.OUTPUT_TYPE__PROVINCE:
        setProvince((String)newValue);
        return;
      case SimpleaddresslookupPackage.OUTPUT_TYPE__POSTAL_CODE:
        setPostalCode((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SimpleaddresslookupPackage.OUTPUT_TYPE__ADDRESS_LINE1:
        setAddressLine1(ADDRESS_LINE1_EDEFAULT);
        return;
      case SimpleaddresslookupPackage.OUTPUT_TYPE__ADDRESS_LINE2:
        setAddressLine2(ADDRESS_LINE2_EDEFAULT);
        return;
      case SimpleaddresslookupPackage.OUTPUT_TYPE__CITY:
        setCity(CITY_EDEFAULT);
        return;
      case SimpleaddresslookupPackage.OUTPUT_TYPE__COUNTRY:
        setCountry(COUNTRY_EDEFAULT);
        return;
      case SimpleaddresslookupPackage.OUTPUT_TYPE__PROVINCE:
        setProvince(PROVINCE_EDEFAULT);
        return;
      case SimpleaddresslookupPackage.OUTPUT_TYPE__POSTAL_CODE:
        setPostalCode(POSTAL_CODE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SimpleaddresslookupPackage.OUTPUT_TYPE__ADDRESS_LINE1:
        return ADDRESS_LINE1_EDEFAULT == null ? addressLine1 != null : !ADDRESS_LINE1_EDEFAULT.equals(addressLine1);
      case SimpleaddresslookupPackage.OUTPUT_TYPE__ADDRESS_LINE2:
        return ADDRESS_LINE2_EDEFAULT == null ? addressLine2 != null : !ADDRESS_LINE2_EDEFAULT.equals(addressLine2);
      case SimpleaddresslookupPackage.OUTPUT_TYPE__CITY:
        return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
      case SimpleaddresslookupPackage.OUTPUT_TYPE__COUNTRY:
        return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
      case SimpleaddresslookupPackage.OUTPUT_TYPE__PROVINCE:
        return PROVINCE_EDEFAULT == null ? province != null : !PROVINCE_EDEFAULT.equals(province);
      case SimpleaddresslookupPackage.OUTPUT_TYPE__POSTAL_CODE:
        return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (addressLine1: ");
    result.append(addressLine1);
    result.append(", addressLine2: ");
    result.append(addressLine2);
    result.append(", city: ");
    result.append(city);
    result.append(", country: ");
    result.append(country);
    result.append(", province: ");
    result.append(province);
    result.append(", postalCode: ");
    result.append(postalCode);
    result.append(')');
    return result.toString();
  }

  /**
   * @generated
   */
  public void setAddressLine1(Object value)
  {
    // Call the default set, passing in the converted value
    setAddressLine1(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setAddressLine2(Object value)
  {
    // Call the default set, passing in the converted value
    setAddressLine2(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setCity(Object value)
  {
    // Call the default set, passing in the converted value
    setCity(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setCountry(Object value)
  {
    // Call the default set, passing in the converted value
    setCountry(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setProvince(Object value)
  {
    // Call the default set, passing in the converted value
    setProvince(BDSTypeConversions.convertToString(value));
  }
  /**
   * @generated
   */
  public void setPostalCode(Object value)
  {
    // Call the default set, passing in the converted value
    setPostalCode(BDSTypeConversions.convertToString(value));
  }
} //OutputTypeImpl
