import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector: ");

        int tamanio = scanner.nextInt();
        int[] vector = new int[tamanio];
        int suma = 0;

        for (int i = 0; i < tamanio; i++) {
            System.out.println("Ingrese el vector " + (i + 1) + ":");
            vector[i] = scanner.nextInt();
            suma = suma + vector[i];
        }
        System.out.println("La suma de todos los elementos del vector es: " + suma);
    }
}