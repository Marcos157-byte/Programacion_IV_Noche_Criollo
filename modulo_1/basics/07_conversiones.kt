fun main() {
    val entero: Int =12
    val decimal:Double = entero.toDouble()
    val longVariable: Long =entero.toLong()
    val variableString: String = entero.toString()
    println("Entero: $entero")
    println("Decimal: $decimal")
    println("Longs Variables: $longVariable")
    println("String: $variableString")
    
    println("String a Numerico")
    val num1 = "1234".toInt()
    val num2 = "3.1415".toDouble()
    
    val invalido = "abcd".toIntOrNull()
    println(invalido)
}