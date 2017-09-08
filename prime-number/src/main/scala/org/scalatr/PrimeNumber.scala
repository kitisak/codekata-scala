package org.scalatr

/**
 * Project: PrimeNumber
  *
 * Created on 4.11.2013 - Time: 22:37
  *
  * @author rayyildiz
 */
object PrimeNumber {
  def isPrime(n: Int): Boolean = (2 until n) forall (d => n % d != 0)
}
