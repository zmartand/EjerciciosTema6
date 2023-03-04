import java.util.Scanner;

public class Ejercicio5 {
    private static final int FILAS = 10;
    private static final int COLUMNAS = 40;
    private static char[][] tabla = new char[FILAS][COLUMNAS];

    public static void main(String[] args) {
        inicializarTabla();
        mostrarTabla();

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n¿Qué acción desea realizar?");
            System.out.println("1. Dibujar un carácter");
            System.out.println("2. Dibujar un rectángulo");
            System.out.println("3. Cambiar el color (bote de pintura)");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nDibujar un carácter");
                    System.out.println("Ingrese la fila y la columna donde desea dibujar el carácter:");
                    int fila = scanner.nextInt();
                    int columna = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el carácter a dibujar:");
                    char caracter = scanner.nextLine().charAt(0);
                    dibujarCaracter(fila, columna, caracter);
                    mostrarTabla();
                    break;
                case 2:
                    System.out.println("\nDibujar un rectángulo");
                    System.out.println("Ingrese la fila y la columna de la esquina superior izquierda del rectángulo:");
                    int fila1 = scanner.nextInt();
                    int columna1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese la fila y la columna de la esquina inferior derecha del rectángulo:");
                    int fila2 = scanner.nextInt();
                    int columna2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el carácter con el que desea dibujar el rectángulo:");
                    char caracter2 = scanner.nextLine().charAt(0);
                    dibujarRectangulo(fila1, columna1, fila2, columna2, caracter2);
                    mostrarTabla();
                    break;
                case 3:
                    System.out.println("\nCambiar el color (bote de pintura)");
                    System.out.println("Ingrese la fila y la columna donde desea cambiar el color:");
                    int fila3 = scanner.nextInt();
                    int columna3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese el nuevo carácter que desea utilizar:");
                    char caracter3 = scanner.nextLine().charAt(0);
                    cambiarColor(fila3, columna3, caracter3);
                    mostrarTabla();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("\n¡Opción inválida! Intente de nuevo.");
                    break;
            }
        }

        System.out.println("\n¡Gracias por participar en el taller de arte ASCII!");
    }

    /**
     * Inicializa la tabla con caracteres de espacio.
     */
    private static void inicializarTabla() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tabla[i][j] = ' ';
            }
        }
    }

    /**
     * Muestra la tabla en la consola.
     */
    private static void mostrarTabla() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tabla[i][j]);
            }
            System.out.println();
        }
    }
    private static void dibujarCaracter(int fila, int columna, char caracter) {
        if (fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS) {
            tabla[fila][columna] = caracter;
        }
    }
    private static void dibujarRectangulo(int fila1, int columna1, int fila2, int columna2, char caracter) {
        if (fila1 >= 0 && fila1 < FILAS && columna1 >= 0 && columna1 < COLUMNAS && fila2 >= 0 && fila2 < FILAS && columna2 >= 0 && columna2 < COLUMNAS) {
            for (int i = fila1; i <= fila2; i++) {
                for (int j = columna1; j <= columna2; j++) {
                    tabla[i][j] = caracter;
                }
            }
        }
    }
    private static void cambiarColor(int fila, int columna, char caracter) {
        if (fila >= 0 && fila < FILAS && columna >= 0 && columna < COLUMNAS) {
            char caracterOriginal = tabla[fila][columna];
            tabla[fila][columna] = caracter;
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    if (tabla[i][j] == caracterOriginal) {
                        tabla[i][j] = caracter;
                    }
                }
            }
        }
    }

}


