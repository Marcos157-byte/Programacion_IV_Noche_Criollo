// Ejercicio: validación en setter (simulada con función)
class Temperatura(private var celsius: Double) {
    fun setCelsius(valor: Double) {
        if (valor >= -273.15) celsius = valor
    }
    fun getCelsius() = celsius
}

fun main() {
    val t = Temperatura(20.0)
    t.setCelsius(-300.0) // inválido
    println("Temperatura: ${t.getCelsius()}°C")
}
