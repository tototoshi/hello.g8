lazy val root = project
  .in(file("."))
  .settings(
    name := """hello.g8""",
    version := "1.0",
    scalaVersion := "2.11.8"
  )
