public class Persona {
    private String nombre;

    private String apellidos;
    private String direccion;
    private String telefono;

    public Persona(String nombre, String apellidos, String direccion, String telefono){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;

    }
    public void saludar(String saludo){

        System.out.println(saludo + ", me llamo "+ nombre);
    }
    @Override
    public String toString(){

        return "Nombre completo: " + nombre + " " + apellidos;

    }

    public String getNombre(){

        return nombre;
    }
}
