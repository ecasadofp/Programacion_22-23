// Programa que escribe un byte en un archivo. No está muy fino, hay que "repararlo"

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscrituraBytes {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {
              fos = new FileOutputStream("datos.dat");
        } catch (FileNotFoundException e) {
            System.out.println("Problema con el archivo");
        }

        int dato = 12;

        try {
            fos.write(dato);
        } catch (IOException e) {
            System.out.println("No se puede escribir");
        }
    }
}
