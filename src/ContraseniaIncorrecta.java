import java.util.Scanner;

public class ContraseniaIncorrecta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String contraseniaCorrecta = "Alumno12345*";
        String contraseniaUsuario;
        boolean ingreso = true;

        System.out.println("Ingrese contraseña");

        while (ingreso) {
            contraseniaUsuario = scanner.next();
            if (contraseniaUsuario.equalsIgnoreCase(contraseniaCorrecta)){
                System.out.println("Contrase Correcta.Bienvenido");
                break;
            } else {
                System.out.println("Contrasenia Incorrecta. Intente de nuevo");
            }
        }
        scanner.close();
    }
}
