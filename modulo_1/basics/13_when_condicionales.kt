fun main (){
    println("When con condicional")
    println("edad del paciente")
    val edad = readLine()?.toIntOrNull()?:0
    println("Tiene segudlo? s/n")
    val tieneSeguro = readLine()?.trim()?.lowercase()=="s"

    
    val nivelSeguro = if(tieneSeguro){
    println("Nuvel del seguro (BASICO/INTERMEDIO/PREMIUN)")
    readLine()?.trim()?.lowercase()?: ""
    } else ""
        val copago = when {
        !tieneSeguro && edad <18->0.0
        !tieneSeguro && edad >=65 ->15.0
        !tieneSeguro ->45.0
        nivelSeguro=="BASICO" ->20.0
        nivelSeguro=="INTERMEDIO" ->10
        nivelSeguro=="PREMIUN" ->0.0
        else -> 30.0
    }
    println("Copago aplciado: $${"%2.f".format(copago)}")
}