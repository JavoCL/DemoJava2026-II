public class Libro extends Recurso
{
    // ATRIBUTOS DE LA CLASE 'LIBRO'
    private Autor autor;
    private int paginas;

    // GETTERS
    public Autor getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    // SETTERS
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setPaginas(int nuevaPaginas) {
        this.paginas = paginas;
        if(nuevaPaginas > 0)
        {
            this.paginas = nuevaPaginas;
        }
        else
        {
            // Retorna 0 en caso que me equivoque en la entrada correcta del numero de paginas
            this.paginas = 0;
        }
    }

    // CONSTRUCTOR
    public Libro(String nuevoTitulo, Autor nuevoAutor, int nuevoAnio, int nuevaPaginas)
    {
        super(nuevoTitulo,nuevoAnio);
        this.setAutor(nuevoAutor);
        this.setPaginas(nuevaPaginas);
    }

    // METODOS
    public void MostrarLibro()
    {
        System.out.println("Este libro se define como: TITULO: " + this.getTitulo());
    }

    @Override
    public void MostrarDetalles()
    {
        System.out.println("Los detalles del libro son:\n Autor: " + this.getAutor().getNombre() + "; Páginas: " + this.getPaginas());
    }
}
