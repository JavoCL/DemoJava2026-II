import Biblioteca.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    Autor kosemen = new Autor("C.M. Kosemen", "18/05/84", "", 42, "turco");

    // Ya no podemos crear objetos de la clase abstracta 'Recurso'
    //Recurso nuevoRecurso = new Recurso("A1", "Juego de Tronos", "2026");

    try
    {
        Libro nuevoLibro = new Libro("A2", "All Tomorrows", "2007",
                kosemen, "Time Publishing",
                "9781806770021", 144);

        // Test sobre la clase Libro
        System.out.println("El titulo del libro es " + nuevoLibro.getTitulo());
        System.out.println("El autor del libro es " + nuevoLibro.getAutor());
        System.out.println("El libro es " + nuevoLibro.toString());
    }
    catch (ParametroVacioException e)
    {
        System.out.println("Error al crear Libro: " + e.getMessage());
    }
    catch (FormatoFechaException e)
    {
        System.out.println("Error al crear Libro: " + e.getMessage());
    }


    // TESTEO SOBRE LA CLASE RECURSO
    // System.out.println("El titulo del recurso es " + nuevoRecurso.getTitulo());
    // System.out.println("El recurso es " + nuevoRecurso.toString());



    // Generamos un nuevo objeto de la clase 'Director'
    Director nuevoDirector = new Director("James Cameron", "1954", "",
                                            "canadiense", 72);

    Pelicula nuevaPelicula = new Pelicula("A3", "Titanic", "1998",
                                    nuevoDirector, "Leo Dicaprio, Kate Winslet",
                                            210, "drama");

    System.out.println("El titulo de la pelicula es " + nuevaPelicula.getTitulo());
    System.out.println("El director de la pelicula es " + nuevaPelicula.getDirector());
    System.out.println("El elenco de la pelicula es " + nuevaPelicula.getElenco());
    System.out.println("La pelicula es " + nuevaPelicula.toString());

    Pelicula otraPelicula = new Pelicula("A4", "Avatar", "2009",
                                          nuevoDirector, "Sam Worthington, Zoe Saldaña",
                            162, "C. Ficcion");

}
