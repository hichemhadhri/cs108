import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
.enablePlugins(ScalaJSPlugin)
  .settings(
    name := "cs107",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0",
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.4" % "test",
    testFrameworks += new TestFramework("utest.runner.Framework"),
  )

  
// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
