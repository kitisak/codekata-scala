package org.scalatr

/**
  * Project: FizzBuzz
  *
  * Created on 29.10.2013 - Time: 16:35
  *
  * @author rayyildiz
  */
object FizzBuzz {

  def matchTest(i: Int): String = (i % 3, i % 5) match {
    case (0, 0) => "FizzBuzz"
    case (0, _) => "Fizz"
    case (_, 0) => "Buzz"
    case _      => i.toString()
  }

  def findFizzBuzz(max: Int): List[String] = (for (i <- 1 to max) yield (matchTest(i))).toList

}
