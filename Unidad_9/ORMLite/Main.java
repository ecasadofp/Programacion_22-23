package org.example.Aplicacion;

import org.example.Datos.GestionBd;

public class Main {
    public static void main(String[] args) {

        try {


            GestionBd miBd = new GestionBd("modulos");
            Profesor profesor1 = miBd.getProfesor(1);

            Modulo modulo1 = new Modulo("Ebanistería");
            modulo1.asignaProfesor(profesor1);

          //  miBd.guardaModulo(modulo1);

            Modulo modulo2 = miBd.getModulo("Ebanistería");

            System.out.println("El módulo Ebanistería tiene los siguientes datos");
            System.out.println(modulo2);

            Alumno alumno1 = new Alumno(2,"Blanca","Nieves");

            AlumnoModulo alumnoModulo1 = new AlumnoModulo(alumno1,modulo2);

            miBd.guardaAlumnoModulo(alumnoModulo1);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}