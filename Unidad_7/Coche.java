package org.example;

public class Coche {

    private String marca;
    private String modelo;
    private int cv;

    private String estado;

    public String getEstado() {
        return estado;
    }

    public Coche(String marca, String modelo, int cv, String estado){

        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCv() {
        return cv;
    }

    @Override
    public String toString() {
        return String.format("Marca %s, modelo %s, %d cv", marca, modelo, cv);
    }
}
