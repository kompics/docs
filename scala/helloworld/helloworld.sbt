name := "Hello World"

organization := "se.sics.test"

version := "1.0"

scalaVersion := "2.12.2"

resolvers += "Kompics Releases" at "http://kompics.sics.se/maven/repository/"
resolvers += "Kompics Snapshots" at "http://kompics.sics.se/maven/snapshotrepository/"

libraryDependencies += "se.sics.kompics" %% "kompics-scala" % "1.0.0-SNAPSHOT"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "0.9.28"
