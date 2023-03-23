package org.example;

import javax.swing.*;
import java.awt.*;

public class PrimeraGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Mi primera GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        JButton boton = new JButton("Presionar");
        Container panelContenido = frame.getContentPane();
                panelContenido.add(boton);
        frame.setVisible(true);
    }
}