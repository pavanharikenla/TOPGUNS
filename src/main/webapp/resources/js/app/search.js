/**
 * Author: H Pavan Kumar
 */

var startNum= 0;
var sentimentTypeGlobal = "";
var app= angular.module('topguns',[]);

app.controller('searchcontroller', function($scope,$http) {
    	$scope.data = [];
    	$scope.data.doClick = function(item,event){
    		if (event.which === 13){
    		    //alert('I am an alert');//proceed further nothing to do... :-)
    		}else{
    			return;
    		}
    		$("#processNextPrev").append("<img id='processing' src='"+contextpath+"/resources/images/process.gif' height='50' width='50'/>");
    		var clickedId = event.currentTarget.id;
    		var searchKey = $('#searchKey').val();
    		if(searchKey == ""){
    			alert('Please enter a valid search string.');
    			return;
    		}
    		//alert(clickedId);
    		var sentimentType ="";
    		if(clickedId == 'searchId' || clickedId == 'searchKey'){
    			$("#processSearch").append("<img id='processing' src='"+contextpath+"/resources/images/process.gif' height='50' width='50'/>");
    			$('#alertDiv').css("display","none");
    			$('#tableHolder').css("display","none");
    			startNum =0;
    		}
    		
    		if(clickedId == 'prevNav'){
    			startNum = Number(startNum) -10;
	    		$('#nextNav').css("display","");
	    	}else if(clickedId == 'nextNav'){
	    		startNum = Number(startNum) +10;
	    	}
    		if(Number(startNum)>9){
	        	$('#prevNav').css("display","");
	        }else{
	        	$('#prevNav').css("display","none");
	        }
    		var startVar = Number(startNum);
    		//alert(sentimentType);
    		//alert(startVar);
    		var responsePromise = $http({
    	        method: 'GET',
    	        url: contextpath+"/searchtweetresponse?search="+searchKey+"&start="+startVar+"&end=10",
    	        //params: 'limit=10, sort_by=created:desc',
    	        headers: {"Content-Type": "application/json",
    	        			"Content-Type": "application/x-www-form-urlencoded",
    	        			"X-Requested-With": "XMLHttpRequest"
    	        		 }
    	     });
    	     responsePromise.success(function(data){
    	        // With the data succesfully returned, call our callback
    	    	 $('#alertDiv').css("display","");
    	    	 $("#processSearch").empty();
    	    	 
    	    	 $("#processNextPrev").empty();
    	    	 if(data.total>0){
    	    		 $('#tableHolder').css("display","");
	    	    	 if(clickedId == 'searchId' || clickedId == 'searchKey'){
	    	    		 $('#alertInfo').empty();
	    	    		 var totalResult = "<span>Search Keyword: <b>"+searchKey+"</b>. Total of <b>"+data.total+ "</b> results found.</span>";
	    	    		 $('#alertInfo').append(totalResult);
	    	    	 }
    	    	 }else{
    	    		 if(clickedId == 'searchId' || clickedId == 'searchKey'){
    	    			 $('#alertInfo').empty();
	    	    		 var totalResult = "<span>No results found for <b>"+searchKey+"</b>.</span>";
	    	    		 $('#alertInfo').append(totalResult);
	    	    	 }
    	    	 }
    	    	//$('#endRecord').val('');
    	    	
    	    	//alert(startVar);
    	        var response = data.tweetList;
    	        //alert(response);
    	        var trData = "";
    	        for(var i in response){
    	        	trData = trData + '<tr><td>'+response[i].tweet +"</td></tr>";
    	        }
    	        if(clickedId == 'nextNav' && trData == ""){
    	        	$('#nextNav').css("display","none");
    	        	startNum = Number(startNum) -10;
    	        }else{
    	        	$('#tweetTable tbody').empty();
    	        	$('#tweetTable tbody').append(trData);
    	        }
    	        
    	    });
    	    responsePromise.error(function(data,status,headers,config){
    	    	alert(status);
    	        alert("Exception returned from Server. Please try later.");
    	    });
    	};
});