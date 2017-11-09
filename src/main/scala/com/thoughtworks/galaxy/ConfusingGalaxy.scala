package com.thoughtworks.galaxy

object ConfusingGalaxy {

  type Error = String

  case class Result(answers: List[Answer],
                    errors: List[Error],
                    alien: Map[String, String],
                    currency: Map[String, Double])
  object Result {
    val zero = Result(List.empty, List.empty, Map.empty, Map.empty)

    def addAlien(result: Result, word: String, roman: String): Result =
      result.copy(alien = result.alien + (word -> roman))

    def addCurrencyRate(result: Result, currency: String, rate: Int): Result =
      result.copy(currency = result.currency + (currency -> rate))

    def addAnswerFor(result: Result, answer: Answer): Result =
      result.copy(answers = result.answers :+ answer)

    def addError(result: Result, error: Error): Result =
      result.copy(errors = result.errors :+ error)
  }

  case class Answer(question: String, answer: Either[Error, String])

  trait Statement {}

  case class AlienLanguageStatement(word: String, roman: String) extends Statement
  case class CurrencyRate(currency: String, rate: Int) extends Statement
  case class ErrorStatement(errorMessage: String) extends Statement
  case class HowMany(question: String) extends Statement
  case class HowMuch(question: String) extends Statement
}
