import java.util.ArrayList;
import java.util.Iterator;

public class PruebaIterator {
    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("Casa");
        palabras.add("Coche");
        palabras.add("Mesa");
        palabras.add("Silla");
        palabras.add("Coche");

        System.out.println(palabras);

        Iterator<String> it = palabras.iterator();

        while (it.hasNext()) {
            if(it.next().equals("Mesa"))
                it.remove(); // elimina de la colección subyacente
        }

        System.out.println(palabras);

        for(String s:palabras)
            if(s.equals("Silla"))
                s= null; // no hay manera de eliminar de la colección subyacente

        System.out.println(palabras);
    }



}
