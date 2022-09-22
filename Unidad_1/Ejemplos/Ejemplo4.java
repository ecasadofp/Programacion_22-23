/*
* Escribe un programa en el que se declaren las variables enteras x e y.
* Asígnales los valores 1000 y 2000 respectivamente.
* A continuación muestra por pantalla el valor de cada variable, la suma, la resta,
* la multiplicación, la división y el resto.
*/

public class Ejemplo4 {

    public static void main(String[] args ){

        int x;
        int y;
        x = 25;
        y = 3;

        int suma = x + y;
        int resta = x - y;
        int multiplicacion = x * y;
        double division = (double) x / y; //Casteamos para división decimal
        int resto = x % y;

        System.out.printf("Suma: %d, resta: %d, multiplicación: %d, división: %f y resto: %d",suma, resta, multiplicacion, division, resto);

    }

}
