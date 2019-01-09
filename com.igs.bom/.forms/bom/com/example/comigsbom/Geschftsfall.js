/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.comigsbom.Geschftsfall. 
 */ 


com.tibco.data.Loader.classDefiner["com.example.comigsbom.Geschftsfall"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.example.comigsbom.Geschftsfall");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_PKID = "PKID";
theClass.ATTR_PROCESSNUMBER = "processNumber";
theClass.ATTR_URGENT = "urgent";
theClass.ATTR_PROCESSUSER = "processUser";
theClass.ATTR_WORKFLOWDATE = "workflowDate";
theClass.ATTR_MESSAGEPK = "messagePK";
theClass.ATTR_SENDERNAME = "senderName";
theClass.ATTR_OWNERNAME = "ownerName";
theClass.ATTR_WORKFLOWSTATE = "workflowState";
theClass.ATTR_HANDLINGREASON = "handlingReason";
theClass.ATTR_FEEDBACK = "feedback";
theClass.ATTR_TYPNUMMER = "typNummer";
theClass.ATTR_TYPBEZEICHNUNG = "typBezeichnung";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_PKID] = {type:"BomPrimitiveTypes.ID", baseType:"BomPrimitiveTypes.ID", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PROCESSNUMBER] = {type:"BomPrimitiveTypes.Integer", baseType:"BomPrimitiveTypes.Integer", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_URGENT] = {type:"BomPrimitiveTypes.Boolean", baseType:"BomPrimitiveTypes.Boolean", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PROCESSUSER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_WORKFLOWDATE] = {type:"BomPrimitiveTypes.DateTime", baseType:"BomPrimitiveTypes.DateTime", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_MESSAGEPK] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SENDERNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_OWNERNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_WORKFLOWSTATE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_HANDLINGREASON] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_FEEDBACK] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TYPNUMMER] = {type:"BomPrimitiveTypes.Integer", baseType:"BomPrimitiveTypes.Integer", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TYPBEZEICHNUNG] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_PKID, theClass.ATTR_PROCESSNUMBER, theClass.ATTR_URGENT, theClass.ATTR_PROCESSUSER, theClass.ATTR_WORKFLOWDATE, theClass.ATTR_MESSAGEPK, theClass.ATTR_SENDERNAME, theClass.ATTR_OWNERNAME, theClass.ATTR_WORKFLOWSTATE, theClass.ATTR_HANDLINGREASON, theClass.ATTR_FEEDBACK, theClass.ATTR_TYPNUMMER, theClass.ATTR_TYPBEZEICHNUNG];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_PKID, theClass.ATTR_PROCESSNUMBER, theClass.ATTR_URGENT, theClass.ATTR_PROCESSUSER, theClass.ATTR_WORKFLOWDATE, theClass.ATTR_MESSAGEPK, theClass.ATTR_SENDERNAME, theClass.ATTR_OWNERNAME, theClass.ATTR_WORKFLOWSTATE, theClass.ATTR_HANDLINGREASON, theClass.ATTR_FEEDBACK, theClass.ATTR_TYPNUMMER, theClass.ATTR_TYPBEZEICHNUNG];

theClass.getName = function() {
    return "com.example.comigsbom.Geschftsfall";
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
		throw("Attribute " + attName + " not recognized for class com.example.comigsbom.Geschftsfall");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.comigsbom.Geschftsfall");
};

theClass.prototype.getPKID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_PKID, useInternal);
};

theClass.prototype.setPKID = function(PKID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_PKID, PKID);
};


theClass.prototype.getProcessNumber = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_PROCESSNUMBER, useInternal);
};

theClass.prototype.setProcessNumber = function(processNumber) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_PROCESSNUMBER, processNumber);
};


theClass.prototype.getUrgent = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_URGENT, useInternal);
};

theClass.prototype.setUrgent = function(urgent) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_URGENT, urgent);
};


theClass.prototype.getProcessUser = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_PROCESSUSER, useInternal);
};

theClass.prototype.setProcessUser = function(processUser) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_PROCESSUSER, processUser);
};


theClass.prototype.getWorkflowDate = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_WORKFLOWDATE, useInternal);
};

theClass.prototype.setWorkflowDate = function(workflowDate) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_WORKFLOWDATE, workflowDate);
};


theClass.prototype.getMessagePK = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_MESSAGEPK, useInternal);
};

theClass.prototype.setMessagePK = function(messagePK) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_MESSAGEPK, messagePK);
};


theClass.prototype.getSenderName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_SENDERNAME, useInternal);
};

theClass.prototype.setSenderName = function(senderName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_SENDERNAME, senderName);
};


theClass.prototype.getOwnerName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_OWNERNAME, useInternal);
};

theClass.prototype.setOwnerName = function(ownerName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_OWNERNAME, ownerName);
};


theClass.prototype.getWorkflowState = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_WORKFLOWSTATE, useInternal);
};

theClass.prototype.setWorkflowState = function(workflowState) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_WORKFLOWSTATE, workflowState);
};


theClass.prototype.getHandlingReason = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_HANDLINGREASON, useInternal);
};

theClass.prototype.setHandlingReason = function(handlingReason) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_HANDLINGREASON, handlingReason);
};


theClass.prototype.getFeedback = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_FEEDBACK, useInternal);
};

theClass.prototype.setFeedback = function(feedback) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_FEEDBACK, feedback);
};


theClass.prototype.getTypNummer = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_TYPNUMMER, useInternal);
};

theClass.prototype.setTypNummer = function(typNummer) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_TYPNUMMER, typNummer);
};


theClass.prototype.getTypBezeichnung = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_TYPBEZEICHNUNG, useInternal);
};

theClass.prototype.setTypBezeichnung = function(typBezeichnung) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Geschftsfall").ATTR_TYPBEZEICHNUNG, typBezeichnung);
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

com.tibco.data.Loader.classDefiner["com.example.comigsbom.Geschftsfall"]();
