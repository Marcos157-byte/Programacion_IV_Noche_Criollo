// Ejercicio: interfaz con método con implementación por defecto
interface Saludo {
    fun decirHola(nombre: String)
    fun despedida() {
        println("Adiós desde la interfaz")
    }
}

class Empleado : Saludo {
    override fun decirHola(nombre: String) = println("Hola, $nombre. Bienvenido")
}

fun main() {
    val e = Empleado()
    e.decirHola("Luis")
    e.despedida()
}
\n// Nombre del ejercicio: Interfaz con m�todo por defecto
