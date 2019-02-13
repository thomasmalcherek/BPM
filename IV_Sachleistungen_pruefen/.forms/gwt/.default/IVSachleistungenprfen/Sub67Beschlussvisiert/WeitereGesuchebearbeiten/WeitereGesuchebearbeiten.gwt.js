

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_jhBkwC98Eem8NYwCvBPJhw'] = new Object();
tibcoforms.formCode['_jhBkwC98Eem8NYwCvBPJhw']['defineActions'] = function() {
var fc = tibcoforms.formCode['_jhBkwC98Eem8NYwCvBPJhw'];
    fc['rule_cancel'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "cancel", "cancel", fc['action_cancel']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(cancel) Error: " + e);
	       throw e;
	   }
	}

    fc['rule_close'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "close", "close", fc['action_close']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(close) Error: " + e);
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
tibcoforms.formCode['_jhBkwC98Eem8NYwCvBPJhw']['defineActions']();

tibcoforms.formCode['_jhBkwC98Eem8NYwCvBPJhw']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_jhBkwC98Eem8NYwCvBPJhw'];
	
fc['validation_WorklistFasade_abrechNr_WorklistFasade_abrechNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_abrechNr: WorklistFasade_abrechNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_abrechNr__length", true, true);
}
	
fc['validation_actionToDo_actionToDo__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "actionToDo: actionToDo__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "actionToDo__length", true, true);
}
	
fc['validation_WorklistFasade_wiedervorlagedatum_WorklistFasade_wiedervorlagedatum__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_wiedervorlagedatum: WorklistFasade_wiedervorlagedatum__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_wiedervorlagedatum__datetime", true, true);
}
	
fc['validation_Geschaeftsfall_processNumber_Geschaeftsfall_processNumber__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_processNumber: Geschaeftsfall_processNumber__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_processNumber__length", true, true);
}
	
fc['validation_Dokument_documentDateOfReceipt_Dokument_documentDateOfReceipt__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentDateOfReceipt: Dokument_documentDateOfReceipt__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentDateOfReceipt__datetime", true, true);
}
	
fc['validation_Mitglied_accountNumber_Mitglied_accountNumber__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_accountNumber: Mitglied_accountNumber__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_accountNumber__length", true, true);
}
	
fc['validation_Versicherter_VSPartnerID_Versicherter_VSPartnerID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_VSPartnerID: Versicherter_VSPartnerID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_VSPartnerID__length", true, true);
}
	
fc['validation_WorklistFasade_zusatzbezeichnung_WorklistFasade_zusatzbezeichnung__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_zusatzbezeichnung: WorklistFasade_zusatzbezeichnung__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_zusatzbezeichnung__length", true, true);
}
	
	
fc['validation_Geschaeftsfall_senderName_Geschaeftsfall_senderName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_senderName: Geschaeftsfall_senderName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_senderName__length", true, true);
}
	
	
fc['validation_Dokument_keyword_Dokument_keyword__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_keyword: Dokument_keyword__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_keyword__length", true, true);
}
fc['validation_Dokument_keyword_Dokument_keyword__multiplicity'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof tibco.forms.Util.checkMultiplicity != \'undefined\' ? tibco.forms.Util.checkMultiplicity(context.value, 0, 2147483647) ?  true : [this.getLabel(), \'0\'] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_keyword: Dokument_keyword__multiplicity", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_keyword__multiplicity", true, true);
}
	
fc['validation_Versicherter_birthDate_Versicherter_birthDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_birthDate: Versicherter_birthDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_birthDate__datetime", true, true);
}
	
fc['validation_Geschaeftsfall_processUser_Geschaeftsfall_processUser__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_processUser: Geschaeftsfall_processUser__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_processUser__length", true, true);
}
	
fc['validation_Geschaeftsfall_workflowDate_Geschaeftsfall_workflowDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_workflowDate: Geschaeftsfall_workflowDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_workflowDate__datetime", true, true);
}
	
fc['validation_Versicherter_degree_Versicherter_degree__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_degree: Versicherter_degree__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_degree__length", true, true);
}
	
fc['validation_Mitglied_foundingDate_Mitglied_foundingDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_foundingDate: Mitglied_foundingDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_foundingDate__datetime", true, true);
}
	
	
fc['validation_Versicherter_sprache_Versicherter_sprache__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_sprache: Versicherter_sprache__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_sprache__length", true, true);
}
	
fc['validation_Dokument_documentSecurity_Dokument_documentSecurity__integer'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'if (typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\') {\
  \ntibco.forms.Util.checkInteger(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue) ? true :  [context.control.getLabel()]} else {\
  \nvar regex = new RegExp(\"^-?[0-9]+$\");\
  \nregex.test(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue);}';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentSecurity: Dokument_documentSecurity__integer", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentSecurity__integer", true, true);
}
fc['validation_Dokument_documentSecurity_Dokument_documentSecurity__lowerLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkLowerLimit(context.stringValue, \'-2147483648\', true) ? true : [context.control.getLabel(), \'-2147483648\'] : isNaN(context.value) || context.value.valueOf() >= -2147483648;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentSecurity: Dokument_documentSecurity__lowerLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentSecurity__lowerLimit", true, true);
}
fc['validation_Dokument_documentSecurity_Dokument_documentSecurity__upperLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkUpperLimit(context.stringValue, \'2147483647\', true) ? true : [context.control.getLabel(), \'2147483647\'] : isNaN(context.value) || context.value.valueOf() <= 2147483647;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentSecurity: Dokument_documentSecurity__upperLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentSecurity__upperLimit", true, true);
}
	
	
fc['validation_WorklistFasade_versVorname_WorklistFasade_versVorname__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_versVorname: WorklistFasade_versVorname__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_versVorname__length", true, true);
}
	
	
fc['validation_Geschaeftsfall_PKID_Geschaeftsfall_PKID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_PKID: Geschaeftsfall_PKID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_PKID__length", true, true);
}
	
	
fc['validation_Dokument_kommentar_Dokument_kommentar__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_kommentar: Dokument_kommentar__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_kommentar__length", true, true);
}
	
	
fc['validation_Geschaeftsfall_ownerName_Geschaeftsfall_ownerName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_ownerName: Geschaeftsfall_ownerName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_ownerName__length", true, true);
}
	
fc['validation_Dokument_stackName_Dokument_stackName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_stackName: Dokument_stackName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_stackName__length", true, true);
}
	
	
fc['validation_Dokument_documentScanDate_Dokument_documentScanDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentScanDate: Dokument_documentScanDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentScanDate__datetime", true, true);
}
	
fc['validation_Dokument_anmeldenummer_Dokument_anmeldenummer__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_anmeldenummer: Dokument_anmeldenummer__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_anmeldenummer__length", true, true);
}
	
fc['validation_WorklistFasade_dokumentenArt_WorklistFasade_dokumentenArt__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_dokumentenArt: WorklistFasade_dokumentenArt__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_dokumentenArt__length", true, true);
}
	
	
	
fc['validation_Mitglied_companyID_Mitglied_companyID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_companyID: Mitglied_companyID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_companyID__length", true, true);
}
	
fc['validation_WorkFlowID_WorkFlowID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkFlowID: WorkFlowID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkFlowID__length", true, true);
}
	
fc['validation_WorklistFasade_geschaeftsfallNr_WorklistFasade_geschaeftsfallNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_geschaeftsfallNr: WorklistFasade_geschaeftsfallNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_geschaeftsfallNr__length", true, true);
}
	
fc['validation_Dokument_documentNumber_Dokument_documentNumber__integer'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'if (typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\') {\
  \ntibco.forms.Util.checkInteger(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue) ? true :  [context.control.getLabel()]} else {\
  \nvar regex = new RegExp(\"^-?[0-9]+$\");\
  \nregex.test(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue);}';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentNumber: Dokument_documentNumber__integer", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentNumber__integer", true, true);
}
fc['validation_Dokument_documentNumber_Dokument_documentNumber__lowerLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkLowerLimit(context.stringValue, \'-2147483648\', true) ? true : [context.control.getLabel(), \'-2147483648\'] : isNaN(context.value) || context.value.valueOf() >= -2147483648;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentNumber: Dokument_documentNumber__lowerLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentNumber__lowerLimit", true, true);
}
fc['validation_Dokument_documentNumber_Dokument_documentNumber__upperLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkUpperLimit(context.stringValue, \'2147483647\', true) ? true : [context.control.getLabel(), \'2147483647\'] : isNaN(context.value) || context.value.valueOf() <= 2147483647;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentNumber: Dokument_documentNumber__upperLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentNumber__upperLimit", true, true);
}
	
fc['validation_Dokument_kurztext_Dokument_kurztext__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_kurztext: Dokument_kurztext__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_kurztext__length", true, true);
}
	
fc['validation_Geschaeftsfall_typBezeichnung_Geschaeftsfall_typBezeichnung__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_typBezeichnung: Geschaeftsfall_typBezeichnung__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_typBezeichnung__length", true, true);
}
	
fc['validation_Versicherter_firstName_Versicherter_firstName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_firstName: Versicherter_firstName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_firstName__length", true, true);
}
	
	
fc['validation_Geschaeftsfall_feedback_Geschaeftsfall_feedback__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_feedback: Geschaeftsfall_feedback__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_feedback__length", true, true);
}
	
fc['validation_Geschaeftsfall_workflowState_Geschaeftsfall_workflowState__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_workflowState: Geschaeftsfall_workflowState__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_workflowState__length", true, true);
}
	
fc['validation_Mitglied_name_Mitglied_name__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_name: Mitglied_name__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_name__length", true, true);
}
	
	
fc['validation_Versicherter_secureNumber_Versicherter_secureNumber__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_secureNumber: Versicherter_secureNumber__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_secureNumber__length", true, true);
}
	
fc['validation_Mitglied_MGPartnerID_Mitglied_MGPartnerID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_MGPartnerID: Mitglied_MGPartnerID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_MGPartnerID__length", true, true);
}
	
fc['validation_WorklistFasade_personenID_WorklistFasade_personenID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 64) ? true : [context.control.getLabel(), \'64\'] : context.value.length <= 64;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_personenID: WorklistFasade_personenID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_personenID__length", true, true);
}
	
fc['validation_WorklistFasade_versNachname_WorklistFasade_versNachname__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 64) ? true : [context.control.getLabel(), \'64\'] : context.value.length <= 64;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_versNachname: WorklistFasade_versNachname__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_versNachname__length", true, true);
}
	
fc['validation_WorklistFasade_dokEingangsdatum_WorklistFasade_dokEingangsdatum__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_dokEingangsdatum: WorklistFasade_dokEingangsdatum__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_dokEingangsdatum__datetime", true, true);
}
	
fc['validation_Versicherter_personID_Versicherter_personID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_personID: Versicherter_personID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_personID__length", true, true);
}
	
fc['validation_WorklistFasade_anmeldeNr_WorklistFasade_anmeldeNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_anmeldeNr: WorklistFasade_anmeldeNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_anmeldeNr__length", true, true);
}
	
fc['validation_Dokument_effortType_Dokument_effortType__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_effortType: Dokument_effortType__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_effortType__length", true, true);
}
	
	
fc['validation_Dokument_dokumentID_Dokument_dokumentID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_dokumentID: Dokument_dokumentID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_dokumentID__length", true, true);
}
	
fc['validation_action_action__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "action: action__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "action__length", true, true);
}
	
	
fc['validation_WorklistFasade_versichNr_WorklistFasade_versichNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 64) ? true : [context.control.getLabel(), \'64\'] : context.value.length <= 64;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_versichNr: WorklistFasade_versichNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_versichNr__length", true, true);
}
	
	
fc['validation_WorklistFasade_unternehmensID_WorklistFasade_unternehmensID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_unternehmensID: WorklistFasade_unternehmensID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_unternehmensID__length", true, true);
}
	
	
fc['validation_Dokument_formularempfnger_Dokument_formularempfnger__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_formularempfnger: Dokument_formularempfnger__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_formularempfnger__length", true, true);
}
	
fc['validation_Mitglied_anmeldenummer_Mitglied_anmeldenummer__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_anmeldenummer: Mitglied_anmeldenummer__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_anmeldenummer__length", true, true);
}
	
fc['validation_WorklistFasade_prozessstatus_WorklistFasade_prozessstatus__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_prozessstatus: WorklistFasade_prozessstatus__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_prozessstatus__length", true, true);
}
	
fc['validation_Versicherter_title_Versicherter_title__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_title: Versicherter_title__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_title__length", true, true);
}
	
fc['validation_Geschaeftsfall_messagePK_Geschaeftsfall_messagePK__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_messagePK: Geschaeftsfall_messagePK__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_messagePK__length", true, true);
}
	
fc['validation_Versicherter_gender_Versicherter_gender__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_gender: Versicherter_gender__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_gender__length", true, true);
}
	
fc['validation_WorklistFasade_aktuelleBearbeiter_WorklistFasade_aktuelleBearbeiter__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_aktuelleBearbeiter: WorklistFasade_aktuelleBearbeiter__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorklistFasade_aktuelleBearbeiter__length", true, true);
}
	
	
fc['validation_Dokument_documentType_Dokument_documentType__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentType: Dokument_documentType__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentType__length", true, true);
}
	
fc['validation_Versicherter_lastName_Versicherter_lastName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_lastName: Versicherter_lastName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_lastName__length", true, true);
}
	
fc['validation_Geschaeftsfall_handlingReason_Geschaeftsfall_handlingReason__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_handlingReason: Geschaeftsfall_handlingReason__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_handlingReason__length", true, true);
}
	
fc['validation_Geschaeftsfall_typNummer_Geschaeftsfall_typNummer__integer'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'if (typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\') {\
  \ntibco.forms.Util.checkInteger(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue) ? true :  [context.control.getLabel()]} else {\
  \nvar regex = new RegExp(\"^-?[0-9]+$\");\
  \nregex.test(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue);}';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_typNummer: Geschaeftsfall_typNummer__integer", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_typNummer__integer", true, true);
}
fc['validation_Geschaeftsfall_typNummer_Geschaeftsfall_typNummer__lowerLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkLowerLimit(context.stringValue, \'-2147483648\', true) ? true : [context.control.getLabel(), \'-2147483648\'] : isNaN(context.value) || context.value.valueOf() >= -2147483648;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_typNummer: Geschaeftsfall_typNummer__lowerLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_typNummer__lowerLimit", true, true);
}
fc['validation_Geschaeftsfall_typNummer_Geschaeftsfall_typNummer__upperLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkUpperLimit(context.stringValue, \'2147483647\', true) ? true : [context.control.getLabel(), \'2147483647\'] : isNaN(context.value) || context.value.valueOf() <= 2147483647;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_typNummer: Geschaeftsfall_typNummer__upperLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_typNummer__upperLimit", true, true);
}
	
	
fc['validation_Mitglied_additionalName_Mitglied_additionalName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_additionalName: Mitglied_additionalName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_additionalName__length", true, true);
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
	   form.registerPackages(['com.example.comigsbom.ComigsbomPackage', 'com.example.worklistfasade.WorklistfasadePackage']);
       form.registerFactories(['com.example.comigsbom.ComigsbomFactory', 'com.example.worklistfasade.WorklistfasadeFactory']);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getVersicherter = function() {
			return this.form.dataMap['Versicherter'].getValue();
		};
		this.setVersicherter = function(value) {
			return this.form.dataMap['Versicherter'].setValue(value);
		};
		this.getMitglied = function() {
			return this.form.dataMap['Mitglied'].getValue();
		};
		this.setMitglied = function(value) {
			return this.form.dataMap['Mitglied'].setValue(value);
		};
		this.getGeschaeftsfall = function() {
			return this.form.dataMap['Geschaeftsfall'].getValue();
		};
		this.setGeschaeftsfall = function(value) {
			return this.form.dataMap['Geschaeftsfall'].setValue(value);
		};
		this.getDokument = function() {
			return this.form.dataMap['Dokument'].getValue();
		};
		this.setDokument = function(value) {
			return this.form.dataMap['Dokument'].setValue(value);
		};
		this.getWorklistFasade = function() {
			return this.form.dataMap['WorklistFasade'].getValue();
		};
		this.setWorklistFasade = function(value) {
			return this.form.dataMap['WorklistFasade'].setValue(value);
		};
		this.getWorkFlowID = function(useInternal) {
			return this.form.dataMap['WorkFlowID'].getValue(useInternal);
		};
		this.setWorkFlowID = function(value) {
			return this.form.dataMap['WorkFlowID'].setValue(value);
		};
		this.getAction = function(useInternal) {
			return this.form.dataMap['action'].getValue(useInternal);
		};
		this.setAction = function(value) {
			return this.form.dataMap['action'].setValue(value);
		};
		this.getActionToDo = function(useInternal) {
			return this.form.dataMap['actionToDo'].getValue(useInternal);
		};
		this.setActionToDo = function(value) {
			return this.form.dataMap['actionToDo'].setValue(value);
		};
		this.getWP_WW_Protokolle_bearbeiten = function(useInternal) {
			return this.form.dataMap['WP_WW_Protokolle_bearbeiten'].getValue(useInternal);
		};
		this.setWP_WW_Protokolle_bearbeiten = function(value) {
			return this.form.dataMap['WP_WW_Protokolle_bearbeiten'].setValue(value);
		};
		this.getWP_Verfuegung_zum_Gesuch = function(useInternal) {
			return this.form.dataMap['WP_Verfuegung_zum_Gesuch'].getValue(useInternal);
		};
		this.setWP_Verfuegung_zum_Gesuch = function(value) {
			return this.form.dataMap['WP_Verfuegung_zum_Gesuch'].setValue(value);
		};
		this.getSP_Vorbescheid_bearbeiten = function(useInternal) {
			return this.form.dataMap['SP_Vorbescheid_bearbeiten'].getValue(useInternal);
		};
		this.setSP_Vorbescheid_bearbeiten = function(value) {
			return this.form.dataMap['SP_Vorbescheid_bearbeiten'].setValue(value);
		};
		this.getSP_Verfuegung_bearbeiten = function(useInternal) {
			return this.form.dataMap['SP_Verfuegung_bearbeiten'].getValue(useInternal);
		};
		this.setSP_Verfuegung_bearbeiten = function(value) {
			return this.form.dataMap['SP_Verfuegung_bearbeiten'].setValue(value);
		};
		this.getSP_Mitteilung_bearbeiten = function(useInternal) {
			return this.form.dataMap['SP_Mitteilung_bearbeiten'].getValue(useInternal);
		};
		this.setSP_Mitteilung_bearbeiten = function(value) {
			return this.form.dataMap['SP_Mitteilung_bearbeiten'].setValue(value);
		};
		this.getSP_weitere_Gesuche_bearbeiten = function(useInternal) {
			return this.form.dataMap['SP_weitere_Gesuche_bearbeiten'].getValue(useInternal);
		};
		this.setSP_weitere_Gesuche_bearbeiten = function(value) {
			return this.form.dataMap['SP_weitere_Gesuche_bearbeiten'].setValue(value);
		};
		this.getUserCompleteTaskGuid = function(useInternal) {
			return this.form.dataMap['UserCompleteTaskGuid'].getValue(useInternal);
		};
		this.setUserCompleteTaskGuid = function(value) {
			return this.form.dataMap['UserCompleteTaskGuid'].setValue(value);
		};
	}
	   
            
            
            
            
            
	   
	   
};
tibcoforms.formCode['_jhBkwC98Eem8NYwCvBPJhw']['defineValidations']();
