/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.tibco.bwse.simpleaddresslookup.OutputType. 
 */ 


com.tibco.data.Loader.classDefiner["com.tibco.bwse.simpleaddresslookup.OutputType"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.tibco.bwse.simpleaddresslookup.OutputType");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_ADDRESSLINE1 = "addressLine1";
theClass.ATTR_ADDRESSLINE2 = "addressLine2";
theClass.ATTR_CITY = "city";
theClass.ATTR_COUNTRY = "country";
theClass.ATTR_PROVINCE = "province";
theClass.ATTR_POSTALCODE = "postalCode";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_ADDRESSLINE1] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_ADDRESSLINE2] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_CITY] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_COUNTRY] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_PROVINCE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_POSTALCODE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_ADDRESSLINE1, theClass.ATTR_ADDRESSLINE2, theClass.ATTR_CITY, theClass.ATTR_COUNTRY, theClass.ATTR_PROVINCE, theClass.ATTR_POSTALCODE];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_ADDRESSLINE1, theClass.ATTR_ADDRESSLINE2, theClass.ATTR_CITY, theClass.ATTR_COUNTRY, theClass.ATTR_PROVINCE, theClass.ATTR_POSTALCODE];

theClass.getName = function() {
    return "com.tibco.bwse.simpleaddresslookup.OutputType";
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
		throw("Attribute " + attName + " not recognized for class com.tibco.bwse.simpleaddresslookup.OutputType");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType");
};

theClass.prototype.getAddressLine1 = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType").ATTR_ADDRESSLINE1, useInternal);
};

theClass.prototype.setAddressLine1 = function(addressLine1) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType").ATTR_ADDRESSLINE1, addressLine1);
};


theClass.prototype.getAddressLine2 = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType").ATTR_ADDRESSLINE2, useInternal);
};

theClass.prototype.setAddressLine2 = function(addressLine2) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType").ATTR_ADDRESSLINE2, addressLine2);
};


theClass.prototype.getCity = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType").ATTR_CITY, useInternal);
};

theClass.prototype.setCity = function(city) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType").ATTR_CITY, city);
};


theClass.prototype.getCountry = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType").ATTR_COUNTRY, useInternal);
};

theClass.prototype.setCountry = function(country) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType").ATTR_COUNTRY, country);
};


theClass.prototype.getProvince = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType").ATTR_PROVINCE, useInternal);
};

theClass.prototype.setProvince = function(province) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType").ATTR_PROVINCE, province);
};


theClass.prototype.getPostalCode = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType").ATTR_POSTALCODE, useInternal);
};

theClass.prototype.setPostalCode = function(postalCode) {
    this._setPrimitiveAttribute(this.loader.getClass("com.tibco.bwse.simpleaddresslookup.OutputType").ATTR_POSTALCODE, postalCode);
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

com.tibco.data.Loader.classDefiner["com.tibco.bwse.simpleaddresslookup.OutputType"]();
