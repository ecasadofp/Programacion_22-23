package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ActionListener implementado en la propia clase
public class VentanaSaludadora2 extends JFrame {
    JLabel lbNombre = new JLabel("Nombre");
    JTextField tfNombre = new JTextField(20);
    JButton btnFormal = new JButton("Formal");
    JButton btnInformal = new JButton("Informal");
    JLabel lbSaludo = new JLabel();

    public VentanaSaludadora2(){
        super("Saludo personalizado");

        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Listener con clase anónima

        btnFormal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent pepito) {
                lbSaludo.setText("Buenos días, " + tfNombre.getText());
            }
        });

        // Listener con función lambda

        btnInformal.addActionListener(josefina->lbSaludo.setText("Hola ke ase, " + tfNombre.getText()+ "Han pinchado a " + josefina.getActionCommand()));

        add(lbNombre);
        add(tfNombre);
        add(btnFormal);
        add(btnInformal);
        add(lbSaludo);

        setVisible(true);

    }

}
