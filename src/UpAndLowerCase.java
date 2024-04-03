import java.util.Scanner;

public class UpAndLowerCase {
    public static void main (String[] args) {
        //Primero definimos variables y el tipo de datos

        String frase;
        String fraseMayuscula;
        String fraseMinuscula;

        //Abrimos el Scanner
        Scanner scanner = new Scanner(System.in);

        //Solicitamos al usuario ingreso de frase
        System.out.println("Ingrese una frase: ");

        //Asignamos el valor ingresado a la variable
        frase = scanner.nextLine();

        //Convertimos a Mayuscula la variable frase con .toUpperCase
        fraseMayuscula= frase.toUpperCase();

        System.out.println("Frase en Mayúscula: " + fraseMayuscula);

        //Convertimos a Minúscula la variable frase con .toloweCase
        fraseMinuscula= frase.toLowerCase();

        System.out.println("Frase en Minúscula: " + fraseMinuscula);

    }
}
