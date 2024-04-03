import java.util.Scanner;

public class VolumenEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double volumen;

        System.out.println("ingrese la longitud del radio de una esfera");
        double radio = scanner.nextDouble();

        volumen = ( 4.0/3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("El volumen de una esfera es: " + volumen);

        scanner.close();



    }
}
