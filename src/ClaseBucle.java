import java.util.Scanner;

public class ClaseBucle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroCero = 0;
        int numeroCien = 100;
        boolean flag = true;
        int num = 0;

        while (flag) {
            System.out.println("Ingrese un número:");
            num = scanner.nextInt();
            if ((num == 0) || num == 100) {
                flag = false;
            }
        }
        System.out.println("El numero es 0 o 100");
    }
}
