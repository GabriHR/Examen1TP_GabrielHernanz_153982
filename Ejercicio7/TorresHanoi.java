package Ejercicio7;

public class TorresHanoi {

    public static void resolverHanoi(int n, String origen, String auxiliar, String destino) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return;
        }
        resolverHanoi(n - 1, origen, destino, auxiliar);
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
        resolverHanoi(n - 1, auxiliar, origen, destino);
    }

    public static void main(String[] args) {
        int n = 3; // Número de discos
        resolverHanoi(n, "P1", "P2", "P3");
    }
}
