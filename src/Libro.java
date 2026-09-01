public class Libro
{
    // ATRIBUTOS DE LA CLASE 'LIBRO'
    private String titulo;
    private Autor autor;
    private int anio;
    private int paginas;

    // GETTERS
    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public int getPaginas() {
        return paginas;
    }

    // SETTERS
    public void setTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }

    public void setAnio(int nuevoAnio) {
        if(nuevoAnio >= 0)
        {
            this.anio = nuevoAnio;
        }
        else
        {
            this.anio = 2026;
        }
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // CONSTRUCTOR
    public Libro(String nuevoTitulo, Autor nuevoAutor, int nuevoAnio, int nuevaPaginas)
    {
        this.setTitulo(nuevoTitulo);
        this.setAutor(nuevoAutor);
        this.setAnio(nuevoAnio);
        this.setPaginas(nuevaPaginas);
    }

    // METODOS
    public void MostrarLibro()
    {
        System.out.println("Este libro se define como: TITULO: " + this.getTitulo());
    }
}
