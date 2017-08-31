organization := "org.scalatr"

name := "<<PROJECT_NAME>>"

version := "1.0-SNAPSHOT"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

scalaVersion := "2.11.0"

crossScalaVersions := Seq("2.11.0", "2.11.8", "2.11.11")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)
