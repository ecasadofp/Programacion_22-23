// Ejemplo de uso de la clase JOptionPane

import javax.swing.JOptionPane;

public class EjemploJOptionPane {

    public static void main(String[] args) {

    String nombre;

    nombre = JOptionPane.showInputDialog("Hola, como te llamas?");

    JOptionPane.showMessageDialog(null,"Hola, " + nombre + ", encantado de conocerte");

    }

}
