organization :="org.scalatr"

name := "FizzBuzz"

version := "1.0-SNAPSHOT"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

scalaVersion := "2.10.3"

org.scalastyle.sbt.ScalastylePlugin.Settings

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "1.9.2" % "test"
)
