function onselect_dateField(y, m, d) {
	var date = new Date(y, m - 1, d);
	var day = date.getDay();
	
	if (day != 0 && day != 6) {
		alert("no weekend, no match");
		return false;
	}
	return true;
}
