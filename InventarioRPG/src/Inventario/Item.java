package Inventario;

public abstract class Item {

    // region ATRIBUTOS

    protected String nombre;
    protected float peso;
    protected String descripcion;
    private boolean esAcumulable;
    protected int espacio;

    // endregion

    // region GETTERS SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float nuevoPeso) {
        if(nuevoPeso > 0f)
        {
            this.peso = nuevoPeso;
        }
        else
        {
            this.peso = 0f;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEsAcumulable() {
        return esAcumulable;
    }

    private void setEsAcumulable(boolean esAcumulable) {
        this.esAcumulable = esAcumulable;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int nuevoEspacio) {

        if(nuevoEspacio > 0)
        {
            this.espacio = nuevoEspacio;
        }
        else
        {
            this.espacio = 0;
        }
    }

    // endregion

    // region CONSTRUCTORES

    public Item(String nuevoNombre, float nuevoPeso, String nuevaDescripcion, boolean nuevoAcumulable, int nuevoEspacio)
    {
        this.setNombre(nuevoNombre);
        this.setPeso(nuevoPeso);
        this.setDescripcion(nuevaDescripcion);
        this.setEsAcumulable(nuevoAcumulable);
        this.setEspacio(nuevoEspacio);
    }

    public Item(String nuevoNombre, float nuevoPeso, boolean nuevoAcumulable)
    {
        this.setNombre(nuevoNombre);
        this.setPeso(nuevoPeso);
        this.setDescripcion("None");
        this.setEsAcumulable(nuevoAcumulable);
        this.setEspacio(1);
    }

    // endregion

    // region METODOS

    // endregion
}
