// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
  println("operadores Logicos")
  val esMayor=true
  val tienePermiso=false
  val estaActivo=true
  val mayorEdad=false
  println(" Operador ANN &&")
  println("$esMayor && $tienePermiso ${esMayor&&tienePermiso}")
  println("$esMayor && $estaActivo ${esMayor&&estaActivo}")
  
  println("Or Logico")
  println("$esMayor || $tienePermiso ${esMayor||tienePermiso}")
  println("$esMayor || $estaActivo ${esMayor||estaActivo}")
  
  println("$mayorEdad || $tienePermiso || $estaActivo ${mayorEdad||tienePermiso||estaActivo}")
  
  println("Not logico")
  println("! $esMayor ${!esMayor}")
  println("! $mayorEdad ${!mayorEdad}")
}