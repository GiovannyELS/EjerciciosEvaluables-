import java.util.Scanner;

public class CalculadoraUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;
        int resultado;
        String operador;

        System.out.println("Ingrese el primer número");
        numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        numero2 = scanner.nextInt();

        System.out.println("*********** SELECCIONE UNA **********");
        System.out.println("  *********** OPERACION **********");
        System.out.println("  *                                *");
        System.out.println("  * Sumar  ----------------------1 *");
        System.out.println("  * Restar --------------------- 2 *");
        System.out.println("  * Multiplicar ---------------- 3 *");
        System.out.println("  * Dividir -------------------- 4 *");
        System.out.println("  *                                *");
        System.out.println("  **********************************");
        System.out.println("**************************************");

        System.out.println();

        operador = scanner.next();

        switch (operador) {

            case "1":
                resultado = (numero1 + numero2);
                System.out.printf("La Suma es:  %s + %s = %s ", numero1, numero2,
                        resultado + "\n");
                break;

            case "2":
                resultado = (numero1 - numero2);
                System.out.printf("La Resta es:  %s - %s = %s ", numero1, numero2,
                        resultado + "\n");
                break;

            case "3":
                resultado = (numero1 * numero2);
                System.out.printf("La Multiplación es:  %s * %s = %s ", numero1, numero2,
                        resultado + "\n");
                break;

            case "4":
                resultado = (numero1 % numero2);
                System.out.printf("La División es:  %s / %s = %s ", numero1, numero2,
                        resultado + "\n");
                break;

            default:
                System.out.println("Opción Invalida");

        }
    }
}
