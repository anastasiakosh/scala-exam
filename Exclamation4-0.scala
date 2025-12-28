def remove(s: String): String = {
  val chars = s.toCharArray
  val result = new Array[Char](chars.length + 1)
  var pos = 0
  var i = 0
  
  while (i < chars.length) {
    val c = chars(i)
    if (c != '!') {
      result(pos) = c
      pos += 1
    }
    i += 1
  }
  
  result(pos) = '!'
  
  new String(result, 0, pos + 1)
}
