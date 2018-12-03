/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the factory class saveDataCaseXSD.bw.test.poc.tibco.com.ComFactory. 
 */ 

com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.ComFactory"] = function() {

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

com.tibco.data.Loader.currentLoader.registerClass(theClass, "saveDataCaseXSD.bw.test.poc.tibco.com.ComFactory");

theClass.prototype.SUPPORTED_CLASSES = ["saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType", "saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseType", "saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType", "saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType", "saveDataCaseXSD.bw.test.poc.tibco.com.GetDataRequestFromCaseIDType", "saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType"];

theClass.prototype.checkClassName = function(className) {
    for(i = 0; i < this.SUPPORTED_CLASSES.length; i++) {
        if (className == this.SUPPORTED_CLASSES[i]) return;
    }
    throw("Factory saveDataCaseXSD.bw.test.poc.tibco.com.ComFactory does not support class \"" + className + "\"");
};

theClass.prototype.create = function(className, jsonData) {
    this.checkClassName(className);
    var classObject = this.loader.newInstance(className, this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData, this.context);
    return classObject;
};

theClass.prototype.createCreateCaseIDRequestType = function(jsonData) {
    var classObject = this.loader.newInstance("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateCreateCaseIDRequestType = function(jsonData) {
    var classObject = this.loader.newInstance("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createCreateCaseIDResponseType = function(jsonData) {
    var classObject = this.loader.newInstance("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateCreateCaseIDResponseType = function(jsonData) {
    var classObject = this.loader.newInstance("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createCreateCaseIDRequestFromBPMType = function(jsonData) {
    var classObject = this.loader.newInstance("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateCreateCaseIDRequestFromBPMType = function(jsonData) {
    var classObject = this.loader.newInstance("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestFromBPMType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createCreateCaseIDResponseFromBPMType = function(jsonData) {
    var classObject = this.loader.newInstance("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateCreateCaseIDResponseFromBPMType = function(jsonData) {
    var classObject = this.loader.newInstance("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDResponseFromBPMType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createGetDataRequestFromCaseIDType = function(jsonData) {
    var classObject = this.loader.newInstance("saveDataCaseXSD.bw.test.poc.tibco.com.GetDataRequestFromCaseIDType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateGetDataRequestFromCaseIDType = function(jsonData) {
    var classObject = this.loader.newInstance("saveDataCaseXSD.bw.test.poc.tibco.com.GetDataRequestFromCaseIDType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.createGetDataResponseFromCaseIDType = function(jsonData) {
    var classObject = this.loader.newInstance("saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType", this.context);
    if(jsonData != undefined)
        classObject = classObject._setValue(classObject, jsonData);
    return classObject;
};

theClass.prototype.listCreateGetDataResponseFromCaseIDType = function(jsonData) {
    var classObject = this.loader.newInstance("saveDataCaseXSD.bw.test.poc.tibco.com.GetDataResponseFromCaseIDType", this.context);
    var classList;
    classList = classObject._setValueList(classObject, jsonData);
    return classList;
};
    
theClass.prototype.getClass = function(className) {
    this.checkClassName(className);
    return this.loader.getClass(className);
};
};

com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.ComFactory"]();
