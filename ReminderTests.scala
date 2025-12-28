class RemainderSpec extends org.scalatest.flatspec.AnyFlatSpec {
  "remainder" should "pass basic tests" in {
    assert(remainder(17, 5) == Some(2), "for remainder(17, 5)")
    assert(remainder(72, 13) == Some(7), "for remainder(72, 13)")
    assert(remainder(10, 2) == Some(0), "for remainder(10, 2)")
  }
  
  it should "not be affected by the order the arguments are passed" in {
    assert(remainder(17, 5) == remainder(5, 17), "for remainder(17, 5) and remainder(5, 17)")
    assert(remainder(72, 13) == remainder(13, 72), "for remainder(72, 13) and remainder(13, 72)")
  }
  
  it should "return None for division by zero" in {
    assert(remainder(1, 0) == None, "for remainder(1, 0)")
    assert(remainder(0, 0) == None, "for remainder(0, 0)")
    assert(remainder(0, 1) == None, "for remainder(0, 1)")
  }
  
  it should "pass negative number tests" in {
    assert(remainder(-13, -13) == Some(0), "for remainder(-13, -13)")
    assert(remainder(-60, 340) == Some(40), "for remainder(-60, 340)")
    assert(remainder(60, -40) == Some(20), "for remainder(60, -40)")
    assert(remainder(-340, 60) == Some(60), "for remainder(-340, 60)")
    assert(remainder(-25, -7) == Some(-7), "for remainder(-25, -7)")
  }
}
