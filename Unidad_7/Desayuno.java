package org.example;

public class Desayuno {

    private String nombre;
    private double precio;
    private String descripcion;
    private int calorias;

    public Desayuno(String nombre, double precio, String descripcion, int calorias){
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return String.format("Nombre %s, %.2f $. %s. Calorias: %d", nombre, precio, descripcion, calorias);
    }
}
