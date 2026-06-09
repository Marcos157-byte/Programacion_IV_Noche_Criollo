// Ejercicio: usar data class y copy para actualizar campos
data class Usuario(val nombre: String, val edad: Int)

fun main() {
    val u1 = Usuario("Carlos", 28)
    val u2 = u1.copy(edad = 29)
    println(u1)
    println(u2)
}
\n// Nombre del ejercicio: Data class Usuario y copy
