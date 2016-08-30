var ASSERT = require("assert");
[
    "2010-01-01T00:00:00.000Z",
].forEach(function (isoDate) {
    exports['testReflexiveParseFormat ' + isoDate] = function () {
        var parsed = Date.parse(isoDate);
        ASSERT.equal(new Date(parsed).toISOString(), isoDate);
    };
});
