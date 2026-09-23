package Biblioteca;

public class Autor {
    // region ATRIBUTOS
    private String nombre;
    private String fechaNac;
    private String fechaDef;
    private int edad;
    private String nacionalidad;
    // endregion

    // region GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getFechaDef() {
        return fechaDef;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNombre(String nuevoNombre)
    {
        if(nuevoNombre != "")
        {
            this.nombre = nuevoNombre;
        }
        else
        {
            // ERROR
        }
    }

    public void setFechaNac(String nuevaFechaNac)
    {
        if (nuevaFechaNac != "") {
            this.fechaNac = nuevaFechaNac;
        }
        else
        {
            // ERROR
        }
    }

    public void setFechaDef(String fechaDef) {
        this.fechaDef = fechaDef;
    }

    public void setEdad(int nuevaEdad)
    {
        if(nuevaEdad > 0)
        {
            this.edad = nuevaEdad;
        }
        else
        {
            // ERROR
        }
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // endregion

    // region CONSTRUCTORES

    public Autor(String nuevoNombre, String nuevaFechaNac, String nuevaFechaDef, int nuevaEdad, String nuevaNacionalidad)
    {
        this.setNombre(nuevoNombre);
        this.setFechaNac(nuevaFechaNac);
        this.setFechaDef(nuevaFechaDef);
        this.setEdad(nuevaEdad);
        this.setNacionalidad(nuevaNacionalidad);
    }

    // endregion

    // region METODOS

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", fechaNac='" + fechaNac + '\'' +
                ", fechaDef='" + fechaDef + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }

    // endregion
}
