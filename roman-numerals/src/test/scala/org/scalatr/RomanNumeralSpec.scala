package org.scalatr

import org.scalatest.FunSpec

/**
 * Project: RomanNumerals
  *
 * Created on 31.10.2013 - Time: 08:12
  *
  * @author rayyildiz
 */
class RomanNumeralSpec extends FunSpec {
  describe("Roman Numeral") {
    it("should 5001 / 1000  is 5") {
      val res: Int = 5001 / 1000;

      assert(res === 5)
    }

    it("should 4999 / 1000  is not 5") {
      val res: Int = 4999 / 1000;

      assert(res != 5)
      assert(res === 4)
    }

    it("should 3 equals to III") {
      val expected = "III"

      val actual = RomanNumeral.calculate(3)

      assert(actual === expected)
    }

    it("should 7 equals to VII") {
      val expected = "VII"

      val actual = RomanNumeral.calculate(7)

      assert(actual === expected)
    }

    it("should 19 equals to XIX") {
      val expected = "XIX"

      val actual = RomanNumeral.calculate(19)

      assert(actual === expected)
    }

    it("should 25 equals to XXV") {
      val expected = "XXV"

      val actual = RomanNumeral.calculate(25)

      assert(actual === expected)
    }

    it("should 44 equals to XLIV") {
      val expected = "XLIV"

      val actual = RomanNumeral.calculate(44)

      assert(actual === expected)
    }

    it("should 58 equals to LVIII") {
      val expected = "LVIII"

      val actual = RomanNumeral.calculate(58)

      assert(actual === expected)
    }

    it("should 86 equals to LXXXVI") {
      val expected = "LXXXVI"

      val actual = RomanNumeral.calculate(86)

      assert(actual === expected)
    }

    it("should 200 equals to CC") {
      val expected = "CC"

      val actual = RomanNumeral.calculate(200)

      assert(actual === expected)
    }

    it("should 222 equals to CCXXII") {
      val expected = "CCXXII"

      val actual = RomanNumeral.calculate(222)

      assert(actual === expected)
    }

    it("should 488 equals to CDLXXXVIII") {
      val expected = "CDLXXXVIII"

      val actual = RomanNumeral.calculate(488)

      assert(actual === expected)
    }

    it("should 500 equals to D") {
      val expected = "D"

      val actual = RomanNumeral.calculate(500)

      assert(actual === expected)
    }

    it("should 987 equals to CMLXXXVII") {
      val expected = "CMLXXXVII"

      val actual = RomanNumeral.calculate(987)

      assert(actual === expected)
    }

    it("should 2017 equals to MMXVII") {
      val expected = "MMXVII"

      val actual = RomanNumeral.calculate(2017)

      assert(actual === expected)
    }

  }
}
