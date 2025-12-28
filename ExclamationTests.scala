class RemoveSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "remove" should "pass basic tests" in {
    val tests = Seq(
      ("Hi!" , "Hi!"),
      ("Hi!!!" ,"Hi!"),
      ("!Hi" , "Hi!"),
      ("!Hi!" , "Hi!"),
      ("Hi! Hi!" , "Hi Hi!"),
      ("Hi" , "Hi!"),
    )
    
    tests foreach {
      (s, expected) =>
        assert(remove(s) == expected, s"for remove(\"$s\")")
    }
  }
}
