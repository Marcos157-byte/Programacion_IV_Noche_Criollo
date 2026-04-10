// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
  println("Tiene seguro medico s/n")
  val tieneSeguro = readLine()?.trim()?.lowercase()== "s"
  prinln("Costo base de la consutla")
  val costoBase= readLine()?.DoubleOrNull()?:0.0
  if(tieneSeguro) {
      val cobertura=costoBase*0.80
      println("Seguro cubre $cobertura Cliente ${costoBase - cobertura}")
  } else {
      println("Cliente cubre $costoBase")
  }
}