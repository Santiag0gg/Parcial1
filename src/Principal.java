public class Principal {

    // El constructor ejecuta la lógica de prueba
    public Principal() {
        System.out.println("--- PRUEBAS DE MOVIMIENTO ---");

        // Creamos los objetos usando Polimorfismo
        Pieza miPeon = new Peon(2, 4);   // Esperado: 2 casillas
        Pieza miRey = new Rey(1, 1);    // Esperado: 3 casillas (está en una esquina)
        Pieza miTorre = new Torre(5, 5); // Esperado: 14 casillas

        mostrarInfo("Peón (fila 2)", miPeon);
        mostrarInfo("Rey (esquina 1,1)", miRey);
        mostrarInfo("Torre (5,5)", miTorre);
    }

    public void mostrarInfo(String nombre, Pieza p) {
        System.out.println(nombre + " puede moverse a: " + p.calcularCasillas() + " casillas.");
    }

    public static void main(String[] args) {
        // Al crear el objeto, se dispara el constructor de arriba
        new Principal();
    }
}