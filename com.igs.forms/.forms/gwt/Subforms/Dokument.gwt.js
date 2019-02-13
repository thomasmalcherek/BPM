

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_Iz0fIC94Eem8NYwCvBPJhw'] = new Object();
tibcoforms.formCode['_Iz0fIC94Eem8NYwCvBPJhw']['defineActions'] = function() {
var fc = tibcoforms.formCode['_Iz0fIC94Eem8NYwCvBPJhw'];
	fc['action_cancel'] = function(context, data, pane, control, factory, pkg, f , p) {
		context.form.invokeAction('cancel');
	}

	fc['action_apply'] = function(context, data, pane, control, factory, pkg, f , p) {
		context.form.invokeAction('apply');
	}
	
	fc['action_close'] = function(context, data, pane, control, factory, pkg, f , p) {
		context.form.invokeAction('close');
	}

	fc['action_submit'] = function(context, data, pane, control, factory, pkg, f , p) {
		context.form.invokeAction('submit');
	}
	
	fc['action_validate'] = function(context, data, pane, control, factory, pkg, f , p) {
		context.form.invokeAction('validate');
    }
    
    fc['action_reset'] = function(context, data, pane, control, factory, pkg, f , p) {
    	context.form.invokeAction('reset');
    }
    
    fc['generator_info'] = function() {
        return "TIBCO Forms 4.1.0 V17 compliant";
    }
};
tibcoforms.formCode['_Iz0fIC94Eem8NYwCvBPJhw']['defineActions']();

tibcoforms.formCode['_Iz0fIC94Eem8NYwCvBPJhw']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_Iz0fIC94Eem8NYwCvBPJhw'];
	
fc['validation_dokument_kommentar_dokument_kommentar__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_kommentar: dokument_kommentar__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_kommentar__length", true, true);
}
	
fc['validation_dokument_documentType_dokument_documentType__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentType: dokument_documentType__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentType__length", true, true);
}
	
fc['validation_dokument_effortType_dokument_effortType__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_effortType: dokument_effortType__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_effortType__length", true, true);
}
	
fc['validation_dokument_documentScanDate_dokument_documentScanDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentScanDate: dokument_documentScanDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentScanDate__datetime", true, true);
}
	
	
fc['validation_dokument_documentNumber_dokument_documentNumber__integer'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'if (typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\') {\
  \ntibco.forms.Util.checkInteger(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue) ? true :  [context.control.getLabel()]} else {\
  \nvar regex = new RegExp(\"^-?[0-9]+$\");\
  \nregex.test(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue);}';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentNumber: dokument_documentNumber__integer", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentNumber__integer", true, true);
}
fc['validation_dokument_documentNumber_dokument_documentNumber__lowerLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkLowerLimit(context.stringValue, \'-2147483648\', true) ? true : [context.control.getLabel(), \'-2147483648\'] : isNaN(context.value) || context.value.valueOf() >= -2147483648;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentNumber: dokument_documentNumber__lowerLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentNumber__lowerLimit", true, true);
}
fc['validation_dokument_documentNumber_dokument_documentNumber__upperLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkUpperLimit(context.stringValue, \'2147483647\', true) ? true : [context.control.getLabel(), \'2147483647\'] : isNaN(context.value) || context.value.valueOf() <= 2147483647;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentNumber: dokument_documentNumber__upperLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentNumber__upperLimit", true, true);
}
	
fc['validation_dokument_keyword_dokument_keyword__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_keyword: dokument_keyword__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_keyword__length", true, true);
}
fc['validation_dokument_keyword_dokument_keyword__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_keyword: dokument_keyword__multiplicity", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_keyword__multiplicity", true, true);
}
	
fc['validation_dokument_documentSecurity_dokument_documentSecurity__integer'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'if (typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\') {\
  \ntibco.forms.Util.checkInteger(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue) ? true :  [context.control.getLabel()]} else {\
  \nvar regex = new RegExp(\"^-?[0-9]+$\");\
  \nregex.test(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue);}';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentSecurity: dokument_documentSecurity__integer", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentSecurity__integer", true, true);
}
fc['validation_dokument_documentSecurity_dokument_documentSecurity__lowerLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkLowerLimit(context.stringValue, \'-2147483648\', true) ? true : [context.control.getLabel(), \'-2147483648\'] : isNaN(context.value) || context.value.valueOf() >= -2147483648;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentSecurity: dokument_documentSecurity__lowerLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentSecurity__lowerLimit", true, true);
}
fc['validation_dokument_documentSecurity_dokument_documentSecurity__upperLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkUpperLimit(context.stringValue, \'2147483647\', true) ? true : [context.control.getLabel(), \'2147483647\'] : isNaN(context.value) || context.value.valueOf() <= 2147483647;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentSecurity: dokument_documentSecurity__upperLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentSecurity__upperLimit", true, true);
}
	
fc['validation_dokument_kurztext_dokument_kurztext__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_kurztext: dokument_kurztext__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_kurztext__length", true, true);
}
	
fc['validation_dokument_formularempfnger_dokument_formularempfnger__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_formularempfnger: dokument_formularempfnger__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_formularempfnger__length", true, true);
}
	
fc['validation_dokument_dokumentID_dokument_dokumentID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_dokumentID: dokument_dokumentID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_dokumentID__length", true, true);
}
	
fc['validation_dokument_anmeldenummer_dokument_anmeldenummer__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_anmeldenummer: dokument_anmeldenummer__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_anmeldenummer__length", true, true);
}
	
fc['validation_dokument_stackName_dokument_stackName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_stackName: dokument_stackName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_stackName__length", true, true);
}
	
fc['validation_dokument_documentDateOfReceipt_dokument_documentDateOfReceipt__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentDateOfReceipt: dokument_documentDateOfReceipt__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentDateOfReceipt__datetime", true, true);
}
	fc['validate_required'] = function(formId, controlName, cloneUID, listIndex) {
	var context = new Object();
    var form = tibcoforms.formCache[formId];
	var logger = tibcoforms.bridge.log_logger();
	context.control = this;
    if (listIndex == -1) {
        context.value = context.control.getValue();
        if (context.control.getStringValue)
            context.stringValue = context.control.getStringValue();
    } else {
        context.value = context.control.getValue()[listIndex];
        if (context.control.getStringValue)
            context.stringValue = context.control.getStringValue()[listIndex];
    }
    if (context.value == null)
        context.value = '';
		var controlType = context.control.getControlType();
		var strContxtControlValue = context.control.getValue();
	    if (listIndex >= 0) {
	       strContxtControlValue = strContxtControlValue[listIndex];
	    }
	    return !(context.control.getRequired() && 
                 (strContxtControlValue == null || strContxtControlValue.toString().replace(/^\s+|\s+$/gm,'').length == 0) ||
                 (("com.tibco.forms.controls.checkbox" == controlType) && 'true' != strContxtControlValue.toString().toLowerCase()));
	}
	fc['register_pkgs_and_fcts'] = function(formId) {
	   var form = tibcoforms.formCache[formId];
	   form.registerPackages(['com.example.comigsbom.ComigsbomPackage']);
       form.registerFactories(['com.example.comigsbom.ComigsbomFactory']);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getDokument = function() {
			return this.form.dataMap['dokument'].getValue();
		};
		this.setDokument = function(value) {
			return this.form.dataMap['dokument'].setValue(value);
		};
	}
	   
};
tibcoforms.formCode['_Iz0fIC94Eem8NYwCvBPJhw']['defineValidations']();
