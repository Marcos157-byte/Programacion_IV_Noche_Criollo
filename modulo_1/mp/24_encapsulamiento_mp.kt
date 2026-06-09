// Ejercicio: clase con encapsulamiento mínimo para una cuenta bancaria
class CuentaBancaria(private var saldo: Double) {
    fun depositar(monto: Double) {
        if (monto > 0) saldo += monto
    }
    fun retirar(monto: Double): Boolean {
        return if (monto > 0 && monto <= saldo) {
            saldo -= monto
            true
        } else false
    }
    fun obtenerSaldo() = saldo
}

fun main() {
    val cuenta = CuentaBancaria(100.0)
    cuenta.depositar(50.0)
    val ok = cuenta.retirar(30.0)
    println("Retiro ok: $ok, saldo actual: ${cuenta.obtenerSaldo()}")
}
\n// Nombre del ejercicio: Cuenta bancaria con encapsulamiento
