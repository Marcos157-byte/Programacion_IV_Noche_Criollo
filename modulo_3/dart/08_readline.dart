import 'dart:io';

void main() {
  // stdin.readLineSync() — lee una línea de texto desde la consola
  stdout.write('Nombre del servidor: ');
  final servidor = stdin.readLineSync() ?? '';

  stdout.write('Puerto (número): ');
  final puertoTexto = stdin.readLineSync();
  final puerto = int.tryParse(puertoTexto ?? '');

  if (puerto == null) {
    print('Puerto inválido, no se pudo leer un número');
    return;
  }

  print('Servidor "$servidor" configurado en el puerto $puerto');
}

void main() {
  // Leer varias líneas hasta encontrar un comando de salida
  print('Escribe comandos ("salir" para terminar):');

  final comandos = <String>[];
  while (true) {
    stdout.write('> ');
    final entrada = stdin.readLineSync();
    if (entrada == null || entrada.trim().toLowerCase() == 'salir') break;
    comandos.add(entrada);
  }

  print('Comandos registrados: $comandos');
}
