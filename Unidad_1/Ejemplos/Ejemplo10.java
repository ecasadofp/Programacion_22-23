// Escribe un programa en el que se definan dos variables y se intercambie el valor que contienen,
// imprimiendo el resultado por pantalla.

public class Ejemplo10 {

    public static void main (String args[]){

        int a = 6;
        int b = 7;
        int aux;

        System.out.printf("El valor de a es %d y el de b es %d\n", a, b);

        aux = a;
        a = b;
        b = aux;

        System.out.printf("El valor de a es %d y el de b es %d\n", a, b);

    }

}
