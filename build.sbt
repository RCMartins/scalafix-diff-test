lazy val test =
  project
    .in(file("."))
    .settings(
      moduleName := "scalafix-diff-test",
      version := "0.1",
      scalaVersion := "2.12.11"
    )
