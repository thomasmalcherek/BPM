

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_i6WmUC98Eem8NYwCvBPJhw'] = new Object();
tibcoforms.formCode['_i6WmUC98Eem8NYwCvBPJhw']['defineActions'] = function() {
var fc = tibcoforms.formCode['_i6WmUC98Eem8NYwCvBPJhw'];
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
tibcoforms.formCode['_i6WmUC98Eem8NYwCvBPJhw']['defineActions']();

tibcoforms.formCode['_i6WmUC98Eem8NYwCvBPJhw']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_i6WmUC98Eem8NYwCvBPJhw'];
	
fc['validation_Versicherte_gender_Versicherte_gender__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_gender: Versicherte_gender__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_gender__length", true, true);
}
	
fc['validation_Geschaeftsfall_processUser_Geschaeftsfall_processUser__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_processUser: Geschaeftsfall_processUser__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_processUser__length", true, true);
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
	
	
	
fc['validation_Dokument_kurztext_Dokument_kurztext__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_kurztext: Dokument_kurztext__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_kurztext__length", true, true);
}
	
	
	
fc['validation_Geschaeftsfall_ownerName_Geschaeftsfall_ownerName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_ownerName: Geschaeftsfall_ownerName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_ownerName__length", true, true);
}
	
fc['validation_WorkListFasade_anmeldeNr_WorkListFasade_anmeldeNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_anmeldeNr: WorkListFasade_anmeldeNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_anmeldeNr__length", true, true);
}
	
fc['validation_Mitglied_companyID_Mitglied_companyID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_companyID: Mitglied_companyID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_companyID__length", true, true);
}
	
	
fc['validation_WorkListFasade_geschaeftsfallNr_WorkListFasade_geschaeftsfallNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_geschaeftsfallNr: WorkListFasade_geschaeftsfallNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_geschaeftsfallNr__length", true, true);
}
	
	
	
fc['validation_WorkListFasade_Field_personenID_WorkListFasade_Field_personenID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 64) ? true : [context.control.getLabel(), \'64\'] : context.value.length <= 64;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_personenID: WorkListFasade_Field_personenID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_personenID__length", true, true);
}
	
fc['validation_WorkListFasade_personenID_WorkListFasade_personenID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 64) ? true : [context.control.getLabel(), \'64\'] : context.value.length <= 64;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_personenID: WorkListFasade_personenID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_personenID__length", true, true);
}
	
	
fc['validation_WorkListFasade_wiedervorlagedatum_WorkListFasade_wiedervorlagedatum__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_wiedervorlagedatum: WorkListFasade_wiedervorlagedatum__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_wiedervorlagedatum__datetime", true, true);
}
	
fc['validation_Dokument_documentType_Dokument_documentType__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentType: Dokument_documentType__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentType__length", true, true);
}
	
fc['validation_Versicherte_degree_Versicherte_degree__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_degree: Versicherte_degree__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_degree__length", true, true);
}
	
	
fc['validation_Dokument_effortType_Dokument_effortType__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_effortType: Dokument_effortType__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_effortType__length", true, true);
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
	
	
fc['validation_MasterProcessID_MasterProcessID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "MasterProcessID: MasterProcessID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "MasterProcessID__length", true, true);
}
	
fc['validation_Versicherter_sprache_Versicherter_sprache__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_sprache: Versicherter_sprache__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_sprache__length", true, true);
}
	
fc['validation_WorkListFasade_versichNr_WorkListFasade_versichNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 64) ? true : [context.control.getLabel(), \'64\'] : context.value.length <= 64;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_versichNr: WorkListFasade_versichNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_versichNr__length", true, true);
}
	
fc['validation_WorkListFasade_Field_wiedervorlagedatum_WorkListFasade_Field_wiedervorlagedatum__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_wiedervorlagedatum: WorkListFasade_Field_wiedervorlagedatum__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_wiedervorlagedatum__datetime", true, true);
}
	
fc['validation_Versicherter_lastName_Versicherter_lastName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_lastName: Versicherter_lastName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_lastName__length", true, true);
}
	
	
fc['validation_WorkListFasade_Field_abrechNr_WorkListFasade_Field_abrechNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_abrechNr: WorkListFasade_Field_abrechNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_abrechNr__length", true, true);
}
	
fc['validation_Geschaeftsfall_feedback_Geschaeftsfall_feedback__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_feedback: Geschaeftsfall_feedback__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_feedback__length", true, true);
}
	
fc['validation_Geschaeftsfall_processNumber_Geschaeftsfall_processNumber__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_processNumber: Geschaeftsfall_processNumber__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_processNumber__length", true, true);
}
	
	
fc['validation_Versicherte_lastName_Versicherte_lastName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_lastName: Versicherte_lastName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_lastName__length", true, true);
}
	
	
fc['validation_Mitglied_name_Mitglied_name__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_name: Mitglied_name__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_name__length", true, true);
}
	
fc['validation_Versicherter_personID_Versicherter_personID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_personID: Versicherter_personID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_personID__length", true, true);
}
	
	
	
	
fc['validation_Dokument_formularempfnger_Dokument_formularempfnger__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_formularempfnger: Dokument_formularempfnger__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_formularempfnger__length", true, true);
}
	
fc['validation_CorrelationID_CorrelationID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CorrelationID: CorrelationID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "CorrelationID__length", true, true);
}
	
	
fc['validation_Geschaeftsfall_found_geschaeftsfallNr_Geschaeftsfall_found_geschaeftsfallNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_geschaeftsfallNr: Geschaeftsfall_found_geschaeftsfallNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_geschaeftsfallNr__length", true, true);
}
	
	
	
fc['validation_WorkListFasade_dokEingangsdatum_WorkListFasade_dokEingangsdatum__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_dokEingangsdatum: WorkListFasade_dokEingangsdatum__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_dokEingangsdatum__datetime", true, true);
}
	
fc['validation_Geschaeftsfall_found_partnerID_Geschaeftsfall_found_partnerID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_partnerID: Geschaeftsfall_found_partnerID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_partnerID__length", true, true);
}
	
fc['validation_Geschaeftsfall_typBezeichnung_Geschaeftsfall_typBezeichnung__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_typBezeichnung: Geschaeftsfall_typBezeichnung__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_typBezeichnung__length", true, true);
}
	
	
fc['validation_Geschaeftsfall_handlingReason_Geschaeftsfall_handlingReason__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_handlingReason: Geschaeftsfall_handlingReason__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_handlingReason__length", true, true);
}
	
fc['validation_ProzessStatus_Neu_ProzessStatus_Neu__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProzessStatus_Neu: ProzessStatus_Neu__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ProzessStatus_Neu__length", true, true);
}
	
fc['validation_Dokument_kommentar_Dokument_kommentar__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_kommentar: Dokument_kommentar__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_kommentar__length", true, true);
}
	
fc['validation_Versicherte_sprache_Versicherte_sprache__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_sprache: Versicherte_sprache__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_sprache__length", true, true);
}
	
	
	
fc['validation_Dokument_stackName_Dokument_stackName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_stackName: Dokument_stackName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_stackName__length", true, true);
}
	
fc['validation_WorkflowID_WorkflowID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkflowID: WorkflowID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkflowID__length", true, true);
}
	
	
fc['validation_Mitglied_foundingDate_Mitglied_foundingDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_foundingDate: Mitglied_foundingDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_foundingDate__datetime", true, true);
}
	
fc['validation_Versicherter_degree_Versicherter_degree__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_degree: Versicherter_degree__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_degree__length", true, true);
}
	
	
fc['validation_Geschaeftsfall_messagePK_Geschaeftsfall_messagePK__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_messagePK: Geschaeftsfall_messagePK__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_messagePK__length", true, true);
}
	
fc['validation_Versicherter_firstName_Versicherter_firstName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_firstName: Versicherter_firstName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_firstName__length", true, true);
}
	
fc['validation_Versicherte_title_Versicherte_title__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_title: Versicherte_title__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_title__length", true, true);
}
	
	
fc['validation_Versicherter_gender_Versicherter_gender__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_gender: Versicherter_gender__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_gender__length", true, true);
}
	
	
fc['validation_Geschaeftsfall_found_geschaeftsfall_Geschaeftsfall_found_geschaeftsfall__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_geschaeftsfall: Geschaeftsfall_found_geschaeftsfall__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_geschaeftsfall__length", true, true);
}
	
	
fc['validation_RuntimeIdentifier_RuntimeIdentifier__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "RuntimeIdentifier: RuntimeIdentifier__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "RuntimeIdentifier__length", true, true);
}
	
fc['validation_WorkListFasade_prozessstatus_WorkListFasade_prozessstatus__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_prozessstatus: WorkListFasade_prozessstatus__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_prozessstatus__length", true, true);
}
	
fc['validation_WorkListFasade_zusatzbezeichnung_WorkListFasade_zusatzbezeichnung__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_zusatzbezeichnung: WorkListFasade_zusatzbezeichnung__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_zusatzbezeichnung__length", true, true);
}
	
fc['validation_WorkListFasade_Field_prozessstatus_WorkListFasade_Field_prozessstatus__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_prozessstatus: WorkListFasade_Field_prozessstatus__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_prozessstatus__length", true, true);
}
	
	
fc['validation_Versicherte_VSPartnerID_Versicherte_VSPartnerID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_VSPartnerID: Versicherte_VSPartnerID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_VSPartnerID__length", true, true);
}
	
fc['validation_Frist_Frist__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Frist: Frist__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Frist__datetime", true, true);
}
	
	
fc['validation_Dokument_dokumentID_Dokument_dokumentID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_dokumentID: Dokument_dokumentID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_dokumentID__length", true, true);
}
	
fc['validation_WorkListFasade_Field_dokEingangsdatum_WorkListFasade_Field_dokEingangsdatum__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_dokEingangsdatum: WorkListFasade_Field_dokEingangsdatum__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_dokEingangsdatum__datetime", true, true);
}
	
fc['validation_Geschaeftsfall_senderName_Geschaeftsfall_senderName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_senderName: Geschaeftsfall_senderName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_senderName__length", true, true);
}
	
fc['validation_Versicherte_birthDate_Versicherte_birthDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_birthDate: Versicherte_birthDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_birthDate__datetime", true, true);
}
	
fc['validation_WorkListFasade_Field_geschaeftsfallNr_WorkListFasade_Field_geschaeftsfallNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_geschaeftsfallNr: WorkListFasade_Field_geschaeftsfallNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_geschaeftsfallNr__length", true, true);
}
	
fc['validation_WorkListFasade_Field_versVorname_WorkListFasade_Field_versVorname__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_versVorname: WorkListFasade_Field_versVorname__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_versVorname__length", true, true);
}
	
	
	
fc['validation_Dokument_documentScanDate_Dokument_documentScanDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentScanDate: Dokument_documentScanDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentScanDate__datetime", true, true);
}
	
	
fc['validation_WorkListFasade_Field_versNachname_WorkListFasade_Field_versNachname__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 64) ? true : [context.control.getLabel(), \'64\'] : context.value.length <= 64;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_versNachname: WorkListFasade_Field_versNachname__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_versNachname__length", true, true);
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
	
fc['validation_WorkListFasade_Field_versichNr_WorkListFasade_Field_versichNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 64) ? true : [context.control.getLabel(), \'64\'] : context.value.length <= 64;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_versichNr: WorkListFasade_Field_versichNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_versichNr__length", true, true);
}
	
fc['validation_Geschaeftsfall_found_dokumentenArt_Geschaeftsfall_found_dokumentenArt__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_dokumentenArt: Geschaeftsfall_found_dokumentenArt__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_dokumentenArt__length", true, true);
}
	
fc['validation_Mitglied_accountNumber_Mitglied_accountNumber__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_accountNumber: Mitglied_accountNumber__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_accountNumber__length", true, true);
}
	
	
fc['validation_WorkListFasade_Field_zusatzbezeichnung_WorkListFasade_Field_zusatzbezeichnung__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_zusatzbezeichnung: WorkListFasade_Field_zusatzbezeichnung__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_zusatzbezeichnung__length", true, true);
}
	
	
	
	
	
fc['validation_Versicherter_VSPartnerID_Versicherter_VSPartnerID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_VSPartnerID: Versicherter_VSPartnerID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_VSPartnerID__length", true, true);
}
	
fc['validation_WorkListFasade_abrechNr_WorkListFasade_abrechNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_abrechNr: WorkListFasade_abrechNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_abrechNr__length", true, true);
}
	
fc['validation_Geschaeftsfall_workflowDate_Geschaeftsfall_workflowDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_workflowDate: Geschaeftsfall_workflowDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_workflowDate__datetime", true, true);
}
	
	
	
	
fc['validation_Versicherte_firstName_Versicherte_firstName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_firstName: Versicherte_firstName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_firstName__length", true, true);
}
	
fc['validation_WorkListFasade_aktuelleBearbeiter_WorkListFasade_aktuelleBearbeiter__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_aktuelleBearbeiter: WorkListFasade_aktuelleBearbeiter__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_aktuelleBearbeiter__length", true, true);
}
	
fc['validation_Versicherte_personID_Versicherte_personID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_personID: Versicherte_personID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_personID__length", true, true);
}
	
	
fc['validation_WorkListFasade_versNachname_WorkListFasade_versNachname__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 64) ? true : [context.control.getLabel(), \'64\'] : context.value.length <= 64;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_versNachname: WorkListFasade_versNachname__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_versNachname__length", true, true);
}
	
	
	
fc['validation_actionToDo_actionToDo__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "actionToDo: actionToDo__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "actionToDo__length", true, true);
}
	
fc['validation_Mitglied_MGPartnerID_Mitglied_MGPartnerID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_MGPartnerID: Mitglied_MGPartnerID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_MGPartnerID__length", true, true);
}
	
fc['validation_Dokument_anmeldenummer_Dokument_anmeldenummer__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_anmeldenummer: Dokument_anmeldenummer__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_anmeldenummer__length", true, true);
}
	
fc['validation_Versicherter_birthDate_Versicherter_birthDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_birthDate: Versicherter_birthDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_birthDate__datetime", true, true);
}
	
fc['validation_Dokument_documentDateOfReceipt_Dokument_documentDateOfReceipt__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentDateOfReceipt: Dokument_documentDateOfReceipt__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Dokument_documentDateOfReceipt__datetime", true, true);
}
	
	
fc['validation_Versicherter_title_Versicherter_title__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_title: Versicherter_title__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_title__length", true, true);
}
	
fc['validation_WorkListFasade_dokumentenArt_WorkListFasade_dokumentenArt__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_dokumentenArt: WorkListFasade_dokumentenArt__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_dokumentenArt__length", true, true);
}
	
	
fc['validation_WorkListFasade_unternehmensID_WorkListFasade_unternehmensID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_unternehmensID: WorkListFasade_unternehmensID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_unternehmensID__length", true, true);
}
	
fc['validation_action_action__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "action: action__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "action__length", true, true);
}
	
	
	
fc['validation_WorkListFasade_versVorname_WorkListFasade_versVorname__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_versVorname: WorkListFasade_versVorname__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_versVorname__length", true, true);
}
	
fc['validation_WorkListFasade_Field_unternehmensID_WorkListFasade_Field_unternehmensID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_unternehmensID: WorkListFasade_Field_unternehmensID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_unternehmensID__length", true, true);
}
	
fc['validation_Geschaeftsfall_workflowState_Geschaeftsfall_workflowState__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_workflowState: Geschaeftsfall_workflowState__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_workflowState__length", true, true);
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
	
	
	
fc['validation_WorkListFasade_Field_aktuelleBearbeiter_WorkListFasade_Field_aktuelleBearbeiter__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_aktuelleBearbeiter: WorkListFasade_Field_aktuelleBearbeiter__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_aktuelleBearbeiter__length", true, true);
}
	
fc['validation_Versicherter_secureNumber_Versicherter_secureNumber__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_secureNumber: Versicherter_secureNumber__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherter_secureNumber__length", true, true);
}
	
	
	
fc['validation_Mitglied_anmeldenummer_Mitglied_anmeldenummer__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_anmeldenummer: Mitglied_anmeldenummer__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_anmeldenummer__length", true, true);
}
	
	
fc['validation_Versicherte_secureNumber_Versicherte_secureNumber__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_secureNumber: Versicherte_secureNumber__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Versicherte_secureNumber__length", true, true);
}
	
	
	
	
fc['validation_Geschaeftsfall_found_versichNr_Geschaeftsfall_found_versichNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_versichNr: Geschaeftsfall_found_versichNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_versichNr__length", true, true);
}
	
	
fc['validation_Geschaeftsfall_PKID_Geschaeftsfall_PKID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_PKID: Geschaeftsfall_PKID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_PKID__length", true, true);
}
	
fc['validation_Mitglied_additionalName_Mitglied_additionalName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_additionalName: Mitglied_additionalName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Mitglied_additionalName__length", true, true);
}
	
	
fc['validation_WorkListFasade_Field_anmeldeNr_WorkListFasade_Field_anmeldeNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_anmeldeNr: WorkListFasade_Field_anmeldeNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_anmeldeNr__length", true, true);
}
	
fc['validation_WorkListFasade_Field_dokumentenArt_WorkListFasade_Field_dokumentenArt__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_dokumentenArt: WorkListFasade_Field_dokumentenArt__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_Field_dokumentenArt__length", true, true);
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
		this.getVersicherter = function() {
			return this.form.dataMap['Versicherter'].getValue();
		};
		this.setVersicherter = function(value) {
			return this.form.dataMap['Versicherter'].setValue(value);
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
		this.getDokument = function() {
			return this.form.dataMap['Dokument'].getValue();
		};
		this.setDokument = function(value) {
			return this.form.dataMap['Dokument'].setValue(value);
		};
		this.getWorkListFasade = function() {
			return this.form.dataMap['WorkListFasade'].getValue();
		};
		this.setWorkListFasade = function(value) {
			return this.form.dataMap['WorkListFasade'].setValue(value);
		};
		this.getWorkflowID = function(useInternal) {
			return this.form.dataMap['WorkflowID'].getValue(useInternal);
		};
		this.setWorkflowID = function(value) {
			return this.form.dataMap['WorkflowID'].setValue(value);
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
		this.getWP_Verfuegung_zum_Gesuch = function(useInternal) {
			return this.form.dataMap['WP_Verfuegung_zum_Gesuch'].getValue(useInternal);
		};
		this.setWP_Verfuegung_zum_Gesuch = function(value) {
			return this.form.dataMap['WP_Verfuegung_zum_Gesuch'].setValue(value);
		};
		this.getWP_Gesuch_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Gesuch_anzeigen'].getValue(useInternal);
		};
		this.setWP_Gesuch_anzeigen = function(value) {
			return this.form.dataMap['WP_Gesuch_anzeigen'].setValue(value);
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
		this.getWP_WW_Protokolle_bearbeiten = function(useInternal) {
			return this.form.dataMap['WP_WW_Protokolle_bearbeiten'].getValue(useInternal);
		};
		this.setWP_WW_Protokolle_bearbeiten = function(value) {
			return this.form.dataMap['WP_WW_Protokolle_bearbeiten'].setValue(value);
		};
		this.getSP_Zurueck_zu_Eingang_pruefen = function(useInternal) {
			return this.form.dataMap['SP_Zurueck_zu_Eingang_pruefen'].getValue(useInternal);
		};
		this.setSP_Zurueck_zu_Eingang_pruefen = function(value) {
			return this.form.dataMap['SP_Zurueck_zu_Eingang_pruefen'].setValue(value);
		};
		this.getMasterProcessID = function(useInternal) {
			return this.form.dataMap['MasterProcessID'].getValue(useInternal);
		};
		this.setMasterProcessID = function(value) {
			return this.form.dataMap['MasterProcessID'].setValue(value);
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
		this.getCorrelationID = function(useInternal) {
			return this.form.dataMap['CorrelationID'].getValue(useInternal);
		};
		this.setCorrelationID = function(value) {
			return this.form.dataMap['CorrelationID'].setValue(value);
		};
		this.getWorkListFasade_Field = function() {
			return this.form.dataMap['WorkListFasade_Field'].getValue();
		};
		this.setWorkListFasade_Field = function(value) {
			return this.form.dataMap['WorkListFasade_Field'].setValue(value);
		};
		this.getWP_Geschaeftsfall_klammern = function(useInternal) {
			return this.form.dataMap['WP_Geschaeftsfall_klammern'].getValue(useInternal);
		};
		this.setWP_Geschaeftsfall_klammern = function(value) {
			return this.form.dataMap['WP_Geschaeftsfall_klammern'].setValue(value);
		};
		this.getVersicherte = function() {
			return this.form.dataMap['Versicherte'].getValue();
		};
		this.setVersicherte = function(value) {
			return this.form.dataMap['Versicherte'].setValue(value);
		};
		this.getZ_Fall_erledigt_Ablage = function(useInternal) {
			return this.form.dataMap['Z_Fall_erledigt_Ablage'].getValue(useInternal);
		};
		this.setZ_Fall_erledigt_Ablage = function(value) {
			return this.form.dataMap['Z_Fall_erledigt_Ablage'].setValue(value);
		};
		this.getWP_eM_IV_Akte_anfordern = function(useInternal) {
			return this.form.dataMap['WP_eM_IV_Akte_anfordern'].getValue(useInternal);
		};
		this.setWP_eM_IV_Akte_anfordern = function(value) {
			return this.form.dataMap['WP_eM_IV_Akte_anfordern'].setValue(value);
		};
		this.getUserCompleteTaskGuid = function(useInternal) {
			return this.form.dataMap['UserCompleteTaskGuid'].getValue(useInternal);
		};
		this.setUserCompleteTaskGuid = function(value) {
			return this.form.dataMap['UserCompleteTaskGuid'].setValue(value);
		};
		this.getWP_IK_Erstellen_VA_Eroeffnen_IK = function(useInternal) {
			return this.form.dataMap['WP_IK_Erstellen_VA_Eroeffnen_IK'].getValue(useInternal);
		};
		this.setWP_IK_Erstellen_VA_Eroeffnen_IK = function(value) {
			return this.form.dataMap['WP_IK_Erstellen_VA_Eroeffnen_IK'].setValue(value);
		};
		this.getWP_Aktenbestellung_DMC = function(useInternal) {
			return this.form.dataMap['WP_Aktenbestellung_DMC'].getValue(useInternal);
		};
		this.setWP_Aktenbestellung_DMC = function(value) {
			return this.form.dataMap['WP_Aktenbestellung_DMC'].setValue(value);
		};
		this.getGeschaeftsfall_found = function() {
			return this.form.dataMap['Geschaeftsfall_found'].getValue();
		};
		this.getWeiterleitung_an_IV_Sachbearbeiter = function(useInternal) {
			return this.form.dataMap['Weiterleitung_an_IV_Sachbearbeiter'].getValue(useInternal);
		};
		this.setWeiterleitung_an_IV_Sachbearbeiter = function(value) {
			return this.form.dataMap['Weiterleitung_an_IV_Sachbearbeiter'].setValue(value);
		};
		this.getSP_erstelle_neueWorkflows = function(useInternal) {
			return this.form.dataMap['SP_erstelle_neueWorkflows'].getValue(useInternal);
		};
		this.setSP_erstelle_neueWorkflows = function(value) {
			return this.form.dataMap['SP_erstelle_neueWorkflows'].setValue(value);
		};
	}
	   
            
            
            
            
            
            
            
            
            
	   
	   
};
tibcoforms.formCode['_i6WmUC98Eem8NYwCvBPJhw']['defineValidations']();
