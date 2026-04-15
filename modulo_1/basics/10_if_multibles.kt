// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
  println("If con multiples condiciones")
  println("presion arterial sistolica")
  
  val sistolica = readLine()?.toIntOrNull()?:0
  val clasificacion = if(sistolica <90) {
      "Hipotencion"
  }else if(sistolica <=119) {
      "Normal"
  }else if(sistolica <=139) {
      "Elevada"
  }else if (sistolica <=179) {
      "Hipertencion grado2"
  }else {
      "Crisis Hipertenciva"
  }
  println("Clasificacion: $clasificacion")
}