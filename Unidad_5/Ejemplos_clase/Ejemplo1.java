/* Las clases StringBuffer(segura con varios hilos) y StringBuilder (no segura con varios hilos)
* proporcioan la posibilidad de "modificar los String que contienen" sin tener que crear
* otros nuevos. Solo se usan en casos justificados, si no, String
* */

public class Ejemplo1 {

    public static void main(String[] args) {

        String nombreS = "Enrique";
        StringBuilder nombreSB = new StringBuilder("Enrique");
        StringBuffer nombreSBF = new StringBuffer("Enrique");

        System.out.println(nombreS);
        System.out.println(nombreSB);
        System.out.println(nombreSBF);

        nombreS += " Casado";
        nombreSB.append(" Casado");
        nombreSBF.append(" Casado");

        System.out.println(nombreS);
        System.out.println(nombreSB);
        System.out.println(nombreSBF);


    }

}
