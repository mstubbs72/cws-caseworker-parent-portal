/**
 * 
 */

var app = angular.module('searchApp', []);
app.controller('SearchController', [
		'$scope',
		'$http',
		function($scope, $http) {
			$scope.searchCriteria = {};
			$scope.tableVisible = false;
			$scope.providers = [];
			$scope.search = function() {
				console.log($scope.searchCriteria);
				var datas = $scope.searchCriteria;
				var url = "../api/rest/providers/find";
				var params = "";
				if(!angular.isUndefined($scope.searchCriteria.countyId)){
					params = params + "county="+$scope.searchCriteria.countyId; 
				}
				if(!angular.isUndefined($scope.searchCriteria.cityId)){
					if(params =="")
					params = params + "city="+$scope.searchCriteria.cityId;
					else
						params = params + "&city="+$scope.searchCriteria.cityId;
				}
				if(!angular.isUndefined($scope.searchCriteria.providerName)){
					if(params =="")
					params = params + "providerName="+$scope.searchCriteria.providerName;
					else
					params = params + "&providerName="+$scope.searchCriteria.providerName;
						
				}
				if(!angular.isUndefined($scope.searchCriteria.ratingId)){
					if(params =="")
					params = params + "rating="+$scope.searchCriteria.ratingId;
					else
						params = params + "&rating="+$scope.searchCriteria.ratingId;
				}
				if(!angular.isUndefined($scope.searchCriteria.providerTypeId)){
					if(params =="")
					params = params + "providerType="+$scope.searchCriteria.providerTypeId;
					else
						params = params + "&providerType="+$scope.searchCriteria.providerTypeId;
				}
				
				 if(params != "")
					 {
					 url = url +"?"+params;
					 }
				 console.log(url);
					$http.get(url, datas).success(
						function(data, status) {
							console.log(data);
							$scope.providers = data;
							$scope.tableVisible = true;
						});
			}
			$scope.reset = function() {
				$scope.searchCriteria = {};
				$scope.tableVisible = false;
				$scope.providers = [];
			}
			$scope.showTable = function() {
				return tableVisible;
			}
		} ]);