package cl.duoc.gestorbibliotecafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

// Importamos el package del modelo biblioteca creado para
// el ejemplo de la EV1
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class LibraryController implements Initializable
{
    // Se establecen cuáles son las referencias a los controles de UI
    // en la vista asociada.
    // IMPORTANTE💡: Deben llevar el tag '@FXML' y el mismo nombre
    // de id que en la vista
    @FXML public Button btnAgregarRecurso;
    @FXML public Button btnAgregarAutor;
    @FXML public Tab tabRecursos;
    @FXML public TableView tbvRecursos;
    @FXML public TableColumn tbcRecID;
    @FXML public TableColumn tbcRecTitulo;
    @FXML public TableColumn tbcRecFech;


    // El método 'initialize()' permite establecer comportamientos iniciales, como
    // contadores en 0, mensajes string en valor "", conexión a BD, etc
    // NO SE UTILICE NADA DE VISTA AUN
    @Override
    public void initialize(URL location, ResourceBundle resources){
        // Inicializo la vista
    }

    // Método asociado al boton 'Agregar Recurso'.
    // Debe ser igual al definido en la propiedad 'onAction' de la vista
    // diseñada en el archivo *.fxml
    @FXML
    public void AgregarRecurso(ActionEvent actionEvent)
    {

    }

    // Método asociado al boton 'Agregar Recurso'.
    // Debe ser igual al definido en la propiedad 'onAction' de la vista
    // diseñada en el archivo *.fxml
    @FXML
    public void AgregarAutor(ActionEvent actionEvent) throws IOException
    {
        // Indica cual es la vista a cargar
        FXMLLoader fxmlLoader = new FXMLLoader(AgregarAutorController.class.getResource("/cl/duoc/gestorbibliotecafx/agregar-autor-view.fxml"));
        // Carga la vista de crear autores
        Parent vistaAutor = fxmlLoader.load();

        // Creamos una nueva ventana con el titulo adecuado
        Node origen = (Node)actionEvent.getSource();
        Stage stagePopUp = new Stage();
        stagePopUp.setTitle("Agregar autor");

        // Seteamos una nueva escena cargada con lo que cargamos desde la vista nueva del FXML
        stagePopUp.setScene(new Scene(vistaAutor));
        // Mostramos la nueva ventana
        stagePopUp.show();
    }
}
