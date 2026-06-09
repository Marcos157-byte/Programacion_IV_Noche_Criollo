// Ejercicio: implementar una interfaz que describe conducción
interface Conducible {
    fun conducir()
}

class Bicicleta : Conducible {
    override fun conducir() = println("Pedaleando la bicicleta")
}

fun main() {
    val b: Conducible = Bicicleta()
    b.conducir()
}
\n// Nombre del ejercicio: Interfaz Conducible y Bicicleta
