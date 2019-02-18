name := "Hello World"

organization := "se.sics.test"

version := "1.1"

scalaVersion := "2.12.8"

resolvers += Resolver.bintrayRepo("kompics", "Maven")

libraryDependencies += "se.sics.kompics" %% "kompics-scala" % "1.0.1"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
