var movieApp = angular.module('movie', []);

movieApp.controller('MainController', function($http, $window) {
    var vm = this;

    vm.activeMovie;
    vm.movies = [];
    vm.showList = true;

    vm.add = function() {
        $http.post('/rest/movie', {
            name: vm.activeMovie.name,
            year: vm.activeMovie.year,
            leadActor: vm.activeMovie.leadActor,
			supportingActor: vm.activeMovie.supportingActor
        }).then(function(response) {
            $window.location.reload();
        });
    };

    vm.delete = function(movie) {
        $http.delete('/rest/movie', {
            params: { movieId: movie.id }
        }).then(function(response) {
            $window.location.reload();
        });
    };

    vm.goToAdd = function() {
        vm.activeMovie = null;
        vm.showList = false;
    };

    vm.goToEdit = function(movie) {
        vm.activeMovie = movie;
        vm.showList = false;
    };

    vm.list = function() {
        $http.get('/rest/movie').then(function(response) {
            vm.movies = response.data;
        });
    };

    vm.save = function() {
        if (vm.activeMovie.id) {
            vm.update();
        } else {
            vm.add();
        }
    };

    vm.update = function() {
        $http.put('/rest/movie', {
            id: vm.activeMovie.id,
            name: vm.activeMovie.name,
            year: vm.activeMovie.year,
            leadActor: vm.activeMovie.leadActor,
			supportingActor: vm.activeMovie.supportingActor
        }).then(function(response) {
            $window.location.reload();
        });
    };
});