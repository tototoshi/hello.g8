val scalaVersion_2_12 = "2.12.20"
val scalaVersion_2_13 = "2.13.15"
val scalaVersion_3 = "3.3.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "hello.g8",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scalaVersion_3,
    crossScalaVersions := Seq(scalaVersion_2_12, scalaVersion_2_13, scalaVersion_3),
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-api" % "2.0.16",
      "ch.qos.logback" % "logback-classic" % "1.5.12",
      "org.scalatest" %% "scalatest" % "3.2.19" % "test"
    )
  )
