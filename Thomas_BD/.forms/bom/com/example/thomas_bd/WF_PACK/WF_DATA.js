/**
 * DO NOT EDIT: This is an automatically generated file.
 * This provides an implementation of the class com.example.thomas_bd.WF_PACK.WF_DATA. 
 */ 


com.tibco.data.Loader.classDefiner["com.example.thomas_bd.WF_PACK.WF_DATA"] = function() {

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
theClass.LOADER.registerClass(theClass, "com.example.thomas_bd.WF_PACK.WF_DATA");

com.tibco.data.Loader.extendClass(com.tibco.data.BomBase, theClass);

theClass.ATTR_HEADER = "HEADER";
theClass.ATTR_VALUE = "VALUE";
theClass.ATTR_DATE = "DATE";
theClass.ATTR_EXPLANATION = "EXPLANATION";
theClass.ATTR_POSTALCODE = "POSTALCODE";

theClass.TYPE_ARRAY = new Object();
theClass.TYPE_ARRAY[theClass.ATTR_HEADER] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_VALUE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_DATE] = {type:"BomPrimitiveTypes.Date", baseType:"BomPrimitiveTypes.Date", primitive:true, multivalued:false, required:true, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_EXPLANATION] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:false, defaultValue:""};
theClass.TYPE_ARRAY[theClass.ATTR_POSTALCODE] = {type:"BomPrimitiveTypes.Text", baseType:"BomPrimitiveTypes.Text", primitive:true, multivalued:false, required:true, defaultValue:""};

theClass.PRIMITIVE_ATTRIBUTE_NAMES = [theClass.ATTR_HEADER, theClass.ATTR_VALUE, theClass.ATTR_DATE, theClass.ATTR_EXPLANATION, theClass.ATTR_POSTALCODE];

theClass.COMPOSITE_ATTRIBUTE_NAMES = [];

theClass.ATTRIBUTE_NAMES = [theClass.ATTR_HEADER, theClass.ATTR_VALUE, theClass.ATTR_DATE, theClass.ATTR_EXPLANATION, theClass.ATTR_POSTALCODE];

theClass.getName = function() {
    return "com.example.thomas_bd.WF_PACK.WF_DATA";
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
		throw("Attribute " + attName + " not recognized for class com.example.thomas_bd.WF_PACK.WF_DATA");
	return attType;
};

theClass.prototype.getClass  = function() {
    return this.loader.getClass("com.example.thomas_bd.WF_PACK.WF_DATA");
};

theClass.prototype.getHEADER = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.thomas_bd.WF_PACK.WF_DATA").ATTR_HEADER, useInternal);
};

theClass.prototype.setHEADER = function(HEADER) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.thomas_bd.WF_PACK.WF_DATA").ATTR_HEADER, HEADER);
};


theClass.prototype.getVALUE = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.thomas_bd.WF_PACK.WF_DATA").ATTR_VALUE, useInternal);
};

theClass.prototype.setVALUE = function(VALUE) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.thomas_bd.WF_PACK.WF_DATA").ATTR_VALUE, VALUE);
};


theClass.prototype.getDATE = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.thomas_bd.WF_PACK.WF_DATA").ATTR_DATE, useInternal);
};

theClass.prototype.setDATE = function(DATE) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.thomas_bd.WF_PACK.WF_DATA").ATTR_DATE, DATE);
};


theClass.prototype.getEXPLANATION = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.thomas_bd.WF_PACK.WF_DATA").ATTR_EXPLANATION, useInternal);
};

theClass.prototype.setEXPLANATION = function(EXPLANATION) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.thomas_bd.WF_PACK.WF_DATA").ATTR_EXPLANATION, EXPLANATION);
};


theClass.prototype.getPOSTALCODE = function(useInternal) {
    return this._getPrimitiveAttribute(this.loader.getClass("com.example.thomas_bd.WF_PACK.WF_DATA").ATTR_POSTALCODE, useInternal);
};

theClass.prototype.setPOSTALCODE = function(POSTALCODE) {
    this._setPrimitiveAttribute(this.loader.getClass("com.example.thomas_bd.WF_PACK.WF_DATA").ATTR_POSTALCODE, POSTALCODE);
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

com.tibco.data.Loader.classDefiner["com.example.thomas_bd.WF_PACK.WF_DATA"]();
