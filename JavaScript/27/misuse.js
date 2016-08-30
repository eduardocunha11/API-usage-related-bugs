var geolocate = (function(){
  var data = {};
  var cookieName = "geolocate";
  var init;
  return {
    init : function(){
     
      if (init) return;
      init = 1;
      cookie = $.cookie(cookieName);
      if (cookie != null) {
        data = JSON.parse(cookie);
        data.cookie = true;
      }
  };
})();
;
