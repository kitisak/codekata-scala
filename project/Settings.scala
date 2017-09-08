import sbt._
import Keys._

object Settings {

  lazy val settings = Seq(
    organization := "org.scalatr",
    version := "0.0.1." + sys.props.getOrElse("buildNumber", default = "0-SNAPSHOT"),
    scalaVersion := "2.12.3",
    crossScalaVersions := Seq("2.11.0", "2.11.8", "2.11.11", "2.12.0", "2.12.3"),
    publishMavenStyle := true,
    publishArtifact in Test := false
  )

  lazy val testSettings = Seq(
    fork in Test := false,
    parallelExecution in Test := false
  )

  lazy val itSettings = Defaults.itSettings ++ Seq(
    logBuffered in IntegrationTest := false,
    fork in IntegrationTest := true
  )

}