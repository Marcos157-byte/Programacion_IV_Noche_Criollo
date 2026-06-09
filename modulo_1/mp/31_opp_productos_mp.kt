// Ejercicio: lista de productos y cálculo de stock total
data class Producto(val nombre: String, val cantidad: Int)

fun main() {
    val inventario = listOf(Producto("Lapicero", 10), Producto("Cuaderno", 5), Producto("Borrador", 20))
    val total = inventario.sumOf { it.cantidad }
    println("Productos: $inventario")
    println("Stock total: $total")
}
\n// Nombre del ejercicio: Inventario y stock total
