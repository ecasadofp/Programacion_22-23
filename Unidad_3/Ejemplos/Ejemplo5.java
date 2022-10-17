// Ejemplo5: Un programador trabaja en dos proyectos simultáneamente. Crea un vector bidimensional
// que represente las horas trabajadas en cada proyecto cada día de la semana y llénalo con valores.
// Haz que compruebe que ningún día se ha trabajado más de 8 horas.

public class Ejemplo5 {

    public static void main(String[] args) {

        int[][] horas = {{2, 3, 4, 2, 7},{4, 5, 2, 3, 2}};

        muestraArray(horas);

        if(comprobarMenosDeOcho(horas))
            System.out.println("El array cumple con las 8 horas máximo al día");
        else System.out.println("Hay algún día con más de 8 horas");

    }

    public static void muestraArray(int[][] horas){

        for(int[] dia:horas){

            System.out.println("Horas trabajadas en proyecto");

            for(int h:dia)
                System.out.print(h + "\t");

            System.out.println();
        }

    }

    public static boolean comprobarMenosDeOcho(int[][] horas){

        for(int i = 0; i < 5; i++){

            int hDia = horas[0][i] + horas[1][i];

            if(hDia > 8)
                return false;

        }
        return true;
    }

}
