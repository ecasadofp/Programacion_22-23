import java.util.HashSet;

public class HashSetPersona {
    public static void main(String[] args) {


    HashSet<Persona> personas = new HashSet<>();

    Persona persona1 = new Persona("Pepito", "Grillo", "Bosque 1", "4654745");

    personas.add(persona1);
    personas.add(new Persona ("Blancanives", "La Blanca", "Castillo 3","5346"));


        System.out.println(personas);

        personas.add(persona1);
        personas.add(new Persona ("Blancanives", "La Blanca", "Castillo 3","5346"));

        for(Persona p: personas)
            System.out.println(p.hashCode());
        System.out.println(personas);

    }
}
