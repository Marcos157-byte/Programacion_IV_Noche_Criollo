// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
  saludar()
  saludarConParametros("Michel")
  val num1 = 10
  val num2 = 20
  println("Suma de $num1 + $num2 = ${sumar(num1, num2)}")
  println("Resta de $num1 - $num2 = ${restar(num1, num2)}")
  operacion()
  println("Multiplica $num1 * $num2 = ${multiplicar(num1,num2)}")
}

fun saludar() {
    println("Hello word from functions")
}

fun saludarConParametros(nombre: String){
    println("Buenas noches: $nombre")
}

fun sumar(num1: Int, num2: Int): Int {
    return num1+num2
}

//funcion simplificada

fun restar(num1: Int, num2: Int)=num1-num2

//funcion dento de funcion

fun operacion(){
    fun cuadrado(x: Int)= x*x
    println(cuadrado(5))
}

//Funciones como vsriables 

val multiplicar = {a: Int, b: Int -> a*b}