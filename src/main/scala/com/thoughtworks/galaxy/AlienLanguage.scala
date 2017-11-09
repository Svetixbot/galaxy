package com.thoughtworks.galaxy

import com.thoughtworks.galaxy.ConfusingGalaxy._

import scala.util.matching.Regex

object AlienLanguage {
  val isAlienLanguage: Regex = "([a-zA-Z]+) (is) (.*)".r
  val isHowManyQuestion: Regex = "(how many Credits is) (.+) (\\?)".r
  val isHowMuchQuestion: Regex = "(how much is) (.+) (\\?)".r

  /***
    * Input: glob is I
    * Output: AlienLanguageStatement(glob, I)
    *
    *
    *  {
    *    case isAlienLanguage(word, _, roman) => AlienLanguageStatement(word, roman)
    *  }
    */
  def alien: PartialFunction[String, AlienLanguageStatement] = ???

  /**
    * Input: how many Credits is glob prok Silver ?
    * Output: HowMany(glob prok Silver)
    * */
  def howManyQuestion: PartialFunction[String, HowMany] = ???

  /**
    * Input: how much is pish tegj glob glob ?
    * Output: HowMuch(pish tegj glob glob)
    * */
  def howMuchQuestion: PartialFunction[String, Statement] = ???

  /**
    * Input: anything
    * Output: Error(anything)
    * */
  def errorStatement: PartialFunction[String, ErrorStatement] = ???
}