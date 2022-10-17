// Almacena una palabra en un array de caracteres. Imprimela.
// Luego hazlo con un String. Saca sus caracteres con charAt(i)

public class Ejemplo4 {

    public static void main(String[] args) {

        char[] palabra1 = {'h','o','l','a'};
        int[] numeros = {1,2,4,6,6};

        System.out.println(palabra1);
        System.out.println(numeros);

        palabra1[0] = 'm';

        System.out.println(palabra1);

        String palabra2 = "adios";

        palabra2 = "bye";

        System.out.println(palabra2.charAt(0));

        String palabra3 = new String("bye");

        System.out.println("palabra2 contiene " + palabra2);
        System.out.println("palabra3 contiene " + palabra3);

        System.out.println(palabra2.equals(palabra3) );

    }

}
