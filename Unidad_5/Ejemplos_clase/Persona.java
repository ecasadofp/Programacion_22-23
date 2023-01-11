public class Persona {

    private String nombre;
    private int edad;
    private double altura;
    private double peso;

    public Persona(String nombre, int edad, double altura, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }

    public Persona(String nombre, double altura, double peso){

        this.nombre = nombre;
        this.edad = 0;
        this.altura = altura;
        this.peso = peso;

    }


  public void cumpleAnnos(){
        edad++;
        if(edad >= 60){
            altura *= 0.99;
        }

        if(edad >= 40){
            peso++;
        }
  }

  public String getNombre(){
        return nombre;
  }

  public void crecer(double crecido){

        altura += crecido;
  }

  public boolean esMayorEdad(){
        return (edad >= 18);
  }

  public void cobrar(){

        System.out.println("Me debes 30€");
  }
    @Override
    public String toString() {
        String salida;
        salida = String.format("Nombre: %s, edad %d, mide %.2f metros y pesa %.1f kg.", nombre,edad,altura,peso);
        return salida;
    }
}
