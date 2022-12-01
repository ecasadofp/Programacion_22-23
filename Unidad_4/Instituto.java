import java.util.ArrayList;

public class Instituto {

    public static void main(String[] args) {

        ArrayList<Object> cosas = new ArrayList<>();

        cosas.add(new Persona("Antonio", "Castro","Calle única","646464"));

        Alumno alumno1 = new Alumno("Pepito", "Marín", "DAW");
        cosas.add(alumno1);

        System.out.println("Número de cosas: " + cosas.size());
        cosas.add(new Alumno("Caperucita", "Roja", "Mantenimiento"));

        cosas.add("Guardame esto");
        cosas.add(5634.74);

        System.out.println("Número de cosas: " + cosas.size());
        for(Object o:cosas)
            System.out.println(o);


    }


}
