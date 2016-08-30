function RandomObject() {
    this.toString = function() { 
	return (Math.random() * 100).toString(); 
    }
}
for (var attempt = 0; attempt < 100; ++attempt) {
    var arr = [];
    for (var i = 0; i < 64; ++i)
        arr[i] = new RandomObject;
    arr.sort();
}
