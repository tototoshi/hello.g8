val scalaVersion_2_12 = "2.12.19"
val scalaVersion_2_13 = "2.13.13"
val scalaVersion_3 = "3.3.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "hello.g8",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scalaVersion_3,
    crossScalaVersions := Seq(scalaVersion_2_12, scalaVersion_2_13, scalaVersion_3),
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-api" % "2.0.12",
      "ch.qos.logback" % "logback-classic" % "1.5.3",
      "org.scalatest" %% "scalatest" % "3.2.19" % "test"
    )
  )
