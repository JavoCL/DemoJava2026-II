package Biblioteca;

// Definimos una clase abstracta que maneje los atributos y metodos básicos para cualquier
// recurso bibliografico.
// Existe sólo para ser heredada
public abstract class Recurso
{
    // region ATRIBUTOS

    private String id; // Identificador unico para el recurso bibliografico
    private String titulo; // Titulo del recurso bibliografico
    private String fecha; // Fecha de publicacion bibliografico

    // endregion

    // region GETTERS Y SETTERS

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id != "")
        {
            this.id = id;
        }
        else
        {
            // ERROR
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String nuevoTitulo) throws ParametroVacioException{
        if(nuevoTitulo == "")
        {
            // Arroja la excepcion con el mensaje y muere el setter
            throw new ParametroVacioException("El titulo del recurso no debe ser vacío");
        }

        // Si no arrojó excepcion, asigna el nuevo título
        this.titulo = nuevoTitulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String nuevaFecha) throws ParametroVacioException, FormatoFechaException
    {
        if(nuevaFecha == "")
        {
            // Arroja la excepcion si la fecha es vacía y muere el setter de fecha
            throw new ParametroVacioException("La fecha del recurso no puede ser vacía");
        }

        // SIMULAMOS comparar una fecha con cierto formato
        if(ValidarFormatoFecha(nuevaFecha, "dd/mm/aa") == false)
        {
            throw new FormatoFechaException("El formato de fecha es inválido");
        }

        // Si no arrojó excepción, asigna la fecha
        this.fecha = nuevaFecha;
    }

    // endregion

    // region CONSTRUCTORES
    public Recurso(String nuevoId, String nuevoTitulo, String nuevaFecha) throws ParametroVacioException, FormatoFechaException
    {
        this.setId(nuevoId);
        this.setTitulo(nuevoTitulo);
        this.setFecha(nuevaFecha);
    }
    // endregion

    // region METODOS

    // [METODO EN CONSTRUCCION]
    public Boolean ValidarFormatoFecha(String fecha, String formato)
    {
        // Simulamos la comparacion con el formato
        return true;
    }

    // endregion
}
