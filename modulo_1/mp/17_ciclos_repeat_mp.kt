// Ejercicio: intentar hasta 3 veces realizar una acción
fun main() {
    var intentos = 0
    var exito = false
    repeat(3) {
        intentos++
        // Simulamos un intento que tiene éxito en el tercer try
        if (intentos == 3) exito = true
    }
    println("Intentos: $intentos, éxito: $exito")
}
\n// Nombre del ejercicio: Intentos repetidos con repeat
