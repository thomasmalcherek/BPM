

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_Ih5BQP5aEeiFLcX4iMwVPw'] = new Object();
tibcoforms.formCode['_Ih5BQP5aEeiFLcX4iMwVPw']['defineActions'] = function() {
var fc = tibcoforms.formCode['_Ih5BQP5aEeiFLcX4iMwVPw'];
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
tibcoforms.formCode['_Ih5BQP5aEeiFLcX4iMwVPw']['defineActions']();

tibcoforms.formCode['_Ih5BQP5aEeiFLcX4iMwVPw']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_Ih5BQP5aEeiFLcX4iMwVPw'];
	
fc['validation_ParGeschaeftsvorfall_FOUND_frist_ParGeschaeftsvorfall_FOUND_frist__datetime'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkDateTimeFormat(context.stringValue) ?  true : [context.control.getLabel()] : true;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ParGeschaeftsvorfall_FOUND_frist: ParGeschaeftsvorfall_FOUND_frist__datetime", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ParGeschaeftsvorfall_FOUND_frist__datetime", true, true);
}
	
	
	
	
fc['validation_ParGeschaeftsvorfall_FOUND_WFCaseID_ParGeschaeftsvorfall_FOUND_WFCaseID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ParGeschaeftsvorfall_FOUND_WFCaseID: ParGeschaeftsvorfall_FOUND_WFCaseID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ParGeschaeftsvorfall_FOUND_WFCaseID__length", true, true);
}
	
	
	
	
fc['validation_ParGeschaeftsvorfall_FOUND_partnerID_ParGeschaeftsvorfall_FOUND_partnerID__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ParGeschaeftsvorfall_FOUND_partnerID: ParGeschaeftsvorfall_FOUND_partnerID__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ParGeschaeftsvorfall_FOUND_partnerID__length", true, true);
}
	
	
	
fc['validation_ParGeschaeftsvorfall_FOUND_dokumentenArt_ParGeschaeftsvorfall_FOUND_dokumentenArt__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ParGeschaeftsvorfall_FOUND_dokumentenArt: ParGeschaeftsvorfall_FOUND_dokumentenArt__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ParGeschaeftsvorfall_FOUND_dokumentenArt__length", true, true);
}
	
fc['validation_ParGeschaeftsvorfall_FOUND_AHVNummer_ParGeschaeftsvorfall_FOUND_AHVNummer__length'] = function(formId, controlName, cloneUID, listIndex) {
	var valScr = 'typeof context.stringValue != \'undefined\' && typeof tibco.forms.Util != \'undefined\' ? tibco.forms.Util.checkTextLength(context.stringValue, 50) ? true : [context.control.getLabel(), \'50\'] : context.value.length <= 50;';
	// return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ParGeschaeftsvorfall_FOUND_AHVNummer: ParGeschaeftsvorfall_FOUND_AHVNummer__length", true, true);
	return tibco.forms.Util.handleInlineValidation.call(this, formId, this, cloneUID, listIndex, valScr, "ParGeschaeftsvorfall_FOUND_AHVNummer__length", true, true);
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
		this.getParGeschaeftsvorfall_FOUND = function() {
			return this.form.dataMap['ParGeschaeftsvorfall_FOUND'].getValue();
		};
		this.getSp_klammern = function(useInternal) {
			return this.form.dataMap['sp_klammern'].getValue(useInternal);
		};
		this.setSp_klammern = function(value) {
			return this.form.dataMap['sp_klammern'].setValue(value);
		};
	}
	   
            
	   
	   
};
tibcoforms.formCode['_Ih5BQP5aEeiFLcX4iMwVPw']['defineValidations']();
