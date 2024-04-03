import java.util.Scanner;

public class CalculadoraTresPuntoCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int resultado = 0;
        String operador = "1,2,3,4";
        String accionUsuario = "";


        System.out.println();
        System.out.println("**** BIENVENIDO A MI CALCULADORA ****");
        System.out.println();

        do {
            try {
                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextInt();

                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextInt();

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

                //System.out.println("Ingrese el operador +,-,*,/");
                operador = scanner.next();

                switch (operador) {
                    case "1":
                        resultado = CalculadoraTresPuntoCero.sumar(num1, num2);
                        break;

                    case "2":
                        resultado = CalculadoraTresPuntoCero.restar(num1, num2);
                        break;

                    case "3":
                        resultado = CalculadoraTresPuntoCero.multiplicar(num1, num2);
                        break;

                    case "4":
                        resultado = CalculadoraTresPuntoCero.dividir(num1, num2);
                        break;

                    default:
                        System.out.println("Operador inválido");
                        break;
                }
                if (operador.equals("1") ||
                        operador.equals("2") || operador.equals("3") ||
                        operador.equals("4")) {

                    System.out.println("El resultado es: " + resultado);

                }

            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            } finally {
                System.out.println(" ");
                System.out.println("Stop para detener la app, 's' para seguir");

                accionUsuario = scanner.next();
            }
        } while
        (!accionUsuario.toLowerCase().equals("stop"));
        System.out.println("Calculadora finalizada");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int dividir(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }
}
