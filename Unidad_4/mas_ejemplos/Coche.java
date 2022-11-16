package ejemplos;

public class Coche {

  private static int kilometrajeTotal = 0;
  public static int getKilometrajeTotal() {
    return Coche.kilometrajeTotal;
  }
  
  private String marca;
  private String modelo;
  private int kilometraje;

  public Coche(String ma, String mo) {
    marca = ma;
    modelo = mo;
    kilometraje = 0;
  }
  
  public int getKilometraje() {
    return this.kilometraje;
  }

  public void recorre(int km) {
    kilometraje +=  km;
    kilometrajeTotal += km;
  }
}















