import sbt._
import Keys._
import sbtassembly.AssemblyPlugin.autoImport._
import sbtassembly.MergeStrategy

/**
  * Singleton object to define list of settings that is common across the modules
  */
object Common {
  val appVersion = "0.0.1-SNAPSHOT"

  val settings: Seq[Def.Setting[_]] = Seq(
//    organization := "com.marriott.elevate",
    version := appVersion,
    scalaVersion := "2.11.11",
    resolvers += Opts.resolver.mavenLocalFile,
    resolvers += Resolver.file("Local", file("C:/Users/M1043345/.ivy2/local"))(Resolver.ivyStylePatterns),
    assemblyJarName in assembly := {
      name.value + "-" + version.value + ".jar"
    }
  )
}
