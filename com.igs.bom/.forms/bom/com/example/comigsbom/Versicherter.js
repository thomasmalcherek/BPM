/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.comigsbom.Versicherter. 
 */ 


com.tibco.data.Loader.classDefiner["com.example.comigsbom.Versicherter"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.example.comigsbom.Versicherter");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_VSPARTNERID = "VSPartnerID";
theClass.ATTR_SECURENUMBER = "secureNumber";
theClass.ATTR_PERSONID = "personID";
theClass.ATTR_LASTNAME = "lastName";
theClass.ATTR_FIRSTNAME = "firstName";
theClass.ATTR_TITLE = "title";
theClass.ATTR_DEGREE = "degree";
theClass.ATTR_GENDER = "gender";
theClass.ATTR_BIRTHDATE = "birthDate";
theClass.ATTR_SPRACHE = "sprache";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_VSPARTNERID] = {type:"BomPrimitiveTypes.ID", baseType:"BomPrimitiveTypes.ID", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SECURENUMBER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PERSONID] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_LASTNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_FIRSTNAME] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_TITLE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DEGREE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_GENDER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_BIRTHDATE] = {type:"BomPrimitiveTypes.Date", baseType:"BomPrimitiveTypes.Date", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_SPRACHE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_VSPARTNERID, theClass.ATTR_SECURENUMBER, theClass.ATTR_PERSONID, theClass.ATTR_LASTNAME, theClass.ATTR_FIRSTNAME, theClass.ATTR_TITLE, theClass.ATTR_DEGREE, theClass.ATTR_GENDER, theClass.ATTR_BIRTHDATE, theClass.ATTR_SPRACHE];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_VSPARTNERID, theClass.ATTR_SECURENUMBER, theClass.ATTR_PERSONID, theClass.ATTR_LASTNAME, theClass.ATTR_FIRSTNAME, theClass.ATTR_TITLE, theClass.ATTR_DEGREE, theClass.ATTR_GENDER, theClass.ATTR_BIRTHDATE, theClass.ATTR_SPRACHE];

theClass.getName = function() {
    return "com.example.comigsbom.Versicherter";
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
		throw("Attribute " + attName + " not recognized for class com.example.comigsbom.Versicherter");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.comigsbom.Versicherter");
};

theClass.prototype.getVSPartnerID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_VSPARTNERID, useInternal);
};

theClass.prototype.setVSPartnerID = function(VSPartnerID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_VSPARTNERID, VSPartnerID);
};


theClass.prototype.getSecureNumber = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_SECURENUMBER, useInternal);
};

theClass.prototype.setSecureNumber = function(secureNumber) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_SECURENUMBER, secureNumber);
};


theClass.prototype.getPersonID = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_PERSONID, useInternal);
};

theClass.prototype.setPersonID = function(personID) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_PERSONID, personID);
};


theClass.prototype.getLastName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_LASTNAME, useInternal);
};

theClass.prototype.setLastName = function(lastName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_LASTNAME, lastName);
};


theClass.prototype.getFirstName = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_FIRSTNAME, useInternal);
};

theClass.prototype.setFirstName = function(firstName) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_FIRSTNAME, firstName);
};


theClass.prototype.getTitle = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_TITLE, useInternal);
};

theClass.prototype.setTitle = function(title) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_TITLE, title);
};


theClass.prototype.getDegree = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_DEGREE, useInternal);
};

theClass.prototype.setDegree = function(degree) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_DEGREE, degree);
};


theClass.prototype.getGender = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_GENDER, useInternal);
};

theClass.prototype.setGender = function(gender) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_GENDER, gender);
};


theClass.prototype.getBirthDate = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_BIRTHDATE, useInternal);
};

theClass.prototype.setBirthDate = function(birthDate) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_BIRTHDATE, birthDate);
};


theClass.prototype.getSprache = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_SPRACHE, useInternal);
};

theClass.prototype.setSprache = function(sprache) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.comigsbom.Versicherter").ATTR_SPRACHE, sprache);
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

com.tibco.data.Loader.classDefiner["com.example.comigsbom.Versicherter"]();
