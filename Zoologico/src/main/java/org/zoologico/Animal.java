package org.zoologico;

public abstract class Animal
{

    // region ATRIBUTOS

    private String codigo;
    private int edad;
    private float peso;

    // endregion

    // region GETTERS Y SETTERS

    public String getCodigo()
    {
        return codigo;
    }

    public int getEdad()
    {
        return edad;
    }

    public float getPeso()
    {
        return peso;
    }

    public void setCodigo(String nuevoCodigo)
    {
        // Validamos que no sea nulo ni esté vacío
        if (nuevoCodigo == null || nuevoCodigo.isEmpty()) {
            // Si no hay código, arroja IllegalArgumentException
            // Esta es una excepción nativa de Java para manejar argumentos
            throw new IllegalArgumentException("El código no puede estar vacío.");
        }
        this.codigo = nuevoCodigo;
    }

    public void setEdad(int nuevaEdad)
    {
        // Validamos el rango de edad
        if (nuevaEdad < 0 || nuevaEdad > 50) {
            // Si no hay código, arroja IllegalArgumentException
            // Esta es una excepción nativa de Java para manejar argumentos
            throw new IllegalArgumentException("La edad debe estar entre 0 y 50 años.");
        }
        this.edad = nuevaEdad;
    }

    public void setPeso(float nuevoPeso)
    {
        // Validamos que el peso sea positivo
        if (nuevoPeso <= 0f) {
            // Si no hay código, arroja IllegalArgumentException
            // Esta es una excepción nativa de Java para manejar argumentos
            throw new IllegalArgumentException("El peso debe ser mayor a cero.");
        }
        this.peso = nuevoPeso;
    }

    // endregion

    // region CONSTRUCTORES

    public Animal(String nuevoCodigo, int nuevaEdad, float nuevoPeso)
    {
        // MUY IMPORTANTE: Delegamos la asignación a los setters.
        // Así, si el setter tiene una validación, se aplica incluso al crear el objeto.
        setCodigo(nuevoCodigo);
        setEdad(nuevaEdad);
        setPeso(nuevoPeso);


        // FORMA INCORRECTA: se puede hacer, pero NO SE DEBE hacer (es mala prática)
        //this.codigo = nuevoCodigo;
    }

    // endregion

    // region METODOS

    // El requerimiento dice que SOLO debe mostrar código y edad.
    @Override
    public String toString()
    {
        return "Código: " + codigo + " | Edad: " + edad;
    }

    // Metodo Abstracto (Polimorfismo)
    // Esta es la mejor forma de hacerlo. Solo declaramos la firma (nombre, retorno y posibles parametros),
    // pero obligamos a las clases "hijas" a implementar este cálculo.
    // Todos los animales comen, pero cada uno cuesta distinto.
    public abstract float calcularCostoAlimentacion();

    // endregion
}
