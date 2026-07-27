// Ejercicio: hacer ping simulado a una lista de servidores con for-in
void main() {
  final servidores = ['srv-01', 'srv-02', 'srv-03'];

  for (final servidor in servidores) {
    print('Haciendo ping a $servidor...');
  }
}
