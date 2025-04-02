package Ejercicio6;

public class Factorial {

    public static long factorialDin(int n) {
        // Crear una tabla para almacenar los valores del factorial
        long[] tabla = new long[n + 1];

        // Inicializar los casos base de la tabla
        tabla[0] = 1;
        tabla[1] = 1;

        // Calcular el factorial de 2 a n
        for (int i = 2; i <= n; i++) {
            tabla[i] = i * tabla[i - 1];
        }

        // Devolver el factorial de n
        return tabla[n];
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("El factorial de " + n + " es: " + factorialDin(n));
    }
}