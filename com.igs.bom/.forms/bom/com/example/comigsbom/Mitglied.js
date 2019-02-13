/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.comigsbom.Mitglied. 
 */ 


com.tibco.data.Loader.classDefiner["com.example.comigsbom.Mitglied"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.example.comigsbom.Mitglied");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_MGPARTNERID = "MGPartnerID";
theClass.ATTR_ACCOUNTNUMBER = "accountNumber";
theClass.ATTR_COMPANYID = "companyID";
theClass.ATTR_NAME = "name";
theClass.ATTR_ADDITIONALNAME = "additionalName";
theClass.ATTR_FOUNDINGDATE = "foundingDate";
theClass.ATTR_ANMELDENUMMER = "anmeldenummer";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_MGPARTNERID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ACCOUNTNUMBER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_COMPANYID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_NAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ADDITIONALNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_FOUNDINGDATE] = {type:"BomPrimitiveTypes.Date", baseType:"BomPrimitiveTypes.Date", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ANMELDENUMMER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_MGPARTNERID, theClass.ATTR_ACCOUNTNUMBER, theClass.ATTR_COMPANYID, theClass.ATTR_NAME, theClass.ATTR_ADDITIONALNAME, theClass.ATTR_FOUNDINGDATE, theClass.ATTR_ANMELDENUMMER];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_MGPARTNERID, theClass.ATTR_ACCOUNTNUMBER, theClass.ATTR_COMPANYID, theClass.ATTR_NAME, theClass.ATTR_ADDITIONALNAME, theClass.ATTR_FOUNDINGDATE, theClass.ATTR_ANMELDENUMMER];

theClass.getName = function() {
    return "com.example.comigsbom.Mitglied";
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
		throw("Attribute " + attName + " not recognized for class com.example.comigsbom.Mitglied");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.comigsbom.Mitglied");
};

theClass.prototype.getMGPartnerID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_MGPARTNERID, useInternal);
};

theClass.prototype.setMGPartnerID = function(MGPartnerID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_MGPARTNERID, MGPartnerID);
};


theClass.prototype.getAccountNumber = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_ACCOUNTNUMBER, useInternal);
};

theClass.prototype.setAccountNumber = function(accountNumber) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_ACCOUNTNUMBER, accountNumber);
};


theClass.prototype.getCompanyID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_COMPANYID, useInternal);
};

theClass.prototype.setCompanyID = function(companyID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_COMPANYID, companyID);
};


theClass.prototype.getName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_NAME, useInternal);
};

theClass.prototype.setName = function(name) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_NAME, name);
};


theClass.prototype.getAdditionalName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_ADDITIONALNAME, useInternal);
};

theClass.prototype.setAdditionalName = function(additionalName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_ADDITIONALNAME, additionalName);
};


theClass.prototype.getFoundingDate = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_FOUNDINGDATE, useInternal);
};

theClass.prototype.setFoundingDate = function(foundingDate) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_FOUNDINGDATE, foundingDate);
};


theClass.prototype.getAnmeldenummer = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_ANMELDENUMMER, useInternal);
};

theClass.prototype.setAnmeldenummer = function(anmeldenummer) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Mitglied").ATTR_ANMELDENUMMER, anmeldenummer);
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

com.tibco.data.Loader.classDefiner["com.example.comigsbom.Mitglied"]();
