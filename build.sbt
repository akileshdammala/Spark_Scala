/**
  * Use only root build.sbt for adding sub-projects and use Dependencies.scala to add specific dependency to the sub-project
  */
// Lines which are commented below are under development.

lazy val LearningSpark =
(project in file("LearningSpark"))
  .settings(Common.settings: _*)
  .settings(name := "LearningSpark")
  .settings(libraryDependencies ++= Dependencies.learningSpark)
  .settings(assemblySettings)
//  .settings(test in assembly := {})

lazy val assemblySettings = assemblyMergeStrategy in assembly := {
  case m if m.toLowerCase.endsWith("manifest.mf")     => MergeStrategy.discard
  case m if m.toLowerCase.matches("meta-inf.*\\.sf$") => MergeStrategy.discard
  case "log4j.properties"                             => MergeStrategy.discard
  case m if m.toLowerCase.startsWith("meta-inf/services/") =>
    MergeStrategy.filterDistinctLines
  case "reference.conf" => MergeStrategy.concat
  case _                => MergeStrategy.first
}
