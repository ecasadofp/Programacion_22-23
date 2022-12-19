public class PruebaProfesorExcepciones {

    public static void main(String[] args) {

        Profesor yo = new Profesor("Enrique");

        try {
            yo.addNota(-3);
        } catch (NotaInvalidaException e) {
            System.out.println("El dato es incorrecto y no se ha añadido");
        }
        try {
            yo.addNota(4);
        } catch (NotaInvalidaException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Se ha intentado poner la nota");
        }
        try {
            yo.addNota(-7);
        } catch (NotaInvalidaException e) {
            // No hacer nada no está bien, pero permite seguir
        }

        yo.muestraNotas();

    }


}
