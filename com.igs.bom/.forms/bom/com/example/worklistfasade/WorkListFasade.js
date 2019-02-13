/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.worklistfasade.WorkListFasade. 
 */ 


com.tibco.data.Loader.classDefiner["com.example.worklistfasade.WorkListFasade"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.example.worklistfasade.WorkListFasade");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_VERSICHNR = "versichNr";
theClass.ATTR_PERSONENID = "personenID";
theClass.ATTR_VERSNACHNAME = "versNachname";
theClass.ATTR_WIEDERVORLAGEDATUM = "wiedervorlagedatum";
theClass.ATTR_DOKEINGANGSDATUM = "dokEingangsdatum";
theClass.ATTR_AKTUELLEBEARBEITER = "aktuelleBearbeiter";
theClass.ATTR_ANMELDENR = "anmeldeNr";
theClass.ATTR_ZUSATZBEZEICHNUNG = "zusatzbezeichnung";
theClass.ATTR_ABRECHNR = "abrechNr";
theClass.ATTR_UNTERNEHMENSID = "unternehmensID";
theClass.ATTR_VERSVORNAME = "versVorname";
theClass.ATTR_DOKUMENTENART = "dokumentenArt";
theClass.ATTR_PROZESSSTATUS = "prozessstatus";
theClass.ATTR_GESCHAEFTSFALLNR = "geschaeftsfallNr";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_VERSICHNR] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PERSONENID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_VERSNACHNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_WIEDERVORLAGEDATUM] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOKEINGANGSDATUM] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_AKTUELLEBEARBEITER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ANMELDENR] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ZUSATZBEZEICHNUNG] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ABRECHNR] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_UNTERNEHMENSID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_VERSVORNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOKUMENTENART] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PROZESSSTATUS] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_GESCHAEFTSFALLNR] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_VERSICHNR, theClass.ATTR_PERSONENID, theClass.ATTR_VERSNACHNAME, theClass.ATTR_WIEDERVORLAGEDATUM, theClass.ATTR_DOKEINGANGSDATUM, theClass.ATTR_AKTUELLEBEARBEITER, theClass.ATTR_ANMELDENR, theClass.ATTR_ZUSATZBEZEICHNUNG, theClass.ATTR_ABRECHNR, theClass.ATTR_UNTERNEHMENSID, theClass.ATTR_VERSVORNAME, theClass.ATTR_DOKUMENTENART, theClass.ATTR_PROZESSSTATUS, theClass.ATTR_GESCHAEFTSFALLNR];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_VERSICHNR, theClass.ATTR_PERSONENID, theClass.ATTR_VERSNACHNAME, theClass.ATTR_WIEDERVORLAGEDATUM, theClass.ATTR_DOKEINGANGSDATUM, theClass.ATTR_AKTUELLEBEARBEITER, theClass.ATTR_ANMELDENR, theClass.ATTR_ZUSATZBEZEICHNUNG, theClass.ATTR_ABRECHNR, theClass.ATTR_UNTERNEHMENSID, theClass.ATTR_VERSVORNAME, theClass.ATTR_DOKUMENTENART, theClass.ATTR_PROZESSSTATUS, theClass.ATTR_GESCHAEFTSFALLNR];

theClass.getName = function() {
    return "com.example.worklistfasade.WorkListFasade";
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
		throw("Attribute " + attName + " not recognized for class com.example.worklistfasade.WorkListFasade");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.worklistfasade.WorkListFasade");
};

theClass.prototype.getVersichNr = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_VERSICHNR, useInternal);
};

theClass.prototype.setVersichNr = function(versichNr) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_VERSICHNR, versichNr);
};


theClass.prototype.getPersonenID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_PERSONENID, useInternal);
};

theClass.prototype.setPersonenID = function(personenID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_PERSONENID, personenID);
};


theClass.prototype.getVersNachname = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_VERSNACHNAME, useInternal);
};

theClass.prototype.setVersNachname = function(versNachname) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_VERSNACHNAME, versNachname);
};


theClass.prototype.getWiedervorlagedatum = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_WIEDERVORLAGEDATUM, useInternal);
};

theClass.prototype.setWiedervorlagedatum = function(wiedervorlagedatum) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_WIEDERVORLAGEDATUM, wiedervorlagedatum);
};


theClass.prototype.getDokEingangsdatum = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_DOKEINGANGSDATUM, useInternal);
};

theClass.prototype.setDokEingangsdatum = function(dokEingangsdatum) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_DOKEINGANGSDATUM, dokEingangsdatum);
};


theClass.prototype.getAktuelleBearbeiter = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_AKTUELLEBEARBEITER, useInternal);
};

theClass.prototype.setAktuelleBearbeiter = function(aktuelleBearbeiter) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_AKTUELLEBEARBEITER, aktuelleBearbeiter);
};


theClass.prototype.getAnmeldeNr = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_ANMELDENR, useInternal);
};

theClass.prototype.setAnmeldeNr = function(anmeldeNr) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_ANMELDENR, anmeldeNr);
};


theClass.prototype.getZusatzbezeichnung = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_ZUSATZBEZEICHNUNG, useInternal);
};

theClass.prototype.setZusatzbezeichnung = function(zusatzbezeichnung) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_ZUSATZBEZEICHNUNG, zusatzbezeichnung);
};


theClass.prototype.getAbrechNr = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_ABRECHNR, useInternal);
};

theClass.prototype.setAbrechNr = function(abrechNr) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_ABRECHNR, abrechNr);
};


theClass.prototype.getUnternehmensID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_UNTERNEHMENSID, useInternal);
};

theClass.prototype.setUnternehmensID = function(unternehmensID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_UNTERNEHMENSID, unternehmensID);
};


theClass.prototype.getVersVorname = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_VERSVORNAME, useInternal);
};

theClass.prototype.setVersVorname = function(versVorname) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_VERSVORNAME, versVorname);
};


theClass.prototype.getDokumentenArt = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_DOKUMENTENART, useInternal);
};

theClass.prototype.setDokumentenArt = function(dokumentenArt) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_DOKUMENTENART, dokumentenArt);
};


theClass.prototype.getProzessstatus = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_PROZESSSTATUS, useInternal);
};

theClass.prototype.setProzessstatus = function(prozessstatus) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_PROZESSSTATUS, prozessstatus);
};


theClass.prototype.getGeschaeftsfallNr = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_GESCHAEFTSFALLNR, useInternal);
};

theClass.prototype.setGeschaeftsfallNr = function(geschaeftsfallNr) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.worklistfasade.WorkListFasade").ATTR_GESCHAEFTSFALLNR, geschaeftsfallNr);
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

com.tibco.data.Loader.classDefiner["com.example.worklistfasade.WorkListFasade"]();
