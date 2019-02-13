

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_Ww6vUC98Eem8NYwCvBPJhw'] = new Object();
tibcoforms.formCode['_Ww6vUC98Eem8NYwCvBPJhw']['defineActions'] = function() {
var fc = tibcoforms.formCode['_Ww6vUC98Eem8NYwCvBPJhw'];
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

    fc['rule_close'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "close", "validate", fc['action_validate']);
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "close", "apply", fc['action_apply']);
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "close", "close", fc['action_close']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(close) Error: " + e);
	       throw e;
	   }
	}

    fc['rule_openDossier'] = function(formId, context, thisObj) {
	   try {
			tibco.forms.Util.handleScriptAction.call(thisObj, formId, context, thisObj, "openDossier", "actionOpenDossier", fc['action_actionOpenDossier']);
	   } catch(e) {
	       tibcoforms.bridge.log_error("Rule(openDossier) Error: " + e);
	       throw e;
	   }
	}

			fc['action_actionOpenDossier'] = function(context, data, pane, control, factory, pkg, f , p) {
				 if (context.form && context.form._marked4Cancel)
					return;
				 var resource = context.form.resource;
			     var logger = tibcoforms.bridge.log_logger();
				open("http://ssva90321:9081/navigator/?desktop=POC&feature=BTCSearchViewFeature&searchId=%7BD0005668-0000-CD6D-81A1-10EDD72874F8%7D&searchCriteria=[{%22property%22%3A%22BPM_ID%22%2C%22value%22%3A%225d293e37-da91-4d51-8e68-c0399662f89d%22}]","icn");
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
tibcoforms.formCode['_Ww6vUC98Eem8NYwCvBPJhw']['defineActions']();

tibcoforms.formCode['_Ww6vUC98Eem8NYwCvBPJhw']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_Ww6vUC98Eem8NYwCvBPJhw'];
	
	
	
	
	
	
	
	
fc['validation_pane7__versicherter_personID_versicherter_personID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane7__versicherter_personID: versicherter_personID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "versicherter_personID__length", true, true);
}
	
fc['validation_pane7__versicherter_VSPartnerID_versicherter_VSPartnerID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane7__versicherter_VSPartnerID: versicherter_VSPartnerID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "versicherter_VSPartnerID__length", true, true);
}
	
fc['validation_pane7__versicherter_firstName_versicherter_firstName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane7__versicherter_firstName: versicherter_firstName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "versicherter_firstName__length", true, true);
}
	
	
	
	
	
	
	
	
	
	
	
fc['validation_pane8__geschftsfall_processUser_geschftsfall_processUser__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_processUser: geschftsfall_processUser__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_processUser__length", true, true);
}
	
	
fc['validation_pane8__geschftsfall_feedback_geschftsfall_feedback__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_feedback: geschftsfall_feedback__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_feedback__length", true, true);
}
	
fc['validation_pane8__geschftsfall_processNumber_geschftsfall_processNumber__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_processNumber: geschftsfall_processNumber__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_processNumber__length", true, true);
}
	
	
	
fc['validation_pane1__mitglied_name_mitglied_name__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_name: mitglied_name__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_name__length", true, true);
}
	
	
fc['validation_pane7__versicherter_degree_versicherter_degree__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane7__versicherter_degree: versicherter_degree__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "versicherter_degree__length", true, true);
}
	
fc['validation_pane8__geschftsfall_PKID_geschftsfall_PKID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_PKID: geschftsfall_PKID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_PKID__length", true, true);
}
	
fc['validation_pane1__mitglied_accountNumber_mitglied_accountNumber__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_accountNumber: mitglied_accountNumber__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_accountNumber__length", true, true);
}
	
fc['validation_pane8__geschftsfall_typNummer_geschftsfall_typNummer__integer'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'if (typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\') {\
  \ntibco.forms.Util.checkInteger(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue) ? true :  [context.control.getLabel()]} else {\
  \nvar regex = new RegExp(\"^-?[0-9]+$\");\
  \nregex.test(typeof context.stringValue == \'undefined\' ? context.value : context.stringValue);}';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_typNummer: geschftsfall_typNummer__integer", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_typNummer__integer", true, true);
}
fc['validation_pane8__geschftsfall_typNummer_geschftsfall_typNummer__lowerLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkLowerLimit(context.stringValue, \'-2147483648\', true) ? true : [context.control.getLabel(), \'-2147483648\'] : isNaN(context.value) || context.value.valueOf() >= -2147483648;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_typNummer: geschftsfall_typNummer__lowerLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_typNummer__lowerLimit", true, true);
}
fc['validation_pane8__geschftsfall_typNummer_geschftsfall_typNummer__upperLimit'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkUpperLimit(context.stringValue, \'2147483647\', true) ? true : [context.control.getLabel(), \'2147483647\'] : isNaN(context.value) || context.value.valueOf() <= 2147483647;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_typNummer: geschftsfall_typNummer__upperLimit", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_typNummer__upperLimit", true, true);
}
	
	
	
	
	
	
	
	
	
fc['validation_pane8__geschftsfall_workflowState_geschftsfall_workflowState__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_workflowState: geschftsfall_workflowState__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_workflowState__length", true, true);
}
	
	
fc['validation_pane1__mitglied_companyID_mitglied_companyID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_companyID: mitglied_companyID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_companyID__length", true, true);
}
	
	
fc['validation_pane7__versicherter_secureNumber_versicherter_secureNumber__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane7__versicherter_secureNumber: versicherter_secureNumber__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "versicherter_secureNumber__length", true, true);
}
	
fc['validation_pane8__geschftsfall_messagePK_geschftsfall_messagePK__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_messagePK: geschftsfall_messagePK__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_messagePK__length", true, true);
}
	
fc['validation_pane8__geschftsfall_typBezeichnung_geschftsfall_typBezeichnung__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_typBezeichnung: geschftsfall_typBezeichnung__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_typBezeichnung__length", true, true);
}
	
fc['validation_pane1__mitglied_MGPartnerID_mitglied_MGPartnerID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_MGPartnerID: mitglied_MGPartnerID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_MGPartnerID__length", true, true);
}
	
fc['validation_pane1__mitglied_additionalName_mitglied_additionalName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_additionalName: mitglied_additionalName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_additionalName__length", true, true);
}
	
fc['validation_pane7__versicherter_title_versicherter_title__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane7__versicherter_title: versicherter_title__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "versicherter_title__length", true, true);
}
	
fc['validation_pane1__mitglied_foundingDate_mitglied_foundingDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_foundingDate: mitglied_foundingDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_foundingDate__datetime", true, true);
}
	
	
	
fc['validation_pane8__geschftsfall_ownerName_geschftsfall_ownerName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_ownerName: geschftsfall_ownerName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_ownerName__length", true, true);
}
	
fc['validation_pane7__versicherter_sprache_versicherter_sprache__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane7__versicherter_sprache: versicherter_sprache__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "versicherter_sprache__length", true, true);
}
	
fc['validation_frist_frist__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "frist: frist__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "frist__datetime", true, true);
}
	
fc['validation_pane7__versicherter_birthDate_versicherter_birthDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane7__versicherter_birthDate: versicherter_birthDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "versicherter_birthDate__datetime", true, true);
}
	
fc['validation_pane1__mitglied_anmeldenummer_mitglied_anmeldenummer__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 22) ? true : [context.control.getLabel(), \'22\'] : context.value.length <= 22;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane1__mitglied_anmeldenummer: mitglied_anmeldenummer__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "mitglied_anmeldenummer__length", true, true);
}
	
fc['validation_pane8__geschftsfall_handlingReason_geschftsfall_handlingReason__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_handlingReason: geschftsfall_handlingReason__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_handlingReason__length", true, true);
}
	
fc['validation_pane7__versicherter_lastName_versicherter_lastName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane7__versicherter_lastName: versicherter_lastName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "versicherter_lastName__length", true, true);
}
	
	
fc['validation_pane7__versicherter_gender_versicherter_gender__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane7__versicherter_gender: versicherter_gender__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "versicherter_gender__length", true, true);
}
	
	
fc['validation_pane8__geschftsfall_workflowDate_geschftsfall_workflowDate__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_workflowDate: geschftsfall_workflowDate__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_workflowDate__datetime", true, true);
}
	
fc['validation_pane8__geschftsfall_senderName_geschftsfall_senderName__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "pane8__geschftsfall_senderName: geschftsfall_senderName__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "geschftsfall_senderName__length", true, true);
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
		this.getAction = function(useInternal) {
			return this.form.dataMap['action'].getValue(useInternal);
		};
		this.setAction = function(value) {
			return this.form.dataMap['action'].setValue(value);
		};
		this.getWorkflowID = function(useInternal) {
			return this.form.dataMap['WorkflowID'].getValue(useInternal);
		};
		this.setWorkflowID = function(value) {
			return this.form.dataMap['WorkflowID'].setValue(value);
		};
		this.getCorrelationID = function(useInternal) {
			return this.form.dataMap['CorrelationID'].getValue(useInternal);
		};
		this.setCorrelationID = function(value) {
			return this.form.dataMap['CorrelationID'].setValue(value);
		};
		this.getProzessStatus_Neu = function(useInternal) {
			return this.form.dataMap['ProzessStatus_Neu'].getValue(useInternal);
		};
		this.setProzessStatus_Neu = function(value) {
			return this.form.dataMap['ProzessStatus_Neu'].setValue(value);
		};
		this.getWorkListFasade = function() {
			return this.form.dataMap['WorkListFasade'].getValue();
		};
		this.setWorkListFasade = function(value) {
			return this.form.dataMap['WorkListFasade'].setValue(value);
		};
		this.getGeschaeftsfall_found = function() {
			return this.form.dataMap['Geschaeftsfall_found'].getValue();
		};
		this.getWP_Geschaeftsfall_klammern = function(useInternal) {
			return this.form.dataMap['WP_Geschaeftsfall_klammern'].getValue(useInternal);
		};
		this.setWP_Geschaeftsfall_klammern = function(value) {
			return this.form.dataMap['WP_Geschaeftsfall_klammern'].setValue(value);
		};
		this.getActionToDo = function(useInternal) {
			return this.form.dataMap['actionToDo'].getValue(useInternal);
		};
		this.setActionToDo = function(value) {
			return this.form.dataMap['actionToDo'].setValue(value);
		};
		this.getWP_Gesuch_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Gesuch_anzeigen'].getValue(useInternal);
		};
		this.setWP_Gesuch_anzeigen = function(value) {
			return this.form.dataMap['WP_Gesuch_anzeigen'].setValue(value);
		};
		this.getWP_WW_Protokolle_bearbeiten = function(useInternal) {
			return this.form.dataMap['WP_WW_Protokolle_bearbeiten'].getValue(useInternal);
		};
		this.setWP_WW_Protokolle_bearbeiten = function(value) {
			return this.form.dataMap['WP_WW_Protokolle_bearbeiten'].setValue(value);
		};
		this.getZ_Fall_erledigt_Ablage = function(useInternal) {
			return this.form.dataMap['Z_Fall_erledigt_Ablage'].getValue(useInternal);
		};
		this.setZ_Fall_erledigt_Ablage = function(value) {
			return this.form.dataMap['Z_Fall_erledigt_Ablage'].setValue(value);
		};
		this.getWP_IK_Auszug_drucken_VP = function(useInternal) {
			return this.form.dataMap['WP_IK_Auszug_drucken_VP'].getValue(useInternal);
		};
		this.setWP_IK_Auszug_drucken_VP = function(value) {
			return this.form.dataMap['WP_IK_Auszug_drucken_VP'].setValue(value);
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
		this.getWP_IK_Ausz_ZAS_best_loeschen = function(useInternal) {
			return this.form.dataMap['WP_IK_Ausz_ZAS_best_loeschen'].getValue(useInternal);
		};
		this.setWP_IK_Ausz_ZAS_best_loeschen = function(value) {
			return this.form.dataMap['WP_IK_Ausz_ZAS_best_loeschen'].setValue(value);
		};
		this.getWP_IK_Ausz_ZAS_best_EP = function(useInternal) {
			return this.form.dataMap['WP_IK_Ausz_ZAS_best_EP'].getValue(useInternal);
		};
		this.setWP_IK_Ausz_ZAS_best_EP = function(value) {
			return this.form.dataMap['WP_IK_Ausz_ZAS_best_EP'].setValue(value);
		};
		this.getWP_eM_Nachlieferung_IVST_IVST = function(useInternal) {
			return this.form.dataMap['WP_eM_Nachlieferung_IVST_IVST'].getValue(useInternal);
		};
		this.setWP_eM_Nachlieferung_IVST_IVST = function(value) {
			return this.form.dataMap['WP_eM_Nachlieferung_IVST_IVST'].setValue(value);
		};
		this.getWP_eM_IV_Akte_anfordern = function(useInternal) {
			return this.form.dataMap['WP_eM_IV_Akte_anfordern'].getValue(useInternal);
		};
		this.setWP_eM_IV_Akte_anfordern = function(value) {
			return this.form.dataMap['WP_eM_IV_Akte_anfordern'].setValue(value);
		};
		this.getSP_Wiedervorlage = function(useInternal) {
			return this.form.dataMap['SP_Wiedervorlage'].getValue(useInternal);
		};
		this.setSP_Wiedervorlage = function(value) {
			return this.form.dataMap['SP_Wiedervorlage'].setValue(value);
		};
		this.getFrist = function(useInternal) {
			return this.form.dataMap['Frist'].getValue(useInternal);
		};
		this.setFrist = function(value) {
			return this.form.dataMap['Frist'].setValue(value);
		};
		this.getWarteKorbPerformer = function(useInternal) {
			return this.form.dataMap['WarteKorbPerformer'].getValue(useInternal);
		};
		this.setWarteKorbPerformer = function(value) {
			return this.form.dataMap['WarteKorbPerformer'].setValue(value);
		};
		this.getWP_Aktenbestellung_DMC = function(useInternal) {
			return this.form.dataMap['WP_Aktenbestellung_DMC'].getValue(useInternal);
		};
		this.setWP_Aktenbestellung_DMC = function(value) {
			return this.form.dataMap['WP_Aktenbestellung_DMC'].setValue(value);
		};
		this.getWP_IK_Erstellen_VA_Eroeffnen_IK = function(useInternal) {
			return this.form.dataMap['WP_IK_Erstellen_VA_Eroeffnen_IK'].getValue(useInternal);
		};
		this.setWP_IK_Erstellen_VA_Eroeffnen_IK = function(value) {
			return this.form.dataMap['WP_IK_Erstellen_VA_Eroeffnen_IK'].setValue(value);
		};
		this.getWP_Formular_zum_Gesuch_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Formular_zum_Gesuch_anzeigen'].getValue(useInternal);
		};
		this.setWP_Formular_zum_Gesuch_anzeigen = function(value) {
			return this.form.dataMap['WP_Formular_zum_Gesuch_anzeigen'].setValue(value);
		};
		this.getWP_Verhandlungspartner_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Verhandlungspartner_anzeigen'].getValue(useInternal);
		};
		this.setWP_Verhandlungspartner_anzeigen = function(value) {
			return this.form.dataMap['WP_Verhandlungspartner_anzeigen'].setValue(value);
		};
		this.getWP_Zuteilung_zum_Gesuch_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Zuteilung_zum_Gesuch_anzeigen'].getValue(useInternal);
		};
		this.setWP_Zuteilung_zum_Gesuch_anzeigen = function(value) {
			return this.form.dataMap['WP_Zuteilung_zum_Gesuch_anzeigen'].setValue(value);
		};
		this.getWP_eM_Aktenversand_an_UV_Antw = function(useInternal) {
			return this.form.dataMap['WP_eM_Aktenversand_an_UV_Antw'].getValue(useInternal);
		};
		this.setWP_eM_Aktenversand_an_UV_Antw = function(value) {
			return this.form.dataMap['WP_eM_Aktenversand_an_UV_Antw'].setValue(value);
		};
		this.getWP_eM_Aktenversand_an_UV = function(useInternal) {
			return this.form.dataMap['WP_eM_Aktenversand_an_UV'].getValue(useInternal);
		};
		this.setWP_eM_Aktenversand_an_UV = function(value) {
			return this.form.dataMap['WP_eM_Aktenversand_an_UV'].setValue(value);
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
		this.getWP_Auftraege_zum_Gesuch_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Auftraege_zum_Gesuch_anzeigen'].getValue(useInternal);
		};
		this.setWP_Auftraege_zum_Gesuch_anzeigen = function(value) {
			return this.form.dataMap['WP_Auftraege_zum_Gesuch_anzeigen'].setValue(value);
		};
		this.getWP_Journal_zum_Gesuch_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Journal_zum_Gesuch_anzeigen'].getValue(useInternal);
		};
		this.setWP_Journal_zum_Gesuch_anzeigen = function(value) {
			return this.form.dataMap['WP_Journal_zum_Gesuch_anzeigen'].setValue(value);
		};
		this.getSP_Anfrage_RAD = function(useInternal) {
			return this.form.dataMap['SP_Anfrage_RAD'].getValue(useInternal);
		};
		this.setSP_Anfrage_RAD = function(value) {
			return this.form.dataMap['SP_Anfrage_RAD'].setValue(value);
		};
		this.getSP_Zurueck_zu_Eingang_pruefen = function(useInternal) {
			return this.form.dataMap['SP_Zurueck_zu_Eingang_pruefen'].getValue(useInternal);
		};
		this.setSP_Zurueck_zu_Eingang_pruefen = function(value) {
			return this.form.dataMap['SP_Zurueck_zu_Eingang_pruefen'].setValue(value);
		};
		this.getSP_Zurueck_zu_Sachleistung_pruefen = function(useInternal) {
			return this.form.dataMap['SP_Zurueck_zu_Sachleistung_pruefen'].getValue(useInternal);
		};
		this.setSP_Zurueck_zu_Sachleistung_pruefen = function(value) {
			return this.form.dataMap['SP_Zurueck_zu_Sachleistung_pruefen'].setValue(value);
		};
		this.getWP_Verfuegung_zum_Gesuch = function(useInternal) {
			return this.form.dataMap['WP_Verfuegung_zum_Gesuch'].getValue(useInternal);
		};
		this.setWP_Verfuegung_zum_Gesuch = function(value) {
			return this.form.dataMap['WP_Verfuegung_zum_Gesuch'].setValue(value);
		};
		this.getStepname = function(useInternal) {
			return this.form.dataMap['Stepname'].getValue(useInternal);
		};
		this.setStepname = function(value) {
			return this.form.dataMap['Stepname'].setValue(value);
		};
		this.getVorheriger_Bearbeiter = function(useInternal) {
			return this.form.dataMap['vorheriger_Bearbeiter'].getValue(useInternal);
		};
		this.setVorheriger_Bearbeiter = function(value) {
			return this.form.dataMap['vorheriger_Bearbeiter'].setValue(value);
		};
		this.getNeuer_Bearbeiter = function(useInternal) {
			return this.form.dataMap['neuer_Bearbeiter'].getValue(useInternal);
		};
		this.setNeuer_Bearbeiter = function(value) {
			return this.form.dataMap['neuer_Bearbeiter'].setValue(value);
		};
		this.getInit_wiedervorlagedatum = function(useInternal) {
			return this.form.dataMap['init_wiedervorlagedatum'].getValue(useInternal);
		};
		this.setInit_wiedervorlagedatum = function(value) {
			return this.form.dataMap['init_wiedervorlagedatum'].setValue(value);
		};
		this.getWP_eM_Mitt_des_Beschlusses_an_ext_AK = function(useInternal) {
			return this.form.dataMap['WP_eM_Mitt_des_Beschlusses_an_ext_AK'].getValue(useInternal);
		};
		this.setWP_eM_Mitt_des_Beschlusses_an_ext_AK = function(value) {
			return this.form.dataMap['WP_eM_Mitt_des_Beschlusses_an_ext_AK'].setValue(value);
		};
		this.getResponsecode = function(useInternal) {
			return this.form.dataMap['Responsecode'].getValue(useInternal);
		};
		this.setResponsecode = function(value) {
			return this.form.dataMap['Responsecode'].setValue(value);
		};
		this.getWP_PV_Versicherter_mutieren = function(useInternal) {
			return this.form.dataMap['WP_PV_Versicherter_mutieren'].getValue(useInternal);
		};
		this.setWP_PV_Versicherter_mutieren = function(value) {
			return this.form.dataMap['WP_PV_Versicherter_mutieren'].setValue(value);
		};
		this.getTask = function(useInternal) {
			return this.form.dataMap['Task'].getValue(useInternal);
		};
		this.setTask = function(value) {
			return this.form.dataMap['Task'].setValue(value);
		};
		this.getWP_eM_Mitteilungskopie_Hilfsmittel_AHV_fuer_EL = function(useInternal) {
			return this.form.dataMap['WP_eM_Mitteilungskopie_Hilfsmittel_AHV_fuer_EL'].getValue(useInternal);
		};
		this.setWP_eM_Mitteilungskopie_Hilfsmittel_AHV_fuer_EL = function(value) {
			return this.form.dataMap['WP_eM_Mitteilungskopie_Hilfsmittel_AHV_fuer_EL'].setValue(value);
		};
		this.getWP_Auszufuehrender_Versand_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Auszufuehrender_Versand_anzeigen'].getValue(useInternal);
		};
		this.setWP_Auszufuehrender_Versand_anzeigen = function(value) {
			return this.form.dataMap['WP_Auszufuehrender_Versand_anzeigen'].setValue(value);
		};
		this.getPane8__geschftsfall = function() {
			return this.form.dataMap['pane8__geschftsfall'].getValue();
		};
		this.setPane8__geschftsfall = function(value) {
			return this.form.dataMap['pane8__geschftsfall'].setValue(value);
		};
		this.getPane7__versicherter = function() {
			return this.form.dataMap['pane7__versicherter'].getValue();
		};
		this.setPane7__versicherter = function(value) {
			return this.form.dataMap['pane7__versicherter'].setValue(value);
		};
		this.getPane1__mitglied = function() {
			return this.form.dataMap['pane1__mitglied'].getValue();
		};
		this.setPane1__mitglied = function(value) {
			return this.form.dataMap['pane1__mitglied'].setValue(value);
		};
	}
	   
	   
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	   
};
tibcoforms.formCode['_Ww6vUC98Eem8NYwCvBPJhw']['defineValidations']();
