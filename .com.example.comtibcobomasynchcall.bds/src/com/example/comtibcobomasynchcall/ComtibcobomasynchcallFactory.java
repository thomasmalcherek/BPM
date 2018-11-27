

package com.example.comtibcobomasynchcall;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.example.comtibcobomasynchcall.ComtibcobomasynchcallPackage
 * @generated
 */
public interface ComtibcobomasynchcallFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ComtibcobomasynchcallFactory eINSTANCE = com.example.comtibcobomasynchcall.impl.ComtibcobomasynchcallFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>Meta Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Meta Data</em>'.
   * @generated
   */
  MetaData createMetaData();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ComtibcobomasynchcallPackage getComtibcobomasynchcallPackage();

} //ComtibcobomasynchcallFactory
