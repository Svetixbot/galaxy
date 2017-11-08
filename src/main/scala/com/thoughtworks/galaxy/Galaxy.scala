package com.thoughtworks.galaxy

object Galaxy extends App {

  def startHere(commands: List[String]): Answer = ???
  def parseStatement(statement: String): PartialFunction[String, Statement] = ???
  def parseQuestion(question: String): PartialFunction[String, Question] = ???
  def errorStatement(): PartialFunction[String, ErrorStatement] = ???

  /**
    * Input: glob prok Silver
    * Output: 68
    *
    * Input: some stuff Bronze
    * Output: some is not a thing. stuff is not a thing. Bronze is not a thing.
    *
    * Use `parseToken`
    * Use `translate`
    *
    * */
  def howMany(token: String, inCurrency: Currency): Either[String, Int] = ???

  /**
    * Input: pish tegj glob glob
    * Output: 42
    *
    * Input: some stuff
    * Output: some is not a thing. stuff is not a thing.
    *
    * Use `parseToken`
    * Use `translate`
    *
    * */
  def howMuch(token: String): Either[String, Int] = ???


  /**
    * Input: pish tegj glob glob
    * Output: XLII
    *
    * Input: some stuff
    * Output: some is not a thing. stuff is not a thing.
    * */
  def parseToken(token: String): Either[String, String] = ???

  /**
    * Input: I
    * Output: 1
    *
    * Input: II
    * Output: 2
    *
    * Input: XLII
    * Output: 42
    *
    * Challenge: try to implement it without mutation
    *
    * You can use `translateRomanSymbol`
    *
    * Hint: try to use foldLeft
    */
  def translate(roman: String): Either[String, Int] = ???

  def toRoman(value: String): Either[String, String] = {
    val alienDictionary = Map(
      "glob" -> "I",
      "prok" -> "V",
      "pish" -> "X",
      "tegj" -> "L"
    )
    alienDictionary.get(value).
      fold[Either[String, String]](
        Left("Not an alien number"))(
          v => Right(v))
  }

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
      fold[Either[String, Int]](
        Left("Not a roman number"))(
        v => Right(v))
  }
}