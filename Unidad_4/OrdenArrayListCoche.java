import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenArrayListCoche {

    public static void main(String[] args) {

        ArrayList<Coche> coches = new ArrayList<>();

        Coche miCoche = new Coche("Ford", "Mustang", 350, "5335MCC", "rojo", 12, 56063.34);

        coches.add(miCoche);
        coches.add(new Coche("Renault", "Clio", 90, "5334FGB", "azul", 120568, 563.34));
        coches.add(new Coche("Kia", "Rio", 130, "6475KLM", "blanco", 45568, 8563.34));


    muestraCoches(coches);

        Collections.sort(coches);

        muestraCoches(coches);
    }
    public static void muestraCoches(ArrayList<Coche> coches){

        for(Coche c:coches)
            System.out.println("Marca: " + c.getMarca() + ", kms: " + c.getKmRecorridos());

    }

}
