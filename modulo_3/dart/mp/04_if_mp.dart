// Ejercicio: clasificar el estado de un servidor según su tiempo de respuesta
void main() {
  final tiempoRespuestaMs = 350;

  String estado;
  if (tiempoRespuestaMs < 100) {
    estado = 'Excelente';
  } else if (tiempoRespuestaMs < 500) {
    estado = 'Aceptable';
  } else {
    estado = 'Lento';
  }

  print('Tiempo: ${tiempoRespuestaMs}ms → $estado');
}
