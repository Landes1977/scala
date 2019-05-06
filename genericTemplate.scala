package GenericTemplate

// Import statements to increase functionality 
import org.apache.spark._
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql._
import org.apache.spark.sql.types._
import org.apache.spark.sql.functions._  
import org.apache.spark.rdd.RDD
import scala.io.Source
import scala.util.control.NonFatal
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.Dataset
import org.apache.spark.ml.regression.LinearRegression
import org.apache.spark.ml.feature.RFormula
import org.apache.spark.ml.feature.VectorAssembler
import org.apache.spark.ml.linalg.Vectors
import org.apache.spark.sql.catalyst.encoders.ExpressionEncoder
import org.apache.spark.sql.Encoder
import org.apache.spark.sql.hive.HiveContext
import org.apache.spark.sql.Row
import org.apache.spark.util._
// Allows User Defined Functions 
import org.apache.spark.sql.functions.udf

object GenericTemplate extends Serializable {

  def main(args: Array[String]): Unit = {


  val spark = SparkSession.
    builder().
    appName("GenericTemplate").
    enableHiveSupport().
    config("spark.serializer","org.apache.spark.serializer.KryoSerializer").
    config("spark.kryoserializer.buffer.max", "2000mb").
    getOrCreate()

  import spark.implicits._

  try {
  
  
  
// ###########################################################################################################  
// Body of scipt
// ###########################################################################################################  
  
  
  

} // try

catch { 
case NonFatal(ex) => println(s"Non fatal exception! $ex")

println(s"completing in CATCH section")
} // catch

finally { 
println(s"completing in FINALLY section")

spark.stop
} // finally

} // main

} // object