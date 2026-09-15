public class Pelicula extends Recurso
{
    // region ATRIBUTOS
    private String director;
    private float duracion; // Duracion de la pelicula en minutos
    // endregion

    // region GETTERS SETTERS

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
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

    // endregion

    // region CONSTRUCTORES

    public Pelicula(String nuevoTitulo, int nuevoAnio, String nuevoDirector, float nuevaDuracion)
    {
        super(nuevoTitulo, nuevoAnio);

        this.setDirector(nuevoDirector);
        this.setDuracion(nuevaDuracion);
    }

    // endregion

    @Override
    public void MostrarDetalles()
    {


    }
}
