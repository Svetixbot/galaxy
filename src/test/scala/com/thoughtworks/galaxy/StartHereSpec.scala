package com.thoughtworks.galaxy

import org.scalatest.{FlatSpec, Matchers}

import com.thoughtworks.galaxy.StartHere._
import com.thoughtworks.galaxy.ConfusingGalaxy._


class StartHereSpec extends FlatSpec with Matchers {
  "The Galaxy guide" should "starts here" in {
    val commands = List("glob is I",
      "prok is V",
      "pish is X",
      "tegj is L",
      "glob glob Silver is 34 Credits",
      "glob prok Gold is 57800 Credits",
      "pish pish Iron is 3910 Credits",
      "how much is pish tegj glob glob ?",
      "how many Credits is glob prok Silver ?",
      "how many Credits is glob prok Gold ?",
      "how many Credits is glob prok Iron ?",
      "how much wood could a woodchuck chuck if a woodchuck could chuck wood ?")

    startHere(commands) shouldEqual Result(

      answers = List(Answer(question = "how much is pish tegj glob glob ?",
        answer = Right("pish tegj glob glob is 42")),
        Answer(question = "how many Credits is glob prok Silver ?",
          answer = Right("glob prok Silver is 68 Credits")),
        Answer(question = "how many Credits is glob prok Gold ?",
          answer = Right("glob prok Gold is 57800 Credits")),
        Answer(question = "how many Credits is glob prok Iron ?",
          answer = Right("glob prok Iron is 782 Credits")),
        Answer(question = "how much wood could a woodchuck chuck if a woodchuck could chuck wood ?",
          answer = Right("I have no idea what you are talking about"))),
      errors = List.empty,
      alien = Map("glob" -> "I", "prok" -> "V", "pish" -> "X", "tegj" -> "L"),
      currency = Map("Silver" -> 17, "Gold" -> 14450, "Iron" -> 195.5)
    )
  }
}
