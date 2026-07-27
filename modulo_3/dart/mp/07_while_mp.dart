// Ejercicio: reintentar una conexión con while hasta lograrlo o agotar intentos
void main() {
  int intentos = 0;
  bool conectado = false;

  while (!conectado && intentos < 5) {
    intentos++;
    conectado = intentos == 4; // simula éxito en el 4to intento
    print('Intento $intentos: ${conectado ? "conectado" : "fallido"}');
  }
}
