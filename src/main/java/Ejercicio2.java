import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    /*2. Micro guerra de barcos (versión 2)
Requisito previo: Ejercicio 8 del capítulo Las tablas

Retomar el algoritmo de la guerra de barcos, dividiéndolo en procedimientos y funciones:

Escribir un procedimiento initializarTablero() que inicialice el tablero de juego.

Escribir un procedimiento mostrarTablero() que, como su nombre indica, muestre el tablero de juego.

Escribir una función introducirEnteroEntreLimites(), que hace que el usuario introduzca un valor hasta que esté entre un valor mínimo y un valor máximo, pasados en los argumentos de esta función.

Escribir una función de disparar() que le permita al jugador elegir sus coordenadas de disparo y devuelva verdadero si el barco es alcanzado y falso en caso contrario.

Escribir el algoritmo principal que llama a estos procedimientos y sus funciones. */

    private final int FILAS = 10;
    private final int COLUMNAS = 10;
    private final int AGUA = 0;
    private final int BARCO = 1;
    private final int HUNDIDO = 2;
    private int[][] tabla;
    private int barcoFila;
    private int barcoColumna;

    public Ejercicio2() {
        tabla = new int[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            Arrays.fill(tabla[i], AGUA);
        }
    }

    public void depositarBarco(int fila, int columna) {
        barcoFila = fila;
        barcoColumna = columna;
        tabla[fila][columna] = BARCO;
    }

    public boolean disparar(int fila, int columna) {
        if (tabla[fila][columna] == BARCO) {
            tabla[fila][columna] = HUNDIDO;
            if (fila == barcoFila && columna == barcoColumna) {
                return true;
            }
        }
        return false;
    }

    public void visualizacion() {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < FILAS; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < COLUMNAS; j++) {
                if (tabla[i][j] == AGUA) {
                    System.out.print("~ ");
                } else if (tabla[i][j] == BARCO) {
                    System.out.print("~ ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
Ejercicio2 juego = new Ejercicio2();
        int fila, columna;
        boolean hundido = false;
        juego.depositarBarco(5, 5);
        while (!hundido) {
            System.out.print("Introduce la fila: ");
            fila = sc.nextInt();
            System.out.print("Introduce la columna: ");
            columna = sc.nextInt();
            hundido = juego.disparar(fila, columna);
            juego.visualizacion();
        }
        System.out.println("¡Has hundido el barco!");



    }

}
