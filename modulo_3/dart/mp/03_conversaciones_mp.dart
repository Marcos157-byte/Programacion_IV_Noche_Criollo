// Ejercicio: convertir el texto de un puerto ingresado a número de forma segura
void main() {
  final puertoTexto = '8443';

  final puerto = int.tryParse(puertoTexto);
  if (puerto != null) {
    print('Puerto válido: $puerto');
  } else {
    print('Puerto inválido: "$puertoTexto"');
  }
}
