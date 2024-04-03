import java.util.Scanner;

public class Superliga {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int partidosGanados;
        int partidosPerdidos;
        int partidosEmpatados;
        int puntajePorPGanados;
        int puntajePorPEmpatados;
        int puntajeTotal;

        System.out.println("Ingrese el numero de partidos ganados por su equipo favorito:");
        partidosGanados = scanner.nextInt();

        System.out.println("Ingrese el numero de partidos perdidos por su equipo favorito:");
        partidosPerdidos = scanner.nextInt();

        System.out.println("Ingrese el numero de partidos empatados por su equipo favorito:");
        partidosEmpatados = scanner.nextInt();



        puntajePorPGanados = partidosGanados * 3;
        puntajePorPEmpatados = partidosEmpatados;
        puntajeTotal = puntajePorPGanados + puntajePorPEmpatados;

        System.out.println("El puntaje total de su equipo es: " + puntajeTotal);

    }
}
