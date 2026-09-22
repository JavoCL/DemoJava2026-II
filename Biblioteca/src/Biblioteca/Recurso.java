package Biblioteca;

// Definimos una clase abstracta que maneje los atributos y metodos básicos para cualquier
// recurso bibliografico.
// Existe sólo para ser heredada
public abstract class Recurso {
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
            throw new ParametroVacioException();
        }

        if(nuevoTitulo != "")
        {
            this.titulo = nuevoTitulo;
        }
        else
        {
            // ERROR
        }
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String nuevaFecha) {
        if(nuevaFecha == "")
        {
            // PENDIENTE: validar fecha
            this.fecha = nuevaFecha;
        }
    }

    // endregion

    // region CONSTRUCTORES
    public Recurso(String nuevoId, String nuevoTitulo, String nuevaFecha)
    {
        try
        {
            this.setId(nuevoId);
            this.setTitulo(nuevoTitulo);
            this.setFecha(nuevaFecha);
        }
        catch (ParametroVacioException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

    }
    // endregion

    // region METODOS

    // endregion
}
