(function(){
	var app = angular.module('seedbank', [ ]);
	
	app.controller('SeedController', function($scope){
		$scope.products = gem;
	});
	
	var gem = [{"date":1410629328454,"harvestCodeValidator":"8CE39223","ufarmerID":"1B1F4A28"},{"date":1410629328455,"harvestCodeValidator":"80938622","ufarmerID":"2F1B48A2"},{"date":1410629328455,"harvestCodeValidator":"B77B7173","ufarmerID":"1483ABF2"},{"date":1410629328456,"harvestCodeValidator":"2E3465CF","ufarmerID":"BA24481F"},{"date":1410629328456,"harvestCodeValidator":"1617C349","ufarmerID":"1B48FA25"}]
	
	app.controller('BankController', ['$http', function($http){
		var bank = this;
		bank.harvests = [ ]
		$http.get('http://localhost:8080/harvest').success(function(data) {
			bank.harvests = data;
		});		
	}]);
})();


/*

function Hello($scope, $http) {
    $http.get('http://localhost:8080/harvest').
        success(function(data) {
            $scope.birth = data;
        });
}

*/
