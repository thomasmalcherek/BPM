/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class com.example.comigsbom.ComigsbomFactory. 
 */ 

com.tibco.data.Loader.classDefiner["com.example.comigsbom.ComigsbomFactory"] = function() {

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

com.tibco.data.Loader.currentLoader.registerClass(theClass, "com.example.comigsbom.ComigsbomFactory");

theClass.prototype.SUPPORTED_CLASSES = ["com.example.comigsbom.Versicherter", "com.example.comigsbom.Mitglied", "com.example.comigsbom.address", "com.example.comigsbom.Geschftsfall", "com.example.comigsbom.Dokument"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory com.example.comigsbom.ComigsbomFactory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createVersicherter = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.comigsbom.Versicherter", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateVersicherter = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.comigsbom.Versicherter", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createMitglied = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.comigsbom.Mitglied", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateMitglied = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.comigsbom.Mitglied", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createAddress = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.comigsbom.address", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateAddress = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.comigsbom.address", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createGeschftsfall = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.comigsbom.Geschftsfall", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateGeschftsfall = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.comigsbom.Geschftsfall", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createDokument = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.comigsbom.Dokument", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateDokument = function(jsonData) {
    var classObject = this.loader.newInstance("com.example.comigsbom.Dokument", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["com.example.comigsbom.ComigsbomFactory"]();
