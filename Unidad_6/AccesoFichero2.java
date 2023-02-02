import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero2 {

    public static void main(String[] args) {

        FileReader fr = null;

        try {
            fr = new FileReader("/home/ecasado/tontada.txt");
            int leido;
            do {
                leido = fr.read();
                if (leido != -1)
                    System.out.print((char) leido);
            } while (leido != -1);

        } catch (FileNotFoundException e) {
            System.out.println("Problemas con el fichero");

        } catch (IOException e) {
            System.out.println("Problemas en la lectura del fichero");
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println("No se ha podido cerrar");
                }
            }
        }
    }
}
