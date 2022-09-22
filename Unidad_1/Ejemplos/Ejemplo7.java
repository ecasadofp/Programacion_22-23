// Ejemplo7: Realiza un programa que pida dos números enteros y
// luego muestre el resultado de su multiplicación.

import java.util.Scanner;

public class Ejemplo7 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a, b, multiplicacion;

        System.out.println("Introduce el primer número");

        a = sc.nextInt();

        System.out.println("Introduce el segundo número: ");

        b = sc.nextInt();

        multiplicacion = a * b;

        System.out.printf("%d x %d = %d", a, b, multiplicacion);
    }
}
