import java.util.Collections;
import java.util.ArrayList;

public class OrdenArrayList {

    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("Casa");
        palabras.add("Coche");
        palabras.add("Mesa");
        palabras.add("Alfombra");
        palabras.add("Murciélago");

        System.out.println(palabras);

        Collections.sort(palabras);

        System.out.println(palabras);


    }

}
