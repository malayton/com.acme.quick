'use strict';

(function() {

	var MODULE = angular.module('com.acme.quick.upper.application',
			[ 'ngRoute', 'ngResource' ]);

	MODULE.config( function($routeProvider) {
		$routeProvider.when('/', { controller: mainProvider, templateUrl: '/com.acme.quick.upper/main/htm/home.htm'});
		$routeProvider.when('/about', { templateUrl: '/com.acme.quick.upper/main/htm/about.htm'});
		$routeProvider.otherwise('/');
	});
	
	MODULE.run( function($rootScope, $location) {
		$rootScope.alerts = [];
		$rootScope.closeAlert = function(index) {
			$rootScope.alerts.splice(index, 1);
		};
		$rootScope.page = function() {
			return $location.path();
		}
	});
	
	
	
	var mainProvider = function($scope, $http) {
		
		$scope.upper = function() {
			var name = prompt("Enter a string to convert to uppercase:");
			if ( name ) {
				$http.get('/rest/upper/'+name).then(
						function(d) {
							$scope.alerts.push( { type: 'success', msg: d.data });
						}, function(d) {
							$scope.alerts.push( { type: 'danger', msg: 'Failed with ['+ d.status + '] '+ d.statusText });
						}
				);
			}
		};
	
		$scope.lower = function() {
			var name = prompt("Enter a string to convert to lowercase:");
			if ( name ) {
				$http.get('/rest/lower/'+name).then(
						function(d) {
							$scope.alerts.push( { type: 'success', msg: d.data });
						}, function(d) {
							$scope.alerts.push( { type: 'danger', msg: 'Failed with ['+ d.status + '] '+ d.statusText });
						}
				);
			}
		};

		$scope.stripSpaces = function() {
			var name = prompt("Enter the string in which to remove whitespace:");
			if ( name ) {
				$http.get('/rest/stripSpaces/'+name).then(
						function(d) {
							$scope.alerts.push( { type: 'success', msg: d.data });
						}, function(d) {
							$scope.alerts.push( { type: 'danger', msg: 'Failed with ['+ d.status + '] '+ d.statusText });
						}
				);
			}
		};
	}
	
})();
