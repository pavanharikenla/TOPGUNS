/**
 * Author: H Pavan Kumar
 */

var app= angular.module('topguns',[]);
app.controller('homecontroller', function($scope,$http) {
    	$scope.data = [];
    	$scope.data.doClick = function(item,event){
    		var responsePromise = $http({
    	        method: 'GET',
    	        url: contextpath+"/tweetresponse?type=general&start=0&end=10",
    	        //params: 'limit=10, sort_by=created:desc',
    	        headers: {"Content-Type": "application/json",
    	        			"Content-Type": "application/x-www-form-urlencoded",
    	        			"X-Requested-With": "XMLHttpRequest"
    	        		 }
    	     });
    	     responsePromise.success(function(data){
    	        // With the data succesfully returned, call our callback
    	        var response = data;
    	    });
    	    responsePromise.error(function(data,status,headers,config){
    	    	//alert(status);
    	        alert("Exception returned from Server. Please try later.");
    	    });
    	};
});