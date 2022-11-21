// Implementa un programa que determine la frecuencia de aparición de cada letra en una cadena de caracteres introducida por teclado.
// Comenzará solicitando la cadena y, posteriormente, construirá un array con las frecuencias de cada letra.
// Finalmente, imprimirá el array de frecuencias por pantalla. Cuanto más preciso sea, mejor
// (ten en cuenta tildes, diéresis, símbolos...) (NOTA: No debe ser sensible a mayúsculas/minúsculas).

public class Ejercicio16 {
    public static void main(String[] args) {
        String entrada = "El nuestro es un mundo de gigantes nucleares e infantes éticos. Sabemos más sobre la guerra que de la paz, más de matar que acerca de la vida. General Omar Bradley";

        System.out.println(entrada);

        int[] frecuencias = cuentaLetras(entrada);

        presentaFrecuencias(frecuencias);
    }

    public static int[] cuentaLetras(String cadena){

        cadena = cadena.toLowerCase();

        int[] frecuencias = new int[256];

        for(int i = 0; i < cadena.length(); i++){

            char car = cadena.charAt(i);
            switch(car){

                case 'á':
                case 'ä':
                    car = 'a';
                    break;
                case 'é':
                case 'ë':
                    car = 'e';
                    break;
                case 'í':
                case 'ï':
                    car = 'i';
                    break;
                case 'ó':
                case 'ö':
                    car = 'o';
                    break;
                case 'ú':
                case 'ü':
                    car = 'u';
                    break;
                case ' ':
                    continue;
            }
            frecuencias[car]++;
        }
        return frecuencias;
    }

    public static void presentaFrecuencias(int[] frecuencias){
        int salto = 1;
        for(int i = 65; i < frecuencias.length; i++){

            char car = (char)i;
            int frec = frecuencias[i];
            if(frec == 0)
                continue;

            System.out.printf("%s -> %d\t\t", car, frec);
            if(salto % 5 == 0)
                System.out.println();
            salto++;
        }
    }
}