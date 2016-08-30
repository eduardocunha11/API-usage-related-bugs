(function() {
  var getActiveElement = function(text) {
    var element = ';
    if (text.length >= 0) {
      var regex = new RegExp('<([^!?][^s/>]*).*?>', 'g');
      var matches = [];
      var match;
      while ((match = regex.exec(text)) != null) {
         matches.push({
            tag: match[1],
            selfclose: (match[0].slice(match[0].length - 2) === '/>')
         });
      }
    }
    return element;
  };
})();

