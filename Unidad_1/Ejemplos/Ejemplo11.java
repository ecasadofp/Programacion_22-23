// Ejemplo11: Escribe un programa que pida una letra por el teclado
// y te diga la anterior en el alfabeto.
import java.util.Scanner;

public class Ejemplo11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame la entrada ");
        char caracter = sc.nextLine().charAt(0); // No hay un "nextChar", tenemos que tomar un String y su primera posición

        System.out.println("Has introducido el caracter " + caracter + ". El anterior es " + (char)(caracter -1));






    }

}
