'use strict';

fbqApp.controller('FbqController', ['$scope', 'FbqService', function($scope, FbqService) {
	var context = this;
	var results = [];

	context.fetchAllNumbers = function(){
		FbqService.fetchAllNumbers()
		.then(
				function(data) {
					angular.copy(data,results);
				},
				function(errResponse){
					console.error('Error while fetching data');
				}
		);
	};

	context.fetchAllNumbers();
	
	// bootstrap data table to show list of results 
	$scope.bsTableFbq = {
            options: {
                data: results,
                rowStyle: function (row, index) {
                    var classes = ['white', 'green'];	        		       		
	        		return {
	                    classes: classes[index % 2]
	                };  
                },
                cache: false,
                height: 500,
                striped: true,
                pagination: true,
                pageSize: 10,
                pageList: [10, 25, 50],
                search: true,
                showColumns: true,
                showRefresh: false,
                minimumCountColumns: 1,
                clickToSelect: false,
                showToggle: true,
                maintainSelected: true,
                columns: [ {
                    field: 'number',
                    title: 'Number',
                    align: 'center',
                    valign: 'bottom',
                    sortable: true
                }, {
                    field: 'result',
                    title: 'Result',
                    align: 'center',
                    valign: 'bottom',
                    sortable: true                 
                }]
            }
        };	
}]);
