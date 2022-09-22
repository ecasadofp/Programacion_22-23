// Ejemplo6: Crea un programa con las variables nombre,
// dirección y teléfono y asígnale los valores correspondientes a tus datos personales.
// Muestra los valores de estas variables por pantalla en tres líneas distintas.

public class Ejemplo6 {

    public static void main(String args[]){

        String nombre, direccion, telefono;

        nombre = "Perico";
        direccion = "Calle Única 3";
        telefono = "53546755";

        System.out.println(nombre);
        System.out.print("Dirección: " + direccion + "\n");
        System.out.format("El telefono es %s, no llamar en horas de trabajo", telefono);

    }
}
