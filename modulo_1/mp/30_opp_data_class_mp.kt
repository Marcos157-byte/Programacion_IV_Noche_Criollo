// Ejercicio: destructuring de data class Book
data class Libro(val titulo: String, val autor: String, val paginas: Int)

fun main() {
    val libro = Libro("Kotlin para todos", "María", 220)
    val (t, a, p) = libro
    println("Título: $t, Autor: $a, Páginas: $p")
}
\n// Nombre del ejercicio: Desestructuraci�n de data class Libro
