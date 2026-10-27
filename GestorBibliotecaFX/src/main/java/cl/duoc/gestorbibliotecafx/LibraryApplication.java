package cl.duoc.gestorbibliotecafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

// Aplicación que lanzará la vista
public class LibraryApplication extends Application {
    /// Como hereda de 'Application', debe implementar y sobreescribir
    /// el método 'start()'
    @Override
    public void start(Stage stage) throws IOException {
        // FXMLLoader será el encargado de cargar la vista indicada
        FXMLLoader fxmlLoader = new FXMLLoader(LibraryApplication.class.getResource("library-view.fxml"));
        // La escena será levantada basándose en el resultado del FXMLLoader
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        // Se le indica un título a la ventana general del programa (ó 'Stage')
        stage.setTitle("Gestor Biblioteca FX");
        // Se establece la escena a mostrar en la ventana del programa
        stage.setScene(scene);
        // Finalmente, se muestra la ventana del programa
        stage.show();
    }
}
