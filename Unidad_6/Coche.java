import java.io.Serializable;

public class Coche implements Serializable {

    private String marca;
    private String modelo;
    private int cv;

    public Coche(String marca, String modelo, int cv){
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;

    }

    @Override
    public String toString(){
        return "Coche marca: " + marca + ", modelo: " + modelo + ", " + cv + "caballos";
    }

}
