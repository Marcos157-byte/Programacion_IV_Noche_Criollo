// Ejercicio: clasificar IMC con if anidados
fun main() {
    val peso = 68.0 // kg
    val altura = 1.72 // m
    val imc = peso / (altura * altura)

    if (imc < 18.5) {
        println("Bajo peso")
    } else {
        if (imc < 25.0) println("Peso normal")
        else println("Sobrepeso u obesidad")
    }
}
\n// Nombre del ejercicio: Clasificación de IMC con if anidados
