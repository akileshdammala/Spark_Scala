import sbt._

/**
  * Singleton object to define list of dependencies and it's version(s)
  */
object Dependencies {

  /**
    * List of Version(s) being used for Library Dependencies
    */
  val sparkVersion = "2.3.0"
  /**
    * Spark Dependencies
    */
  val sparksql = "org.apache.spark" %% "spark-sql" % sparkVersion
  val sparkcore = "org.apache.spark" %% "spark-core" % sparkVersion
  val sparkStreaming = "org.apache.spark" %% "spark-streaming" % sparkVersion
  val sparkHive = "org.apache.spark" %% "spark-hive" % sparkVersion
  val sparkGraphx = "org.apache.spark" %% "spark-graphx" % sparkVersion
  val sparksqlkafka = "org.apache.spark" %% "spark-sql-kafka-0-10" % sparkVersion //% Provided

  /**
    * Module Specific Dependencies
    */
  val learningSpark: Seq[ModuleID] = Seq(sparkcore, sparksql, sparkHive, sparkGraphx, sparkStreaming)
}
