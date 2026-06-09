// Ejercicio: usar Map para asociar productos y precios
fun main() {
    val precios = mapOf("leche" to 1.5, "pan" to 0.8, "huevos" to 2.0)
    for ((producto, precio) in precios) {
        println("$producto → $precio EUR")
    }
}
\n// Nombre del ejercicio: Map de productos y precios
