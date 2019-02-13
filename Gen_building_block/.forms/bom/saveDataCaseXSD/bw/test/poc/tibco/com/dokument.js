/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class saveDataCaseXSD.bw.test.poc.tibco.com.dokument. 
 */ 


com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.dokument"] = function() {

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
theClass.LOADER.registerClass(theClass, "saveDataCaseXSD.bw.test.poc.tibco.com.dokument");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_DOKUMENTENID = "dokumentenID";
theClass.ATTR_DOCUMENTENNUMMER = "documentenNummer";
theClass.ATTR_DOCUMENTENART = "documentenArt";
theClass.ATTR_DOKSCHUTZ = "dokSchutz";
theClass.ATTR_DOKEINGANGSDATUM = "dokEingangsDatum";
theClass.ATTR_DOKSCANDATUM = "dokScanDatum";
theClass.ATTR_STAPELNAME = "stapelname";
theClass.ATTR_LEISTUNGSART = "leistungsArt";
theClass.ATTR_SCHLAGWORT = "schlagwort";
theClass.ATTR_KURZTEXT = "kurztext";
theClass.ATTR_KOMMENTAR = "kommentar";
theClass.ATTR_ANMELDENUMMER = "anmeldenummer";
theClass.ATTR_FORMULAREMPFAENGER = "formularempfaenger";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_DOKUMENTENID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOCUMENTENNUMMER] = {type:"BomPrimitiveTypes.Integer", baseType:"BomPrimitiveTypes.Integer", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOCUMENTENART] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOKSCHUTZ] = {type:"BomPrimitiveTypes.Integer", baseType:"BomPrimitiveTypes.Integer", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOKEINGANGSDATUM] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOKSCANDATUM] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_STAPELNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_LEISTUNGSART] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SCHLAGWORT] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:true, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_KURZTEXT] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_KOMMENTAR] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ANMELDENUMMER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_FORMULAREMPFAENGER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_DOKUMENTENID, theClass.ATTR_DOCUMENTENNUMMER, theClass.ATTR_DOCUMENTENART, theClass.ATTR_DOKSCHUTZ, theClass.ATTR_DOKEINGANGSDATUM, theClass.ATTR_DOKSCANDATUM, theClass.ATTR_STAPELNAME, theClass.ATTR_LEISTUNGSART, theClass.ATTR_SCHLAGWORT, theClass.ATTR_KURZTEXT, theClass.ATTR_KOMMENTAR, theClass.ATTR_ANMELDENUMMER, theClass.ATTR_FORMULAREMPFAENGER];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_DOKUMENTENID, theClass.ATTR_DOCUMENTENNUMMER, theClass.ATTR_DOCUMENTENART, theClass.ATTR_DOKSCHUTZ, theClass.ATTR_DOKEINGANGSDATUM, theClass.ATTR_DOKSCANDATUM, theClass.ATTR_STAPELNAME, theClass.ATTR_LEISTUNGSART, theClass.ATTR_SCHLAGWORT, theClass.ATTR_KURZTEXT, theClass.ATTR_KOMMENTAR, theClass.ATTR_ANMELDENUMMER, theClass.ATTR_FORMULAREMPFAENGER];

theClass.getName = function() {
    return "saveDataCaseXSD.bw.test.poc.tibco.com.dokument";
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
		throw("Attribute " + attName + " not recognized for class saveDataCaseXSD.bw.test.poc.tibco.com.dokument");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument");
};

theClass.prototype.getDokumentenID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_DOKUMENTENID, useInternal);
};

theClass.prototype.setDokumentenID = function(dokumentenID) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_DOKUMENTENID, dokumentenID);
};


theClass.prototype.getDocumentenNummer = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_DOCUMENTENNUMMER, useInternal);
};

theClass.prototype.setDocumentenNummer = function(documentenNummer) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_DOCUMENTENNUMMER, documentenNummer);
};


theClass.prototype.getDocumentenArt = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_DOCUMENTENART, useInternal);
};

theClass.prototype.setDocumentenArt = function(documentenArt) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_DOCUMENTENART, documentenArt);
};


theClass.prototype.getDokSchutz = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_DOKSCHUTZ, useInternal);
};

theClass.prototype.setDokSchutz = function(dokSchutz) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_DOKSCHUTZ, dokSchutz);
};


theClass.prototype.getDokEingangsDatum = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_DOKEINGANGSDATUM, useInternal);
};

theClass.prototype.setDokEingangsDatum = function(dokEingangsDatum) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_DOKEINGANGSDATUM, dokEingangsDatum);
};


theClass.prototype.getDokScanDatum = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_DOKSCANDATUM, useInternal);
};

theClass.prototype.setDokScanDatum = function(dokScanDatum) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_DOKSCANDATUM, dokScanDatum);
};


theClass.prototype.getStapelname = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_STAPELNAME, useInternal);
};

theClass.prototype.setStapelname = function(stapelname) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_STAPELNAME, stapelname);
};


theClass.prototype.getLeistungsArt = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_LEISTUNGSART, useInternal);
};

theClass.prototype.setLeistungsArt = function(leistungsArt) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_LEISTUNGSART, leistungsArt);
};


theClass.prototype.getSchlagwort = function(useInternal) {
    return this._getPrimitiveArrayAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_SCHLAGWORT, useInternal);
};

theClass.prototype.setSchlagwort = function(schlagwort) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_SCHLAGWORT, schlagwort);
};


theClass.prototype.getKurztext = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_KURZTEXT, useInternal);
};

theClass.prototype.setKurztext = function(kurztext) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_KURZTEXT, kurztext);
};


theClass.prototype.getKommentar = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_KOMMENTAR, useInternal);
};

theClass.prototype.setKommentar = function(kommentar) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_KOMMENTAR, kommentar);
};


theClass.prototype.getAnmeldenummer = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_ANMELDENUMMER, useInternal);
};

theClass.prototype.setAnmeldenummer = function(anmeldenummer) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_ANMELDENUMMER, anmeldenummer);
};


theClass.prototype.getFormularempfaenger = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_FORMULAREMPFAENGER, useInternal);
};

theClass.prototype.setFormularempfaenger = function(formularempfaenger) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.dokument").ATTR_FORMULAREMPFAENGER, formularempfaenger);
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

com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.dokument"]();
