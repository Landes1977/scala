name := "ProjectName"
 
version := "0.1"
 
scalaVersion := "2.11.8"
 
val sparkVersion = "2.3.0.cloudera4"
 
resolvers ++= Seq(
        "cloudera" at "http://repository.cloudera.com/artifactory/cloudera-repos/",
        "springplugin" at "http://repo.spring.io/plugins-release/"
)
 

 
libraryDependencies ++= Seq(
        "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
        "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",
        "org.apache.spark" %% "spark-mllib" % sparkVersion % "provided",
        "org.apache.spark" %% "spark-hive" % sparkVersion % "provided",
        "org.scala-lang" % "scala-library" % "2.11.8",
        "com.databricks" %% "spark-csv" % "1.5.0" % "provided",
        "eigenbase" % "eigenbase-properties" % "1.1.4" % "provided"
)

assemblyMergeStrategy in assembly :=  { 
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case x => MergeStrategy.first
   }

assemblyJarName in assembly := "name.jar"