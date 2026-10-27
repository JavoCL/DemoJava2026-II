package cl.duoc.gestorbibliotecafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LibraryController implements Initializable
{
    @FXML public TextField txtTituloLibro;
    @FXML public Label lbMensaje;
    @FXML public Button btnMostrarLibro;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        // Inicializo la vista
        lbMensaje.setText("");
    }

    @FXML
    public void MostrarLibroClic(ActionEvent actionEvent) {

        if(txtTituloLibro.getText().equals("") == true)
        {
            lbMensaje.setText("EL LIBRO ESTA VACIO ❌");
            return;
        }
        // Cambie el mensaje por el titulo del libro
        lbMensaje.setText("El libro ingresado es: " + txtTituloLibro.getText());
    }
}
