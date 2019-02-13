

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_weaIkC95Eem8NYwCvBPJhw'] = new Object();
tibcoforms.formCode['_weaIkC95Eem8NYwCvBPJhw']['defineActions'] = function() {
var fc = tibcoforms.formCode['_weaIkC95Eem8NYwCvBPJhw'];
    fc['rule_cancel'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "cancel", "cancel", fc['action_cancel']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(cancel) Error: " + e);
	       throw e;
	   }
	}

    fc['rule_submit'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "submit", "submit", fc['action_submit']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(submit) Error: " + e);
	       throw e;
	   }
	}

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
tibcoforms.formCode['_weaIkC95Eem8NYwCvBPJhw']['defineActions']();

tibcoforms.formCode['_weaIkC95Eem8NYwCvBPJhw']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_weaIkC95Eem8NYwCvBPJhw'];
	
	
	
fc['validation_dokumentEmbedded__dokument_kurztext_dokument_kurztext__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_kurztext: dokument_kurztext__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_kurztext__length", true, true);
}
	
fc['validation_pane1__mitglied_accountNumber_mitglied_accountNumber__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_accountNumber: mitglied_accountNumber__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_accountNumber__length", true, true);
}
	
fc['validation_pane1__mitglied_name_mitglied_name__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_name: mitglied_name__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_name__length", true, true);
}
	
fc['validation_dokumentEmbedded__dokument_documentScanDate_dokument_documentScanDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_documentScanDate: dokument_documentScanDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentScanDate__datetime", true, true);
}
	
fc['validation_dokumentEmbedded__dokument_documentDateOfReceipt_dokument_documentDateOfReceipt__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_documentDateOfReceipt: dokument_documentDateOfReceipt__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentDateOfReceipt__datetime", true, true);
}
	
fc['validation_dokumentEmbedded__dokument_keyword_dokument_keyword__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_keyword: dokument_keyword__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_keyword__length", true, true);
}
fc['validation_dokumentEmbedded__dokument_keyword_dokument_keyword__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_keyword: dokument_keyword__multiplicity", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_keyword__multiplicity", true, true);
}
	
	
fc['validation_dokumentEmbedded__dokument_kommentar_dokument_kommentar__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_kommentar: dokument_kommentar__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_kommentar__length", true, true);
}
	
	
	
fc['validation_pane1__mitglied_foundingDate_mitglied_foundingDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_foundingDate: mitglied_foundingDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_foundingDate__datetime", true, true);
}
	
	
	
fc['validation_dokumentEmbedded__dokument_effortType_dokument_effortType__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_effortType: dokument_effortType__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_effortType__length", true, true);
}
	
	
fc['validation_dokumentEmbedded__dokument_documentType_dokument_documentType__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_documentType: dokument_documentType__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentType__length", true, true);
}
	
fc['validation_pane1__mitglied_additionalName_mitglied_additionalName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_additionalName: mitglied_additionalName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_additionalName__length", true, true);
}
	
fc['validation_pane1__mitglied_anmeldenummer_mitglied_anmeldenummer__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_anmeldenummer: mitglied_anmeldenummer__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_anmeldenummer__length", true, true);
}
	
	
	
	
fc['validation_pane1__mitglied_companyID_mitglied_companyID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_companyID: mitglied_companyID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_companyID__length", true, true);
}
	
	
fc['validation_dokumentEmbedded__dokument_formularempfnger_dokument_formularempfnger__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_formularempfnger: dokument_formularempfnger__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_formularempfnger__length", true, true);
}
	
fc['validation_pane1__mitglied_MGPartnerID_mitglied_MGPartnerID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_MGPartnerID: mitglied_MGPartnerID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_MGPartnerID__length", true, true);
}
	
	
	
	
	
fc['validation_dokumentEmbedded__dokument_stackName_dokument_stackName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_stackName: dokument_stackName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_stackName__length", true, true);
}
	
	
	
	
	
fc['validation_dokumentEmbedded__dokument_documentSecurity_dokument_documentSecurity__integer'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'if (typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\') {\
  \ntibco.forms.Util.checkInteger(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue) ? true :  [context.control.getLabel()]} else {\
  \nvar regex = new RegExp(\"^-?[0-9]+$\");\
  \nregex.test(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue);}';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_documentSecurity: dokument_documentSecurity__integer", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentSecurity__integer", true, true);
}
fc['validation_dokumentEmbedded__dokument_documentSecurity_dokument_documentSecurity__lowerLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkLowerLimit(context.stringValue, \'-2147483648\', true) ? true : [context.control.getLabel(), \'-2147483648\'] : isNaN(context.value) || context.value.valueOf() >= -2147483648;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_documentSecurity: dokument_documentSecurity__lowerLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentSecurity__lowerLimit", true, true);
}
fc['validation_dokumentEmbedded__dokument_documentSecurity_dokument_documentSecurity__upperLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkUpperLimit(context.stringValue, \'2147483647\', true) ? true : [context.control.getLabel(), \'2147483647\'] : isNaN(context.value) || context.value.valueOf() <= 2147483647;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_documentSecurity: dokument_documentSecurity__upperLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentSecurity__upperLimit", true, true);
}
	
	
fc['validation_dokumentEmbedded__dokument_documentNumber_dokument_documentNumber__integer'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'if (typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\') {\
  \ntibco.forms.Util.checkInteger(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue) ? true :  [context.control.getLabel()]} else {\
  \nvar regex = new RegExp(\"^-?[0-9]+$\");\
  \nregex.test(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue);}';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_documentNumber: dokument_documentNumber__integer", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentNumber__integer", true, true);
}
fc['validation_dokumentEmbedded__dokument_documentNumber_dokument_documentNumber__lowerLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkLowerLimit(context.stringValue, \'-2147483648\', true) ? true : [context.control.getLabel(), \'-2147483648\'] : isNaN(context.value) || context.value.valueOf() >= -2147483648;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_documentNumber: dokument_documentNumber__lowerLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentNumber__lowerLimit", true, true);
}
fc['validation_dokumentEmbedded__dokument_documentNumber_dokument_documentNumber__upperLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkUpperLimit(context.stringValue, \'2147483647\', true) ? true : [context.control.getLabel(), \'2147483647\'] : isNaN(context.value) || context.value.valueOf() <= 2147483647;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_documentNumber: dokument_documentNumber__upperLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_documentNumber__upperLimit", true, true);
}
	
fc['validation_dokumentEmbedded__dokument_anmeldenummer_dokument_anmeldenummer__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_anmeldenummer: dokument_anmeldenummer__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_anmeldenummer__length", true, true);
}
	
fc['validation_dokumentEmbedded__dokument_dokumentID_dokument_dokumentID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokumentEmbedded__dokument_dokumentID: dokument_dokumentID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "dokument_dokumentID__length", true, true);
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
	   form.registerPackages(['com.example.comigsbom.ComigsbomPackage', 'com.example.arraymapping.ArraymappingPackage', 'com.example.worklistfasade.WorklistfasadePackage']);
       form.registerFactories(['com.example.comigsbom.ComigsbomFactory', 'com.example.arraymapping.ArraymappingFactory', 'com.example.worklistfasade.WorklistfasadeFactory']);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getDokument = function() {
			return this.form.dataMap['Dokument'].getValue();
		};
		this.setDokument = function(value) {
			return this.form.dataMap['Dokument'].setValue(value);
		};
		this.getVersicherte = function() {
			return this.form.dataMap['Versicherte'].getValue();
		};
		this.setVersicherte = function(value) {
			return this.form.dataMap['Versicherte'].setValue(value);
		};
		this.getGeschaeftsfall = function() {
			return this.form.dataMap['Geschaeftsfall'].getValue();
		};
		this.setGeschaeftsfall = function(value) {
			return this.form.dataMap['Geschaeftsfall'].setValue(value);
		};
		this.getMitglied = function() {
			return this.form.dataMap['Mitglied'].getValue();
		};
		this.setMitglied = function(value) {
			return this.form.dataMap['Mitglied'].setValue(value);
		};
		this.getWorkListFasade = function() {
			return this.form.dataMap['WorkListFasade'].getValue();
		};
		this.setWorkListFasade = function(value) {
			return this.form.dataMap['WorkListFasade'].setValue(value);
		};
		this.getActionToDo = function(useInternal) {
			return this.form.dataMap['actionToDo'].getValue(useInternal);
		};
		this.setActionToDo = function(value) {
			return this.form.dataMap['actionToDo'].setValue(value);
		};
		this.getAction = function(useInternal) {
			return this.form.dataMap['action'].getValue(useInternal);
		};
		this.setAction = function(value) {
			return this.form.dataMap['action'].setValue(value);
		};
		this.getRuntimeIdentifier = function(useInternal) {
			return this.form.dataMap['RuntimeIdentifier'].getValue(useInternal);
		};
		this.setRuntimeIdentifier = function(value) {
			return this.form.dataMap['RuntimeIdentifier'].setValue(value);
		};
		this.getWP_PV_Versicherter_mutieren = function(useInternal) {
			return this.form.dataMap['WP_PV_Versicherter_mutieren'].getValue(useInternal);
		};
		this.setWP_PV_Versicherter_mutieren = function(value) {
			return this.form.dataMap['WP_PV_Versicherter_mutieren'].setValue(value);
		};
		this.getWP_IK_Ausz_ZAS_best_VP = function(useInternal) {
			return this.form.dataMap['WP_IK_Ausz_ZAS_best_VP'].getValue(useInternal);
		};
		this.setWP_IK_Ausz_ZAS_best_VP = function(value) {
			return this.form.dataMap['WP_IK_Ausz_ZAS_best_VP'].setValue(value);
		};
		this.getWP_IK_Auszug_drucken_EP = function(useInternal) {
			return this.form.dataMap['WP_IK_Auszug_drucken_EP'].getValue(useInternal);
		};
		this.setWP_IK_Auszug_drucken_EP = function(value) {
			return this.form.dataMap['WP_IK_Auszug_drucken_EP'].setValue(value);
		};
		this.getWP_IK_Auszug_drucken_VP = function(useInternal) {
			return this.form.dataMap['WP_IK_Auszug_drucken_VP'].getValue(useInternal);
		};
		this.setWP_IK_Auszug_drucken_VP = function(value) {
			return this.form.dataMap['WP_IK_Auszug_drucken_VP'].setValue(value);
		};
		this.getWP_IK_Ausz_ZAS_best_EP = function(useInternal) {
			return this.form.dataMap['WP_IK_Ausz_ZAS_best_EP'].getValue(useInternal);
		};
		this.setWP_IK_Ausz_ZAS_best_EP = function(value) {
			return this.form.dataMap['WP_IK_Ausz_ZAS_best_EP'].setValue(value);
		};
		this.getWP_IK_Ausz_ZAS_best_loeschen = function(useInternal) {
			return this.form.dataMap['WP_IK_Ausz_ZAS_best_loeschen'].getValue(useInternal);
		};
		this.setWP_IK_Ausz_ZAS_best_loeschen = function(value) {
			return this.form.dataMap['WP_IK_Ausz_ZAS_best_loeschen'].setValue(value);
		};
		this.getWP_Verhandlungspartner_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Verhandlungspartner_anzeigen'].getValue(useInternal);
		};
		this.setWP_Verhandlungspartner_anzeigen = function(value) {
			return this.form.dataMap['WP_Verhandlungspartner_anzeigen'].setValue(value);
		};
		this.getWP_Formular_zum_Gesuch_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Formular_zum_Gesuch_anzeigen'].getValue(useInternal);
		};
		this.setWP_Formular_zum_Gesuch_anzeigen = function(value) {
			return this.form.dataMap['WP_Formular_zum_Gesuch_anzeigen'].setValue(value);
		};
		this.getWP_Gesuch_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Gesuch_anzeigen'].getValue(useInternal);
		};
		this.setWP_Gesuch_anzeigen = function(value) {
			return this.form.dataMap['WP_Gesuch_anzeigen'].setValue(value);
		};
		this.getWP_eM_Nachlieferung_IVST_IVST = function(useInternal) {
			return this.form.dataMap['WP_eM_Nachlieferung_IVST_IVST'].getValue(useInternal);
		};
		this.setWP_eM_Nachlieferung_IVST_IVST = function(value) {
			return this.form.dataMap['WP_eM_Nachlieferung_IVST_IVST'].setValue(value);
		};
		this.getFrist = function(useInternal) {
			return this.form.dataMap['Frist'].getValue(useInternal);
		};
		this.setFrist = function(value) {
			return this.form.dataMap['Frist'].setValue(value);
		};
		this.getSP_Wiedervorlage = function(useInternal) {
			return this.form.dataMap['SP_Wiedervorlage'].getValue(useInternal);
		};
		this.setSP_Wiedervorlage = function(value) {
			return this.form.dataMap['SP_Wiedervorlage'].setValue(value);
		};
		this.getSP_Suva_IV_Regressfall_an_RGD = function(useInternal) {
			return this.form.dataMap['SP_Suva_IV_Regressfall_an_RGD'].getValue(useInternal);
		};
		this.setSP_Suva_IV_Regressfall_an_RGD = function(value) {
			return this.form.dataMap['SP_Suva_IV_Regressfall_an_RGD'].setValue(value);
		};
		this.getSP_Eigener_IV_Regressfall_an_RGD = function(useInternal) {
			return this.form.dataMap['SP_Eigener_IV_Regressfall_an_RGD'].getValue(useInternal);
		};
		this.setSP_Eigener_IV_Regressfall_an_RGD = function(value) {
			return this.form.dataMap['SP_Eigener_IV_Regressfall_an_RGD'].setValue(value);
		};
		this.getWP_WW_Protokolle_bearbeiten = function(useInternal) {
			return this.form.dataMap['WP_WW_Protokolle_bearbeiten'].getValue(useInternal);
		};
		this.setWP_WW_Protokolle_bearbeiten = function(value) {
			return this.form.dataMap['WP_WW_Protokolle_bearbeiten'].setValue(value);
		};
		this.getUserCompleteTaskGuid = function(useInternal) {
			return this.form.dataMap['UserCompleteTaskGuid'].getValue(useInternal);
		};
		this.setUserCompleteTaskGuid = function(value) {
			return this.form.dataMap['UserCompleteTaskGuid'].setValue(value);
		};
		this.getMasterProcessID = function(useInternal) {
			return this.form.dataMap['MasterProcessID'].getValue(useInternal);
		};
		this.setMasterProcessID = function(value) {
			return this.form.dataMap['MasterProcessID'].setValue(value);
		};
		this.getWorkflowID = function(useInternal) {
			return this.form.dataMap['WorkflowID'].getValue(useInternal);
		};
		this.setWorkflowID = function(value) {
			return this.form.dataMap['WorkflowID'].setValue(value);
		};
		this.getWeiterleitung_an_IV_Sachbearbeiter = function(useInternal) {
			return this.form.dataMap['Weiterleitung_an_IV_Sachbearbeiter'].getValue(useInternal);
		};
		this.setWeiterleitung_an_IV_Sachbearbeiter = function(value) {
			return this.form.dataMap['Weiterleitung_an_IV_Sachbearbeiter'].setValue(value);
		};
		this.getWP_eM_IV_Akte_anfordern = function(useInternal) {
			return this.form.dataMap['WP_eM_IV_Akte_anfordern'].getValue(useInternal);
		};
		this.setWP_eM_IV_Akte_anfordern = function(value) {
			return this.form.dataMap['WP_eM_IV_Akte_anfordern'].setValue(value);
		};
		this.getWP_Aktenbestellung_DMC = function(useInternal) {
			return this.form.dataMap['WP_Aktenbestellung_DMC'].getValue(useInternal);
		};
		this.setWP_Aktenbestellung_DMC = function(value) {
			return this.form.dataMap['WP_Aktenbestellung_DMC'].setValue(value);
		};
		this.getWP_Geschaeftsfall_klammern = function(useInternal) {
			return this.form.dataMap['WP_Geschaeftsfall_klammern'].getValue(useInternal);
		};
		this.setWP_Geschaeftsfall_klammern = function(value) {
			return this.form.dataMap['WP_Geschaeftsfall_klammern'].setValue(value);
		};
		this.getWP_IK_Erstellen_VA_Eroeffnen_IK = function(useInternal) {
			return this.form.dataMap['WP_IK_Erstellen_VA_Eroeffnen_IK'].getValue(useInternal);
		};
		this.setWP_IK_Erstellen_VA_Eroeffnen_IK = function(value) {
			return this.form.dataMap['WP_IK_Erstellen_VA_Eroeffnen_IK'].setValue(value);
		};
		this.getZ_Fall_erledigt_Ablage = function(useInternal) {
			return this.form.dataMap['Z_Fall_erledigt_Ablage'].getValue(useInternal);
		};
		this.setZ_Fall_erledigt_Ablage = function(value) {
			return this.form.dataMap['Z_Fall_erledigt_Ablage'].setValue(value);
		};
		this.getGeschaeftsfall_found = function() {
			return this.form.dataMap['Geschaeftsfall_found'].getValue();
		};
		this.getSP_erstelle_neueWorkflows = function(useInternal) {
			return this.form.dataMap['SP_erstelle_neueWorkflows'].getValue(useInternal);
		};
		this.setSP_erstelle_neueWorkflows = function(value) {
			return this.form.dataMap['SP_erstelle_neueWorkflows'].setValue(value);
		};
		this.getCorrelationID = function(useInternal) {
			return this.form.dataMap['CorrelationID'].getValue(useInternal);
		};
		this.setCorrelationID = function(value) {
			return this.form.dataMap['CorrelationID'].setValue(value);
		};
		this.getVersicherter = function() {
			return this.form.dataMap['Versicherter'].getValue();
		};
		this.setVersicherter = function(value) {
			return this.form.dataMap['Versicherter'].setValue(value);
		};
		this.getSP_Anfrage_RAD = function(useInternal) {
			return this.form.dataMap['SP_Anfrage_RAD'].getValue(useInternal);
		};
		this.setSP_Anfrage_RAD = function(value) {
			return this.form.dataMap['SP_Anfrage_RAD'].setValue(value);
		};
		this.getSP_Anfrage_BSV = function(useInternal) {
			return this.form.dataMap['SP_Anfrage_BSV'].getValue(useInternal);
		};
		this.setSP_Anfrage_BSV = function(value) {
			return this.form.dataMap['SP_Anfrage_BSV'].setValue(value);
		};
		this.getSP_Anfrage_AD = function(useInternal) {
			return this.form.dataMap['SP_Anfrage_AD'].getValue(useInternal);
		};
		this.setSP_Anfrage_AD = function(value) {
			return this.form.dataMap['SP_Anfrage_AD'].setValue(value);
		};
		this.getSP_Anfrage_RD = function(useInternal) {
			return this.form.dataMap['SP_Anfrage_RD'].getValue(useInternal);
		};
		this.setSP_Anfrage_RD = function(value) {
			return this.form.dataMap['SP_Anfrage_RD'].setValue(value);
		};
		this.getWP_Auftraege_zum_Gesuch_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Auftraege_zum_Gesuch_anzeigen'].getValue(useInternal);
		};
		this.setWP_Auftraege_zum_Gesuch_anzeigen = function(value) {
			return this.form.dataMap['WP_Auftraege_zum_Gesuch_anzeigen'].setValue(value);
		};
		this.getWP_Verfuegung_zum_Gesuch = function(useInternal) {
			return this.form.dataMap['WP_Verfuegung_zum_Gesuch'].getValue(useInternal);
		};
		this.setWP_Verfuegung_zum_Gesuch = function(value) {
			return this.form.dataMap['WP_Verfuegung_zum_Gesuch'].setValue(value);
		};
		this.getWP_Journal_zum_Gesuch_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Journal_zum_Gesuch_anzeigen'].getValue(useInternal);
		};
		this.setWP_Journal_zum_Gesuch_anzeigen = function(value) {
			return this.form.dataMap['WP_Journal_zum_Gesuch_anzeigen'].setValue(value);
		};
		this.getWP_Zuteilung_zum_Gesuch_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Zuteilung_zum_Gesuch_anzeigen'].getValue(useInternal);
		};
		this.setWP_Zuteilung_zum_Gesuch_anzeigen = function(value) {
			return this.form.dataMap['WP_Zuteilung_zum_Gesuch_anzeigen'].setValue(value);
		};
		this.getWP_eM_Aktenversand_an_UV = function(useInternal) {
			return this.form.dataMap['WP_eM_Aktenversand_an_UV'].getValue(useInternal);
		};
		this.setWP_eM_Aktenversand_an_UV = function(value) {
			return this.form.dataMap['WP_eM_Aktenversand_an_UV'].setValue(value);
		};
		this.getWP_eM_Aktenversand_an_UV_Antw = function(useInternal) {
			return this.form.dataMap['WP_eM_Aktenversand_an_UV_Antw'].getValue(useInternal);
		};
		this.setWP_eM_Aktenversand_an_UV_Antw = function(value) {
			return this.form.dataMap['WP_eM_Aktenversand_an_UV_Antw'].setValue(value);
		};
		this.getWP_eM_Gesuch_um_Akteneinsicht_UV = function(useInternal) {
			return this.form.dataMap['WP_eM_Gesuch_um_Akteneinsicht_UV'].getValue(useInternal);
		};
		this.setWP_eM_Gesuch_um_Akteneinsicht_UV = function(value) {
			return this.form.dataMap['WP_eM_Gesuch_um_Akteneinsicht_UV'].setValue(value);
		};
		this.getEXC_Excel_Dokumente = function(useInternal) {
			return this.form.dataMap['EXC_Excel_Dokumente'].getValue(useInternal);
		};
		this.setEXC_Excel_Dokumente = function(value) {
			return this.form.dataMap['EXC_Excel_Dokumente'].setValue(value);
		};
		this.getSP_vmV_pruefen = function(useInternal) {
			return this.form.dataMap['SP_vmV_pruefen'].getValue(useInternal);
		};
		this.setSP_vmV_pruefen = function(value) {
			return this.form.dataMap['SP_vmV_pruefen'].setValue(value);
		};
		this.getSP_Zurueck_zu_Eingang_pruefen = function(useInternal) {
			return this.form.dataMap['SP_Zurueck_zu_Eingang_pruefen'].getValue(useInternal);
		};
		this.setSP_Zurueck_zu_Eingang_pruefen = function(value) {
			return this.form.dataMap['SP_Zurueck_zu_Eingang_pruefen'].setValue(value);
		};
		this.getPerformer_Mitarbeiter_RD = function(useInternal) {
			return this.form.dataMap['Performer_Mitarbeiter_RD'].getValue(useInternal);
		};
		this.setPerformer_Mitarbeiter_RD = function(value) {
			return this.form.dataMap['Performer_Mitarbeiter_RD'].setValue(value);
		};
		this.getPerformer_IV_Kernprozessleitung = function(useInternal) {
			return this.form.dataMap['Performer_IV_Kernprozessleitung'].getValue(useInternal);
		};
		this.setPerformer_IV_Kernprozessleitung = function(value) {
			return this.form.dataMap['Performer_IV_Kernprozessleitung'].setValue(value);
		};
		this.getPerformer_Mitarbeiter_AD = function(useInternal) {
			return this.form.dataMap['Performer_Mitarbeiter_AD'].getValue(useInternal);
		};
		this.setPerformer_Mitarbeiter_AD = function(value) {
			return this.form.dataMap['Performer_Mitarbeiter_AD'].setValue(value);
		};
		this.getWarteKorbPerformer = function(useInternal) {
			return this.form.dataMap['WarteKorbPerformer'].getValue(useInternal);
		};
		this.setWarteKorbPerformer = function(value) {
			return this.form.dataMap['WarteKorbPerformer'].setValue(value);
		};
		this.getProzessStatus_Neu = function(useInternal) {
			return this.form.dataMap['ProzessStatus_Neu'].getValue(useInternal);
		};
		this.setProzessStatus_Neu = function(value) {
			return this.form.dataMap['ProzessStatus_Neu'].setValue(value);
		};
		this.getWorkListFasade_Field = function() {
			return this.form.dataMap['WorkListFasade_Field'].getValue();
		};
		this.setWorkListFasade_Field = function(value) {
			return this.form.dataMap['WorkListFasade_Field'].setValue(value);
		};
		this.getPane1__mitglied = function() {
			return this.form.dataMap['pane1__mitglied'].getValue();
		};
		this.setPane1__mitglied = function(value) {
			return this.form.dataMap['pane1__mitglied'].setValue(value);
		};
		this.getDokumentEmbedded__dokument = function() {
			return this.form.dataMap['dokumentEmbedded__dokument'].getValue();
		};
		this.setDokumentEmbedded__dokument = function(value) {
			return this.form.dataMap['dokumentEmbedded__dokument'].setValue(value);
		};
	}
	   
	   
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	   
};
tibcoforms.formCode['_weaIkC95Eem8NYwCvBPJhw']['defineValidations']();
