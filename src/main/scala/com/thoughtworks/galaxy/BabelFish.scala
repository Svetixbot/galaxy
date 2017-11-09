package com.thoughtworks.galaxy

import com.thoughtworks.galaxy.ConfusingGalaxy._

object BabelFish {

  /**
    * Input: glob prok Gold
    * Output: Answer: 57800
    */
  def howMany(alien: Map[String, String], currency: Map[String, Double])
             (question: String): Answer = ???

  /**
    * Input: pish tegj glob glob
    * Output: 42
    * */
  def howMuch(alien: Map[String, String])(question: String): Answer = ???

  /**
    * Input: glob prok Gold
    * Output: IV, 14450
    * */
  def alienToRomanWithConversion(alien: Map[String, String], currency: Map[String, Double])
                                (token: String): Either[Error, (String, Int)] = ???


  /**
    * Input: pish tegj glob glob
    * Output: LXII
    *
    * Try to use foldLeft and pattern matching
    * */
  def alienToRoman(alien: Map[String, String])(token: String): Either[Error, String] = ???

  /**
    * Input: LXII
    * Outout: 42
    *
    * Try to use foldLeft and pattern matching
    * */
  def romanToNumber(roman: String)(conversionRate: Int = 1): Either[Error, Int] = ???

  /**
    * Input: glob
    * Outout: I
    *
    * Try to get stuff from the map in a safe way and
    * use pattern matching to convert the structure into Either
    * */
  def toRoman(alienDictionary: Map[String, String])(value: String): Either[Error, String] = ???

  def translateRomanSymbol(value: String): Either[String, Int] = {
    val romanDictionary = Map(
      "I" -> 1,
      "V" -> 5,
      "X" -> 10,
      "L" -> 50,
      "C" -> 100,
      "D" -> 500,
      "M" -> 1000
    )

    romanDictionary.get(value).
      fold[Either[Error, Int]](
        Left("Not a roman number"))(v => Right(v))
  }

}
