import java.util.Scanner;

public class CondicionalIf {
    public static void main(String[] args){

        //Definimos variables
        int num1=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero:");
        num1= scanner.nextInt();

        //Es positiva?

        if (num1>0){
            System.out.println("El número es Positivo");
        }
        else if (num1==0) {
            System.out.println("El número es 0");
        }
        else {
            System.out.println("El número es negativo");
        }

        //Es par o impar?

        if(num1%2==0){
            System.out.println("El número es par");
        }

        else {
            System.out.println("el número es impar");}
    }

}
