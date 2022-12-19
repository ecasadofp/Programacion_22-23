// Clase que hemos creado para ilustrar el lanzamiento y control de excepciones

import java.util.ArrayList;

public class Profesor {

    private String nombre;
    private ArrayList<Integer> encuestas;

    public Profesor(String nombre){
        this.nombre= nombre;
        encuestas =  new ArrayList<>();
    }

    public void addNota (int nota) throws NotaInvalidaException {

        if(nota<0||nota>10)
            throw (new NotaInvalidaException("La nota no es correcta"));
        encuestas.add(nota);
    }

    public void muestraNotas(){
        for(int n:encuestas)
            System.out.println(n);
    }
}
