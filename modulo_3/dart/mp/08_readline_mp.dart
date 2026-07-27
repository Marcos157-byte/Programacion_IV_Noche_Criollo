import 'dart:io';

// Ejercicio: leer el nombre de un servidor desde consola y saludarlo
void main() {
  stdout.write('Nombre del servidor a reiniciar: ');
  final servidor = stdin.readLineSync() ?? 'desconocido';

  print('Reiniciando $servidor...');
}
