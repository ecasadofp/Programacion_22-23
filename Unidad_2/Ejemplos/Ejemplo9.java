// Muestra la tabla de multiplicar de un número n
// introducido por el teclado (utilizadno do while)

import java.util.Scanner;

public class Ejemplo9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número");
        int numero = sc.nextInt();
        int factor = 0;
        do{

            System.out.printf("%d x %d = %d\n",numero, factor, numero*factor);
            factor++;

        } while(factor <= 10);

    }

}
