

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_txPkwBW8Eemwx6NixRoh7A'] = new Object();
tibcoforms.formCode['_txPkwBW8Eemwx6NixRoh7A']['defineActions'] = function() {
var fc = tibcoforms.formCode['_txPkwBW8Eemwx6NixRoh7A'];
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
tibcoforms.formCode['_txPkwBW8Eemwx6NixRoh7A']['defineActions']();

tibcoforms.formCode['_txPkwBW8Eemwx6NixRoh7A']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_txPkwBW8Eemwx6NixRoh7A'];
	
	
	
fc['validation_Geschaeftsfall_found_ahvNummer_Geschaeftsfall_found_ahvNummer__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_ahvNummer: Geschaeftsfall_found_ahvNummer__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_ahvNummer__length", true, true);
}
	
	
fc['validation_WorkListFasade_wiedervorlagedatum_WorkListFasade_wiedervorlagedatum__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_wiedervorlagedatum: WorkListFasade_wiedervorlagedatum__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_wiedervorlagedatum__datetime", true, true);
}
	
	
fc['validation_Geschaeftsfall_found_dossierID_Geschaeftsfall_found_dossierID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_dossierID: Geschaeftsfall_found_dossierID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_dossierID__length", true, true);
}
	
fc['validation_WorkListFasade_versVorname_WorkListFasade_versVorname__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_versVorname: WorkListFasade_versVorname__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_versVorname__length", true, true);
}
	
	
	
	
	
fc['validation_WorkListFasade_dokumentenArt_WorkListFasade_dokumentenArt__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_dokumentenArt: WorkListFasade_dokumentenArt__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_dokumentenArt__length", true, true);
}
	
fc['validation_WorkListFasade_abrechNr_WorkListFasade_abrechNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_abrechNr: WorkListFasade_abrechNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_abrechNr__length", true, true);
}
	
fc['validation_WorkListFasade_zusatzbezeichnung_WorkListFasade_zusatzbezeichnung__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_zusatzbezeichnung: WorkListFasade_zusatzbezeichnung__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_zusatzbezeichnung__length", true, true);
}
	
fc['validation_WorkListFasade_versichNr_WorkListFasade_versichNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 64) ? true : [context.control.getLabel(), \'64\'] : context.value.length <= 64;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_versichNr: WorkListFasade_versichNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_versichNr__length", true, true);
}
	
	
	
fc['validation_WorkListFasade_aktuelleBearbeiter_WorkListFasade_aktuelleBearbeiter__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_aktuelleBearbeiter: WorkListFasade_aktuelleBearbeiter__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_aktuelleBearbeiter__length", true, true);
}
	
fc['validation_Geschaeftsfall_found_caseID_Geschaeftsfall_found_caseID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_caseID: Geschaeftsfall_found_caseID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_caseID__length", true, true);
}
	
fc['validation_Geschaeftsfall_found_geschaeftsfall_Geschaeftsfall_found_geschaeftsfall__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_geschaeftsfall: Geschaeftsfall_found_geschaeftsfall__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_geschaeftsfall__length", true, true);
}
	
	
fc['validation_WorkListFasade_dokEingangsdatum_WorkListFasade_dokEingangsdatum__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_dokEingangsdatum: WorkListFasade_dokEingangsdatum__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_dokEingangsdatum__datetime", true, true);
}
	
fc['validation_WorkListFasade_personenID_WorkListFasade_personenID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 64) ? true : [context.control.getLabel(), \'64\'] : context.value.length <= 64;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_personenID: WorkListFasade_personenID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_personenID__length", true, true);
}
	
fc['validation_Geschaeftsfall_found_dokumentenArt_Geschaeftsfall_found_dokumentenArt__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_dokumentenArt: Geschaeftsfall_found_dokumentenArt__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall_found_dokumentenArt__length", true, true);
}
	
fc['validation_WorkListFasade_unternehmensID_WorkListFasade_unternehmensID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_unternehmensID: WorkListFasade_unternehmensID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_unternehmensID__length", true, true);
}
	
	
fc['validation_WorkListFasade_versNachname_WorkListFasade_versNachname__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 64) ? true : [context.control.getLabel(), \'64\'] : context.value.length <= 64;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_versNachname: WorkListFasade_versNachname__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_versNachname__length", true, true);
}
	
	
fc['validation_WorkListFasade_anmeldeNr_WorkListFasade_anmeldeNr__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 20) ? true : [context.control.getLabel(), \'20\'] : context.value.length <= 20;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_anmeldeNr: WorkListFasade_anmeldeNr__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "WorkListFasade_anmeldeNr__length", true, true);
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
	   form.registerPackages(['com.example.arraymapping.ArraymappingPackage', 'com.example.worklistfasade.WorklistfasadePackage']);
       form.registerFactories(['com.example.arraymapping.ArraymappingFactory', 'com.example.worklistfasade.WorklistfasadeFactory']);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getGeschaeftsfall_found = function() {
			return this.form.dataMap['Geschaeftsfall_found'].getValue();
		};
		this.getUserCompleteTaskGuid = function(useInternal) {
			return this.form.dataMap['UserCompleteTaskGuid'].getValue(useInternal);
		};
		this.setUserCompleteTaskGuid = function(value) {
			return this.form.dataMap['UserCompleteTaskGuid'].setValue(value);
		};
		this.getWP_Geschaeftsfall_klammern = function(useInternal) {
			return this.form.dataMap['WP_Geschaeftsfall_klammern'].getValue(useInternal);
		};
		this.setWP_Geschaeftsfall_klammern = function(value) {
			return this.form.dataMap['WP_Geschaeftsfall_klammern'].setValue(value);
		};
		this.getWorkListFasade = function() {
			return this.form.dataMap['WorkListFasade'].getValue();
		};
		this.setWorkListFasade = function(value) {
			return this.form.dataMap['WorkListFasade'].setValue(value);
		};
	}
	   
            
            
            
	   
	   
};
tibcoforms.formCode['_txPkwBW8Eemwx6NixRoh7A']['defineValidations']();
