package Biblioteca;

public class Libro extends Recurso{

    // region ATRIBUTOS
    private String autor; // Autor del libro
    private String editorial; // Editorial del libro
    private String isbn; // Código ISBN particular de la edición del libro
    private int paginas; // Cantidad de páginas del libro
    // endregion

    // region GETTERS Y SETTERS

    public String getAutor() {
        return autor;
    }

    public void setAutor(String nuevoAutor) {
        if(nuevoAutor != "")
        {
            this.autor = nuevoAutor;
        }
        else
        {
            // ERROR
        }
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String nuevaEditorial) {
        if(nuevaEditorial != "")
        {
            this.editorial = nuevaEditorial;
        }
        else
        {
            // ERROR
        }
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String nuevoIsbn) {
        if(nuevoIsbn != "")
        {
            this.isbn = nuevoIsbn;
        }
        else
        {
            // ERROR
        }
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int nuevasPaginas) {
        if(nuevasPaginas > 0)
        {
            this.paginas = nuevasPaginas;
        }
        else
        {
            // ERROR
        }
    }

    // endregion

    // region CONSTRUCTOR
    public Libro(String nuevoId, String nuevoTitulo, String nuevaFecha,
                 String nuevoAutor, String nuevaEditorial, String nuevoIsbn, int nuevasPaginas)
    {
        // Llamamos al constructor de la clase abstracta base 'Recurso'
        super(nuevoId,nuevoTitulo,nuevaFecha);

        // Asignamos los nuevos valores a los setters correspondientes
        this.setAutor(nuevoAutor);
        this.setEditorial(nuevaEditorial);
        this.setIsbn(nuevoIsbn);
        this.setPaginas(nuevasPaginas);
    }
    // endregion

    // region METODOS

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", fecha='" + this.getFecha() + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", isbn='" + isbn + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    // endregion
}
