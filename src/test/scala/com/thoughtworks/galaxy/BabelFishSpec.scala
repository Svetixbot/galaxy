package com.thoughtworks.galaxy

import org.scalatest.{FlatSpec, Matchers}
import com.thoughtworks.galaxy.BabelFish._


class BabelFishSpec extends FlatSpec with Matchers  {
  "The Galaxy guide" should "work out how much" in {
    val alien = Map("pish" -> "X", "tegj" -> "L", "glob" -> "I")
    howMuch(alien)("pish tegj glob glob").answer shouldEqual Right("pish tegj glob glob is 42")
  }

  "The Galaxy guide" should "work out how many" in {
    val alien = Map("pish" -> "X", "tegj" -> "L", "glob" -> "I")
    val currency: Map[String, Double] = Map("Silver" -> 17, "Gold" -> 14450, "Iron" -> 195.5)
    howMany(alien, currency)("glob prok Silver").answer shouldEqual Right("68")
  }
}
