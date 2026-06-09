// Ejercicio: aplicar operaciones funcionales sobre listas
fun main() {
    val nums = listOf(1, 2, 3, 4, 5, 6)
    val pares = nums.filter { it % 2 == 0 }
    val cuadrados = pares.map { it * it }
    val suma = cuadrados.sum()
    println("Pares: $pares")
    println("Cuadrados: $cuadrados")
    println("Suma de cuadrados: $suma")
}
\n// Nombre del ejercicio: Operaciones funcionales en listas
