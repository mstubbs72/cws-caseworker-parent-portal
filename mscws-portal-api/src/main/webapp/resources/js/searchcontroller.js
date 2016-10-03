/**
 * 
 */
var app = angular.module('SearchModule', [ 'ui.bootstrap' ]);
app
		.controller(
				'SearchController',
				[
						'$scope',
						'$http',
						'$location',
						function($scope, $http, $location) {
							$scope.searchCriteria = {};
							$scope.tableVisible = false;
							$scope.availableResults = false;
							$scope.providers = [];
							$scope.filteredProviders = [],
									$scope.currentPage = 1,
									$scope.numPerPage = 10, $scope.maxSize = 5;
							$scope.error = false;
							$scope.resultsFilter = {};
							if ($location.path() == "/providerSearch") {
								var baseUrl = '../api/rest/metadata/';
								$http.get(baseUrl + 'county').success(
										function(data) {
											$scope.countys = data;
										});
								$http.get(baseUrl + 'providertypes').success(
										function(data) {
											$scope.providerTypes = data;
										});
								$http.get(baseUrl + 'cities').success(
										function(data) {
											$scope.cities = data;
										});

								$http
										.get(
												'../api/rest/metadata/qualityratings')
										.success(function(data) {
											$scope.qualityRatings = data;
										});
							}
							$scope.search = function() {
								if ($scope.providers.length > 0) {
									$scope.providers = [];
									$scope.filteredProviders = [];
								}
								var datas = $scope.searchCriteria;
								var url = "../api/rest/providers/find";
								var params = "";
								if (!angular
										.isUndefined($scope.searchCriteria.countyId)) {
									if (params == "")
										params = params
												+ "county="
												+ $scope.searchCriteria.countyId.countyNumber;
									else
										params = params
												+ "&county="
												+ $scope.searchCriteria.countyId.countyNumber;
								}
								if (!angular
										.isUndefined($scope.searchCriteria.cityId)) {
									if (params == "")
										params = params
												+ "city="
												+ $scope.searchCriteria.cityId.id;
									else
										params = params
												+ "&city="
												+ $scope.searchCriteria.cityId.id;
								}
								if (!angular
										.isUndefined($scope.searchCriteria.providerName)) {
									if (params == "")
										params = params
												+ "providerName="
												+ $scope.searchCriteria.providerName;
									else
										params = params
												+ "&providerName="
												+ $scope.searchCriteria.providerName;

								}
								if (!angular
										.isUndefined($scope.searchCriteria.ratingId)) {
									if (params == "")
										params = params
												+ "rating="
												+ $scope.searchCriteria.ratingId.qualityRating;
									else
										params = params
												+ "&rating="
												+ $scope.searchCriteria.ratingId.qualityRating;
								}
								if (!angular
										.isUndefined($scope.searchCriteria.providerTypeId)) {
									if (params == "")
										params = params
												+ "providerType="
												+ $scope.searchCriteria.providerTypeId.providerType;
									else
										params = params
												+ "&providerType="
												+ $scope.searchCriteria.providerTypeId.providerType;
								}

								if (params != "") {
									url = url + "?" + params;
								} else {
									$scope.error = "true";
									return;
								}
								$http
										.get(url, datas)
										.success(
												function(data, status) {
													$scope.providers = data;
													$scope.tableVisible = true;
													if ($scope.providers.length > 0) {
														$scope.availableResults = true;
														$scope
																.$watch(
																		'currentPage + numPerPage',
																		function() {
																			var begin = (($scope.currentPage - 1) * $scope.numPerPage), end = begin
																					+ $scope.numPerPage;
																			$scope.filteredProviders = $scope.providers
																					.slice(
																							begin,
																							end);
																		});
													}

												});
							}

							$scope.reset = function() {
								$scope.searchCriteria = {};
								$scope.tableVisible = false;
								$scope.providers = [];
								$scope.filteredProviders = [];
								$scope.error = false;
							}
							$scope.showTable = function() {
								return tableVisible;
							}
							$scope.rating = function(qualityRating) {
								return qualityRating - 1;
							}
							$scope.mapToggle = true;
							$scope.listToggle = false;

							$scope.mapViewFunc = function() {
								$scope.mapToggle = !$scope.mapToggle;
								$scope.listToggle = !$scope.listToggle;
							}
							$scope.listViewFunc = function() {
								$scope.listToggle = !$scope.listToggle;
								$scope.mapToggle = !$scope.mapToggle;
							}
						} ]);