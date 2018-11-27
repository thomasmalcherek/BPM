/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupFactory. 
 */ 

com.tibco.data.Loader.classDefiner["com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupFactory"] = function() {

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

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupFactory");

theClass.prototype.SUPPORTED_CLASSES = ["com.tibco.bwse.simpleaddresslookup.InputType", "com.tibco.bwse.simpleaddresslookup.OutputType", "com.tibco.bwse.simpleaddresslookup.SimpleAddressLookupPortType"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupFactory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createInputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.bwse.simpleaddresslookup.InputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateInputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.bwse.simpleaddresslookup.InputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createOutputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.bwse.simpleaddresslookup.OutputType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateOutputType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.bwse.simpleaddresslookup.OutputType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createSimpleAddressLookupPortType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.bwse.simpleaddresslookup.SimpleAddressLookupPortType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateSimpleAddressLookupPortType = function(jsonData) {
    var classObject = this.loader.newInstance("com.tibco.bwse.simpleaddresslookup.SimpleAddressLookupPortType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["com.tibco.bwse.simpleaddresslookup.SimpleaddresslookupFactory"]();
