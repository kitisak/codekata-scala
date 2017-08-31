
organization :="org.scalatr"

name := "FizzBuzz"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.0"

crossScalaVersions := Seq("2.11.0", "2.11.8", "2.11.11")

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)
