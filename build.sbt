val scalaVersion_2_11 = "2.11.12"
val scalaVersion_2_12 = "2.12.6"

lazy val root = project
  .in(file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := """hello.g8""",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scalaVersion_2_12,
    crossScalaVersions := Seq(scalaVersion_2_11, scalaVersion_2_12),
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-api" % "1.7.25",
      "ch.qos.logback" % "logback-classic" % "1.2.3",
      "org.scalatest" %% "scalatest" % "3.0.1" % "test"
    )
  )
