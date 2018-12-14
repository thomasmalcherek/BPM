/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class com.tibco.poc.test.sticky.user.UserFactory. 
 */ 

com.tibco.data.Loader.classDefiner["com.tibco.poc.test.sticky.user.UserFactory"] = function() {

/**
 * Constructor.
 */
var theClass = function(form) {
    this.context = new Object();
    this.context.form = form;
    this.context.dataStore = form.getDataStore();
    this.context.logger = form.getLogger();
    this.context.item = null;
    this.context.id = null;
    this.loader = form._loader;
};

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.tibco.poc.test.sticky.user.UserFactory");

theClass.prototype.SUPPORTED_CLASSES = ["com.tibco.poc.test.sticky.user.pocMetaData", "com.tibco.poc.test.sticky.user.pocDBRequest"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory com.tibco.poc.test.sticky.user.UserFactory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createPocMetaData = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.poc.test.sticky.user.pocMetaData", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreatePocMetaData = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.poc.test.sticky.user.pocMetaData", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createPocDBRequest = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.poc.test.sticky.user.pocDBRequest", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreatePocDBRequest = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.poc.test.sticky.user.pocDBRequest", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["com.tibco.poc.test.sticky.user.UserFactory"]();
