/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the package class com.example.comigsfak001.Comigsfak001Package.
 */

com.tibco.data.Loader.classDefiner["com.example.comigsfak001.Comigsfak001Package"] = function() {

/**
 * Constructor.
 */
var theClass = function() {
};

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.example.comigsfak001.Comigsfak001Package");

// Define the enumerations declared by this package.
theClass.Geschaeftsfall = ["FAK001", "FAK002"];
theClass.Geschaeftsfall.FAK001 = "FAK001";
theClass.Geschaeftsfall.FAK002 = "FAK002";
theClass.getGeschaeftsfall = function() {
    return this.Geschaeftsfall;
};

// Load the classes defined by this package.
com.tibco.data.Loader.currentLoader.load("com.example.comigsfak001.Geschaeftsvorfall");

// Load the associated factory.
com.tibco.data.Loader.currentLoader.load("com.example.comigsfak001.Comigsfak001Factory");

};

com.tibco.data.Loader.classDefiner["com.example.comigsfak001.Comigsfak001Package"]();
