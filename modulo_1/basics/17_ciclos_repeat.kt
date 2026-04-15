// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
  println("CICLOS repeat")
  println("Cuantas pulsaciones tomar para calcular frecuencia")
  val mediciones=readLine()?.toIntOrNull()?:3
  var totalPulsaciones=0
  
  repeat(mediciones){i->
   println("Medicion ${i+1} pulsos en 15 seg")
  val pulsos=readLine()?.toIntOrNull()?:0
  totalPulsaciones+=pulsos*4
      
  }
  
  val promedio = totalPulsaciones / mediciones
  println("Frecuencia cardiaca promedio: $promedio lpm")
  println("Clasificacion: ${
  when {
  promedio <60 ->"Bradicardia"
  promedio <=100 ->"Normal"
  else ->"Taquicardia"
  
    }
}")
}