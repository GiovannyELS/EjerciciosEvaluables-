import java.util.Scanner;

public class Arreglando {
    public static void main(String[] args) {

        //Declaro variables
        int[] num = new int[3];

        //Abro scanner
        Scanner scanner = new Scanner(System.in);

        //proceso con for
        Scanner scanner1 = scanner;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese numero " + (i + 1) + ":");
            num[i] = scanner1.nextInt();
        }

        //for para numeros mayor
        int mayor = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > mayor) {
                mayor = num[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);

        scanner.close();
    }
}
