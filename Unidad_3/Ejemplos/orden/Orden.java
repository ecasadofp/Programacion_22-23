package orden;

public class Orden {
	//
	public static void burbuja(int[]matrix){
        int temp;
        for(int i=1;i < matrix.length;i++){
            for (int j=0 ; j < matrix.length- 1; j++){
                if (matrix[j] > matrix[j+1]){
                    temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j+1] = temp;
                }
            }
        }
    } // de Burbuja



	public static void insercion (int[] vector) {
	      for (int i=1; i < vector.length; i++) {
	         int aux = vector[i];
	         int j;
	         for (j=i-1; j>=0 && vector[j] > aux; j--){
	              vector[j+1] = vector[j];
	          }
	         vector[j+1] = aux;
	      }
	   } // de insercion



	public static void seleccion(int[] A) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) { // tomamos como menor el primero
              menor = A[i]; // de los elementos que quedan por ordenar
              pos = i; // y guardamos su posición
              for (j = i + 1; j < A.length; j++){ // buscamos en el resto
                    if (A[j] < menor) { // del array algún elemento
                        menor = A[j]; // menor que el actual
                        pos = j;
                    }
              }
              if (pos != i){ // si hay alguno menor se intercambia
                  tmp = A[i];
                  A[i] = A[pos];
                  A[pos] = tmp;
              }
        }
}

// Empiezan los métodos requeridos para quickshort
	
	public static int divide(int[] array, int inicio, int fin) {
	    int izquierda, derecha, pivote, aux;
	    pivote = array[inicio];
	    izquierda = inicio;
	    derecha = fin;
	 
	    // Mientras no se crucen los índices
	    while (izquierda < derecha) { // While Principal
	        while (array[derecha] > pivote) {
	            derecha--;
	        }
	 
	        while ((izquierda < derecha) && (array[izquierda] <= pivote)) {
	            izquierda++;
	        }
	 
	        // Si todavía no se cruzan los indices seguimos intercambiando
	        if (izquierda < derecha) {
	            aux = array[izquierda];
	            array[izquierda] = array[derecha];
	            array[derecha] = aux;
	        }
	    } // Del While Principal
	 
	    // Los índices ya se han cruzado, ponemos el pivote en el lugar que le corresponde
	    aux = array[derecha];
	    array[derecha] = array[inicio];
	    array[inicio] = aux;
	 
	    // La nueva posición del pivote
	    return derecha;
	}
	
	public static void quicksort(int[] array, int inicio, int fin)
	{
	    int pivote;
	 
	    if (inicio < fin) {
	        pivote = divide(array, inicio, fin);
	 
	        // Ordeno la lista de los menores
	        quicksort(array, inicio, pivote - 1);
	 
	        // Ordeno la lista de los mayores
	        quicksort(array, pivote + 1, fin);
	    }
	} // de quicksort

}// de la clase Orden

