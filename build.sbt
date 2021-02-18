val scalaVersion_2_12 = "2.12.12"
val scalaVersion_2_13 = "2.13.4"

lazy val root = project
  .in(file("."))
  .enablePlugins(JavaAppPackaging)
  .settings(
    name := """hello.g8""",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scalaVersion_2_13,
    crossScalaVersions := Seq(scalaVersion_2_12, scalaVersion_2_13),
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-api" % "1.7.30",
      "ch.qos.logback" % "logback-classic" % "1.2.3",
      "org.scalatest" %% "scalatest" % "3.2.4" % "test"
    )
  )
