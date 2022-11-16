package ejemplos;

public class PruebaGato {
  public static void main(String[] args) {
    
    Gato gato1 =new Gato(); //
    System.out.println(gato1.getSexo()); //Imprime null
    System.out.println(gato1.getpeso()); //Imprime 0
    Gato garfield = new Gato("anaranjado con rallas negras", "British Shorthair Red", "macho", 7, 10 );
    garfield.setpeso(12); //Realmente pesa 12 kilos
    garfield.maulla();
    garfield.ronronea();
    garfield.come("empanadico");
    garfield.come("pescado");
    Gato tom = new Gato("macho");
    tom.come("sopa de verduras");
    Gato lisa = new Gato("hembra");
    garfield.peleaCon(lisa);
    lisa.peleaCon(tom);
    tom.peleaCon(garfield);
    System.out.println(tom);
    
  }
}
