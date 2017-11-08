package com.thoughtworks.galaxy

import org.scalatest._

class GalaxySpec extends FlatSpec with Matchers {
  "The Hello object" should "work out how much" in {
    Galaxy.howMuch("pish tegj glob glob") shouldEqual Right(42)
  }

  "The Hello object" should "parse roman numeral" in {
    Galaxy.parseToken("pish tegj glob glob") shouldEqual Right("XLII")
  }
}
