package org.example.Aplicacion;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.ArrayList;
@DatabaseTable
public class Modulo {
    @DatabaseField(id = true)
    private String nombreModulo;

    /*
     * Poner solo foreign = true haría que solo nos devolviera el id correspondiente,
     * foreignAutoRefresh = true hace que se rellene automágicamente
     */
    @DatabaseField(foreign = true, foreignAutoRefresh = true)
    private Profesor profesor;


    public Modulo(){}

    public Modulo(String nombreModulo){
        this.nombreModulo = nombreModulo;
    }

    public void asignaProfesor(Profesor p){
        this.profesor = p;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "nombreModulo='" + nombreModulo + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}
