name := """Message In The Sky"""
organization := "MITS"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.8"

libraryDependencies += filters

libraryDependencies += "org.apache.directory.studio" % "org.apache.commons.io" % "2.4"

