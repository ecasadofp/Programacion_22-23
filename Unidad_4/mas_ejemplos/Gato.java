package ejemplos;

public class Gato {
 // 
  private String color;
  private String raza;
  private String sexo;
  private int edad;
  private double peso;
  
  public Gato() { // Constructor vac�o
	}
  
  public Gato(String color, String raza, String sexo, int edad, double peso) {
	
	this.color = color;
	this.raza = raza;
	this.sexo = sexo;
	this.edad = edad;
	this.peso = peso;
}

// constructor
  
  
  public Gato (String s) {
    this.sexo = s;
  }
  
  // getter
 public String getSexo() {
    return this.sexo;
  }
 public void setpeso(double peso) {
	    this.peso=peso;
	  }
 public double getpeso() {
	    return this.peso;
	  }
  /**
   * Hace que el gato maulle
   */
  public void maulla() {
    System.out.println("Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */  
  public void ronronea() {
    System.out.println("mrrrrrr");
  }
  
 
  public void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como pescado");
    }
  }

  
  public void peleaCon(Gato contrincante) {
    if (this.sexo.equals("hembra")) {
      System.out.println("no me gusta pelear");
    } else {
      if (contrincante.getSexo().equals("hembra")) {
        System.out.println("no peleo contra gatitas");
      } else {
        System.out.println("ven aqu� que te vas a enterar");
      }
    }
  }
}
