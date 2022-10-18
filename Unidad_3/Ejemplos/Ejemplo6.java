// Ejemplo6: Crea un programa que nos haga una tabla en la que se reflejen las
// temperaturas de cada hora del día de toda la semana.
// Rellénalas con valores aleatorios razonables. Muestra los datos por pantalla.

public class Ejemplo6 {

    public static void main(String[] args) {

        double[][] temperaturas = new double[7][24];

        System.out.println("Las de Góriz");

        llenaArray(temperaturas, -12, 13);
        muestraArray(temperaturas);

        System.out.println("Y ahora las de Huesca");

        llenaArray(temperaturas);
        muestraArray(temperaturas);

    }

    public static void llenaArray(double[][] array){

        llenaArray(array, 3, 33);

    }

    public static void llenaArray(double[][] array, int min, int max){
        for(double[] fila:array)
            for(int i = 0; i < fila.length; i++)
                fila[i] = doubleAleatorio(min,max);


    }

    public static void muestraArray(double[][] array){

        for(double[] fila:array){

            for(double v:fila)
                System.out.printf("%.2f \t",v);
            System.out.println();
        }
    }

    public static double doubleAleatorio(int min, int max){
        double valor;
        valor = Math.random() * (max - min) + min;
        return valor;
    }

}
