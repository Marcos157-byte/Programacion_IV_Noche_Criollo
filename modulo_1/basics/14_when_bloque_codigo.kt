// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
    println("When con bloque de codigo")
    println("Nombre paciente")
    val paciente = readLine()?.trim()?:""
    println("Nivel de alerta CRITICO/URGENTE/MODERADO/LEVE:")
    val nivel = readLine()?.trim()?.uppercase()?:""
    
    when(nivel){
        "CRITICO" -> {
            println("ALERTA CRITICA-Paciente. $paciente")
            println("Accion inmediata")
            println("Registrar hora activacion de protocolo")
        }
        "URGENTE" ->{
            println("URGENTE-Paciente $paciente")
            println("Priorizar Sala de Espera")
            println("Reevaluar en 15 minutos")
        }
        "MODERADO" ->println("Moderado paciente $paciente. registrar monitorear")
        "LEVE" ->println("LEVE: paciente: $paciente. registrar en la lista normal")
        else->println("Protocolo no reconocido")
    }
    
    println("edad:")
    val edad = readLine()?.toIntOrNull()?:0
    val tarifa = when(edad){
    in 0..2 ->"Neonatal"
    in 3..11 -> "Pediatrico"
    in 12..17 ->"Adolescente"
    in 18..24 ->"Adulto"
    else -> "Adulto mayor"
    }
    println("$edad años -> $tarifa")
}