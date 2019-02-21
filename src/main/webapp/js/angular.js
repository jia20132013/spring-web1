var app = angular.module('app', []);
 

app.controller('getuserController', function($scope, $http, $location) {
	
	$scope.showUser = false;
	
	$scope.getUser = function() {
		var url = $location.absUrl() + "users/" + $scope.userId;
      
		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}
 
		$http.get(url, config).then(function(response) {
			  var str = "";
			  var res = response;
			  for (obj in res) {
				  str += res[obj] + ": " + obj;
			  }
			if (response.status == "200") {
				$scope.user = response.data;
				$scope.showUser = true;
				$scope.ErrorMsg = "";
			} 
 
		}, function(response) {
			$scope.showUser = false;
			$scope.ErrorMsg = response.data.message;
		});
	}
	
	$scope.clear = function () {
		$scope.userId = "";
	}
 
	
	
});

