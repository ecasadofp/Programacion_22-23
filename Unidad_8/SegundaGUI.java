package org.example;
import javax.swing.*;

public class SegundaGUI {
    private static void creaYMuestraGUI() {

        JFrame marco = new JFrame("Hola mundo");

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel etiqueta = new JLabel("Hola mundo");

        marco.getContentPane().add(etiqueta);

        marco.pack();

        marco.setVisible(true);

    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run(){

                creaYMuestraGUI();

            }
        });
    }


}
