package org.example;

import java.sql.*;

// Acordaos de meter en Maven la dependencia del driver de conexión

public class Main {
    public static void main(String[] args) {

        String consulta = "SELECT * FROM alumno WHERE edad>3";
        String consultaI = "INSERT INTO alumno VALUES ('Fernando', 'Alonso',33)";

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://db-programacion-ej1.cbved7bhnvqz.us-east-1.rds.amazonaws.com:3306/alumnos","admin","piramide");
            Statement stmnt = con.createStatement();
             stmnt.executeUpdate(consultaI);
            ResultSet rs = stmnt.executeQuery(consulta);

            while (rs.next()){
                String nombre = rs.getString(1);
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");

                System.out.printf("Nombre: %s, apellido: %s, edad %d\n", nombre, apellido, edad);

            }

            rs.close();
            stmnt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}