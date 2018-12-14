

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_i-GF4P-wEeitVo1lH3Co-Q'] = new Object();
tibcoforms.formCode['_i-GF4P-wEeitVo1lH3Co-Q']['defineActions'] = function() {
var fc = tibcoforms.formCode['_i-GF4P-wEeitVo1lH3Co-Q'];
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
tibcoforms.formCode['_i-GF4P-wEeitVo1lH3Co-Q']['defineActions']();

tibcoforms.formCode['_i-GF4P-wEeitVo1lH3Co-Q']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_i-GF4P-wEeitVo1lH3Co-Q'];
	
fc['validation_IN_ParGeschaeftsvorfall_WFCaseID_IN_ParGeschaeftsvorfall_WFCaseID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IN_ParGeschaeftsvorfall_WFCaseID: IN_ParGeschaeftsvorfall_WFCaseID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IN_ParGeschaeftsvorfall_WFCaseID__length", true, true);
}
	
	
	
fc['validation_IN_ParGeschaeftsvorfall_geschaeftsfall_IN_ParGeschaeftsvorfall_geschaeftsfall__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 500) ? true : [context.control.getLabel(), \'500\'] : context.value.length <= 500;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IN_ParGeschaeftsvorfall_geschaeftsfall: IN_ParGeschaeftsvorfall_geschaeftsfall__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IN_ParGeschaeftsvorfall_geschaeftsfall__length", true, true);
}
	
	
fc['validation_IN_ParGeschaeftsvorfall_partnerID_IN_ParGeschaeftsvorfall_partnerID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IN_ParGeschaeftsvorfall_partnerID: IN_ParGeschaeftsvorfall_partnerID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IN_ParGeschaeftsvorfall_partnerID__length", true, true);
}
	
	
fc['validation_IN_ParGeschaeftsvorfall_AHVNummer_IN_ParGeschaeftsvorfall_AHVNummer__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IN_ParGeschaeftsvorfall_AHVNummer: IN_ParGeschaeftsvorfall_AHVNummer__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IN_ParGeschaeftsvorfall_AHVNummer__length", true, true);
}
	
	
	
	
	
fc['validation_IN_ParGeschaeftsvorfall_dokumentenArt_IN_ParGeschaeftsvorfall_dokumentenArt__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IN_ParGeschaeftsvorfall_dokumentenArt: IN_ParGeschaeftsvorfall_dokumentenArt__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IN_ParGeschaeftsvorfall_dokumentenArt__length", true, true);
}
	
	
	
	
	
	
	
	
	
	
fc['validation_IN_ParGeschaeftsvorfall_frist_IN_ParGeschaeftsvorfall_frist__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IN_ParGeschaeftsvorfall_frist: IN_ParGeschaeftsvorfall_frist__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "IN_ParGeschaeftsvorfall_frist__datetime", true, true);
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
	   form.registerPackages(['com.example.comigsfak001.Comigsfak001Package']);
       form.registerFactories(['com.example.comigsfak001.Comigsfak001Factory']);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getIN_ParGeschaeftsvorfall = function() {
			return this.form.dataMap['IN_ParGeschaeftsvorfall'].getValue();
		};
		this.setIN_ParGeschaeftsvorfall = function(value) {
			return this.form.dataMap['IN_ParGeschaeftsvorfall'].setValue(value);
		};
		this.getSp_wiedervorlagen = function(useInternal) {
			return this.form.dataMap['sp_wiedervorlagen'].getValue(useInternal);
		};
		this.setSp_wiedervorlagen = function(value) {
			return this.form.dataMap['sp_wiedervorlagen'].setValue(value);
		};
		this.getWp_pv_daten_administrieren = function(useInternal) {
			return this.form.dataMap['wp_pv_daten_administrieren'].getValue(useInternal);
		};
		this.setWp_pv_daten_administrieren = function(value) {
			return this.form.dataMap['wp_pv_daten_administrieren'].setValue(value);
		};
		this.getWp_fak_erfassung_bezueger_pruefen = function(useInternal) {
			return this.form.dataMap['wp_fak_erfassung_bezueger_pruefen'].getValue(useInternal);
		};
		this.setWp_fak_erfassung_bezueger_pruefen = function(value) {
			return this.form.dataMap['wp_fak_erfassung_bezueger_pruefen'].setValue(value);
		};
		this.getWp_el_pruefen = function(useInternal) {
			return this.form.dataMap['wp_el_pruefen'].getValue(useInternal);
		};
		this.setWp_el_pruefen = function(value) {
			return this.form.dataMap['wp_el_pruefen'].setValue(value);
		};
		this.getWp_pendenzen_erstellen_partner = function(useInternal) {
			return this.form.dataMap['wp_pendenzen_erstellen_partner'].getValue(useInternal);
		};
		this.setWp_pendenzen_erstellen_partner = function(value) {
			return this.form.dataMap['wp_pendenzen_erstellen_partner'].setValue(value);
		};
		this.getWp_fak_bezueger_aktivieren = function(useInternal) {
			return this.form.dataMap['wp_fak_bezueger_aktivieren'].getValue(useInternal);
		};
		this.setWp_fak_bezueger_aktivieren = function(value) {
			return this.form.dataMap['wp_fak_bezueger_aktivieren'].setValue(value);
		};
		this.getWp_el_pruefen_starten = function(useInternal) {
			return this.form.dataMap['wp_el_pruefen_starten'].getValue(useInternal);
		};
		this.setWp_el_pruefen_starten = function(value) {
			return this.form.dataMap['wp_el_pruefen_starten'].setValue(value);
		};
		this.getWp_fak_dokumente_erstellen = function(useInternal) {
			return this.form.dataMap['wp_fak_dokumente_erstellen'].getValue(useInternal);
		};
		this.setWp_fak_dokumente_erstellen = function(value) {
			return this.form.dataMap['wp_fak_dokumente_erstellen'].setValue(value);
		};
		this.getSp_brief_schreiben = function(useInternal) {
			return this.form.dataMap['sp_brief_schreiben'].getValue(useInternal);
		};
		this.setSp_brief_schreiben = function(value) {
			return this.form.dataMap['sp_brief_schreiben'].setValue(value);
		};
		this.getWp_ik_va_erfassen_interner_auftraggeber = function(useInternal) {
			return this.form.dataMap['wp_ik_va_erfassen_interner_auftraggeber'].getValue(useInternal);
		};
		this.setWp_ik_va_erfassen_interner_auftraggeber = function(value) {
			return this.form.dataMap['wp_ik_va_erfassen_interner_auftraggeber'].setValue(value);
		};
		this.getSp_weiterleiten_doku_steuerung = function(useInternal) {
			return this.form.dataMap['sp_weiterleiten_doku_steuerung'].getValue(useInternal);
		};
		this.setSp_weiterleiten_doku_steuerung = function(value) {
			return this.form.dataMap['sp_weiterleiten_doku_steuerung'].setValue(value);
		};
		this.getWp_case_closed = function(useInternal) {
			return this.form.dataMap['wp_case_closed'].getValue(useInternal);
		};
		this.setWp_case_closed = function(value) {
			return this.form.dataMap['wp_case_closed'].setValue(value);
		};
	}
	   
            
	   
	   
};
tibcoforms.formCode['_i-GF4P-wEeitVo1lH3Co-Q']['defineValidations']();
