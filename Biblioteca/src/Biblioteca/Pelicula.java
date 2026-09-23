package Biblioteca;

public class Pelicula extends Recurso implements Prestable{

    // region ATRIBUTOS
    private Director director; // Director de la pelicula
    private String elenco; // Elenco participante de la pelicula
    private int duracion; // Duracion de la pelicula en minutos
    private String genero; // Genero de la pelicula
    // endregion

    // region GETTERS Y SETTERS

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director nuevoDirector) {
        if(nuevoDirector != null)
        {
            this.director = nuevoDirector;
        }
        else
        {
            // ERROR
        }
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String nuevoElenco) {
        // Se considera par estos efectos que el elenco podría ser vacío
        this.elenco = nuevoElenco;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int nuevaDuracion) {
        if(nuevaDuracion > 0)
        {
            this.duracion = nuevaDuracion;
        }
        else
        {
            // ERROR
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String nuevoGenero) {
        if(nuevoGenero != "")
        {
            this.genero = nuevoGenero;
        }
        else
        {
            // ERROR
        }
    }

    // endregion

    // region CONSTRUCTORES
    public Pelicula(String nuevoId, String nuevoTitulo, String nuevaFecha,
                    Director nuevoDirector, String nuevoElenco, int nuevaDuracion, String nuevoGenero) throws ParametroVacioException, FormatoFechaException
    {
        // Llamamos al constructor de la clase abstracta base 'Recurso'
        super(nuevoId, nuevoTitulo, nuevaFecha);

        // Llenamos los atributos restantes pertencientes a esta clase 'Pelicula'
        this.setDirector(nuevoDirector);
        this.setElenco(nuevoElenco);
        this.setDuracion(nuevaDuracion);
        this.setGenero(nuevoGenero);
    }
    // endregion

    // region METODOS

    @Override
    public void Prestar(String usuario)
    {
        String mensaje = "La pelicula se prestó al usuario=" + usuario + ". Lo debe traer en 3 días más";
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + this.getTitulo() + '\'' +
                ", fecha='" + this.getFecha() + '\'' +
                ", director='" + director + '\'' +
                ", elenco='" + elenco + '\'' +
                ", duracion=" + duracion +
                ", genero='" + genero + '\'' +
                '}';
    }

    // endregion
}
