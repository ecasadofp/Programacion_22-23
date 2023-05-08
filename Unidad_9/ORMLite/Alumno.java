package org.example.Aplicacion;

// TODO: 30/4/23 Quizá las clases alumno y profesor deberían heredar de persona

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Alumno {
    @DatabaseField(id = true)
    private int numExp;
    @DatabaseField(canBeNull = false)
    private String nombre;
    @DatabaseField(canBeNull = false)
    private String apellido;

    public Alumno(){

    }

    public Alumno(int numExp, String nombre, String apellido){
        this.numExp = numExp;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "num_exp=" + numExp +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
