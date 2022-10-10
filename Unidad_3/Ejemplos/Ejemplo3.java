// Haz un ejercicio que pida al usuario que cantidad de datos enteros
// quiere almacenar y posteriormente, se los pida y los almacene en un array.
// Finalmente, haz que presente los datos (en métodos. Utiliza for each para presentar).

import java.util.Scanner;

public class Ejemplo3 {

    public static void main(String[] args) {

        int[] numeros;

        numeros = creaArray();
        llenaArray(numeros);
        muestraArray(numeros);

        System.out.println();

        System.out.println("Modificamos array");

        llenaArray(numeros);
        muestraArray(numeros);

    }

    // Método que pide un entero al usuario y crea un array de esa dimensión

    public static int[] creaArray(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Que cantidad de enteros vas a introducir");
        int dimension = sc.nextInt();

        int[] array = new int[dimension];

        return array;
    }

    // Método que va pidiendo los elementos al usuario para llenar un array

    public static void llenaArray(int[] array){

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < array.length; i ++){

            System.out.println("Dame el valor " + (i+1) +"º");
            array[i] = sc.nextInt();

        }

    }

    // Método que muestra los elementos de un array por pantalla

    public static void muestraArray(int[] array){

        System.out.println("Los elementos del array son: ");

        for(int num:array){

            System.out.print("\t" + num);

        }

    }

}
