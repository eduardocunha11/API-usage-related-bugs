function wrapper()
{
  var x = 5;  
  var y = 0;  
  document.write(let(x = x + 10, y = 12) x + y + "<br>");  
  document.write(x+y + "<br>");  
}
