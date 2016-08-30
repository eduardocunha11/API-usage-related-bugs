var accounting = (function () {
    function toFixed(value, precision) {
	  precision = isNaN(precision = Math.abs(precision)) ? 0 : precision;
	  var power = Math.pow(10, precision);
		
		return (Math.round(value * power) / power).toFixed(precision);
  }
}());
