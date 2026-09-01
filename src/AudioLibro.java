public class AudioLibro extends Libro
{
    // ATRIBUTOS
    private String narrador;
    private float duracion;

    // GETTERS Y SETTERS
    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String nuevoNarrador) {
        this.narrador = nuevoNarrador;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float nuevaDuracion) {
        if(nuevaDuracion > 0f)
        {
            this.duracion = nuevaDuracion;
        }
        else
        {
            this.duracion = 0f;
        }
    }

    // CONSTRUCTOR
    public AudioLibro(String nuevoTitulo, Autor nuevoAutor, int nuevoAnio, int nuevaPaginas,
                      String nuevoNarrador, float nuevaDuracion){

        super(nuevoTitulo,nuevoAutor,nuevoAnio,nuevaPaginas);
        this.setNarrador(nuevoNarrador);
        this.setDuracion(nuevaDuracion);
    }

    // METODOS
    public void MostrarAudioLibro()
    {
        super.MostrarLibro();
        System.out.println("Este audiolibro dura " + (this.getDuracion()/3600) + " horas");
    }
}
