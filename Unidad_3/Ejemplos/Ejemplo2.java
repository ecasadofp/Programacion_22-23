// Crea un array de notas de un alumno. Además crea una variable que almacene el número de años
// que lleva estudiando en el centro. Genera un método que "cambie" el valor de los años que
// lleva estudiando en el centro (pasado como argumento). Luego otro que cambie la primera nota del array
// (pasado como argumento).
// Invoca los dos métodos, presenta luego los datos y observa lo que pasa. (utiliza .length)

public class Ejemplo2 {
    public static void main(String[] args) {

        int[] nota = {3, 6, 7, 8, 10, 2, 4, 0, 9};
        int annos = 10;

        System.out.println(annos);

        doblaAnnos(annos);

        System.out.println(annos);

        muestraArray(nota);

        System.out.println();

        doblaArray(nota);

        muestraArray(nota);


    }

    public static void muestraArray(int[] valor){

        for(int i = 0; i < valor.length ; i++){

            System.out.println("Valor " + (i + 1) + "º: " + valor[i]);

        }

    }

    public static void doblaAnnos(int annos){

        annos *= 2;
        System.out.println(annos);

    }

    public static void doblaArray(int[] nota){

        for(int i = 0; i < nota.length; i++){

            nota[i] *= 2;

        }


    }


}
