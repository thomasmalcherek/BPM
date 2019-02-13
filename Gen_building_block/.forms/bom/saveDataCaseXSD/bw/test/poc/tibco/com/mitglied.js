/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class saveDataCaseXSD.bw.test.poc.tibco.com.mitglied. 
 */ 


com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.mitglied"] = function() {

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
theClass.LOADER.registerClass(theClass, "saveDataCaseXSD.bw.test.poc.tibco.com.mitglied");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_MGPARTNERID = "MGPartnerID";
theClass.ATTR_ABRECHNUNGSNUMMER = "abrechnungsnummer";
theClass.ATTR_UNTERNEHMENSID = "unternehmensID";
theClass.ATTR_NAME = "name";
theClass.ATTR_ZUSATZBEZEICHNUNG = "zusatzbezeichnung";
theClass.ATTR_GRUENDUNGSDATUM = "gruendungsDatum";
theClass.ATTR_ANMELDENUMMER = "anmeldenummer";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_MGPARTNERID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ABRECHNUNGSNUMMER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_UNTERNEHMENSID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_NAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ZUSATZBEZEICHNUNG] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_GRUENDUNGSDATUM] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ANMELDENUMMER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_MGPARTNERID, theClass.ATTR_ABRECHNUNGSNUMMER, theClass.ATTR_UNTERNEHMENSID, theClass.ATTR_NAME, theClass.ATTR_ZUSATZBEZEICHNUNG, theClass.ATTR_GRUENDUNGSDATUM, theClass.ATTR_ANMELDENUMMER];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_MGPARTNERID, theClass.ATTR_ABRECHNUNGSNUMMER, theClass.ATTR_UNTERNEHMENSID, theClass.ATTR_NAME, theClass.ATTR_ZUSATZBEZEICHNUNG, theClass.ATTR_GRUENDUNGSDATUM, theClass.ATTR_ANMELDENUMMER];

theClass.getName = function() {
    return "saveDataCaseXSD.bw.test.poc.tibco.com.mitglied";
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
		throw("Attribute " + attName + " not recognized for class saveDataCaseXSD.bw.test.poc.tibco.com.mitglied");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied");
};

theClass.prototype.getMGPartnerID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_MGPARTNERID, useInternal);
};

theClass.prototype.setMGPartnerID = function(MGPartnerID) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_MGPARTNERID, MGPartnerID);
};


theClass.prototype.getAbrechnungsnummer = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_ABRECHNUNGSNUMMER, useInternal);
};

theClass.prototype.setAbrechnungsnummer = function(abrechnungsnummer) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_ABRECHNUNGSNUMMER, abrechnungsnummer);
};


theClass.prototype.getUnternehmensID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_UNTERNEHMENSID, useInternal);
};

theClass.prototype.setUnternehmensID = function(unternehmensID) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_UNTERNEHMENSID, unternehmensID);
};


theClass.prototype.getName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_NAME, useInternal);
};

theClass.prototype.setName = function(name) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_NAME, name);
};


theClass.prototype.getZusatzbezeichnung = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_ZUSATZBEZEICHNUNG, useInternal);
};

theClass.prototype.setZusatzbezeichnung = function(zusatzbezeichnung) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_ZUSATZBEZEICHNUNG, zusatzbezeichnung);
};


theClass.prototype.getGruendungsDatum = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_GRUENDUNGSDATUM, useInternal);
};

theClass.prototype.setGruendungsDatum = function(gruendungsDatum) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_GRUENDUNGSDATUM, gruendungsDatum);
};


theClass.prototype.getAnmeldenummer = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_ANMELDENUMMER, useInternal);
};

theClass.prototype.setAnmeldenummer = function(anmeldenummer) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.mitglied").ATTR_ANMELDENUMMER, anmeldenummer);
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

com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.mitglied"]();
