package Biblioteca;

public class Director {
    // region ATRIBUTOS
    private String nombre; // Nombre del director
    private String fechaNac; // Fecha de nacimiento del director
    private String fechaDef; // Fecha de defuncion del director
    private String nacionalidad; // Nacionalidad del director
    private int edad; // Edad del director
    // endregion

    // region GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        if(nuevoNombre != "")
        {
            this.nombre = nuevoNombre;
        }
        else
        {
            // ERROR
        }
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String nuevaFecha) {
        if(nuevaFecha != "")
        {
            // PENDIENTE: validar fecha
            this.fechaNac = nuevaFecha;
        }
    }

    public String getFechaDef() {
        return fechaDef;
    }

    public void setFechaDef(String nuevaFecha) {

        // PENDIENTE: validar fecha
        this.fechaDef = nuevaFecha;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nuevaNacionalidad) {
        if(nuevaNacionalidad != "")
        {
            this.nacionalidad = nuevaNacionalidad;
        }
        else
        {
            // ERROR
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int nuevaEdad) {
        // La edad debe ser positiva y mayor que la edad anterior
        if(nuevaEdad > 0 && nuevaEdad > this.edad)
        {
            this.edad = nuevaEdad;
        }
    }

    // endregion

    // region CONSTRUCTORES
    public Director(String nuevoNombre, String nuevaFechaNac, String nuevaFechaDef, String nuevaNacionalidad, int nuevaEdad)
    {
        this.setNombre(nuevoNombre);
        this.setFechaNac(nuevaFechaNac);
        this.setFechaDef(nuevaFechaDef);
        this.setNacionalidad(nuevaNacionalidad);
        this.setEdad(nuevaEdad);
    }
    // endregion

    // region METODOS

    @Override
    public String toString() {
        return "Director{" +
                "nombre='" + nombre + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", fechaDef='" + fechaDef + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", edad=" + edad +
                '}';
    }

    // endregion
}
