public class Autor
{
    // ATRIBUTOS
    private String nombre;
    private String fechaNacimiento;
    private String nacionalidad;

    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    // SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // CONSTRUCTOR
    public Autor(String nuevoNombre, String nuevaFecha, String nuevaNacionalidad)
    {
        this.setNombre(nuevoNombre);
        this.setFechaNacimiento(nuevaFecha);
        this.setNacionalidad(nuevaNacionalidad);
    }
}
