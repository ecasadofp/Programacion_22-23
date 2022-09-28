// Realiza un programa que a partir de una nota (entera) introducida por teclado,
// visualice su calificación correspondiente: insuficiente, suficiente, bien, notable y sobresaliente.

import java.util.Scanner;

public class Ejemplo3 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int nota;
        String mensaje;

        System.out.println("Introduce la nota numérica ");
        nota = sc.nextInt();

        if (nota < 5){
            mensaje = "insuficiente";
        }else if(nota < 6){
            mensaje = "suficiente";
        }else if(nota < 7){ mensaje = "bien";}  // se puede poner en línea
        else if(nota < 9)
            mensaje ="notable"; // se puede poner sin llaves si solo es una sentencia
        else mensaje = "sobresaliente"; // incluso en la misma linea y sin llaves (solo una)

    System.out.println("La nota es " + mensaje);

    }



}
