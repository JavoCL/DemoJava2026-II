package org.zoologico;

public class Ave extends Animal
{

    // region ATRIBUTOS

    private float envergaduraAlas;

    // endregion

    // region GETTERS Y SETTERS

    public float getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(float nuevaEnvergaduraAlas)
    {
        if (nuevaEnvergaduraAlas <= 0) {
            throw new IllegalArgumentException("La envergadura debe ser mayor a cero.");
        }
        this.envergaduraAlas = nuevaEnvergaduraAlas;
    }

    // endregion

    // region CONSTRUCTORES

    public Ave(String nuevoCodigo, int nuevaEdad, float nuevoPeso, float nuevaEnvergaduraAlas)
    {
        // LLamamos al constructor de la clase padre 'Animal'
        super(nuevoCodigo, nuevaEdad, nuevoPeso);
        // LLamamos a los setters de cada atributo de la clase 'Ave'
        setEnvergaduraAlas(nuevaEnvergaduraAlas);
    }

    // endregion

    // region METODOS

    @Override
    public float calcularCostoAlimentacion()
    {
        float costoBase = 20000;
        if (this.envergaduraAlas > 1.5) {
            // Aumento del 15%
            costoBase = costoBase * 1.15f; // El costo incrementado al 115% (1 + 0.15)
        }
        return costoBase;
    }

    // endregion

}
