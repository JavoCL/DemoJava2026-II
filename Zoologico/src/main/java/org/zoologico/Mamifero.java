package org.zoologico;

public class Mamifero extends Animal implements EnProgramaConservacion
{
    // region ATRIBUTOS
    private float gestacion;
    private Boolean esCarnivoro;
    private Boolean enConservacion;
    // endregion

    // region GETTERS Y SETTERS

    public float getGestacion() {
        return gestacion;
    }

    public Boolean getEsCarnivoro() {
        return esCarnivoro;
    }

    public void setGestacion(int nuevaGestacion)
    {
        if (nuevaGestacion < 0)
        {
            // Si no hay código, arroja IllegalArgumentException
            // Esta es una excepción nativa de Java para manejar argumentos
            throw new IllegalArgumentException("Los meses de gestación no pueden ser negativos.");
        }
        this.gestacion = nuevaGestacion;
    }

    public void setEsCarnivoro(Boolean esCarnivoro) {
        this.esCarnivoro = esCarnivoro;
    }


    // endregion

    // region CONSTRUCTORES

    public Mamifero(String codigo, int edad, float peso, int mesesGestacion, Boolean esCarnivoro)
    {
        // super() llama al constructor de la clase padre (Animal)
        super(codigo, edad, peso);

        // Asignamos los atributos propios usando setters
        this.setGestacion(mesesGestacion);
        this.setEsCarnivoro(esCarnivoro);
        // Por defecto, todos los nuevos mamíferos no están en conservación
        this.enConservacion = false;
    }

    // endregion

    // region METODOS

    // Implementación del metodo abstracto de la clase Animal
    @Override
    public float calcularCostoAlimentacion()
    {
        float costoBase = 50000f;
        if (this.esCarnivoro) {
            // Aumento del 30%
            costoBase = costoBase * 1.3f; // El costo incrementado al 130% (1 + 0.3)
        }
        return costoBase;
    }

    // --- Implementación de los métodos de la Interfaz ---
    @Override
    public Boolean estaEnProgramaConservacion()
    {
        return this.enConservacion;
    }

    @Override
    public void inscribirEnPrograma()
    {
        this.enConservacion = true;
    }

    // endregion

}
