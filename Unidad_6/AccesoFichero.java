// Este programa funciona mal. Algo hace de lo que debe, pero cuando falla, lo hace a lo grande.
// Además, cuando funciona "bien", tampoco lo hace bien del todo
// Si te fijas, tampoco hemos cerrado el flujo de entrada
// Intenta arreglarlo

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("/home/ecasado/tontada.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Ha habido problemas con el fichero");
        }

        try {
            int leido;
            do {
                leido = fr.read();
                System.out.print((char) leido);
            } while (leido != -1);
        } catch (IOException e) {
            System.out.println("Problemas en la lectura del fichero");
        }
    }
}
