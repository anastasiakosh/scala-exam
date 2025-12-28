def remove(s: String): String = {
  val sb = new StringBuilder()
  var i = 0
  val len = s.length
  
  while (i < len) {
    val char = s.charAt(i)
    if (char != '!') {
      sb.append(char)
    }
    i += 1
  }
  
  sb.append('!').toString()
}
