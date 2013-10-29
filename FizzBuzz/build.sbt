name := "FizzBuzz"

version := "1.0-SNAPSHOT"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "1.9.2" % "test"
)