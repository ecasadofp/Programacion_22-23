// Escribe un programa que calcule el salario semanal de un trabajador
// teniendo en cuenta que las horas ordinarias (40 primeras) se pagan a 12 € la hora.
// A partir de la hora 41 se pagan a 16 € la hora.

public class Ejemplo2 {

    public static void main(String[] args) {

        // Mejor el precio de las horas en constantes (final)

        int horas = 54;

        int salario; // mejor un double aunque en el enunciado nos encaje int

        if (horas <= 40){

            salario = horas * 12;

        }else{

            int extra = horas - 40;
            salario = (40 * 12) + (extra * 16);
        }

        System.out.println("El salario que le corresponde es: " + salario + " €");
    }

}
