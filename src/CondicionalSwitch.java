import java.util.Scanner;

public class CondicionalSwitch {
    public static void main (String[] args){

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Ingrese un mes del 1 al 12:");

        //Declaramos variables

        int mes = scanner.nextInt();

        switch (mes){
            case 1:
                System.out.println("Enero");
                System.out.println("verano");
                break;

            case 2:
                System.out.println("Febrero");
                System.out.println("verano");
                break;

            case 3:
                System.out.println("Marzo");
                System.out.println("otoño");
                break;

            case 4:
                System.out.println("Abril");
                System.out.println("otoño");
                break;

            case 5:
                System.out.println("Mayo");
                System.out.println("otoño");
                break;

            case 6:
                System.out.println("Junio");
                System.out.println("invierno");
                break;

            case 7:
                System.out.println("Julio");
                System.out.println("invierno");
                break;

            case 8:
                System.out.println("Agosto");
                System.out.println("invierno");
                break;

            case 9:
                System.out.println("Septiembre");
                System.out.println("primavera");
                break;

            case 10:
                System.out.println("Octubre");
                System.out.println("primavera");
                break;

            case 11:
                System.out.println("Noviembre");
                System.out.println("primavera");
                break;

            case 12:
                System.out.println("Diciembre");
                System.out.println("verano");
                break;

            default:
                System.out.println("El número ingresado no corresponde a un mes");
        }

    }

}
