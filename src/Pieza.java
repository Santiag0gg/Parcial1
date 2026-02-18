public abstract class Pieza {
    protected int fila;
    protected int columna;

    public Pieza(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    
    public abstract int calcularCasillas();

    // Método protegido para validar que la posición no se salga del tablero 8x8
    protected boolean esValida(int f, int c) {
        return f >= 1 && f <= 8 && c >= 1 && c <= 8;
    }
}