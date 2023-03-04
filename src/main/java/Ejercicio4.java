import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Inicializar la tabla
        int[][] tabla = new int[][]{
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 1, 1, 1, 0, 0}
        };

        // Mostrar la tabla inicial
        mostrarTabla(tabla);

        // Pedir al usuario que ingrese el movimiento
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el movimiento (fila,columna,direccion): ");
        int fila = scanner.nextInt();
        int columna = scanner.nextInt();
        String direccion = scanner.next();

        // Mover la oveja
        if (moverOveja(tabla, fila, columna, direccion)) {
            // Mostrar la tabla actualizada
            mostrarTabla(tabla);
            System.out.println("Movimiento válido");
        } else {
            System.out.println("Movimiento inválido");
        }
    }

    /**
     * Muestra la tabla en la consola.
     */
    private static void mostrarTabla(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Mueve una oveja en la dirección especificada.
     * Retorna true si el movimiento es válido, y false si no lo es.
     */
    private static boolean moverOveja(int[][] tabla, int fila, int columna, String direccion) {
        int nuevoFila, nuevoColumna, saltoFila, saltoColumna;

        // Determinar los nuevos valores de fila y columna según la dirección
        switch (direccion) {
            case "arriba":
                nuevoFila = fila - 1;
                nuevoColumna = columna;
                saltoFila = fila - 2;
                saltoColumna = columna;
                break;
            case "abajo":
                nuevoFila = fila + 1;
                nuevoColumna = columna;
                saltoFila = fila + 2;
                saltoColumna = columna;
                break;
            case "izquierda":
                nuevoFila = fila;
                nuevoColumna = columna - 1;
                saltoFila = fila;
                saltoColumna = columna - 2;
                break;
            case "derecha":
                nuevoFila = fila;
                nuevoColumna = columna + 1;
                saltoFila = fila;
                saltoColumna = columna + 2;
                break;
            default:
                return false; // Dirección inválida
        }

        // Verificar que la nueva posición sea válida
        if (nuevoFila < 0 || nuevoFila >= tabla.length || nuevoColumna < 0 || nuevoColumna >= tabla[0].length) {
            return false; // Fuera de los límites de la tabla
        }

        return false;
    }
}