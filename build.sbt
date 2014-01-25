//import com.github.theon.coveralls.CoverallsPlugin.CoverallsKeys._
scalaVersion := "2.10.3"

org.scalastyle.sbt.ScalastylePlugin.Settings

seq(ScctPlugin.instrumentSettings : _*)

seq(com.github.theon.coveralls.CoverallsPlugin.coverallsSettings: _*)

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "1.9.2" % "test"
)

//coverallsToken := "zHSdcSA7OjMDppSOPisP58k15bTL0X0P7"