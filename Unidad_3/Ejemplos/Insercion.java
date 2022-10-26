public class Insercion {

    public static void main(String[] args) {

        int[] array = Burbuja.dameUnArray(10, 1, 20);

        Burbuja.muestraArray(array);
        ordenaInsercion(array);
        Burbuja.muestraArray(array);


    }

    public static void ordenaInsercion(int[] array) {

        int aux;

        for (int i = 1; i < array.length; i++) {

            aux = array[i];

            int j;// deben conocerlo fuera del bucle (ámbito)

            for (j = i; j > 0 && array[j - 1] > aux; j--)

                array[j] = array[j - 1];

            array[j] = aux;

        }


    }

}
