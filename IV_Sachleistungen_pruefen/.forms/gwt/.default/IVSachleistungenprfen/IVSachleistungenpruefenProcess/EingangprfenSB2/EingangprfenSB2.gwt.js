

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_uJY_ABW8Eemwx6NixRoh7A'] = new Object();
tibcoforms.formCode['_uJY_ABW8Eemwx6NixRoh7A']['defineActions'] = function() {
var fc = tibcoforms.formCode['_uJY_ABW8Eemwx6NixRoh7A'];
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
tibcoforms.formCode['_uJY_ABW8Eemwx6NixRoh7A']['defineActions']();

tibcoforms.formCode['_uJY_ABW8Eemwx6NixRoh7A']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_uJY_ABW8Eemwx6NixRoh7A'];
	
	
	
	
	
	
	
	
	
	
fc['validation_actionToDo_actionToDo__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "actionToDo: actionToDo__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "actionToDo__length", true, true);
}
	
	
	
	
	
	
	
fc['validation_Frist_Frist__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Frist: Frist__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Frist__datetime", true, true);
}
	
	
	
	
	
	
fc['validation_action_action__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "action: action__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "action__length", true, true);
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
	   form.registerPackages([]);
       form.registerFactories([]);
	}
	fc['DataModel']=function(formId) {
		this.form = tibcoforms.formCache[formId];
		this.getWP_eM_IV_Akte_anfordern = function(useInternal) {
			return this.form.dataMap['WP_eM_IV_Akte_anfordern'].getValue(useInternal);
		};
		this.setWP_eM_IV_Akte_anfordern = function(value) {
			return this.form.dataMap['WP_eM_IV_Akte_anfordern'].setValue(value);
		};
		this.getWP_eM_Nachlieferung_IVST_IVST = function(useInternal) {
			return this.form.dataMap['WP_eM_Nachlieferung_IVST_IVST'].getValue(useInternal);
		};
		this.setWP_eM_Nachlieferung_IVST_IVST = function(value) {
			return this.form.dataMap['WP_eM_Nachlieferung_IVST_IVST'].setValue(value);
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
		this.getWP_WW_Protokolle_bearbeiten = function(useInternal) {
			return this.form.dataMap['WP_WW_Protokolle_bearbeiten'].getValue(useInternal);
		};
		this.setWP_WW_Protokolle_bearbeiten = function(value) {
			return this.form.dataMap['WP_WW_Protokolle_bearbeiten'].setValue(value);
		};
		this.getWP_Gesuch_anzeigen = function(useInternal) {
			return this.form.dataMap['WP_Gesuch_anzeigen'].getValue(useInternal);
		};
		this.setWP_Gesuch_anzeigen = function(value) {
			return this.form.dataMap['WP_Gesuch_anzeigen'].setValue(value);
		};
		this.getWP_Aktenbestellung_DMC = function(useInternal) {
			return this.form.dataMap['WP_Aktenbestellung_DMC'].getValue(useInternal);
		};
		this.setWP_Aktenbestellung_DMC = function(value) {
			return this.form.dataMap['WP_Aktenbestellung_DMC'].setValue(value);
		};
		this.getWP_IK_Ausz_ZAS_best_EP = function(useInternal) {
			return this.form.dataMap['WP_IK_Ausz_ZAS_best_EP'].getValue(useInternal);
		};
		this.setWP_IK_Ausz_ZAS_best_EP = function(value) {
			return this.form.dataMap['WP_IK_Ausz_ZAS_best_EP'].setValue(value);
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
		this.getUserCompleteTaskGuid = function(useInternal) {
			return this.form.dataMap['UserCompleteTaskGuid'].getValue(useInternal);
		};
		this.setUserCompleteTaskGuid = function(value) {
			return this.form.dataMap['UserCompleteTaskGuid'].setValue(value);
		};
	}
	   
	   
	   
};
tibcoforms.formCode['_uJY_ABW8Eemwx6NixRoh7A']['defineValidations']();
