/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class com.example.arraymapping.ArraymappingFactory. 
 */ 

com.tibco.data.Loader.classDefiner["com.example.arraymapping.ArraymappingFactory"] = function() {

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

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.example.arraymapping.ArraymappingFactory");

theClass.prototype.SUPPORTED_CLASSES = ["com.example.arraymapping.GS"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory com.example.arraymapping.ArraymappingFactory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createGS = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.arraymapping.GS", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateGS = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.arraymapping.GS", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["com.example.arraymapping.ArraymappingFactory"]();
