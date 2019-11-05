name := "sbt-ci-release-early-usage-bintray2"
organization := "com.michaelpollmeier"
enablePlugins(GitVersioning)

scalaVersion := "2.13.0"
crossScalaVersions := Seq(scalaVersion.value, "2.12.10", "2.11.12")
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8"

val scmUrl = "https://github.com/mpollmeier/sbt-ci-release-early-usage-bintray"
homepage := Some(url("https://github.com/mpollmeier/sbt-ci-release-early-usage"))
bintrayVcsUrl := Some(scmUrl)
scmInfo := Some(ScmInfo(url(scmUrl), s"scm:$scmUrl"))
licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
developers := List(Developer("mpollmeier", "Michael Pollmeier", "michael@michaelpollmeier.com", url("https://michaelpollmeier.com")))
