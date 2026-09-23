package Biblioteca;

public class Libro extends Recurso implements Prestable, Mostrable
{

    // region ATRIBUTOS

    private Autor autor; // Autor del libro
    private String editorial; // Editorial del libro
    private String isbn; // Código ISBN particular de la edición del libro
    private int paginas; // Cantidad de páginas del libro

    // endregion

    // region GETTERS Y SETTERS

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor nuevoAutor) {
        if(nuevoAutor != null)
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
                 Autor nuevoAutor, String nuevaEditorial, String nuevoIsbn, int nuevasPaginas) throws ParametroVacioException, FormatoFechaException
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
    public void Prestar(String usuario)
    {
        String mensaje = "El libro se prestó al usuario=" + usuario + ". Lo debe traer en 7 días más";
    }

    @Override
    public void Mostrar()
    {
        String mensaje = "El libro se mostró a un usuario. Lo debe entregar al encargado al finalizar el día o antes de salir.";
    }

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
