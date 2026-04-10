// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
  println("inputs")
  println("Escribe Nombre")
  val nombre=readLine()
  println("HOLA $nombre")
  
  println("Escriba su edad:")
  
  val edad=readLine()?.toDoubleOrNull()?:0.00
  
  val doble = edad*2
  println("Su edad es: ${doble}")
  println("el doble de edad es: ${edad*2}")
}