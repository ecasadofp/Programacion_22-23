package org.example;

public class Deporte {

    private String nombre;

    public Deporte(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "El deporte es " + nombre;
    }
}
