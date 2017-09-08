import sbt._

object Dependencies {
  lazy val version = new {
    val scalaTest =  "3.0.3"  //"2.2.6"
    val scalaCheck = "1.13.4"
  }

  lazy val library = new {
    val test = "org.scalatest" %% "scalatest" % version.scalaTest % Test
    val check = "org.scalacheck" %% "scalacheck" % version.scalaCheck % Test
  }

  val testDependencies: Seq[ModuleID] = Seq(
    library.test,
    library.check
  )

}