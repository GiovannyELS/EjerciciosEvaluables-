import java.util.InputMismatchException;
import java.util.Scanner;

public class Funcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean ciclo = true;


        while (ciclo) {

            System.out.println("CONVERSOR DE MONEDAS");
            System.out.println("1 - Pesos Chilenos a Dolares\n" +
                    "2 - Pesos Chilenos a Euros\n" +
                    "3 - Pesos Chilenos a Yenes\n" +
                    "4 - Salir ");

            System.out.println("INGRESE UNA OPCION:  ");



            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        convertir(1.02, " Dolar");
                        break;
                    case 2:
                        convertir(0.94, " Euro");
                        break;
                    case 3:
                        convertir(3.75, " Yenes");
                        break;

                    case 4:
                        System.out.println(" CERRANDO PROGRAMA  ");
                        ciclo = false;
                        break;

                    default:
                        System.out.println(" OPCION INCORRECTA ");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("POR FAVOR INGRESE UN NUMERO DEL 1 AL 4.");
                scanner.next();
            }
        }
    }

    static void convertir(double valorDolar, String pais) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese la cantidad pesos chilenos a %s ", pais + " ");

        double pesoChilenoIngresado = scanner.nextDouble();
        double divisas = valorDolar * pesoChilenoIngresado / 1000;

        System.out.println("Tienes $ " + divisas + pais);

    }
}