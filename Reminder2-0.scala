def remainder(a: Int, b: Int): Option[Int] =
  (math.max(a, b), math.min(a, b)) match
  case (_, 0) => None
  case (max, min) => Some(max % min)
