name := "example-meta"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++= Seq(
  "org.scalameta" %% "scalameta" % "1.6.0"
)

addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M7" cross CrossVersion.full)
