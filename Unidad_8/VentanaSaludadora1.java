package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ActionListener implementado en la propia clase
public class VentanaSaludadora1 extends JFrame implements ActionListener{
    JLabel lbNombre = new JLabel("Nombre");
    JTextField tfNombre = new JTextField(20);
    JButton btnFormal = new JButton("Formal");
    JButton btnInformal = new JButton("Informal");
    JLabel lbSaludo = new JLabel();

    public VentanaSaludadora1(){
        super("Saludo personalizado");

        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        btnFormal.addActionListener(this);
        btnInformal.addActionListener(this);

        add(lbNombre);
        add(tfNombre);
        add(btnFormal);
        add(btnInformal);
        add(lbSaludo);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String saludo;
        String comando = e.getActionCommand();
        saludo = comando.equals("Formal")?"Buenos días, ":"Hola ke asé, ";
        saludo = saludo + tfNombre.getText();
        lbSaludo.setText(saludo);
    }
}
