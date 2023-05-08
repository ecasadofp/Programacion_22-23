package org.example.Aplicacion;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Profesor {
@DatabaseField(id = true)
    private int nrp;
@DatabaseField(canBeNull = false)
    private String nombre;
@DatabaseField(canBeNull = false)
    private String apellido;
@DatabaseField(canBeNull = false)
    private String especialidad;

    public Profesor() {
    }

    public Profesor(int nrp, String nombre, String apellido, String especialidad) {
        this.nrp = nrp;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nrp=" + nrp +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
