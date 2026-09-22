package Inventario;

public class Arma extends Item implements Utilizable, Sonido
{

    // region ATRIBUTOS

    private String tipo;
    private float danio;

    // endregion

    // region GETTERS SETTERS

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getDanio() {
        return danio;
    }

    public void setDanio(float nuevoDanio) {
        if(nuevoDanio > 0f)
        {
            this.danio = nuevoDanio;
        }
        else
        {
            this.danio = 0f;
        }
    }

    // endregion

    // region CONSTRUCTORES

    public Arma(String nuevoNombre, float nuevoPeso, String nuevaDescripcion, int nuevoEspacio)
    {
        super(nuevoNombre, nuevoPeso, nuevaDescripcion, false, nuevoEspacio);
    }

    // endregion

    // region METODOS

    @Override
    public void Utilizar()
    {

    }

    @Override
    public void HacerSonido()
    {

    }

    // endregion
}
