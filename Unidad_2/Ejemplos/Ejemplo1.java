// Realiza un programa que pida una hora por teclado y que muestre luego buenos días,
// buenas tardes o buenas noches según la hora.
// Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5 respectivamente.
// Sólo se tiene en cuenta las horas, los minutos no se deben introducir por teclado.
// Además, si la hora introducida es distinta del rango 0-23 se indicará por pantalla
// que no es correcta.

import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int entrada;

        System.out.println("Introduce la hora actual ");
        entrada = sc.nextInt();

        if(entrada < 0){

            System.out.println("Hora incorrecta");

        } else if(entrada <= 5) {

            System.out.println("Buenas noches");

        }else if(entrada < 13){

            System.out.println("Buenos días");

        }else if(entrada <= 20){

            System.out.println("Buenas tardes");

        }else if(entrada <= 23){

            System.out.println("Buenas noches");
        }else{

            System.out.println("Hora incorrecta");

        }

    }

}
