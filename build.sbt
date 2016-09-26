enablePlugins(ScalaJSPlugin)

name := "template-scalajs-sbt-webpack"
version := "0.0.0"
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "com.lihaoyi" %%% "scalatags" % "0.6.0",
  "be.doeraene" %%% "scalajs-jquery" % "0.9.0"
)
