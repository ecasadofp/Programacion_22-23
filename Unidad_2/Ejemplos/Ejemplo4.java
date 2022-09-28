// Escribe un programa en que se pida un número del 1 al 7 y responda con
// el nombre del día de la semana correspondiente.

import java.util.Scanner;

public class Ejemplo4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Dame un número del 1 al 7");
        numero = sc.nextInt();

        switch (numero){

            case 1:
                System.out.println("lunes");
                break;  // Si no ponemos break se ejecutan los siguientes!!
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miércoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            case 5:
                System.out.println("viernes");

            case 6:
                System.out.println("sabado");
                break;
            case 7 :
                System.out.println("domingo");
                break;
            default:
                System.out.println("error");
        }

    }

}
