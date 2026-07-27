// Ejercicio: definir y usar una función que calcula el área de un círculo
fun areaCirculo(radio: Double): Double = Math.PI * radio * radio

fun main() {
    val r = 3.0
    println("Área del círculo de radio $r = ${areaCirculo(r)}")
}
