package cl.duoc.gestorbibliotecafx.controller;

import cl.duoc.gestorbiblioteca.Autor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AgregarAutorController implements Initializable {

    @FXML public Button btnVolver;
    @FXML public TextField txtNombre;
    @FXML public TextField txtFechaNac;
    @FXML public TextField txtFechaFall;
    @FXML public ComboBox cbNacionalidad;
    @FXML public TextField txtEdad;
    @FXML public Button btnCrearAutor;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbNacionalidad.getItems().addAll(Autor.NACIONALIDADES);
    }

    @FXML
    public void Volver(ActionEvent actionEvent) {
        // Obtenemos el nodo (el boton) que origino este evento
        Node fuente = (Node)actionEvent.getSource();

        //  Obtenemos la ventana a la que pertenece el boton
        Stage stage = (Stage)fuente.getScene().getWindow();

        stage.close();
    }

    @FXML
    public void CrearAutor(ActionEvent actionEvent) {
    }
}
