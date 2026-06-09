// Ejercicio: punto 2D y calcular distancia al origen
data class Punto(val x: Double, val y: Double)

fun main() {
    val p = Punto(3.0, 4.0)
    val distancia = Math.hypot(p.x, p.y)
    println("Punto: $p, distancia al origen: $distancia")
}
\n// Nombre del ejercicio: Data class Punto y distancia
