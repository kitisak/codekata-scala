package org.scalatr

import org.scalatest.FunSpec

/**
 * Project: FizzBuzz
 * User: ramazan
 * Date: 29.10.2013 - Time: 16:44
 */
class FizzBuzzSpec extends FunSpec {
  describe("A FizzBuzz"){

    import FizzBuzz.findFizzBuzz

    it("should correct for number is 15") {
      val expected = List("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")
      val actual = findFizzBuzz(15)

      assert ( expected === actual)
    }

    it("should correct for number is 1") {
      val expected = List("1")
      val actual = findFizzBuzz(1)

      assert ( expected === actual)
    }

    it("should correct for number is 0"){
      val expected = List()
      val actual = findFizzBuzz(0)

      assert ( expected === actual)
    }

    it("should not correct for number is 2"){
      val expected = List("1","2")
      val actual = findFizzBuzz(3)

      assert ( expected != actual)
    }



  }
}
