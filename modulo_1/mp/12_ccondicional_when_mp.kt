// Ejercicio: usar 'when' para mapear número de mes a nombre
fun main() {
    val mes = 4
    val nombre = when (mes) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Mes inválido"
    }
    println("Mes $mes: $nombre")
}
\n// Nombre del ejercicio: Mes a nombre con when
