ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.github.whitechno.spica-x"
ThisBuild / scalaVersion := "2.12.11"

lazy val `hocon-x` = project
  .settings(
    commonSettings,
    libraryDependencies ++= Seq(
      // Test of {"repo":"subutai","module":"hocon"}
      "com.github.whitechno.subutai" %% "hocon" % "0.1.0-SNAPSHOT" % Test,
      // "com.typesafe" % "config" is "provided" in {"repo":"subutai","module":"hocon"}
      "com.typesafe" % "config" % "1.4.0" % Test
    )
  )

lazy val commonSettings = List(
  scalacOptions ++= Seq(
    "-deprecation",
    "-unchecked",
    "-feature" // [warn] there were 21 feature warnings; re-run with -feature for details
  ),
  test in assembly := {}
)
