//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Autor autorFavorito = new Autor("J.R.R. Tolkien", "1890", "neozelandes");
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Libro miLibroFavorito = new Libro("El Hobbit", autorFavorito, 2025, 1000);
    Libro miLibroCabecera = new Libro("El Silmarillion", autorFavorito, 1973, 1200);

    miLibroFavorito.MostrarLibro();
    System.out.println("Este libro se publico el año " + miLibroFavorito.getAnio());
    System.out.println("El autor es: " + miLibroFavorito.getAutor().getNombre());

    AudioLibro miAudioLibroFavorito = new AudioLibro("El Señor de los Anillos", autorFavorito,
            2024, 1024, "Andy Serkis", 14400);

    //miAudioLibroFavorito.MostrarAudioLibro();
    miAudioLibroFavorito.MostrarLibro();
}
