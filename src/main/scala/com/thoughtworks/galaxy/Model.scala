package com.thoughtworks.galaxy


trait Statement {}
case class AlienLanguageStatement() extends Statement
case class CurrencyRate() extends Statement
case class ErrorStatement() extends Statement
case class Question() extends Statement

case class Answer(answers: List[String])
object Result {
  val zero = Answer(List.empty[String])
}

case class Currency(currency: String)