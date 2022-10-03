// Realiza un programa que nos diga cuantos dígitos tiene un número entero introducido por teclado.

import java.util.Scanner;

public class Ejemplo11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entrada;
        int cantidad = 1;

        System.out.println("Dame el número");
        entrada = sc.nextInt();

        while(entrada/10 != 0){

            entrada = entrada /10;
            cantidad ++;

        }

        System.out.printf("El número tiene %d cifras", cantidad);

    }
}
