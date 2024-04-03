public class ImprimiendoPares {
    public static void main(String[] args) {

        int resultado = 0;

        for (int i = 1; i <= 50; i++) {
            resultado = resultado + 2;
            System.out.println(" Resultado es igual a: " + resultado);

            if (resultado % 2 == 0) {
                System.out.println(" Es par ");
            }
        }
    }
}