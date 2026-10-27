package cl.duoc.gestorbibliotecafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
// Importamos el package del modelo biblioteca creado para ejemplo EV1
import cl.duoc.gestorbiblioteca.*;

public class LibraryController implements Initializable
{
    @FXML public TextField txtTituloLibro;
    @FXML public Label lbMensaje;
    @FXML public Button btnMostrarLibro;
    @FXML public TextField txtEditorial;
    @FXML public TextField txtIsbn;
    @FXML public TextField txtPaginas;
    @FXML public TextField txtFechaPub;
    @FXML public Label lbResultado;
    @FXML public Button btnCrearLibro;

    // Autor por defecto
    private Autor autorAnonimo;

    // Libro de ejemplo
    private Libro libroEjemplo;

    @Override
    public void initialize(URL location, ResourceBundle resources){
        // Inicializo la vista
        lbMensaje.setText("");

        try{
            // Inicializo el autor anonimo
            autorAnonimo = new Autor("Anónimo", "1900", "2100",
                    100, "Ninguna");
        }
        catch (ParametroVacioException e){
            System.out.println("Error: " + e.getMessage());
        }
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

    @FXML
    public void CrearLibroClic(ActionEvent actionEvent)
    {
        try
        {
            libroEjemplo = new Libro("A15", txtTituloLibro.getText(),txtFechaPub.getText(),
                    autorAnonimo,txtEditorial.getText(),txtIsbn.getText(), Integer.parseInt(txtPaginas.getText()));

            lbResultado.setText(libroEjemplo.toString());
        }
        catch (ParametroVacioException e)
        {
            lbResultado.setText(e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
        catch (FormatoFechaException e)
        {
            lbResultado.setText(e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
    }
}
