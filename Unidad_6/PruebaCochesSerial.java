import java.io.*;

public class PruebaCochesSerial {
    public static void main(String[] args) {

        Coche cocheAlfred = new Coche("Ford", "Mustang", 4500);
        Coche cocheJuan = new Coche("Chevrolet", "Camaro", 500);
        Coche cocheAndres = new Coche("Peugeot", "Partner", 120);

        try(FileOutputStream fos = new FileOutputStream("coches.dat"); ObjectOutputStream oos = new ObjectOutputStream (fos)){

            oos.writeObject(cocheAlfred);
            oos.writeObject(cocheJuan);
            oos.writeObject(cocheAndres);

        }catch (Exception e){
            System.out.println("No se han podido guardar los datos");
        }


        Coche[] recuperados = new Coche[3];

        try(FileInputStream fis = new FileInputStream("coches.dat"); ObjectInputStream ois = new ObjectInputStream(fis)){

            recuperados[0] = (Coche)ois.readObject();
            recuperados[1] = (Coche)ois.readObject();
            recuperados[2] = (Coche)ois.readObject();

        }catch(Exception e){

            System.out.println("No se han podido leer los datos");

        }

        for(Coche c:recuperados)
            System.out.println(c);

    }
}
