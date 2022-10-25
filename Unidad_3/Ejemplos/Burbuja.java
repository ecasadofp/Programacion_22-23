/**
 * Clase que contiene los elementos para demostrar el uso del algoritmo de ordenación de la burbuja
 *
 * @author ecasado
 * @version 1.0
 */
public class Burbuja {

    public static void main(String[] args) {

        int[] array = dameUnArray(30, 1, 20);
        muestraArray(array);
        ordenaBurbuja(array);
        muestraArray(array);

    }

    /**
     * Método que ordena los elementos de un array de mayor a menor
     *
     * @param array Array de enteros desordenados que hay que ordenar
     */
    public static void ordenaBurbuja(int[] array) {
        int aux;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 -i; j++) {

                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;

                }
            }
        }

    }

    /**
     * Presenta en consola los datos contenidos en un array que se pasa como argumento
     *
     * @param array Datos que se quieren mostrar
     */
    public static void muestraArray(int[] array) {

        for (int valor : array)
            System.out.print(valor + "\t");
        System.out.println();

    }

    /**
     * Devuelve un array de enteros con valores aleatorios comprendidos entre min y max
     *
     * @param dimension Cantidad de datos generados
     * @param min       Mínimo valor de los números aleatorios (incluido)
     * @param max       Máximo valor de los números aleatorios (incluido)
     * @return Array que contiene los valores generados
     */
    public static int[] dameUnArray(int dimension, int min, int max) {
        int aleatorio;
        int[] array = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            aleatorio = (int) (Math.random() * (max - min + 1) + min);
            array[i] = aleatorio;
        }
        return array;
    }


}