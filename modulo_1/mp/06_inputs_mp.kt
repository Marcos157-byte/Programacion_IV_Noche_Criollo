// Ejercicio: leer datos desde la consola (simulado)
// Pide nombre y edad y muestra un saludo personalizado.
fun main() {
    print("Ingresa tu nombre: ")
    val nombre = readLine() ?: "Anónimo"
    print("Ingresa tu edad: ")
    val edad = (readLine() ?: "0").toIntOrNull() ?: 0

    println("Hola $nombre, tienes $edad años.")
}
\n// Nombre del ejercicio: Entrada de nombre y edad desde consola
