// Escribe un programa que pida por teclado una cantidad en segundos
// y devuelva su correspondencia a horas, minutos y segundos

import java.util.Scanner;

public class Ejemplo9 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int horas, minutos, segundos, entrada, temporal;

        System.out.println("Dame los segundos a convertir ");
        entrada = sc.nextInt();

        segundos = entrada % 60;
        temporal = entrada / 60;

        minutos = temporal % 60;
        horas = temporal /60;

        System.out.format("%d segundos equivalen a %d horas, %d minutos y %d segundos", entrada, horas, minutos, segundos);

    }
}