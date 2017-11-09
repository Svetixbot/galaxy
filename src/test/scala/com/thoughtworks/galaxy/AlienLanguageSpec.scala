package com.thoughtworks.galaxy

import org.scalatest.{FlatSpec, Matchers}
import com.thoughtworks.galaxy.ConfusingGalaxy._
import com.thoughtworks.galaxy.AlienLanguage._


class AlienLanguageSpec extends FlatSpec with Matchers {

  "The Language of the galaxy" should "parse alien language" in {
    alien("glob is I") shouldEqual AlienLanguageStatement("glob", "I")
    alien("prok is V") shouldEqual AlienLanguageStatement("prok", "V")
    alien("pish is X") shouldEqual AlienLanguageStatement("pish", "X")
    alien("tegj is L") shouldEqual AlienLanguageStatement("tegj", "L")
  }

  "The Language of the galaxy" should "understands `how many` questions" in {
    howManyQuestion("how many Credits is glob prok Silver ?") shouldEqual HowMany("glob prok Silver")
    howManyQuestion("how many Credits is glob prok Gold ?") shouldEqual HowMany("glob prok Gold")
    howManyQuestion("how many Credits is glob prok Iron ?") shouldEqual HowMany("glob prok Iron")
  }

  "The Language of the galaxy" should "understands `how much` questions" in {
    howMuchQuestion("how much is pish tegj glob glob ?") shouldEqual HowMuch("pish tegj glob glob")
  }

  "The Language of the galaxy" should "understands when people talk crap" in {
    errorStatement("bla bla bla bla bla ?") shouldEqual ErrorStatement("bla bla bla bla bla ?")
  }
}
