//import com.github.theon.coveralls.CoverallsPlugin.CoverallsKeys._
scalaVersion := "2.11.0"

org.scalastyle.sbt.ScalastylePlugin.Settings

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "2.1.15" % "test"
)
