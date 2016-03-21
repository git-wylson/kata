'use strict';

App.controller('FbqController', ['$scope', 'FbqService', function($scope, FbqService) {
	var context = this;
	context.results=[];

	context.fetchAllNumbers = function(){
		FbqService.fetchAllNumbers()
		.then(
				function(data) {
					context.results = data;
				},
				function(errResponse){
					console.error('Error while fetching data');
				}
		);
	};

	context.fetchAllNumbers();
	
}]);
