/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall. 
 */ 


com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall"] = function() {

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
theClass.LOADER.registerClass(theClass, "saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_PKID = "PKID";
theClass.ATTR_GESCHAEFTSFALLNUMMER = "geschaeftsfallNummer";
theClass.ATTR_DRINGEND = "dringend";
theClass.ATTR_BEARBEITER = "bearbeiter";
theClass.ATTR_WORKFLOWDATUM = "workflowDatum";
theClass.ATTR_PKNACHRICHT = "PKNachricht";
theClass.ATTR_ABSENDERNAME = "absenderName";
theClass.ATTR_BESITZERNAME = "besitzerName";
theClass.ATTR_WORKFLOWSTATUS = "workflowStatus";
theClass.ATTR_BEARBEITUNGSGRUND = "bearbeitungsGrund";
theClass.ATTR_RUECKMELDUNG = "rueckmeldung";
theClass.ATTR_TYPNUMMER = "typNummer";
theClass.ATTR_TYPBEZEICHNUNG = "typBezeichnung";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_PKID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_GESCHAEFTSFALLNUMMER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DRINGEND] = {type:"BomPrimitiveTypes.Boolean", baseType:"BomPrimitiveTypes.Boolean", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_BEARBEITER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_WORKFLOWDATUM] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PKNACHRICHT] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ABSENDERNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_BESITZERNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_WORKFLOWSTATUS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_BEARBEITUNGSGRUND] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_RUECKMELDUNG] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TYPNUMMER] = {type:"BomPrimitiveTypes.Integer", baseType:"BomPrimitiveTypes.Integer", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TYPBEZEICHNUNG] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_PKID, theClass.ATTR_GESCHAEFTSFALLNUMMER, theClass.ATTR_DRINGEND, theClass.ATTR_BEARBEITER, theClass.ATTR_WORKFLOWDATUM, theClass.ATTR_PKNACHRICHT, theClass.ATTR_ABSENDERNAME, theClass.ATTR_BESITZERNAME, theClass.ATTR_WORKFLOWSTATUS, theClass.ATTR_BEARBEITUNGSGRUND, theClass.ATTR_RUECKMELDUNG, theClass.ATTR_TYPNUMMER, theClass.ATTR_TYPBEZEICHNUNG];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_PKID, theClass.ATTR_GESCHAEFTSFALLNUMMER, theClass.ATTR_DRINGEND, theClass.ATTR_BEARBEITER, theClass.ATTR_WORKFLOWDATUM, theClass.ATTR_PKNACHRICHT, theClass.ATTR_ABSENDERNAME, theClass.ATTR_BESITZERNAME, theClass.ATTR_WORKFLOWSTATUS, theClass.ATTR_BEARBEITUNGSGRUND, theClass.ATTR_RUECKMELDUNG, theClass.ATTR_TYPNUMMER, theClass.ATTR_TYPBEZEICHNUNG];

theClass.getName = function() {
    return "saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall";
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
		throw("Attribute " + attName + " not recognized for class saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall");
};

theClass.prototype.getPKID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_PKID, useInternal);
};

theClass.prototype.setPKID = function(PKID) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_PKID, PKID);
};


theClass.prototype.getGeschaeftsfallNummer = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_GESCHAEFTSFALLNUMMER, useInternal);
};

theClass.prototype.setGeschaeftsfallNummer = function(geschaeftsfallNummer) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_GESCHAEFTSFALLNUMMER, geschaeftsfallNummer);
};


theClass.prototype.getDringend = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_DRINGEND, useInternal);
};

theClass.prototype.setDringend = function(dringend) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_DRINGEND, dringend);
};


theClass.prototype.getBearbeiter = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_BEARBEITER, useInternal);
};

theClass.prototype.setBearbeiter = function(bearbeiter) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_BEARBEITER, bearbeiter);
};


theClass.prototype.getWorkflowDatum = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_WORKFLOWDATUM, useInternal);
};

theClass.prototype.setWorkflowDatum = function(workflowDatum) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_WORKFLOWDATUM, workflowDatum);
};


theClass.prototype.getPKNachricht = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_PKNACHRICHT, useInternal);
};

theClass.prototype.setPKNachricht = function(PKNachricht) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_PKNACHRICHT, PKNachricht);
};


theClass.prototype.getAbsenderName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_ABSENDERNAME, useInternal);
};

theClass.prototype.setAbsenderName = function(absenderName) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_ABSENDERNAME, absenderName);
};


theClass.prototype.getBesitzerName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_BESITZERNAME, useInternal);
};

theClass.prototype.setBesitzerName = function(besitzerName) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_BESITZERNAME, besitzerName);
};


theClass.prototype.getWorkflowStatus = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_WORKFLOWSTATUS, useInternal);
};

theClass.prototype.setWorkflowStatus = function(workflowStatus) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_WORKFLOWSTATUS, workflowStatus);
};


theClass.prototype.getBearbeitungsGrund = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_BEARBEITUNGSGRUND, useInternal);
};

theClass.prototype.setBearbeitungsGrund = function(bearbeitungsGrund) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_BEARBEITUNGSGRUND, bearbeitungsGrund);
};


theClass.prototype.getRueckmeldung = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_RUECKMELDUNG, useInternal);
};

theClass.prototype.setRueckmeldung = function(rueckmeldung) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_RUECKMELDUNG, rueckmeldung);
};


theClass.prototype.getTypNummer = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_TYPNUMMER, useInternal);
};

theClass.prototype.setTypNummer = function(typNummer) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_TYPNUMMER, typNummer);
};


theClass.prototype.getTypBezeichnung = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_TYPBEZEICHNUNG, useInternal);
};

theClass.prototype.setTypBezeichnung = function(typBezeichnung) {
    this._setPrimitiveAttribute(this.loader.getClass("saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall").ATTR_TYPBEZEICHNUNG, typBezeichnung);
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

com.tibco.data.Loader.classDefiner["saveDataCaseXSD.bw.test.poc.tibco.com.geschaeftsfall"]();
