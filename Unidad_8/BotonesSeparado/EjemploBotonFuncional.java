package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploBotonFuncional  {

    public EjemploBotonFuncional() {

        JFrame marco = new JFrame("El botón sabio");
        marco.setLayout(new FlowLayout());
        //marco.setSize(300, 100);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton botonAlfa = new JButton("Alfa");
        JButton botonBeta = new JButton("Beta");

        botonAlfa.addActionListener(new EscuchadorBoton());
        botonBeta.addActionListener(new EscuchadorBoton());

        marco.add(botonAlfa);
        marco.add(botonBeta);
        marco.pack();
        marco.setVisible(true);
    }

}
