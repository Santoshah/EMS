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
		};
		
	}]);
	
	app.directive('footer',['$http',function(){
		return {
			restrict : 'E',
			templateUrl : "footer.html"
		};
		
	}]);
	
	
	var login = angular.module('login',[]);
	login.controller("loginController", ['$scope', '$http','$window',function($scope, $http, $window) {
      $scope.myForm = {};
      $scope.myForm.userName = "username";
      $scope.myForm.password  = "password";

    $scope.myForm.submitTheForm = function(item, event) {
      console.log("--> Submitting form");
      var dataObject = {
         userName : $scope.myForm.userName
         ,password  : $scope.myForm.password
      };

      var responsePromise = $http.post("http://localhost:8081/EMS/login", dataObject, {});
      responsePromise.success(function(dataFromServer, status, headers, config) {
         console.log(dataFromServer);
         if(dataFromServer){
        	 $window.location.href="";
         } else {
        	 
         }
      });
       responsePromise.error(function(data, status, headers, config) {
         alert("Submitting form failed!");
      });
    };

 }]);
	
})();