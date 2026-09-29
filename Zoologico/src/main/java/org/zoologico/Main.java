package org.zoologico;

public class Main {
    public static void main(String[] args)
    {
        // 1. Instanciar el gestor
        GestorZoologico gestor = new GestorZoologico();

        try
        {
            // 2. Instanciar los animales según la tabla del requerimiento
            Mamifero m1 = new Mamifero("ZOO-M01", 5, 150.5f, 3, true);
            Mamifero m2 = new Mamifero("ZOO-M02", 3, 80.0f, 6, false);
            Ave a1 = new Ave("ZOO-A01", 2, 5.5f, 2.1f);
            Ave a2 = new Ave("ZOO-A02", 1, 0.8f, 0.4f);

            // 3. Inscribir al Mamífero ZOO-M01 en el programa de conservación
            m1.inscribirEnPrograma();

            // 4. Registrar en el gestor
            gestor.registrarAnimal(m1);
            gestor.registrarAnimal(m2);
            gestor.registrarAnimal(a1);
            gestor.registrarAnimal(a2);

            // 5. Buscar y mostrar detalles del "ZOO-M01"
            System.out.println("\n=== BUSQUEDA POR CODIGO: \"ZOO-M01\" ===");
            Animal encontrado = gestor.buscarAnimal("ZOO-M01");

            if (encontrado != null)
            {
                // Como 'encontrado' es de tipo genérico 'Animal', para ver las cosas
                // específicas de Mamífero debemos hacer un "Casteo" (transformación segura)
                if (encontrado instanceof Mamifero) {
                    Mamifero mamiferoEncontrado = (Mamifero) encontrado; // Casteo

                    String esCarnivoroTxt = mamiferoEncontrado.getEsCarnivoro() ? "Sí" : "No";
                    String enProgramaTxt = mamiferoEncontrado.estaEnProgramaConservacion() ? "Sí" : "No";

                    System.out.println("Tipo: Mamífero | Código: " + mamiferoEncontrado.getCodigo() +
                            " | Edad: " + mamiferoEncontrado.getEdad() +
                            " | Peso: " + mamiferoEncontrado.getPeso() + " kg" +
                            " | Meses de gestación: " + mamiferoEncontrado.getGestacion() +
                            " | Carnívoro: " + esCarnivoroTxt +
                            "\nEn programa de conservación: " + enProgramaTxt +
                            " | Costo alimentación: $" + mamiferoEncontrado.calcularCostoAlimentacion());
                }
            }
            else
            {
                System.out.println("Animal no encontrado.");
            }

            // 6. Listar todos los animales (usando el toString sobrescrito)
            gestor.listarAnimales();

        }
        catch (IllegalArgumentException e)
        {
            // Si algún dato de prueba estuviera mal (ej: peso negativo),
            // el constructor dispararía un error y caería aquí de forma controlada.
            System.out.println("Error al registrar animal: " + e.getMessage());
        }
    }
}