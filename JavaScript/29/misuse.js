(function() {
    var indent = match[1], after = match[4];
    var bullet = unorderedBullets.indexOf(match[2]) >= 0
      ? match[2] : (parseInt(match[3], 10) + 1) + '.';
    cm.replaceSelection( + indent + bullet + after, 'end');
  };
}());
