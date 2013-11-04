package org.scalatr

import scala.annotation.tailrec

/**
 * Project: RomanNumerals
 * User: ramazan
 * Date: 29.10.2013 - Time: 20:56
 */
object RomanNumeral {
  val Numbers = Seq(
    1    -> "I",
    4    -> "IV",
    5    -> "V",
    9    -> "IX",
    10   -> "X",
    40   -> "XL",
    50   -> "L",
    90   -> "XC",
    100  -> "C",
    400  -> "CD",
    500  -> "D",
    900  -> "CM",
    1000 -> "M"
  ).reverse


  def nextNumber(i: Int): (Int, String) = Numbers.find(_._1 <= i).get

  def calculate(number : Int) : String = {
    if ( number == 0) ""
    else {
      val (nextNo, romanNumber) = nextNumber(number)

      romanNumber + calculate(number - nextNo)
    }
  }


}
