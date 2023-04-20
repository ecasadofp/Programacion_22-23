package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Connection con1 = ConexionBD.getConexion("alumnos");

        System.out.println(con1);

        Connection con2 = ConexionBD.getConexion("alumnos");

        System.out.println(con2);

    ConexionBD.closeConexion();

    }
}