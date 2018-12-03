/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.comtibcopoctest.pocMetaData. 
 */ 


com.tibco.data.Loader.classDefiner["com.example.comtibcopoctest.pocMetaData"] = function() {

/**
 * Constructor.
 */
var theClass = function(context) {
	this.data = new Object();
	this.isParameter = false;
    if (context == null) {
    	this.detached = true;
    } else  {
    	this.detached = (context.item == null);
		this.dataStore = context.dataStore;
		this.item = context.item;
		this.logger = context.logger;
		this.id = context.id;
		this.form = context.form;
		this.loader = this.form._loader;
        this.parentWrapper = context.parentWrapper;
	}
};

theClass.LOADER = com.tibco.data.Loader.currentLoader;
theClass.LOADER.registerClass(theClass, "com.example.comtibcopoctest.pocMetaData");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_WFCASEID = "WFCaseID";
theClass.ATTR_AHVNUMMER = "AHVNummer";
theClass.ATTR_PARTNERID = "partnerID";
theClass.ATTR_DOKUMENTENART = "dokumentenArt";
theClass.ATTR_KANTON = "kanton";
theClass.ATTR_FRIST = "frist";
theClass.ATTR_WIDERVORLAGEN = "widervorlagen";
theClass.ATTR_TASK = "task";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_WFCASEID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_AHVNUMMER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PARTNERID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOKUMENTENART] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_KANTON] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_FRIST] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_WIDERVORLAGEN] = {type:"BomPrimitiveTypes.Boolean", baseType:"BomPrimitiveTypes.Boolean", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TASK] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_WFCASEID, theClass.ATTR_AHVNUMMER, theClass.ATTR_PARTNERID, theClass.ATTR_DOKUMENTENART, theClass.ATTR_KANTON, theClass.ATTR_FRIST, theClass.ATTR_WIDERVORLAGEN, theClass.ATTR_TASK];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_WFCASEID, theClass.ATTR_AHVNUMMER, theClass.ATTR_PARTNERID, theClass.ATTR_DOKUMENTENART, theClass.ATTR_KANTON, theClass.ATTR_FRIST, theClass.ATTR_WIDERVORLAGEN, theClass.ATTR_TASK];

theClass.getName = function() {
    return "com.example.comtibcopoctest.pocMetaData";
};

theClass._hasAttribute = function(attName) {
	return this.TYPE_ARRAY[attName] != null;
};

theClass._getAttributes = function() {
	return this.ATTRIBUTE_NAMES;
};


theClass._getCompositeAttributes = function() {
    return this.COMPOSITE_ATTRIBUTE_NAMES;
};

theClass._getPrimitiveAttributes = function() {
    return this.PRIMITIVE_ATTRIBUTE_NAMES;
};

theClass._isAttributeMultivalued = function(attName) {
	return this._getTypeDef(attName).multivalued;
};

theClass._isAttributeRequired = function(attName) {
    return this._getTypeDef(attName).required;
};

theClass._getTypeDef = function(attName) {
    var attType = this.TYPE_ARRAY[attName];
	if (attType == null)
		throw("Attribute " + attName + " not recognized for class com.example.comtibcopoctest.pocMetaData");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.comtibcopoctest.pocMetaData");
};

theClass.prototype.getWFCaseID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_WFCASEID, useInternal);
};

theClass.prototype.setWFCaseID = function(WFCaseID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_WFCASEID, WFCaseID);
};


theClass.prototype.getAHVNummer = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_AHVNUMMER, useInternal);
};

theClass.prototype.setAHVNummer = function(AHVNummer) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_AHVNUMMER, AHVNummer);
};


theClass.prototype.getPartnerID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_PARTNERID, useInternal);
};

theClass.prototype.setPartnerID = function(partnerID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_PARTNERID, partnerID);
};


theClass.prototype.getDokumentenArt = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_DOKUMENTENART, useInternal);
};

theClass.prototype.setDokumentenArt = function(dokumentenArt) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_DOKUMENTENART, dokumentenArt);
};


theClass.prototype.getKanton = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_KANTON, useInternal);
};

theClass.prototype.setKanton = function(kanton) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_KANTON, kanton);
};


theClass.prototype.getFrist = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_FRIST, useInternal);
};

theClass.prototype.setFrist = function(frist) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_FRIST, frist);
};


theClass.prototype.getWidervorlagen = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_WIDERVORLAGEN, useInternal);
};

theClass.prototype.setWidervorlagen = function(widervorlagen) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_WIDERVORLAGEN, widervorlagen);
};


theClass.prototype.getTask = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_TASK, useInternal);
};

theClass.prototype.setTask = function(task) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comtibcopoctest.pocMetaData").ATTR_TASK, task);
};

theClass.getAttributeNames = function() {
    return theClass._getAttributes();
};

theClass.getPrimitiveAttributeNames = function() {
    return theClass._getPrimitiveAttributes();
};

theClass.getComplexAttributeNames = function() {
    return theClass._getCompositeAttributes();
};

theClass.getAttributeType = function(attName) {
    return this._getTypeDef(attName).type;
};

theClass.isAttributeMultivalued = function(attName) {
    return theClass._isAttributeMultivalued(attName);
};

theClass.isAttributePrimitive = function(attName) {
    return this._getTypeDef(attName).primitive;
};

theClass.prototype.getAttributeValue = function(attName) {
    var isSingle = !theClass.isAttributeMultivalued(attName);
    var isPrimitive = theClass.isAttributePrimitive(attName);
    if (isSingle) {
        if (isPrimitive) {
            return this._getPrimitiveAttribute(attName);
        } else {
            return this._getComplexAttribute(attName);
        }
    } else {
        if (isPrimitive) {
            return this._getPrimitiveArrayAttribute(attName);
        } else {
            return this._getComplexArrayAttribute(attName);
        }
    }    
};

theClass.prototype.setAttributeValue = function(attName, value) {
    var isSingle = !theClass.isAttributeMultivalued(attName);
    var isPrimitive = theClass.isAttributePrimitive(attName);
    if (isSingle) {
        if (isPrimitive) {
            this._setPrimitiveAttribute(attName, value);
        } else {
            this._setComplexAttribute(attName, value);
        }
    } else {
        if (isPrimitive) {
            this._setPrimitiveAttribute(attName, value);
        } else {
            throw("Cannot set child List for attribute \"" + attName + "\". You can only modify the existing List");
        }
    }    
};

};

com.tibco.data.Loader.classDefiner["com.example.comtibcopoctest.pocMetaData"]();
