package org.scalatr


import org.scalatest.FunSpec

/**
 * Project: RomanNumerals
 * User: ramazan
 * Date: 31.10.2013 - Time: 08:12
 */
class RomanNumeralSpec extends FunSpec {
  describe("Roman Numeral") {
    it ("should 5001 / 1000  is 5"){
      val res: Int = 5001 / 1000;

      assert(res === 5)
    }

    it ("should 4999 / 1000  is not 5"){
      val res: Int = 4999 / 1000;

      assert(res != 5)
      assert(res === 4)
    }

    it ("should 3 equals to III") {
      val expected = "III"

      val actual  = RomanNumeral.calculate(3)
    }

  }
}
