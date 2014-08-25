/**
 * 
 */
(function(){
	var app = angular.module('home',[]);
	app.directive('employeeTable',['$http',function($http){
		return {
			restrict : 'E',
			templateUrl : "employee-table.html",
			controller : function($http){
				var login = this;
				login.employees=[];
				$http.get('http://localhost:8080/ems/employees').success(function(data){
					login.employees=data;
				});
			},
			controllerAs : 'emsctrl'
		}
		
	}]);
	
})();