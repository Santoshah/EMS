/**
 * 
 */
(function(){
	var app = angular.module('login',[]);
	
	app.controller('EMSController',['$http',function($http){
		var login = this;
		login.employees=[];
		$http.get('http://localhost:8080/ems/employees').success(function(data){
			login.employees=data;
		});
	}]);
	
})();