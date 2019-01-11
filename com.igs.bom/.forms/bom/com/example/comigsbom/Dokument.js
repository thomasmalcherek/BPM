/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.comigsbom.Dokument. 
 */ 


com.tibco.data.Loader.classDefiner["com.example.comigsbom.Dokument"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.example.comigsbom.Dokument");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_DOKUMENTID = "dokumentID";
theClass.ATTR_DOCUMENTNUMBER = "documentNumber";
theClass.ATTR_DOCUMENTTYPE = "documentType";
theClass.ATTR_DOCUMENTSECURITY = "documentSecurity";
theClass.ATTR_DOCUMENTDATEOFRECEIPT = "documentDateOfReceipt";
theClass.ATTR_DOCUMENTSCANDATE = "documentScanDate";
theClass.ATTR_STACKNAME = "stackName";
theClass.ATTR_EFFORTTYPE = "effortType";
theClass.ATTR_KEYWORD = "keyword";
theClass.ATTR_KURZTEXT = "kurztext";
theClass.ATTR_KOMMENTAR = "kommentar";
theClass.ATTR_ANMELDENUMMER = "anmeldenummer";
theClass.ATTR_FORMULAREMPFNGER = "formularempfnger";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_DOKUMENTID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOCUMENTNUMBER] = {type:"BomPrimitiveTypes.Integer", baseType:"BomPrimitiveTypes.Integer", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOCUMENTTYPE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOCUMENTSECURITY] = {type:"BomPrimitiveTypes.Integer", baseType:"BomPrimitiveTypes.Integer", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOCUMENTDATEOFRECEIPT] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DOCUMENTSCANDATE] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_STACKNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_EFFORTTYPE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_KEYWORD] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:true, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_KURZTEXT] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_KOMMENTAR] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ANMELDENUMMER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_FORMULAREMPFNGER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_DOKUMENTID, theClass.ATTR_DOCUMENTNUMBER, theClass.ATTR_DOCUMENTTYPE, theClass.ATTR_DOCUMENTSECURITY, theClass.ATTR_DOCUMENTDATEOFRECEIPT, theClass.ATTR_DOCUMENTSCANDATE, theClass.ATTR_STACKNAME, theClass.ATTR_EFFORTTYPE, theClass.ATTR_KEYWORD, theClass.ATTR_KURZTEXT, theClass.ATTR_KOMMENTAR, theClass.ATTR_ANMELDENUMMER, theClass.ATTR_FORMULAREMPFNGER];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_DOKUMENTID, theClass.ATTR_DOCUMENTNUMBER, theClass.ATTR_DOCUMENTTYPE, theClass.ATTR_DOCUMENTSECURITY, theClass.ATTR_DOCUMENTDATEOFRECEIPT, theClass.ATTR_DOCUMENTSCANDATE, theClass.ATTR_STACKNAME, theClass.ATTR_EFFORTTYPE, theClass.ATTR_KEYWORD, theClass.ATTR_KURZTEXT, theClass.ATTR_KOMMENTAR, theClass.ATTR_ANMELDENUMMER, theClass.ATTR_FORMULAREMPFNGER];

theClass.getName = function() {
    return "com.example.comigsbom.Dokument";
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
		throw("Attribute " + attName + " not recognized for class com.example.comigsbom.Dokument");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.comigsbom.Dokument");
};

theClass.prototype.getDokumentID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_DOKUMENTID, useInternal);
};

theClass.prototype.setDokumentID = function(dokumentID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_DOKUMENTID, dokumentID);
};


theClass.prototype.getDocumentNumber = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_DOCUMENTNUMBER, useInternal);
};

theClass.prototype.setDocumentNumber = function(documentNumber) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_DOCUMENTNUMBER, documentNumber);
};


theClass.prototype.getDocumentType = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_DOCUMENTTYPE, useInternal);
};

theClass.prototype.setDocumentType = function(documentType) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_DOCUMENTTYPE, documentType);
};


theClass.prototype.getDocumentSecurity = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_DOCUMENTSECURITY, useInternal);
};

theClass.prototype.setDocumentSecurity = function(documentSecurity) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_DOCUMENTSECURITY, documentSecurity);
};


theClass.prototype.getDocumentDateOfReceipt = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_DOCUMENTDATEOFRECEIPT, useInternal);
};

theClass.prototype.setDocumentDateOfReceipt = function(documentDateOfReceipt) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_DOCUMENTDATEOFRECEIPT, documentDateOfReceipt);
};


theClass.prototype.getDocumentScanDate = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_DOCUMENTSCANDATE, useInternal);
};

theClass.prototype.setDocumentScanDate = function(documentScanDate) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_DOCUMENTSCANDATE, documentScanDate);
};


theClass.prototype.getStackName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_STACKNAME, useInternal);
};

theClass.prototype.setStackName = function(stackName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_STACKNAME, stackName);
};


theClass.prototype.getEffortType = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_EFFORTTYPE, useInternal);
};

theClass.prototype.setEffortType = function(effortType) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_EFFORTTYPE, effortType);
};


theClass.prototype.getKeyword = function(useInternal) {
    return this._getPrimitiveArrayAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_KEYWORD, useInternal);
};

theClass.prototype.setKeyword = function(keyword) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_KEYWORD, keyword);
};


theClass.prototype.getKurztext = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_KURZTEXT, useInternal);
};

theClass.prototype.setKurztext = function(kurztext) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_KURZTEXT, kurztext);
};


theClass.prototype.getKommentar = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_KOMMENTAR, useInternal);
};

theClass.prototype.setKommentar = function(kommentar) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_KOMMENTAR, kommentar);
};


theClass.prototype.getAnmeldenummer = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_ANMELDENUMMER, useInternal);
};

theClass.prototype.setAnmeldenummer = function(anmeldenummer) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_ANMELDENUMMER, anmeldenummer);
};


theClass.prototype.getFormularempfnger = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_FORMULAREMPFNGER, useInternal);
};

theClass.prototype.setFormularempfnger = function(formularempfnger) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Dokument").ATTR_FORMULAREMPFNGER, formularempfnger);
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

com.tibco.data.Loader.classDefiner["com.example.comigsbom.Dokument"]();
