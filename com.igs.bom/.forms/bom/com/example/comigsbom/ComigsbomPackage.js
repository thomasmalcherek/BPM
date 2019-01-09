/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the package class com.example.comigsbom.ComigsbomPackage.
 */

com.tibco.data.Loader.classDefiner["com.example.comigsbom.ComigsbomPackage"] = function() {

/**
 * Constructor.
 */
var theClass = function() {
};

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.example.comigsbom.ComigsbomPackage");


// Load the classes defined by this package.
com.tibco.data.Loader.currentLoader.load("com.example.comigsbom.Versicherter");
com.tibco.data.Loader.currentLoader.load("com.example.comigsbom.Mitglied");
com.tibco.data.Loader.currentLoader.load("com.example.comigsbom.address");
com.tibco.data.Loader.currentLoader.load("com.example.comigsbom.Geschftsfall");
com.tibco.data.Loader.currentLoader.load("com.example.comigsbom.Dokument");

// Load the associated factory.
com.tibco.data.Loader.currentLoader.load("com.example.comigsbom.ComigsbomFactory");

};

com.tibco.data.Loader.classDefiner["com.example.comigsbom.ComigsbomPackage"]();
