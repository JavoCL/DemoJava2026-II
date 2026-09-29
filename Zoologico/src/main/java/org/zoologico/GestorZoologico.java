package org.zoologico;

import java.util.ArrayList;
import java.util.List;

public class GestorZoologico
{
    // Creamos una lista para almacenar los animales
    private List<Animal> listaAnimales;

    // Constructor inicializa la lista vacía
    public GestorZoologico()
    {
        listaAnimales = new ArrayList<>();
    }

    // Metodo para registrar
    public void registrarAnimal(Animal nuevoAnimal)
    {
        listaAnimales.add(nuevoAnimal);
        // Usamos getClass().getSimpleName() para saber si es "Ave" o "Mamifero"
        System.out.println(nuevoAnimal.getCodigo() + " (" + nuevoAnimal.getClass().getSimpleName() + ") registrado correctamente.");
    }

    // Metodo para buscar (retorna un objeto Animal o null si no lo encuentra)
    public Animal buscarAnimal(String codigo)
    {
        // Un ciclo 'for-each' para recorrer la lista
        for (Animal animalActual : listaAnimales) {
            // Usamos .equalsIgnoreCase para comparar textos de forma segura
            if (animalActual.getCodigo().equalsIgnoreCase(codigo))
            {
                return animalActual;
            }
        }
        return null; // Si termina el ciclo y no lo encontró
    }

    // Metodo extra para el requerimiento de listar todos usando toString()
    public void listarAnimales()
    {
        System.out.println("\n=== LISTADO DE ANIMALES ===");
        for (Animal animal : listaAnimales)
        {
            // Al imprimir el objeto, Java llama automáticamente al metodo toString()
            System.out.println(animal);
        }
    }
}