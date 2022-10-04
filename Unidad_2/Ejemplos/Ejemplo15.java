// Utilización de la clase Math para hacer una calculadora que haga raices cuadradas
// y divisiones y si una operación no es posible lo comunique. Nos permitirá introducir
// las operaciones mediante un menú, y no terminará hasta que le digamos que lo haga.

public class Ejemplo15 {

    public static void main(String[] args) {


        int dividendo = 12;
        int divisor = 0;
        try {

            int division = dividendo / divisor;
            System.out.println("La división es " + division);

        }catch (Exception e){

            System.out.println("No puede hacerse la división");

        }
        System.out.println("Esto se ejecuta");
    }
}
