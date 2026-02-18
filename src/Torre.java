public class Torre extends Pieza {
    public Torre(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularCasillas() {
        // En un tablero de 8x8, una torre siempre tiene 14 movimientos 
        // (7 en su fila y 7 en su columna), sin importar su posición.
        return 14;
    }
}