public class Rey extends Pieza {
    public Rey(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularCasillas() {
        int contador = 0;
        for (int f = fila - 1; f <= fila + 1; f++) {
            for (int c = columna - 1; c <= columna + 1; c++) {
                // Si es una casilla válida y NO es la casilla donde ya está parado
                if (esValida(f, c) && !(f == fila && c == columna)) {
                    contador++;
                }
            }
        }
        return contador;
    }
}