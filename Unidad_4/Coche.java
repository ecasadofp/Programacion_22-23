public class Coche implements Comparable<Coche>{

    private String marca;
    private String modelo;
    private int cv;
    private String matricula;
    private String color;
    private double kmRecorridos;
    private double precio;

    public Coche(String marca, String modelo, int cv, String matricula, String color, double kmRecorridos, double precio) {

        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
        this.matricula = matricula;
        this.color = color;
        this.kmRecorridos = kmRecorridos;
        this.precio = precio;

    }

    public void pintaCoche(String color) {

        this.color = color;

    }

    public double overPower(int aumento) {

        double precio;
        if (aumento > 20) {
            if (legalizarAumento(aumento)) {
                this.cv += aumento;
                precio = aumento * aumento * 100;
            } else precio = 50.50;
        } else {
            precio = 100;
            this.cv += aumento;
        }
        return precio;
    }

    private boolean legalizarAumento(int cv) {
        if (Math.random() > 0.3)
            return true;
        return false;
    }

    public String getMarca() {
        return this.marca;
    }

    public void seetMarca(String marca) {
        this.marca = marca;
    }
    public double getKmRecorridos(){

        return this.kmRecorridos;

    }

    public int compareTo(Coche c){

        String marca1 = this.getMarca();
        String marca2 = c.getMarca();

        return marca1.compareTo(marca2);

    }

    @Override
    public String toString(){

        return ("Marca: " + this.marca + ", modelo: " + this.modelo + ", kms: " + this.kmRecorridos);
    }

}
