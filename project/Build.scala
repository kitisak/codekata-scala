import sbt._
import Keys._

object TestProjectBuild extends Build {
	lazy val root = Project("codekata", file("."))  aggregate(fizzBuzz, romanNumeral)
	
	
	lazy val fizzBuzz = Project("FizzBuzz", file("FizzBuzz"))
	
	lazy val romanNumeral = Project("RomanNumerals", file("RomanNumerals"))
}