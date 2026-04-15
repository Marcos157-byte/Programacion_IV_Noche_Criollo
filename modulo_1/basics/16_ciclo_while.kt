// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
  println("CICLOS while")
  val contador=1
  while(contador<=5){
      println(contador)
      contador++
  }
  
  contador=1
  do {
      println(contador)
      contador++
  }while (contador<=5)
  
  println("brake - continue")
  contado =1
  while(contador<=10){
    if(contador == 3) continue
  if(contador == 7) break
  println(contador)  
  }
  
  var input: String
  while(true) {
      println("Escribe 'salir' para terminar":)
      input=readLine()?: ""
      if(input=="salir") break
      println("Ingresaste $input")
  }
  
}