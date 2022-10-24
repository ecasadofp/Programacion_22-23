// Realiza un programa que pida los 8 dígitos de un número
// binario a través de una ventana y luego muestre por pantalla
// el binario y su equivalente decimal.

import java.util.Scanner;

public class Ejemplo7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entrada;
        int valor = 128;
        int decimal = 0;

// Voy a suponer que el usuario no me va a dar entradas equivocadas (nada distinto de 1 y 0)

        for (int i = 0; i < 8; i++) {

            System.out.println("Introduzca el carácer " + (i + 1) + ": ");
            entrada = sc.nextInt();
            decimal += entrada * valor;
            valor /= 2;
        }

        System.out.println("El valor decimal del número es " + decimal);

    }
}
