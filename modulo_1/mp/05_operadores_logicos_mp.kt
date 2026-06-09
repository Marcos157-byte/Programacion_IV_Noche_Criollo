// Ejercicio: comprobar si un usuario califica para descuento
// usando operadores lógicos (AND, OR, NOT).
fun main() {
    val edad = 22
    val esEstudiante = false
    val tieneMembresia = true

    // Descuento si es estudiante o tiene membresía, y es mayor de edad
    if ((esEstudiante || tieneMembresia) && edad >= 18) {
        println("Aplica descuento especial")
    } else {
        println("No aplica descuento")
    }
}
\n// Nombre del ejercicio: Descuento con operadores l�gicos
