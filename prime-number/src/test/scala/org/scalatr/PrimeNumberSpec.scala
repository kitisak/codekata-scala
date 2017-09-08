package org.scalatr

import org.scalatest.FunSpec

/**
 * Project: PrimeNumber
  *
 * Created on 4.11.2013 - Time: 22:38
  *
  * @author rayyildiz
 */
class PrimeNumberSpec extends FunSpec {

  describe("Prime Number") {

    import PrimeNumber.isPrime

    it("should 2 is a prime number") {
      val expected = true

      val actual = isPrime(2)

      assert(expected === actual)
    }

    it("should 5 is a prime number") {
      val expected = true

      val actual = isPrime(5)

      assert(expected === actual)
    }

    it("should 6 is NOT a prime number") {
      val expected = false

      val actual = isPrime(6)

      assert(expected === actual)
    }

    it("should 7 is a prime number") {
      val expected = true

      val actual = isPrime(7)

      assert(expected === actual)
    }

    it("should 17 is a prime number") {
      val expected = true

      val actual = isPrime(17)

      assert(expected === actual)
    }

    it("should 39 is NOT a prime number") {
      val expected = false

      val actual = isPrime(39)

      assert(expected === actual)
    }

  }

}
