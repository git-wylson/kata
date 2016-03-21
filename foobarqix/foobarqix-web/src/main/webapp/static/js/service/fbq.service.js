'use strict';

fbqApp.factory('FbqService', ['$http', '$q', function($http, $q){
	// domaine = http://localhost:8080/foobarqix-web
	var domaine = getCurrentDomainUtils();

	return {
		fetchAllNumbers: function() {
			return $http.get(domaine+'/foobarqix')
			.then(
					function(response){
						return response.data;
					}, 
					function(errResponse){
						console.error('Error while fetching data');
						return $q.reject(errResponse);
					}
			);
		}    
	};
}]);
