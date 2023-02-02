import java.io.*;

public class Loteria {
    public static void main(String[] args) {

        final int CANTIDAD = 10;
        int[] premiados = new int[CANTIDAD];

        System.out.println("Hago un sorteo y muestro resultados pero no lo guardo");
        sortear(premiados);
        muestraArray(premiados);
        guardarPremiados(premiados);

        System.out.println("Cargo los datos del sorteo anterior y los muestro");
        leerPremiados(premiados);
        muestraArray(premiados);

    }

    public static void sortear(int[] premiados){

        for(int i = 0; i < premiados.length; i++){
            premiados[i] = (int)(Math.random()*100000);
        }
    }

    public static void muestraArray(int[] array){
        for(int n: array)
            System.out.println(n);
    }

    public static void guardarPremiados(int[] premiados){

        try(FileOutputStream fos = new FileOutputStream("premiados.dat"); DataOutputStream dos = new DataOutputStream(fos)) {

            for(int n: premiados)
                dos.writeInt(n);

        } catch (FileNotFoundException e) {
            System.out.println("Problemas con el fichero de datos");
        } catch (IOException e) {
            System.out.println("Problemas de escritura");
        }
    }

    public static void leerPremiados(int[] premiados){

        try(FileInputStream fis = new FileInputStream("premiados.dat"); DataInputStream dis = new DataInputStream(fis)) {

            for(int i = 0; i < premiados.length; i++){
                premiados[i] = dis.readInt();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Problemas con el fichero");
        } catch (IOException e) {
            System.out.println("Problemas de lectura");
        }

    }
}
