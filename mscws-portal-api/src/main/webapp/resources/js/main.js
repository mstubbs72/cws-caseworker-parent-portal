$(document).ready(function(){
	$.get("../api/rest/metadata/county", function(data, status){
		//console.log(data);
        var  countyEle=$('#County');
		 	for(i = 0; i< data.length ; i++){
			countyEle.append("<option value="+data[i].countyNumber+"> "+data[i].countyName+"</option>");
			}
    });
	
	$.get("../api/rest/metadata/providertypes", function(data, status){
		//console.log(data);
        var  countyEle=$('#providerType');
		 	for(i = 0; i< data.length ; i++){
			countyEle.append("<option value="+data[i].providerType+"> "+data[i].providerTypeDescription+"</option>");
			}
    });
	
	$.get("../api/rest/metadata/qualityratings", function(data, status){
		//console.log(data);
        var  countyEle=$('#quality');
		 	for(i = 0; i< data.length ; i++){
			countyEle.append("<option value="+data[i].qualityRating+"> "+data[i].qualityRatingDescription+"</option>");
			}
    });
});