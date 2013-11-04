import sbt._
import Keys._

object TestProjectBuild extends Build {
	lazy val root = Project("codekata", file("."))  aggregate(fizzBuzz, romanNumeral,primeNumber)
	
	lazy val fizzBuzz = Project("FizzBuzz", file("FizzBuzz"))
	
	lazy val romanNumeral = Project("RomanNumeral", file("RomanNumerals"))
	
	lazy val primeNumber = Project("PrimeNumber", file("PrimeNumber"))
}