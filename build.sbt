inThisBuild(List(
  organization := "com.example",
  scalaVersion := "2.12.6",
  version := "0.1.0-SNAPSHOT",
  transitiveClassifiers in Global := Seq(Artifact.SourceClassifier)
))

lazy val `kv-api` = project
  .settings(
    libraryDependencies += Libs.`play-json`
  )

lazy val `kv-client` = project
  .dependsOn(`kv-api`)
  .settings(
    libraryDependencies ++= Seq(
      Libs.`akka-http`,
      Akka.`akka-stream`,
      Libs.`akka-http-play-json`,
      Libs.`scala-async`,
      Libs.scalatest % Test
    )
  )

lazy val `kv-server` = project
  .dependsOn(`kv-api`)
  .settings(
    libraryDependencies ++= Seq(
      Libs.`akka-http`,
      Akka.`akka-stream`,
      Libs.`akka-http-play-json`,
      Libs.`scala-async`,
      Libs.scalatest % Test
    )
  )