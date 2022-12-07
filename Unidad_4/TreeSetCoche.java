import java.util.TreeSet;

public class TreeSetCoche {
    public static void main(String[] args) {

        TreeSet<Coche> coches = new TreeSet<>();

        Coche miCoche = new Coche("Ford", "Mustang", 350, "5335MCC", "rojo", 12, 56063.34);

        coches.add(miCoche);
        coches.add(new Coche("Renault", "Clio", 90, "5334FGB", "azul", 120568, 563.34));
        coches.add(new Coche("Kia", "Rio", 130, "6475KLM", "blanco", 45568, 8563.34));
        coches.add(new Coche("Aston Martin", "Safety Car", 630, "F1", "verde", 4568, 185643.34));

        System.out.println(coches);

        coches.add(miCoche);
        coches.add(new Coche("Renault", "Clio", 90, "5334FGB", "verde", 120568, 563.34));

        System.out.println(coches);
    }

}
