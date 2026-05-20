void main() {
  final nombre = 'Ana';
  final edad   = 28;

  // Interpolación con $ (igual que en Kotlin)
  print('Hola, $nombre');                    // Hola, Ana

  // Expresión con ${ }
  print('${nombre.toUpperCase()} tiene ${edad + 1} años el próximo año');

  // String multilinea con triple comillas
  final tarjeta = '''
Nombre: $nombre
Edad:   $edad
Mayor:  ${edad >= 18 ? 'Sí' : 'No'}
  ''';
  print(tarjeta);

  // Raw string — ignora el escape y la interpolación
  final ruta = r'C:\Users\Ana\Documents';  // el \ no se interpreta
  print(ruta);

  // Concatenación (menos idiomático — preferir interpolación)
  final saludo = 'Hola, ' + nombre + '!';

  // Métodos útiles de String
  print('flutter'.toUpperCase());           // FLUTTER
  print('  Flutter  '.trim());              // Flutter
  print('Flutter'.contains('lut'));         // true
  print('Flutter'.replaceAll('t', 'T'));    // FluTTer
  print('a,b,c'.split(','));                // [a, b, c]
  print('Flutter'.substring(0, 4));         // Flut
  print('Flutter'.startsWith('Flu'));       // true
  print('abc'.padLeft(5, '0'));             // 00abc
}
void main() {
  // Conversiones numéricas
  int    entero  = 42;
  double decimal = entero.toDouble();   // 42.0
  String texto   = entero.toString();   // "42"

  // String → número
  int    num1 = int.parse('123');       // 123
  double num2 = double.parse('3.14');   // 3.14

  // Conversión segura (no lanza excepción)
  int?    num3 = int.tryParse('abc');   // null
  double? num4 = double.tryParse('99'); // 99.0

  // Verificar tipo con is (como en Kotlin)
  Object valor = 'texto';
  if (valor is String) {
    print(valor.length);  // smart cast — ya es String
  }

  // Cast explícito con as
  Object obj = 'Hola';
  String str = obj as String;

  // Comprobar nulabilidad
  String? nullable = null;
  int longitud = nullable?.length ?? 0;
  print(longitud);  // 0

  // Números especiales
  print(double.infinity);     // Infinity
  print(double.nan);          // NaN
  print(double.maxFinite);    // 1.7976931348623157e+308
}