val scalaVersion_2_12 = "2.12.15"
val scalaVersion_2_13 = "2.13.7"
val scalaVersion_3_0 = "3.0.0-RC3"

lazy val root = project
  .in(file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := """hello.g8""",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scalaVersion_3_0,
    crossScalaVersions := Seq(scalaVersion_2_12, scalaVersion_2_13, scalaVersion_3_0),
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-api" % "1.7.32",
      "ch.qos.logback" % "logback-classic" % "1.2.9",
      "org.scalatest" %% "scalatest" % "3.2.8" % "test"
    )
  )
