organization :="org.scalatr"

name := "Roman Numerals"

version := "1.0-SNAPSHOT"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

scalaVersion := "2.11.0"

org.scalastyle.sbt.ScalastylePlugin.Settings

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.1.5" % "test"
)
