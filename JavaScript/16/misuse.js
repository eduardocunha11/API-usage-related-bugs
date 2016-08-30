function libloop2(s) {
    var sum = 0;
    for ( var i=0 ; i < 100000 ; i++ )
	sum += parseInt(s);
    return sum;
}
