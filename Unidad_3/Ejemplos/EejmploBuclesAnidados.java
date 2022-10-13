// Muestra las tablas de multiplicar del 1 al 10

public class EejmploBuclesAnidados {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){

            for(int j =1; j <= 10; j++){

                System.out.format("%d x %d = %d\n", i, j, i*j);
              //  System.out.println();

            }

            System.out.println();
        }

    }

}
