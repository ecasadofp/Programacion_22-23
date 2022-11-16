package ejemplos;

// PruebaNif.java: prueba de la clase Nif

public class PruebaNif {
	public static void main(String args[]) {
 	  Nif n = new Nif(80345678);
    System.out.println(n);
    n.leer();
    System.out.println(n);
  }
}