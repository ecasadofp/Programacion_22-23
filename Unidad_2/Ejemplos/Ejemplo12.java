// Escribe un prograna que muestre los n primeros términos de la serie de Fibonacci.
// El primer término es el 0, el segundo el 1 y el resto se calcula sumando
// los dos anteriores. (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...) El número n se introducirá por teclado.

import java.util.Scanner;

public class Ejemplo12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cantidad;
        long anterior = 0;
        long actual = 1;


        System.out.println("Introduce el número de términos");
        cantidad = sc.nextInt();

        System.out.print(anterior + "\t");
        System.out.print(actual + "\t");


        for(int i = 2; i < cantidad; i++){

            long aux = actual;
            actual = anterior + actual;
            anterior = aux;
            System.out.print(actual + "\t");
        }


    }
}
