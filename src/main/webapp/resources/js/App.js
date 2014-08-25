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
				$http.get('http://localhost:8081/ems/employees').success(function(data){
					login.employees=data;
				});
			},
			controllerAs : 'emsctrl'
		}
		
	}]);
	
	app.directive('footer',['$http',function($http){
		return {
			restrict : 'E',
			templateUrl : "footer.html"
		}
		
	}]);
	
	var loginApp = angular.module('login',[]);
	
	loginApp.controller('loginController',function(){
		this.user = {};
		this.logIn = function(user){
			this.user = user;
			if(user.userName === 'bbarun' && user.password === 'August09'){
				alert('authenticated');
			} else {
				alert('not authenticated');
			}
		};
		
	});
	
})();