enablePlugins(ScalaJSPlugin)

name := "Scala Tutorials"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
libraryDependencies += "org.springframework" % "spring" % "2.5.6"

skip in packageJSDependencies := false
jsDependencies += RuntimeDOM
jsDependencies += "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"

testFrameworks += new TestFramework("utest.runner.Framework")

persistLauncher in Compile := true
persistLauncher in Test := false
