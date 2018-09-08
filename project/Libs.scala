import sbt._

object Libs {
  val scalatest   = "org.scalatest"     %% "scalatest" % "3.0.5"
  val `akka-http` = "com.typesafe.akka" %% "akka-http" % "10.1.5"
}

object Akka {
  val Version            = "2.5.16"
  val Org                = "com.typesafe.akka"
  val `akka-stream`      = Org %% "akka-stream" % Version
  val `akka-actor-typed` = Org %% "akka-actor-typed" % Version
}
