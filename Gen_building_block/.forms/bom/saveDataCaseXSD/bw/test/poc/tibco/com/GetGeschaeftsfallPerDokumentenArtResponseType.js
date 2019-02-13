/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType. 
 */ 


com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType"] = function() {

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
theClass.LOADER.registerClass(theClass, "saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_GESCHAEFTSFALL = "GESCHAEFTSFALL";
theClass.ATTR_DOKUMENTENART = "DOKUMENTENART";
theClass.ATTR_DOKUMENTENART_MAIN = "DOKUMENTENART_MAIN";
theClass.ATTR_DOKUMENTENART_SPEC = "DOKUMENTENART_SPEC";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_GESCHAEFTSFALL] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOKUMENTENART] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOKUMENTENART_MAIN] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOKUMENTENART_SPEC] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_GESCHAEFTSFALL, theClass.ATTR_DOKUMENTENART, theClass.ATTR_DOKUMENTENART_MAIN, theClass.ATTR_DOKUMENTENART_SPEC];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_GESCHAEFTSFALL, theClass.ATTR_DOKUMENTENART, theClass.ATTR_DOKUMENTENART_MAIN, theClass.ATTR_DOKUMENTENART_SPEC];

theClass.getName = function() {
    return "saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType";
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
		throw("Attribute " + attName + " not recognized for class saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType");
};

theClass.prototype.getGESCHAEFTSFALL = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType").ATTR_GESCHAEFTSFALL, useInternal);
};

theClass.prototype.setGESCHAEFTSFALL = function(GESCHAEFTSFALL) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType").ATTR_GESCHAEFTSFALL, GESCHAEFTSFALL);
};


theClass.prototype.getDOKUMENTENART = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType").ATTR_DOKUMENTENART, useInternal);
};

theClass.prototype.setDOKUMENTENART = function(DOKUMENTENART) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType").ATTR_DOKUMENTENART, DOKUMENTENART);
};


theClass.prototype.getDOKUMENTENART_MAIN = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType").ATTR_DOKUMENTENART_MAIN, useInternal);
};

theClass.prototype.setDOKUMENTENART_MAIN = function(DOKUMENTENART_MAIN) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType").ATTR_DOKUMENTENART_MAIN, DOKUMENTENART_MAIN);
};


theClass.prototype.getDOKUMENTENART_SPEC = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType").ATTR_DOKUMENTENART_SPEC, useInternal);
};

theClass.prototype.setDOKUMENTENART_SPEC = function(DOKUMENTENART_SPEC) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType").ATTR_DOKUMENTENART_SPEC, DOKUMENTENART_SPEC);
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

com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.GetGeschaeftsfallPerDokumentenArtResponseType"]();
