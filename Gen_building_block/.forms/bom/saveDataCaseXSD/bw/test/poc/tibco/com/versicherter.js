/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class saveDataCaseXSD.bw.test.poc.tibco.com.versicherter. 
 */ 


com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.versicherter"] = function() {

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
theClass.LOADER.registerClass(theClass, "saveDataCaseXSD.bw.test.poc.tibco.com.versicherter");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_VSPARTNERID = "VSPartnerID";
theClass.ATTR_VERSICHERUNGSNUMMER = "versicherungsnummer";
theClass.ATTR_PERSONENID = "personenID";
theClass.ATTR_NACHNAME = "nachname";
theClass.ATTR_VORNAME = "vorname";
theClass.ATTR_ANREDE = "anrede";
theClass.ATTR_TITEL = "titel";
theClass.ATTR_GESCHLECHT = "geschlecht";
theClass.ATTR_GEBURTSDATUM = "geburtsdatum";
theClass.ATTR_SPRACHE = "sprache";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_VSPARTNERID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_VERSICHERUNGSNUMMER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PERSONENID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_NACHNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_VORNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ANREDE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TITEL] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_GESCHLECHT] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_GEBURTSDATUM] = {type:"BomPrimitiveTypes.Date", baseType:"BomPrimitiveTypes.Date", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SPRACHE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_VSPARTNERID, theClass.ATTR_VERSICHERUNGSNUMMER, theClass.ATTR_PERSONENID, theClass.ATTR_NACHNAME, theClass.ATTR_VORNAME, theClass.ATTR_ANREDE, theClass.ATTR_TITEL, theClass.ATTR_GESCHLECHT, theClass.ATTR_GEBURTSDATUM, theClass.ATTR_SPRACHE];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_VSPARTNERID, theClass.ATTR_VERSICHERUNGSNUMMER, theClass.ATTR_PERSONENID, theClass.ATTR_NACHNAME, theClass.ATTR_VORNAME, theClass.ATTR_ANREDE, theClass.ATTR_TITEL, theClass.ATTR_GESCHLECHT, theClass.ATTR_GEBURTSDATUM, theClass.ATTR_SPRACHE];

theClass.getName = function() {
    return "saveDataCaseXSD.bw.test.poc.tibco.com.versicherter";
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
		throw("Attribute " + attName + " not recognized for class saveDataCaseXSD.bw.test.poc.tibco.com.versicherter");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter");
};

theClass.prototype.getVSPartnerID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_VSPARTNERID, useInternal);
};

theClass.prototype.setVSPartnerID = function(VSPartnerID) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_VSPARTNERID, VSPartnerID);
};


theClass.prototype.getVersicherungsnummer = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_VERSICHERUNGSNUMMER, useInternal);
};

theClass.prototype.setVersicherungsnummer = function(versicherungsnummer) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_VERSICHERUNGSNUMMER, versicherungsnummer);
};


theClass.prototype.getPersonenID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_PERSONENID, useInternal);
};

theClass.prototype.setPersonenID = function(personenID) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_PERSONENID, personenID);
};


theClass.prototype.getNachname = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_NACHNAME, useInternal);
};

theClass.prototype.setNachname = function(nachname) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_NACHNAME, nachname);
};


theClass.prototype.getVorname = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_VORNAME, useInternal);
};

theClass.prototype.setVorname = function(vorname) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_VORNAME, vorname);
};


theClass.prototype.getAnrede = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_ANREDE, useInternal);
};

theClass.prototype.setAnrede = function(anrede) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_ANREDE, anrede);
};


theClass.prototype.getTitel = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_TITEL, useInternal);
};

theClass.prototype.setTitel = function(titel) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_TITEL, titel);
};


theClass.prototype.getGeschlecht = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_GESCHLECHT, useInternal);
};

theClass.prototype.setGeschlecht = function(geschlecht) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_GESCHLECHT, geschlecht);
};


theClass.prototype.getGeburtsdatum = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_GEBURTSDATUM, useInternal);
};

theClass.prototype.setGeburtsdatum = function(geburtsdatum) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_GEBURTSDATUM, geburtsdatum);
};


theClass.prototype.getSprache = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_SPRACHE, useInternal);
};

theClass.prototype.setSprache = function(sprache) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.versicherter").ATTR_SPRACHE, sprache);
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

com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.versicherter"]();
