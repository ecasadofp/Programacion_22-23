import java.util.function.BooleanSupplier;

public class Libro {

    private String titulo;
    String autor;
    String editorial;
    String isbn;
    String idioma;
    int numPaginas;


    Libro(String ti, String aut, String ed, String is, String id, int nP){

        this.titulo = ti;
        autor = aut;
        editorial = ed;
        isbn = is;
        idioma = id;
        numPaginas = nP;

    }

    Libro(String titulo){

        this.titulo = titulo;
        this.autor = "Desconocido";

    }

    @Override
    public String toString(){

        String salida;

        salida = String.format("Título: %s\nAutor: %s\nEditorial: %s\nISBN: %s,\tIdioma: %s,\tPáginas: %d",titulo, autor, editorial, isbn, idioma, numPaginas);
/*        salida = "Este es el libro titulado " + this.titulo;
        salida += ", el autor es " + this.autor;*/

        return salida;

    }



}
