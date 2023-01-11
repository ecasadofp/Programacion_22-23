public class Deportista extends Persona {

    private String deporte;
    private boolean altoRendimiento;
    private boolean estaLesionado;

    public Deportista(String nombre, int edad, double altura, double peso, String deporte, boolean altoRendimiento, boolean estaLesionado){

        super(nombre, edad, altura, peso);
        this.deporte = deporte;
        this.altoRendimiento = altoRendimiento;
        this.estaLesionado = estaLesionado;

    }

    public Deportista(String nombre, int edad, double altura, double peso, String deporte, boolean estaLesionado){

        super(nombre, edad, altura, peso);
        this.deporte = deporte;
        this.altoRendimiento = false;
        this.estaLesionado = estaLesionado;

    }

    public Deportista(String nombre, int edad, double altura, double peso, String deporte){

        super(nombre, edad, altura, peso);
        this.deporte = deporte;
        this.altoRendimiento = false;
        this.estaLesionado = false;

    }

    public void darAlta(){

        this.estaLesionado = false;

    }

   public String getDeporte(){
        return deporte;
   }

   public boolean getEstaLesionado(){
        return estaLesionado;
   }

   public void cobrar(){
       System.out.println("Me debes 100€");

   }

    @Override
    public String toString() {

        String salida;
        salida = "Esta pesona es un deportista. Su deporte es: " + deporte +".\n Sus datos personales son: " + super.toString() ;
        return salida;
    }
}
