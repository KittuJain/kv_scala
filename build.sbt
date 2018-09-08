lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version := "0.1.0-SNAPSHOT",
      transitiveClassifiers in Global := Seq(Artifact.SourceClassifier)
    )),
    name := "citi1",
    libraryDependencies += Libs.`akka-http`,
    libraryDependencies += Akka.`akka-stream`,
    libraryDependencies += Libs.scalatest % Test,
  )