// Ejercicio: clase abstracta para figuras geométricas
abstract class Figura {
    abstract fun area(): Double
}

class Triangulo(val base: Double, val altura: Double) : Figura() {
    override fun area() = base * altura / 2.0
}

fun main() {
    val t = Triangulo(6.0, 4.0)
    println("Área triángulo: ${t.area()}")
}
\n// Nombre del ejercicio: Clase abstracta Figura y Triangulo
