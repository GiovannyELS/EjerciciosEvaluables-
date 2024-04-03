import java.util.Scanner;

public class ClaseUtilidadString {
    public static void main(String[] args) {

        //Aperturo Scanner
        Scanner scanner = new Scanner(System.in);

        //Declaro variables
        String palabra;

        //Pido a usuario que ingrese palabra
        System.out.println("Ingrese palabra de 8 letras");

        palabra = scanner.nextLine();

        if (palabra.length() == 8) {

            System.out.println("Correcto");
            System.out.println(palabra.toUpperCase());
        } else {
            System.out.println("Incorrecto");
            System.out.println(palabra.toLowerCase());
        }
    }
}
