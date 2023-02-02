import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc;

       try(FileInputStream fis = new FileInputStream("realhes.txt")){

           sc = new Scanner(fis);

           while(sc.hasNextDouble()){
               System.out.println(sc.nextDouble()+1000);

           }

       }catch (IOException e){

           System.out.println("No ha sido posible leer los datos");
       }

    }


}
