def remove(s: String): String = {
  val sb = new StringBuilder(s.length + 1)
  s.foreach{ c =>
    if (c != '!')sb.append(c)
  }
  sb.append('!').toString()
}
