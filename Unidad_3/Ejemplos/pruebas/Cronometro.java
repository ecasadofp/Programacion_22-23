package pruebas;

import java.util.Calendar;
import java.util.Scanner;

public class Cronometro {

	public static void main(String[] args)
    {
            long tiempo1, tiempo2, diferencia;
            Scanner s = new Scanner(System.in);
            Calendar ahora1 = Calendar.getInstance();  // Nos "guarda" el momento actual
            tiempo1 = ahora1.getTimeInMillis(); // Devuelve los milisegundos transcurridos desde "epoch". Unix 1/1/1970
            System.out.println("Empieza a contar el tiempo. Pulsa Intro para terminar.");

            String cad = s.nextLine();

            Calendar ahora2 = Calendar.getInstance();
            tiempo2 = ahora2.getTimeInMillis();
            
            diferencia = tiempo2 - tiempo1;

            System.out.println("Has tardado: " + diferencia + " milisegundos");
            System.out.print("Equivale a: " + (double)diferencia/1000 + " segundos");
    }

}
