lazy val root = project
  .in(file("."))
  .settings(
    name := """hello.g8""",
    version := "1.0",
    scalaVersion := "2.11.8",
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-api" % "1.7.25",
      "ch.qos.logback" % "logback-classic" % "1.2.3"
    )
  )
