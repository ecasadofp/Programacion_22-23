// Realiza un programa que pida dos números enteros
// y luego muestre el resultado de su división con  tres decimales.

import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int a, b;

        System.out.println("Introduce los dos números enteros separados por un espacio y pulsa enter");

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("La división es: %d / %d = %.3f", a, b, (double)a/b);


    }
}
