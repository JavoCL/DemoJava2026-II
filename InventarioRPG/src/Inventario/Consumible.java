package Inventario;

public class Consumible extends Item implements Utilizable
{
    // region ATRIBUTOS

    private int usos;
    private int cantidadMax;

    // endregion

    // region GETTERS SETTERS

    public int getUsos() {
        return usos;
    }

    public void setUsos(int nuevoUsos) {
        if(nuevoUsos > 0)
        {
            this.usos = nuevoUsos;
        }
        else
        {
            this.usos = 0;
        }
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setCantidadMax(int nuevaCantidadMax) {
        if(nuevaCantidadMax > 0)
        {
            this.cantidadMax = nuevaCantidadMax;
        }
        else
        {
            this.cantidadMax = 0;
        }
    }


    // endregion

    // region CONSTRUCTORES

    public Consumible(String nuevoNombre, float nuevoPeso, String nuevaDescripcion, boolean nuevoAcumulable, int nuevoEspacio, int nuevoUsos, int nuevaCantidadMaxima)
    {
        // Invocamos constructor de clase padre 'Item'
        super(nuevoNombre, nuevoPeso, nuevaDescripcion, nuevoAcumulable, nuevoEspacio);

        // Llenamos atributos de esta clase 'Consumible'
        this.setUsos(nuevoUsos);
        this.setCantidadMax(nuevaCantidadMaxima);
    }

    // endregion

    // region METODOS

    @Override
    public void Utilizar()
    {

    }

    // endregion
}
