// Escribir diferentes métodos para comprobar si un número es primo o compuesto.

import java.util.Scanner;

public class Ejemplo13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

//        numero = Integer.MAX_VALUE-1;

        System.out.println("Introduce el número a comprobar");
        numero = sc.nextInt();

        boolean prueba = esPrimo2(numero);

        System.out.println("El número " + numero + " es primo vale " + prueba);

    }

    public static boolean esPrimo(int numero){

        boolean esPrimo = true; // bandera (flag)

        for( int i = 2; i < numero;i++){

            if((numero % i) == 0)
                esPrimo = false; // no necesita llaves, sentencia única en caso de true

        }

        return esPrimo;
    }

    public static boolean esPrimo2(int numero){

        for( int i = 2; i < numero;i++){

            if((numero % i) == 0)
                return false;  // si devuelvo salgo del método instantáneamente

        }

        return true;
    }

}
