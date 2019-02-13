/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.arraymapping.GS. 
 */ 


com.tibco.data.Loader.classDefiner["com.example.arraymapping.GS"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.example.arraymapping.GS");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_CASEID = "caseID";
theClass.ATTR_AHVNUMMER = "ahvNummer";
theClass.ATTR_DOKUMENTENART = "dokumentenArt";
theClass.ATTR_DOSSIERID = "dossierID";
theClass.ATTR_GESCHAEFTSFALL = "geschaeftsfall";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_CASEID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_AHVNUMMER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOKUMENTENART] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOSSIERID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_GESCHAEFTSFALL] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_CASEID, theClass.ATTR_AHVNUMMER, theClass.ATTR_DOKUMENTENART, theClass.ATTR_DOSSIERID, theClass.ATTR_GESCHAEFTSFALL];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_CASEID, theClass.ATTR_AHVNUMMER, theClass.ATTR_DOKUMENTENART, theClass.ATTR_DOSSIERID, theClass.ATTR_GESCHAEFTSFALL];

theClass.getName = function() {
    return "com.example.arraymapping.GS";
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
		throw("Attribute " + attName + " not recognized for class com.example.arraymapping.GS");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.arraymapping.GS");
};

theClass.prototype.getCaseID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.arraymapping.GS").ATTR_CASEID, useInternal);
};

theClass.prototype.setCaseID = function(caseID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.arraymapping.GS").ATTR_CASEID, caseID);
};


theClass.prototype.getAhvNummer = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.arraymapping.GS").ATTR_AHVNUMMER, useInternal);
};

theClass.prototype.setAhvNummer = function(ahvNummer) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.arraymapping.GS").ATTR_AHVNUMMER, ahvNummer);
};


theClass.prototype.getDokumentenArt = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.arraymapping.GS").ATTR_DOKUMENTENART, useInternal);
};

theClass.prototype.setDokumentenArt = function(dokumentenArt) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.arraymapping.GS").ATTR_DOKUMENTENART, dokumentenArt);
};


theClass.prototype.getDossierID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.arraymapping.GS").ATTR_DOSSIERID, useInternal);
};

theClass.prototype.setDossierID = function(dossierID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.arraymapping.GS").ATTR_DOSSIERID, dossierID);
};


theClass.prototype.getGeschaeftsfall = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.arraymapping.GS").ATTR_GESCHAEFTSFALL, useInternal);
};

theClass.prototype.setGeschaeftsfall = function(geschaeftsfall) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.arraymapping.GS").ATTR_GESCHAEFTSFALL, geschaeftsfall);
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

com.tibco.data.Loader.classDefiner["com.example.arraymapping.GS"]();
