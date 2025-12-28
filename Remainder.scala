def remainder(a: Int, b: Int): Option[Int] =
  val larger = math.max(a, b)
  val smaller = math.min(a, b)

  if smaller == 0 then
    None
  else
    Some(larger % smaller)
