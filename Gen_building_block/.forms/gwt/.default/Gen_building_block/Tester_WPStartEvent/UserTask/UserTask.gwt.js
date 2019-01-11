

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_g8P3ABW2Eemwx6NixRoh7A'] = new Object();
tibcoforms.formCode['_g8P3ABW2Eemwx6NixRoh7A']['defineActions'] = function() {
var fc = tibcoforms.formCode['_g8P3ABW2Eemwx6NixRoh7A'];
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
tibcoforms.formCode['_g8P3ABW2Eemwx6NixRoh7A']['defineActions']();

tibcoforms.formCode['_g8P3ABW2Eemwx6NixRoh7A']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_g8P3ABW2Eemwx6NixRoh7A'];
	
fc['validation_DokumentenArt_DokumentenArt__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "DokumentenArt: DokumentenArt__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "DokumentenArt__length", true, true);
}
	
	
	
fc['validation_AHVNummer_AHVNummer__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "AHVNummer: AHVNummer__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "AHVNummer__length", true, true);
}
	
	
fc['validation_Geschaeftsfall_Geschaeftsfall__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkNumberConstraint(context.stringValue, 9, 0) ? true : [context.control.getLabel(), \'9\'] : !isNaN(context.value) && this.getForm().numberFormat(context.value,9, 0);';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall: Geschaeftsfall__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Geschaeftsfall__length", true, true);
}
	
	
	
fc['validation_Frist_Frist__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Frist: Frist__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "Frist__datetime", true, true);
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
		this.getGeschaeftsfall = function(useInternal) {
			return this.form.dataMap['Geschaeftsfall'].getValue(useInternal);
		};
		this.setGeschaeftsfall = function(value) {
			return this.form.dataMap['Geschaeftsfall'].setValue(value);
		};
		this.getDokumentenArt = function(useInternal) {
			return this.form.dataMap['DokumentenArt'].getValue(useInternal);
		};
		this.setDokumentenArt = function(value) {
			return this.form.dataMap['DokumentenArt'].setValue(value);
		};
		this.getAHVNummer = function(useInternal) {
			return this.form.dataMap['AHVNummer'].getValue(useInternal);
		};
		this.setAHVNummer = function(value) {
			return this.form.dataMap['AHVNummer'].setValue(value);
		};
		this.getFrist = function(useInternal) {
			return this.form.dataMap['Frist'].getValue(useInternal);
		};
		this.setFrist = function(value) {
			return this.form.dataMap['Frist'].setValue(value);
		};
	}
	   
	   
	   
};
tibcoforms.formCode['_g8P3ABW2Eemwx6NixRoh7A']['defineValidations']();
