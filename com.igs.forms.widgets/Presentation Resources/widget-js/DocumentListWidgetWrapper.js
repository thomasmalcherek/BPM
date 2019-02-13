if (typeof(comigsformswidgets) == 'undefined') comigsformswidgets = new Object();
if (typeof(comigsformswidgets.library) == 'undefined') comigsformswidgets.library = new Object();
if (typeof(comigsformswidgets.library.DocumentListWidgetWrapper) == 'undefined') {

	comigsformswidgets.library.DocumentListWidgetWrapper = function(){};
    console.log("start igs forms - docs widget");
    var wrapper = comigsformswidgets.library.DocumentListWidgetWrapper;

    wrapper.MARKUP = "" + 
        "<div>" + 
        	"<div>" +
      			"<div id='jsGridDocs' class='jsGridDocs'></div>" +      			
      		"</div>" +      		
        "</div>";

    wrapper.prototype.initialize = function(component, renderMode) {
    	console.log("initialize docs widget");   
    	
        this.component = component;
    	this.renderMode = renderMode;
    	this.rendered = false;

        this.logger = this.component.getLogger();
        if (this.logger.isDebugEnabled()) this.logger.debug("DocumentListWidgetWrapper.initialize(). renderMode: " + renderMode);
        
    	var parent = this.component.getParentNode();	
    	$(parent).html(comigsformswidgets.library.DocumentListWidgetWrapper.MARKUP);
    	
    	var data = [
    	            { "Dokumentname": "Anfrage - Otto Clay" , "Dokumentart": "Anfrage", "Dok-Datum": "01.02.2018",
    	            	"Link": "http://ssva90321:9081/navigator/bookmark.jsp?desktop=POC&repositoryId=OBST1&repositoryType=p8&docid=SVDocument%2C%7BF312E137-1531-4AA6-9AF0-558FDF50A16B%7D%2C%7BE55AD6C8-0183-49AD-8CFB-38F4A461D1EC%7D&mimeType=application%2Fpdf&template_name=SVDocument&version=released"},
    	            { "Dokumentname": "Arztentscheid Nr.1" , "Dokumentart": "Entscheid", "Dok-Datum": "12.09.2009", 
    	            	"Link": "http://ssva90321:9081/navigator/bookmark.jsp?desktop=POC&repositoryId=OBST1&repositoryType=p8&docid=SVDocument%2C%7BF312E137-1531-4AA6-9AF0-558FDF50A16B%7D%2C%7BE55AD6C8-0183-49AD-8CFB-38F4A461D1EC%7D&mimeType=application%2Fpdf&template_name=SVDocument&version=released"},
    	            { "Dokumentname": "Rente" , "Dokumentart": "Anfrage", "Dok-Datum": "09.03.2016", 
    	            	"Link": "http://ssva90321:9081/navigator/bookmark.jsp?desktop=POC&repositoryId=OBST1&repositoryType=p8&docid=SVDocument%2C%7BF312E137-1531-4AA6-9AF0-558FDF50A16B%7D%2C%7BE55AD6C8-0183-49AD-8CFB-38F4A461D1EC%7D&mimeType=application%2Fpdf&template_name=SVDocument&version=released"},
    	            { "Dokumentname": "Arztbesuch" , "Dokumentart": "Rechnung", "Dok-Datum": "15.01.2018", 
    	            	"Link": "http://ssva90321:9081/navigator/bookmark.jsp?desktop=POC&repositoryId=OBST1&repositoryType=p8&docid=SVDocument%2C%7BF312E137-1531-4AA6-9AF0-558FDF50A16B%7D%2C%7BE55AD6C8-0183-49AD-8CFB-38F4A461D1EC%7D&mimeType=application%2Fpdf&template_name=SVDocument&version=released"},
    	            { "Dokumentname": "Otto Clay" , "Dokumentart": "Verf&uuml;gung", "Dok-Datum": "03.05.2018", 
    	            	"Link": "http://ssva90321:9081/navigator/bookmark.jsp?desktop=POC&repositoryId=OBST1&repositoryType=p8&docid=SVDocument%2C%7BF312E137-1531-4AA6-9AF0-558FDF50A16B%7D%2C%7BE55AD6C8-0183-49AD-8CFB-38F4A461D1EC%7D&mimeType=application%2Fpdf&template_name=SVDocument&version=released"},
    	            { "Dokumentname": "Weiteres Dok" , "Dokumentart": "Verf&uuml;gung", "Dok-Datum": "01.08.2017", 
    	            	"Link": "http://ssva90321:9081/navigator/bookmark.jsp?desktop=POC&repositoryId=OBST1&repositoryType=p8&docid=SVDocument%2C%7BF312E137-1531-4AA6-9AF0-558FDF50A16B%7D%2C%7BE55AD6C8-0183-49AD-8CFB-38F4A461D1EC%7D&mimeType=application%2Fpdf&template_name=SVDocument&version=released"},
    	            { "Dokumentname": "Kommentar zur Entscheidung vom 1.1.15" , "Dokumentart": "Anfrage", "Dok-Datum": "17.05.2015", 
    	            	"Link": "http://ssva90321:9081/navigator/bookmark.jsp?desktop=POC&repositoryId=OBST1&repositoryType=p8&docid=SVDocument%2C%7BF312E137-1531-4AA6-9AF0-558FDF50A16B%7D%2C%7BE55AD6C8-0183-49AD-8CFB-38F4A461D1EC%7D&mimeType=application%2Fpdf&template_name=SVDocument&version=released"}    	           
    	        ];

        $("#jsGridDocs").jsGrid({
                height: 300,
                width: "100%",
         
                autoload: true,
         
                controller: {
                    loadData: function() {
                        return data;
                    }
                },
         
                fields: [                    
                    { name: "Dokumentname", type: "text", width: 160 },
                    { name: "Dokumentart", type: "text", width: 80 },
                    { name: "Dok-Datum", type: "text", width: 80 },
                    { 
                        itemTemplate: function(_, item) {
                            return $("<button>").addClass("gwt-Button control-widget button-peripheral btn btn-secondary").text("oeffnen")
                            	.on("click", function() {
                                	//alert(item.Link);
                                	window.open(item.Link, "doc");
                            	});
                      	}
                    }
                ]
           	});
    	this.rendered = true;    	
    };
        
    wrapper.prototype.refresh = function(updates) {       
    };
    
    wrapper.prototype.destroy = function() {        
    };
    
}
