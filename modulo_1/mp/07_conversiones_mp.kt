// Ejercicio: conversiones entre tipos numÃ©ricos y cadena
fun main() {
    val texto = "123.45"
    val doble = texto.toDoubleOrNull() ?: 0.0
    val entero = doble.toInt()

    println("Texto: $texto")
    println("Como Double: $doble")
    println("Como Int (truncado): $entero")
    println("Como cadena nuevamente: ${entero.toString()}")
}
\n// Nombre del ejercicio: Conversiones numéricas y cadena
