package cl.duoc.gestorbibliotecafx;

import javafx.application.Application;

// Clase principal que lanza la aplicacion
public class Launcher {
    public static void main(String[] args) {
        // 'Application' lanza 'LibraryApplication' (que hereda de 'Application')
        Application.launch(LibraryApplication.class, args);
    }
}
