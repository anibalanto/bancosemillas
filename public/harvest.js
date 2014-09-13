function Hello($scope, $http) {
    $http.get('http://localhost:8080/harvest').
        success(function(data) {
            $scope.birth = data;
        });
}