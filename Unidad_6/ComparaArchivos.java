import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ComparaArchivos {
    public static void main(String[] args) {

        try{
            if(sonIgulaesArchivos(args[0], args[1]))
                System.out.println("Los archivos son iguales");
            else
                System.out.println("Los archivos son distintos");
        }catch(FileNotFoundException e){
            System.out.println("No están los archivos a comparar");
        }catch (IOException e)
        {
            System.out.println("No ha sido posible comparar los archivos");

        }
    }

public static boolean sonIgulaesArchivos (String archivo1, String archivo2) throws IOException, FileNotFoundException {
        FileInputStream fis1 = new FileInputStream(archivo1);
        FileInputStream fis2 = new FileInputStream(archivo2);

            int dato1;
            int dato2;

          do{
              dato1 = fis1.read();
              dato2 = fis2.read();

              if(dato1 != dato2)
                  return false;

          }while(dato1 != -1 && dato2 != -1);

        return true;
    }
}
