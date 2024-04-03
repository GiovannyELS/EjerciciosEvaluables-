import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declarar variable
        int limiteSuma;
        int sumaValoresIngresados = 0;
        int numeroUsuario;

        System.out.println("Ingrese número");
        limiteSuma = scanner.nextInt();

        if (limiteSuma <= 0) {
            System.out.println("Por favor ingrese un numero positivo");
            return;
        }

        do {

            System.out.println("Ingrese el numero a sumar)");
            numeroUsuario= scanner.nextInt();

            sumaValoresIngresados += numeroUsuario;}

            while (sumaValoresIngresados <= limiteSuma);

        System.out.println("la suma total de los numeros s es :" + sumaValoresIngresados + " donde el limite era" + limiteSuma);

        scanner.close();

  }
}