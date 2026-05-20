void main() {
  // Forma básica
  int temperatura = 38;

  if (temperatura > 37.5) {
    print('Fiebre');
  } else if (temperatura > 36) {
    print('Normal');
  } else {
    print('Hipotermia');
  }

  // Operador ternario — para decisiones de una línea
  // condición ? valorSiVerdadero : valorSiFalso
  String estado = temperatura > 37.5 ? 'Con fiebre' : 'Sin fiebre';
  print(estado);

  // null-aware con ternario
  String? ciudad;
  String display = ciudad != null ? ciudad.toUpperCase() : 'Sin ciudad';

  // Forma más concisa con ??
  String display2 = ciudad?.toUpperCase() ?? 'Sin ciudad';
  print(display2);  // Sin ciudad
}
void main() {
  String? nombre;

  // Sin verificar — error de compilación
  // print(nombre.length);  // ERROR: nombre puede ser null

  // Forma 1 — verificación explícita
  if (nombre != null) {
    print(nombre.length);  // aquí Dart sabe que nombre es String
  }

  // Forma 2 — operador ?.
  print(nombre?.length);  // null, sin excepción

  // Forma 3 — valor por defecto
  int longitud = nombre?.length ?? 0;
  print(longitud);  // 0
}
// Los routers reportan la señal en dBm (decibeles-miliwatt)
// Cuanto más cercano a 0, mejor la señal
String clasificarSenalWifi(int dbm) {
  if (dbm >= -50) {
    return 'Excelente ($dbm dBm)';
  } else if (dbm >= -60) {
    return 'Buena ($dbm dBm)';
  } else if (dbm >= -70) {
    return 'Aceptable ($dbm dBm)';
  } else if (dbm >= -80) {
    return 'Débil ($dbm dBm)';
  } else {
    return 'Sin cobertura ($dbm dBm)';
  }
}

void main() {
  final lecturas = [-45, -62, -71, -83, -95];

  for (final dbm in lecturas) {
    print(clasificarSenalWifi(dbm));
  }
}