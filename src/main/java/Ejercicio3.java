public class Ejercicio3 {
    public static void main(String[] args) {
        int[] tabla = new int[10];
        int min = 0;
        int max = 10;
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
        }
        System.out.println("El mayor es: " + mayor(tabla));
    }
    public static int mayor(int[] tabla){
        int mayor = tabla[0];
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > mayor){
                mayor = tabla[i];
            }
        }
        return mayor;
    }
}
