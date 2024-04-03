public class SinCadena {
    public static void main(String[] args) {

        //ojo revisar

        String cadena = "hola mundo";
        String subcadena = cadena.substring(3, 5);
        System.out.println("La cuarta y quinta letra de la cadena son: " + subcadena);

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                contador++;
            }
        }

        System.out.println("La cantidad de vocales en la cadena es: " + contador);
    }
}