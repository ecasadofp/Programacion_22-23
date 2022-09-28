// Algunos ejemplos de la clase Math

public class ClaseMath {
    public static void main(String[] args) {

        double numero = 43.454;
        double base = 45.3;
        double exp = 75.2;


        System.out.printf("La raíz cuadrada de %f es %f ", numero, Math.sqrt(numero));

        System.out.println();

        System.out.printf("La potencia de %f elevado a %f", base, exp, Math.pow(base, exp));

        System.out.println();

        System.out.println(Math.PI);


    }

}
