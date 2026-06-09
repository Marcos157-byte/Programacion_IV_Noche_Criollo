// Ejercicio: encapsular nombre y validar lectura
class Persona(private var nombre: String) {
    fun obtenerNombre() = nombre
    fun cambiarNombre(nuevo: String) {
        if (nuevo.isNotBlank()) nombre = nuevo
    }
}

fun main() {
    val p = Persona("Ana")
    println(p.obtenerNombre())
    p.cambiarNombre("")
    println(p.obtenerNombre())
}
\n// Nombre del ejercicio: Persona con validación en setter
