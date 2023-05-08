package org.example.Aplicacion;

import com.j256.ormlite.field.DatabaseField;

public class AlumnoModulo {

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(foreign = true)
    private Alumno alumno;
    @DatabaseField(foreign = true)
    private Modulo modulo;

    public AlumnoModulo(){}

    public AlumnoModulo(Alumno a, Modulo m){
        this.alumno = a;
        this.modulo = m;
    }
}
