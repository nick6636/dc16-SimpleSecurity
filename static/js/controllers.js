angular.module('myApp').controller('MainController', ['$scope', 'sendSignal',function ($scope, sendSignal)
{
    $scope.lightCodes = [
	{
	    "on": 5510451,
	    "off": 5510460
	},
	{
	    "on": 5510595,
	    "off": 5510604
	},
	{
	    "on": 5510915,
	    "off": 5510924
	},
	{
	    "on": 5512451,
	    "off": 5512460
	},
	{
	    "on": 5518595,
	    "off": 5518604
	}
    ];

    var pin = 0;
    var pulseLength = 185;
    $scope.sendSignal = function(signalID) {
	console.log(signalID);
	sendSignal.save({signal: signalID}, {});
    };
}]);