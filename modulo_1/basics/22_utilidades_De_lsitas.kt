// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
  println("Utilidades de listas")
  val numeros =listOf(1,2,3,4,5,6,7,8,9,10)
  println(numeros)
  val cuadrados=numeros.map{it*it}
  println(cuadrados)
  val numerosTexto=numeros.map{"Num$it"}
  println(numerosTexto)
  println("Filter")
  
}
