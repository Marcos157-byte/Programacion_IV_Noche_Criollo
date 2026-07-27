// Ejercicio: traducir un código de estado HTTP a su mensaje usando switch expresión
void main() {
  final codigo = 403;

  final mensaje = switch (codigo) {
    200 => 'OK',
    404 => 'No encontrado',
    403 => 'Prohibido',
    500 => 'Error del servidor',
    _ => 'Código desconocido',
  };

  print('$codigo → $mensaje');
}
