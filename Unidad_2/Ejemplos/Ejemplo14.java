// Escribe un programa que lea una lista de varios números introducidos por teclado
// separados por espacios y determine cuantos son positivos y cuantos negativos

import java.util.Scanner;

public class Ejemplo14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        System.out.println("Introduce la lista de números separados por espacios y pulsa enter");

        while(sc.hasNextInt()){

            int aux = sc.nextInt();

            if(aux > 0)
                positivos++;
            else if (aux < 0)
                negativos++;

        }

        System.out.printf("Hay %d positivos y %d negativos ", positivos, negativos);

    }

}
