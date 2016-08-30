var depth = 10000;
var deepArray = [];
for (var i = 0; i < depth; i++) deepArray = [deepArray];
assertThrows(function() { JSON.stringify(deepArray); }, RangeError);
var deepObject = {};
for (var i = 0; i < depth; i++) deepObject = { next: deepObject };
assertThrows(function() { JSON.stringify(deepObject); }, RangeError);

