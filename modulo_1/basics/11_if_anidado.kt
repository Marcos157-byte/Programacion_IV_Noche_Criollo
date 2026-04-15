// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
  println("if con condicion anidadas")
  println("El paciente tiene antecedentes cardiacos")
  val tieneAntecedentes = readLine()?.trim()?.lowercase()=="s"
  val frecuencia = readLine()?.toIntOrNull()?:0
  
  if(tieneAntecedentes){
      println("Paciente con antecedentes cardiacos")
      if(frecuencia <50){
          println(" Bradicardia")
      }
  }else if(frecuencia >100){
      println("Taquicardia")
  }else {
      print("Paciente sin antecendentes cardiacos")
      if(frecuencia <60 || frecuencia >100){
          println("Frecuencia fuea de lo normas")
      }else {
          println("Frecuencia cardiaca normal")
      }
  }
}