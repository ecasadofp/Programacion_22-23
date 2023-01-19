import java.util.ArrayList;

public class UsoDeClaseConInterfaces {

    public static void main(String[] args) {

        Interface1 objetoDeInterfaz = new ClaseConInterfaces();

        ClaseConInterfaces miInstancia = new ClaseConInterfaces();

        System.out.println(miInstancia instanceof Interface1);

        System.out.println(miInstancia instanceof Interface3);

    }

}
