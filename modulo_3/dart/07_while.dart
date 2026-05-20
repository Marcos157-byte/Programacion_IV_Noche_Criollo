void main() {
  // while — comprueba la condición ANTES de ejecutar
  int paquetes = 0;
  int buffer   = 1024;  // bytes disponibles

  while (buffer > 0) {
    final tamano = buffer > 256 ? 256 : buffer;
    paquetes++;
    buffer -= tamano;
    print('Paquete $paquetes: $tamano bytes (restante: $buffer)');
  }

  // do-while — ejecuta AL MENOS UNA VEZ antes de comprobar
  int reintentos = 0;
  bool conexionEstablecida = false;

  do {
    reintentos++;
    print('Intento de conexión #$reintentos...');
    // Simular que conecta en el 3er intento
    if (reintentos == 3) conexionEstablecida = true;
  } while (!conexionEstablecida && reintentos < 5);

  print(conexionEstablecida
      ? 'Conectado tras $reintentos intentos'
      : 'No se pudo conectar');
}
void main() {
  final paquetesRed = [64, 128, 512, -1, 256, 1024, -1, 32];
  //                              ↑         ↑
  //                         paquete malo  paquete malo

  // continue — salta el paquete corrupto y continúa
  print('=== Procesando con continue ===');
  for (final paquete in paquetesRed) {
    if (paquete < 0) {
      print('Paquete corrupto ignorado');
      continue;  // salta al siguiente
    }
    print('Procesando paquete de $paquete bytes');
  }

  // break — detiene completamente al encontrar error crítico
  print('\n=== Procesando con break ===');
  for (final paquete in paquetesRed) {
    if (paquete < 0) {
      print('Error crítico — deteniendo procesamiento');
      break;  // sale del bucle
    }
    print('Procesando paquete de $paquete bytes');
  }
}
void main() {
  // Escanear una matriz de servidores buscando uno disponible
  final datacenters = ['EU-WEST', 'EU-EAST', 'US-WEST'];
  final racks       = ['RACK-A', 'RACK-B', 'RACK-C'];

  String? servidorEncontrado;

  // La etiqueta marca el bucle exterior
  busqueda:
  for (final dc in datacenters) {
    for (final rack in racks) {
      final servidor = '$dc/$rack';
      print('Probando $servidor...');

      // Simular que EU-EAST/RACK-B está disponible
      if (dc == 'EU-EAST' && rack == 'RACK-B') {
        servidorEncontrado = servidor;
        break busqueda;  // sale de AMBOS bucles
      }
    }
  }

  print('Servidor asignado: $servidorEncontrado');
}