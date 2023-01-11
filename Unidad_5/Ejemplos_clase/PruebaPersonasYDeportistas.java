import java.util.ArrayList;

public class PruebaPersonasYDeportistas {

    public static void main(String[] args) {

        ArrayList<Persona> clientes = new ArrayList<>();

        clientes.add(new Persona("Pepito", 34, 1.74, 78.4 ));
        clientes.add(new Persona("Marta", 4, 1.32, 32.4 ));
        clientes.add(new Deportista("Manolo", 54,1.43, 87.4,"Tocar el bombo", false));

     for(Persona p:clientes)
         System.out.println(p);

     for(Persona p:clientes){

         Deportista d = (Deportista) p;
         System.out.println("El deporte de esta persona es: " + d.getDeporte());

     }



    }


}
