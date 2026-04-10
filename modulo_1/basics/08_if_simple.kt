// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
   println("Control de flujo")
   println("If Simple")
   println("Temperatura corporal del paciente grados centig.")
   val temperatura = readLine()?.toDoubleOrNull()?:25.5
   if (temperatura >=38){
       println("Fiebre detectada")
   }
   if(temperatura>=40){
       println("Fiebre alta")
   }
   println("Temperatura registrada: $temperatura")
}