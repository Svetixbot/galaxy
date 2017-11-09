package com.thoughtworks.galaxy

import org.scalatest.{FlatSpec, Matchers}
import com.thoughtworks.galaxy.BabelFish._


class BabelFishSpec extends FlatSpec with Matchers  {

  val alien = Map("pish" -> "X", "tegj" -> "L", "glob" -> "I")

  "The Babel fish" should "translate symbols to roman" in {
    toRoman(alien)("pish") shouldEqual Right("X")
  }

  "The Babel fish" should "translate roman numbers into arabic" in {
    romanToNumber("XLII") shouldEqual Right("42")
  }

  "The Babel fish" should "translate alien numbers into roman" in {
    alienToRoman(alien)("pish tegj glob glob") shouldEqual Right("XLII")
  }

  "The Babel fish" should "work out how much" in {
    howMuch(alien)("pish tegj glob glob").answer shouldEqual Right("pish tegj glob glob is 42")
  }

  "The Babel fish" should "work out how many" in {
    val currency: Map[String, Double] = Map("Silver" -> 17, "Gold" -> 14450, "Iron" -> 195.5)
    howMany(alien, currency)("glob prok Silver").answer shouldEqual Right("68")
  }
}
