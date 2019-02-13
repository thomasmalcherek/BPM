if (typeof(comigsformswidgets) == 'undefined') comigsformswidgets = new Object();
if (typeof(comigsformswidgets.library) == 'undefined') comigsformswidgets.library = new Object();
if (typeof(comigsformswidgets.library.NavigationWidgetWrapper) == 'undefined') {

	comigsformswidgets.library.NavigationWidgetWrapper = function(){};
    console.log("start igs forms - navigation widget");
    
    var wrapper = comigsformswidgets.library.NavigationWidgetWrapper;

    wrapper.MARKUP = "" + 
        "<div class='jsGridNavi'>" +        	
        	"<div id='naviheader' style='width: 100% !important'>" +
      			"<div id='navi'></div>" +      			
      		"</div>" +    			
        "</div>";

    wrapper.prototype.initialize = function(component, renderMode) {
    	console.log("initialize navigation widget");        
    	
        this.component = component;
    	this.renderMode = renderMode;
    	this.rendered = false;
    	
    	// The logger available here has the same API as the logger available within Form action scripts. 
        this.logger = this.component.getLogger();
        if (this.logger.isDebugEnabled()) this.logger.debug("NavigationWidgetWrapper.initialize(). renderMode: " + renderMode);
        
    	var parent = this.component.getParentNode();	
    	$(parent).html(comigsformswidgets.library.NavigationWidgetWrapper.MARKUP);
    	
    	this.rendered = true;
    };
        
    wrapper.prototype.refresh = function(updates) {  
    	console.log("refresh navigation widget ...");
    	var self = this;  
    	
    	var actions = self.component.getControl().form.getParameterValue("action");
    	
    	var html = "";
    	actions.forEach(createActions);
  	  	
	  	function createActions(item, index) {
			//html = html + "<img src='widget-images/check_24.gif'/><label class='labelFunktionen'>"+item+"</label><br>";
	  		html = html + "<span id='dotCircle"+item+"' class='dotCircle'></span><span id='"+item+"' class='dotGreen' style='display: none'></span>&nbsp;&nbsp;<label class='labelFunktionen'>" + item.split("_").join(" ") + "</label><br>";
		}  	
	  	      
	  	//console.log("navigation widget - dynamic html source: " + html);
        $('#navi').html(html);

        actions.forEach(toggleState);  	  	
	  	function toggleState(item, index) {
	  		var isDone = self.component.getControl().form.getParameterValue(item);
	  		if(isDone==true){
	  			$( "#dotCircle"+item+"" ).toggle();
	  			$( "#"+item+"" ).toggle( "slow", function() {});	  			
	  		}
		}
        
        $('#naviheader label').click(function() {
            //alert('You clicked a label named ' + $(this).html() +'!');
        	var actionToDo = $(this).html();
            self.component.getControl().form.setParameterValue("actionToDo", actionToDo.split(" ").join("_") );    		  
    		self.component.getControl().form.invokeAction('submit', self, self.component);
        });           
    };
    
    wrapper.prototype.destroy = function() {    	
    };
    
}
