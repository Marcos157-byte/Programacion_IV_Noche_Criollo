// Ejercicio: resolver conflicto de métodos entre dos interfaces
interface A {
    fun saludo() = println("Hola desde A")
}

interface B {
    fun saludo() = println("Hola desde B")
}

class C : A, B {
    override fun saludo() {
        // Elegimos invocar la implementación de B
        super<B>.saludo()
    }
}

fun main() {
    val c = C()
    c.saludo() // Imprime "Hola desde B"
}
\n// Nombre del ejercicio: Conflicto de interfaces A y B
