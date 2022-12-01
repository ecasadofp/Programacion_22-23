import java.util.ArrayList;

public class Alumno extends Persona{

    private String ciclo;
    private int curso;
    private ArrayList<Double> notas;

    public Alumno( String nombre, String apellidos, String ciclo){

        super(nombre, apellidos, "desconocida", "000000000");
        this.ciclo = ciclo;
        this.curso = 1;
        notas = new ArrayList<>();
    }

    public void addNota(double nota){

        this.notas.add(nota);

    }
    @Override
    public void saludar(String saludo){

        System.out.println("Hola soy " + this.getNombre() + ", y curso estudios de " + ciclo);

    }

    @Override
    public String toString(){

        String salida = "Alumno cursando " + this.ciclo + "\nDatos personales:\t"+super.toString();
        return salida;
    }
}
