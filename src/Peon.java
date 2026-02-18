public class Peon extends Pieza {
    public Peon(int fila, int columna) {
        super(fila, columna);
    }

    @Override
    public int calcularCasillas() {
        int contador = 0;
        // 1 casilla adelante
        if (esValida(fila + 1, columna)) contador++;
        // 2 casillas si está en la fila inicial
        if (fila == 2 && esValida(fila + 2, columna)) contador++;
        
        return contador;
    }
}