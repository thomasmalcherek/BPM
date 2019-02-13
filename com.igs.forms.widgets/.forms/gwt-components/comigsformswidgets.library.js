if (typeof(com) == 'undefined') com = new Object();
if (typeof(com.tibco) == 'undefined') com.tibco = new Object();
if (typeof(com.tibco.forms) == 'undefined') com.tibco.forms = new Object();
if (typeof(com.tibco.forms.custom) == 'undefined') com.tibco.forms.custom = new Object();
if (typeof(com.tibco.forms.custom.Library) == 'undefined') com.tibco.forms.custom.Library = new Object();
if (typeof(com.tibco.forms.custom.Library['comigsformswidgets']) == 'undefined') {
	var library = new Object();
	var err = tibcoforms.bridge.log_error;
	com.tibco.forms.custom.Library['comigsformswidgets'] = library;
	library['ComponentTypes'] = new Object();
    var compType = new Object();
	compType['create'] = function() {
	   try {
		   return new comigsformswidgets.library.NavigationWidgetWrapper();
	   } catch(e) { err("ERR_2001: " + e); throw e; }
	}
	compType['isReady'] = function() {
	   try {
	       if(comigsformswidgets.library.NavigationWidgetWrapper.isReady)
	           return comigsformswidgets.library.NavigationWidgetWrapper.isReady();
	       else
	           return true;
	   } catch(e) { err("ERR_2002: " + e); throw e; }
	}
	compType['compare'] = function(elem1, elem2) {
	   try {
	       if(comigsformswidgets.library.NavigationWidgetWrapper.compare)
	           return comigsformswidgets.library.NavigationWidgetWrapper.compare(elem1, elem2);
	       else
	           return true;
	   } catch(e) { err("ERR_2003: " + e); throw e; }
	}
	compType['renderStatic'] = function(value, label, hint, controlId, formId, labelId, propertySet, resources, textOnly, parentPaneType, logger) {
	   try {
	       if(comigsformswidgets.library.NavigationWidgetWrapper.renderStatic)
	           return comigsformswidgets.library.NavigationWidgetWrapper.renderStatic(value, label, hint, controlId, formId, labelId, propertySet, resources, textOnly, parentPaneType, logger);
	       else
	           return "";
	   } catch(e) { err("ERR_2004: " + e); throw e; }
	}
	library['ComponentTypes']['NavigationWidget'] = compType;
	compType.RENDER_MODES = "10000"; 
	compType.CUSTOM_PROPERTIES = new Object();
	compType.PROPERTY_NAMES = [];
	compType.PRIMITIVE_PROPERTY_NAMES = [];
	compType.COMPOSITE_PROPERTY_NAMES = [];
    compType.CAPABILITIES="101010010110100001";            var compType = new Object();
	compType['create'] = function() {
	   try {
		   return new comigsformswidgets.library.DocumentListWidgetWrapper();
	   } catch(e) { err("ERR_2001: " + e); throw e; }
	}
	compType['isReady'] = function() {
	   try {
	       if(comigsformswidgets.library.DocumentListWidgetWrapper.isReady)
	           return comigsformswidgets.library.DocumentListWidgetWrapper.isReady();
	       else
	           return true;
	   } catch(e) { err("ERR_2002: " + e); throw e; }
	}
	compType['compare'] = function(elem1, elem2) {
	   try {
	       if(comigsformswidgets.library.DocumentListWidgetWrapper.compare)
	           return comigsformswidgets.library.DocumentListWidgetWrapper.compare(elem1, elem2);
	       else
	           return true;
	   } catch(e) { err("ERR_2003: " + e); throw e; }
	}
	compType['renderStatic'] = function(value, label, hint, controlId, formId, labelId, propertySet, resources, textOnly, parentPaneType, logger) {
	   try {
	       if(comigsformswidgets.library.DocumentListWidgetWrapper.renderStatic)
	           return comigsformswidgets.library.DocumentListWidgetWrapper.renderStatic(value, label, hint, controlId, formId, labelId, propertySet, resources, textOnly, parentPaneType, logger);
	       else
	           return "";
	   } catch(e) { err("ERR_2004: " + e); throw e; }
	}
	library['ComponentTypes']['DocumentListWidget'] = compType;
	compType.RENDER_MODES = "10000"; 
	compType.CUSTOM_PROPERTIES = new Object();
	compType.PROPERTY_NAMES = [];
	compType.PRIMITIVE_PROPERTY_NAMES = [];
	compType.COMPOSITE_PROPERTY_NAMES = [];
    compType.CAPABILITIES="101010010110100001";	    var libraryExtRes = new Object();
	library['ExternalResources'] = libraryExtRes;
	libraryExtRes.RESOURCES = new Array();
	libraryExtRes.RESOURCES.push({"name":"resource_comigsformswidgets.jquery", "uri":"frameworks/jquery-3.3.1.js"});
	libraryExtRes.RESOURCES.push({"name":"resource_comigsformswidgets.jqueryui", "uri":"frameworks/jquery-ui.min.js"});
	libraryExtRes.RESOURCES.push({"name":"resource_comigsformswidgets.NavigationWidgetWrapper", "uri":"widget-js/NavigationWidgetWrapper.js"});
	libraryExtRes.RESOURCES.push({"name":"resource_comigsformswidgets.DocumentListWidgetWrapper", "uri":"widget-js/DocumentListWidgetWrapper.js"});
	libraryExtRes.RESOURCES.push({"name":"resource_comigsformswidgets.jsgrid", "uri":"frameworks/jsgrid.min.js"});
	libraryExtRes.RESOURCES.push({"name":"resource_comigsformswidgets.jsgridcss", "uri":"frameworks/jsgrid.min.css"});
}
