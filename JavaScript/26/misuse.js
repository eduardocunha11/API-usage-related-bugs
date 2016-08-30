var baudio = require('../');
var b = baudio();
b.push((function () {
    var c = 10;
    return function (t, i) {
        var n = 28;
        c = c * (1 + Math.sin(i / 20000) / 10000);
        return Math.sin(t * 5000) * Math.max(0, Math.sin(t * n + c * Math.sin(t * 20)));
    };
})());
b.play();
