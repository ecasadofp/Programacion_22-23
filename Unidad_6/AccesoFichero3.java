import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero3 {

    public static void main(String[] args) {

        try(FileReader fr = new FileReader("/home/ecasado/tont4ada.txt")) {
            int leido;
            do{
                leido = fr.read();
                if (leido != -1)
                    System.out.print((char)leido);
            }while(leido != -1);

        } catch (FileNotFoundException e) {
            System.out.println("Problemas con el fichero");
        } catch (IOException e) {
            System.out.println("Problemas de lectura");
        }
    }
}
