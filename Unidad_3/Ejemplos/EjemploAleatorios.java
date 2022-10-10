public class EjemploAleatorios {

    public static void main(String[] args) {

        for(int i = 0; i < 100000; i++) {
            int numero =(int) (Math.random() * 10)+1 ;

            if(numero <= 1 || numero >= 10)
              System.out.print(numero + "\t");
        }
    }
}
