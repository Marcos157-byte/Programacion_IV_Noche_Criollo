// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
  println("Condicional when")
  println("Codigo de especualidad ")
  val codigo = readLine()?.toIntOrNull()?:0
  val especialidad = when(codigo) {
      1 -> "Medicina general"
      2-> "Pediatria"
      3 -> "Cardiologia"
      4 ->"Ginecologia"
      5 -> "Traumatologia"
      6 -> "Neurologia"
      7 -> "Dermatologia"
  }
  println("Especialidad: $especialidad")
}