/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType. 
 */ 

com.tibco.data.Loader.currentLoader.load("saveDataCaseXSD.bw.test.poc.tibco.com.dokument");
com.tibco.data.Loader.currentLoader.load("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall");
com.tibco.data.Loader.currentLoader.load("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied");
com.tibco.data.Loader.currentLoader.load("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter");

com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType"] = function() {

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
theClass.LOADER.registerClass(theClass, "saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_DOKUMENT = "dokument";
theClass.ATTR_GESCHAEFTSFALL = "geschaeftsfall";
theClass.ATTR_MITGLIED = "mitglied";
theClass.ATTR_VERSICHERTER = "versicherter";
theClass.ATTR_ANZAHL_DER_DOKUMENTE = "anzahl_der_Dokumente";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_DOKUMENT] = {type:"saveDataCaseXSD.bw.test.poc.tibco.com.dokument", baseType:"saveDataCaseXSD.bw.test.poc.tibco.com.dokument", primitive:false, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_GESCHAEFTSFALL] = {type:"saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall", baseType:"saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall", primitive:false, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_MITGLIED] = {type:"saveDataCaseXSD.bw.test.poc.tibco.com.mitglied", baseType:"saveDataCaseXSD.bw.test.poc.tibco.com.mitglied", primitive:false, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_VERSICHERTER] = {type:"saveDataCaseXSD.bw.test.poc.tibco.com.versicherter", baseType:"saveDataCaseXSD.bw.test.poc.tibco.com.versicherter", primitive:false, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ANZAHL_DER_DOKUMENTE] = {type:"BomPrimitiveTypes.Integer", baseType:"BomPrimitiveTypes.Integer", primitive:true, multivalued:false, required:true, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_ANZAHL_DER_DOKUMENTE];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [theClass.ATTR_DOKUMENT, theClass.ATTR_GESCHAEFTSFALL, theClass.ATTR_MITGLIED, theClass.ATTR_VERSICHERTER];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_DOKUMENT, theClass.ATTR_GESCHAEFTSFALL, theClass.ATTR_MITGLIED, theClass.ATTR_VERSICHERTER, theClass.ATTR_ANZAHL_DER_DOKUMENTE];

theClass.getName = function() {
    return "saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType";
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
		throw("Attribute " + attName + " not recognized for class saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType");
};

theClass.prototype.getDokument = function() {
    return this._getComplexAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType").ATTR_DOKUMENT);
};

theClass.prototype.setDokument = function(dokument) {
    var classRef = this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType");
    var attrRef = classRef.ATTR_DOKUMENT;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("dokument instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, dokument);
    } else {
        throw("Wrong input object type.");
    }
};


theClass.prototype.getGeschaeftsfall = function() {
    return this._getComplexAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType").ATTR_GESCHAEFTSFALL);
};

theClass.prototype.setGeschaeftsfall = function(geschaeftsfall) {
    var classRef = this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType");
    var attrRef = classRef.ATTR_GESCHAEFTSFALL;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("geschaeftsfall instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, geschaeftsfall);
    } else {
        throw("Wrong input object type.");
    }
};


theClass.prototype.getMitglied = function() {
    return this._getComplexAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType").ATTR_MITGLIED);
};

theClass.prototype.setMitglied = function(mitglied) {
    var classRef = this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType");
    var attrRef = classRef.ATTR_MITGLIED;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("mitglied instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, mitglied);
    } else {
        throw("Wrong input object type.");
    }
};


theClass.prototype.getVersicherter = function() {
    return this._getComplexAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType").ATTR_VERSICHERTER);
};

theClass.prototype.setVersicherter = function(versicherter) {
    var classRef = this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType");
    var attrRef = classRef.ATTR_VERSICHERTER;
    var attrType = classRef._getTypeDef(attrRef);
    if (eval("versicherter instanceof this.loader.getClass(attrType.type)")) {
        this._setComplexAttribute(attrRef, versicherter);
    } else {
        throw("Wrong input object type.");
    }
};


theClass.prototype.getAnzahl_der_Dokumente = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType").ATTR_ANZAHL_DER_DOKUMENTE, useInternal);
};

theClass.prototype.setAnzahl_der_Dokumente = function(anzahl_der_Dokumente) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType").ATTR_ANZAHL_DER_DOKUMENTE, anzahl_der_Dokumente);
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

com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.CreateCaseIDRequestType"]();
