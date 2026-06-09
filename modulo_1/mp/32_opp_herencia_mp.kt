// Ejercicio: herencia simple con Vehicle -> Car
open class Vehiculo(val marca: String) {
    open fun descripcion() = "Vehículo marca $marca"
}

class Coche(marca: String, val puertas: Int) : Vehiculo(marca) {
    override fun descripcion() = "Coche $marca con $puertas puertas"
}

fun main() {
    val c = Coche("Toyota", 4)
    println(c.descripcion())
}
\n// Nombre del ejercicio: Herencia Vehiculo -> Coche
