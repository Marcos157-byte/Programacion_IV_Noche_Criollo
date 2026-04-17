// Online Kotlin compiler to run Kotlin program online
// Print "Try programiz.pro" message

fun main() {
  println("Map")
  println("Inmutables")
  
  val capitales = mapOf (
      "Espania" to "Madrid",
      "Francia" to "Paris",
      "Alemania" to "Berlin",
      "Italia" to "Roma"
      
  )
  println(capitales["Espania"])
  println(capitales["Portugal"])
  println(capitales.getOrDefault("Espania", "Desconocido"))
  println(capitales.getOrDefault("Portugal", "Desconocido"))
  println(capitales.keys)
  println(capitales.values)
  println(capitales.entries)
  println(capitales)
  for((pais, capital) in capitales) {
      println("pais: $pais - capital: $capital")
      
  }
  for(capital in capitales) {
      println("capital: $capital")
  }
  println("Mutables")
  val inventario = mutableMapOf (
  "Laptops" to 10,
  "Impresoras" to 4,
  "Teclas" to 12,
  "Mouse" to 8)
  inventario["Monitores"]=5
  println(inventario)
  inventario["Laptops"]=20
  println(inventario)
  inventario.remove("Mouse")
  println(inventario)
  inventario.getOrPut("Proyectos"){15}
  println(inventario)
  inventario.getOrPut("Teclados"){15}
  println(inventario)
  
}
