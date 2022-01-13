val scalaVersion_2_12 = "2.12.15"
val scalaVersion_2_13 = "2.13.8"
val scalaVersion_3 = "3.1.0"

lazy val root = project
  .in(file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := """hello.g8""",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scalaVersion_3,
    crossScalaVersions := Seq(scalaVersion_2_12, scalaVersion_2_13, scalaVersion_3),
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-api" % "1.7.33",
      "ch.qos.logback" % "logback-classic" % "1.2.10",
      "org.scalatest" %% "scalatest" % "3.2.10" % "test"
    )
  )
