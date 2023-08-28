import scala.io.StdIn.readLine

object Q1 {
  def calculateAverage(temperatureList :List[Double]): Double ={
    val fahrenheit =temperatureList.map(celsius=>(celsius * 9/5) + 32)
    val totalTemperature =fahrenheit.reduce((temp1,temp2)=>temp1+temp2)
    val averageTemperature =totalTemperature/temperatureList.length
    averageTemperature
  }
  def main(args: Array[String]): Unit = {
    println("Enter a list of temperature separated by commas:")
    val input = readLine()
    val temperatureList = input.split(",").map(_.toDouble).toList
    println(" Average Fahrenheit temperature:"+BigDecimal(calculateAverage(temperatureList)).setScale(2,BigDecimal.RoundingMode.HALF_UP))
  }
}
