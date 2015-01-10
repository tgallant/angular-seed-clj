'use strict';

// Declare app level module which depends on views, and components
angular.module('myApp', [
  'ngRoute',
  'mm.foundation',
  'myApp.view1',
  'myApp.view2',
  'myApp.version'
]).
config(['$routeProvider', '$locationProvider', function($routeProvider, $locationProvider) {
  $routeProvider.otherwise({redirectTo: '/view1'});
  $locationProvider.html5Mode(true);
}]);
