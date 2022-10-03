// Realiza un programa que calcule la media de n números introducidos por teclado.
// El valor de n se pedirá al usuario al comienzo del programa
// y será un valor entero positivo mayor que 0. (acumulador y contador)

import java.util.Scanner;

public class Ejemplo10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad;
        double acumulador = 0;

        System.out.println("Introduce la cantidad de números ");
        cantidad = sc.nextInt();

        for(int i = 0;i < cantidad; i++){
            double entrada;
            System.out.println("Dame número " + (i + 1));
            entrada = sc.nextDouble();
            acumulador += entrada;
        }

        System.out.printf("La media es %.2f " , acumulador/cantidad);

    }

}
