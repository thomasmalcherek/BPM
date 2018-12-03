

package com.example.comtibcopoctest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.example.comtibcopoctest.ComtibcopoctestPackage
 * @generated
 */
public interface ComtibcopoctestFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ComtibcopoctestFactory eINSTANCE = com.example.comtibcopoctest.impl.ComtibcopoctestFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Document Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Document Root</em>'.
   * @generated
   */
  DocumentRoot createDocumentRoot();

  /**
   * Returns a new object of class '<em>poc DB Request</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>poc DB Request</em>'.
   * @generated
   */
  pocDBRequest createpocDBRequest();

  /**
   * Returns a new object of class '<em>poc Meta Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>poc Meta Data</em>'.
   * @generated
   */
  pocMetaData createpocMetaData();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ComtibcopoctestPackage getComtibcopoctestPackage();

} //ComtibcopoctestFactory
