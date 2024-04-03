public class Iterando {
    public static void main(String[] args) {

        //Declaro variables
        int i = 1;
        int j = 1;
        int suma = 0;
        int sumar = 0;
        int sumado = 0;

        // Proceso con while
        while (i <= 10) {
            suma += i;
            i++;
        }
        System.out.println("La suma con un while es: " + suma);

        //Proceso co do-while
        do {
            sumar = sumar + j;
            j++;
        } while (j <= 10);
        System.out.println("La suma con do-while es: " + sumar);

        // Proceso con for
        for (int k = 1; k <= 10; k++) {
            sumado += k;
        }
        System.out.println("La suma de los números con un for es: " + sumado);
    }
}

