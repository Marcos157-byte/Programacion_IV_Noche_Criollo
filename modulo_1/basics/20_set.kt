// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
  println("SET")
  println("Inmutables")
  val numeros = setOf(1,2,3,4,5,6,1,2,3,42,2,3)
  println(numeros)
  println("Operaciones de Conjuntos")
  val pares=setOf(2,4,6,8,10)
  val multiplos3=setOf(3,6,9,12)
  println("Pares $pares")
  
  val impares=setOf(1,2,5,7,9)
  println("impares $impares")
  println("union ${impares union pares}")
  println("interseccion ${multiplos3 intersect pares}")
  println("intersecciopn ${impares intersect pares}")
  println("substraccion ${impares subtract pares}")
  println("substraccion ${impares subtract multiplos3}")
  
  
  println("Set")
  println("Mutables")
  val lenguajes = mutableSeto("kotlin", "java", "reacnative")
  
  println(lenguaje)
  lenguajes.add("kotlin")
  println(lenguajes)
  lenguajes.add("java")
  println(lenguajes)
  lenguajes.add("javascritps")
  println(lenguajes)
  println("Verificar si un valor existe ${"kotlin" in lenguajes}")
  println("Verificar si un valor existe ${"java" in lenguajes}")
}