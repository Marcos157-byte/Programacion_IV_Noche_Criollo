// Ejercicio: calcular área según figura indicada
fun main() {
    val figura = "rectangulo"
    val resultado = when (figura) {
        "rectangulo" -> {
            val base = 5.0
            val altura = 3.0
            base * altura
        }
        "circulo" -> {
            val r = 2.0
            Math.PI * r * r
        }
        else -> 0.0
    }
    println("Área de $figura = $resultado")
}
\n// Nombre del ejercicio: �rea de figura con when y bloques
