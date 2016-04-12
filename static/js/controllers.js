angular.module('myApp').controller('MainController', ['$scope', 'sendSignal', 'sendSignalDelay',function ($scope, sendSignal, sendSignalDelay)
{
    $scope.time = 0;
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
    $scope.sendSignalDelay = function(signalID, delayTime) {
        console.log(signalID);
        sendSignalDelay.save({delay: delayTime, signal: signalID}, {});
    };
}]);
