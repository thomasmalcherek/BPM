

if (typeof(tibcoforms) == 'undefined') tibcoforms = new Object();
if (typeof(tibcoforms.formCode) == 'undefined') tibcoforms.formCode = new Object();
tibcoforms.formCode['_IhHlMP5aEeiFLcX4iMwVPw'] = new Object();
tibcoforms.formCode['_IhHlMP5aEeiFLcX4iMwVPw']['defineActions'] = function() {
var fc = tibcoforms.formCode['_IhHlMP5aEeiFLcX4iMwVPw'];
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
tibcoforms.formCode['_IhHlMP5aEeiFLcX4iMwVPw']['defineActions']();

tibcoforms.formCode['_IhHlMP5aEeiFLcX4iMwVPw']['defineValidations'] = function() {
var fc = tibcoforms.formCode['_IhHlMP5aEeiFLcX4iMwVPw'];
	
	
	
	
	
	
	
	
	
	
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
		this.getWp_case_closed = function(useInternal) {
			return this.form.dataMap['wp_case_closed'].getValue(useInternal);
		};
		this.setWp_case_closed = function(value) {
			return this.form.dataMap['wp_case_closed'].setValue(value);
		};
		this.getBack_to_main_process = function(useInternal) {
			return this.form.dataMap['back_to_main_process'].getValue(useInternal);
		};
		this.setBack_to_main_process = function(value) {
			return this.form.dataMap['back_to_main_process'].setValue(value);
		};
		this.getSp_brief_schreiben = function(useInternal) {
			return this.form.dataMap['sp_brief_schreiben'].getValue(useInternal);
		};
		this.setSp_brief_schreiben = function(value) {
			return this.form.dataMap['sp_brief_schreiben'].setValue(value);
		};
		this.getSp_wiedervorlagen = function(useInternal) {
			return this.form.dataMap['sp_wiedervorlagen'].getValue(useInternal);
		};
		this.setSp_wiedervorlagen = function(value) {
			return this.form.dataMap['sp_wiedervorlagen'].setValue(value);
		};
	}
	   
	   
	   
};
tibcoforms.formCode['_IhHlMP5aEeiFLcX4iMwVPw']['defineValidations']();
