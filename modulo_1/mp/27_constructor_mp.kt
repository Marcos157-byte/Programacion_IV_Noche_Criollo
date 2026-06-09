// Ejercicio: clase con constructor primario y secundario
class Rectangulo(val base: Double, val altura: Double) {
    constructor(lado: Double) : this(lado, lado)
    fun area() = base * altura
}

fun main() {
    val r1 = Rectangulo(4.0, 5.0)
    val r2 = Rectangulo(3.0)
    println("Area r1=${r1.area()}, r2=${r2.area()}")
}
\n// Nombre del ejercicio: Constructores primario y secundario
