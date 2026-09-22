public abstract class Recurso
{

    // region ATRIBUTOS

    private String titulo;
    private int anio;

    // endregion

    // region GETTERS SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int nuevoAnio) {
        if(nuevoAnio > 0)
        {
            this.anio = nuevoAnio;
        }
        else
        {
            this.anio = 2026;
        }
    }
    // endregion

    // region CONSTRUCTORES

    public Recurso(String nuevoTitulo, int nuevoAnio)
    {
        this.setTitulo(nuevoTitulo);
        this.setAnio(nuevoAnio);
    }
    // endregion

    // region METODOS

    public void MostrarRecurso()
    {
        System.out.println("El recurso se llama " + this.getTitulo() + " y es del año " + this.getAnio());
    }

    public abstract void MostrarDetalles();
    // endregion
}
