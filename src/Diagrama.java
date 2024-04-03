import java.util.Scanner;

public class Diagrama {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.println("Ingrese un número:");
        a = scanner.nextInt();
        System.out.println("Ingrese otro número diferente al primero:");
        b = scanner.nextInt();

        if (a==b){
            System.out.println("escriba números diferentes");
        } else if (a>b) {
            System.out.printf(" %d es mayor que %d ",a,b);
        }
        else {
            System.out.println("El segundo número es mayor");
        }
        scanner.close();
    }
}
