// Ejercicio: usar ranges en 'when' para grupos de edad
fun main() {
    val edad = 34
    val grupo = when (edad) {
        in 0..12 -> "Niñez"
        in 13..17 -> "Adolescencia"
        in 18..64 -> "Adulto"
        in 65..120 -> "Adulto mayor"
        else -> "Edad inválida"
    }
    println("Edad $edad → $grupo")
}
\n// Nombre del ejercicio: Grupos de edad con when rangos
