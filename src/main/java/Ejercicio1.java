public class Ejercicio1 {
    /*1. Es el mayor

Escribir un algoritmo principal que llame a estas dos funciones.*/
    public static void main(String[] args) {
        System.out.println("El mayor es: " + mayor(5, 10));
        System.out.println("El mayor es: " + mayor2(5, 10));
    }
    public static int mayor(int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
    public static int mayor2(int a, int b){
        if (a == b){
            return 0;
        } else if (a > b){
            return 1;
        } else {
            return -1;
        }

    }
}
