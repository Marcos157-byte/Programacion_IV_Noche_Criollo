// Ejercicio: formatear un mensaje de log usando interpolación de strings
void main() {
  final nivel = 'ERROR';
  final mensaje = 'conexión rechazada';
  final intento = 3;

  final log = '[$nivel] intento #$intento: $mensaje';
  print(log.toUpperCase());
}
