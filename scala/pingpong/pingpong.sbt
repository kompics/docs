name := "Ping Pong"

organization := "se.sics.test"

version := "1.0"

scalaVersion := "2.11.11"

resolvers += Resolver.mavenLocal

val kompicsVersion = "1.0.0"

resolvers += "Kompics Releases" at "http://kompics.sics.se/maven/repository/"
resolvers += "Kompics Snapshots" at "http://kompics.sics.se/maven/snapshotrepository/"

libraryDependencies += "se.sics.kompics" %% "kompics-scala" % kompicsVersion
libraryDependencies += "se.sics.kompics.basic" % "kompics-component-netty-network" % kompicsVersion
libraryDependencies += "se.sics.kompics.basic" % "kompics-component-java-timer" % kompicsVersion
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "org.scala-lang.modules" %% "scala-pickling" % "0.10.1" // no Scala 2.12 version, yet
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0"

mainClass in assembly := Some("se.sics.test.Main")
