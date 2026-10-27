package cl.duoc.gestorbibliotecafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

// Importamos el package del modelo biblioteca creado para
// el ejemplo de la EV1
import cl.duoc.gestorbiblioteca.*;

public class LibraryController implements Initializable
{
    // Se establecen cuáles son las referencias a los controles
    // en la vista asociada.
    // IMPORTANTE💡: Deben llevar el tag '@FXML' y el mismo nombre
    // de id que en la vista

    @FXML public TextField txtTituloLibro; // Textfield de titulo
    @FXML public Label lbMensaje; // Label de mensaje
    @FXML public Button btnMostrarLibro; // Boton para mostrar el libro en el mensaje
    @FXML public TextField txtEditorial; // Textfield de editorial
    @FXML public TextField txtIsbn; // Textfield de código ISBN
    @FXML public TextField txtPaginas; // Textfield de páginas
    @FXML public TextField txtFechaPub; // Textfield de la fecha de publicación
    @FXML public Label lbResultado; // Label del resultado al crear libro
    @FXML public Button btnCrearLibro; // Boton para crear el nuevo objeto de la clase 'Libro'

    // Autor por defecto. Elegimos un anónimo
    private Autor autorAnonimo;

    // Libro de ejemplo
    private Libro libroEjemplo;

    // El método 'initialize()' permite establecer comportamientos iniciales, como
    // contadores en 0, mensajes string en valor "", conexión a BD, etc
    // NO SE UTILICE NADA DE VISTA AUN
    @Override
    public void initialize(URL location, ResourceBundle resources){
        // Inicializo la vista
        // Dejo los labels de mensaje y resultado en vacío
        lbMensaje.setText("");
        lbResultado.setText("");

        // Intento crear un nuevo autor (por ahora "anonimo")
        try{
            // Inicializo el autor anonimo
            autorAnonimo = new Autor("Anónimo", "1900", "2100",
                    100, "Ninguna");
        }
        // Si no lo logro por algún error, atrapo el error lanzado
        catch (ParametroVacioException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Método asociado al boton 'Mostrar Libro'.
    // Debe ser igual al definido en la propiedad 'onAction' de la vista
    // diseñada en el archivo *.fxml
    @FXML
    public void MostrarLibroClic(ActionEvent actionEvent)
    {
        // Si está vacío muestra un mensaje acorde al error
        if(txtTituloLibro.getText().equals("") == true)
        {
            lbMensaje.setText("EL LIBRO ESTA VACIO ❌");
            return;
        }
        // Si no está vacío, cambia el mensaje por el título del libro
        lbMensaje.setText("El libro ingresado es: " + txtTituloLibro.getText());
    }

    // Método asociado al boton 'Crear Libro'.
    // Debe ser igual al definido en la propiedad 'onAction' de la vista
    // diseñada en el archivo *.fxml
    @FXML
    public void CrearLibroClic(ActionEvent actionEvent)
    {
        // Intenta crear un nuevo 'Libro' en el objeto 'libroEjemplo'
        try
        {
            // Si no lanza excepción, lo crea
            libroEjemplo = new Libro("A15", txtTituloLibro.getText(),txtFechaPub.getText(),
                    autorAnonimo,txtEditorial.getText(),txtIsbn.getText(), Integer.parseInt(txtPaginas.getText()));
            // ... y luego muestra el mensaje en el label 'lbResultado'
            lbResultado.setText(libroEjemplo.toString());
        }
        // Si no tiene un parametro con valor válido y lanza excepción,
        // la atrapa...
        catch (ParametroVacioException e)
        {
            // ... y genera el mensaje de la excepción en el label 'lbResultado'
            // y consola
            lbResultado.setText(e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
        // Si no tiene una fecha con el formáto válido y lanza excepción,
        // la atrapa...
        catch (FormatoFechaException e)
        {
            // ... y genera el mensaje de la excepción en el label 'lbResultado'
            // y consola
            lbResultado.setText(e.getMessage());
            System.out.println("Error: " + e.getMessage());
        }
        // Si trata de convertir un string vacío y lanza excepción,
        // la atrapa...
        catch (NumberFormatException e) {
            // ... y genera el mensaje de la excepción en el label 'lbResultado'
            // y consola
            lbResultado.setText("Error: Asegúrate de ingresar números válidos en los campos numéricos y no dejarlos vacíos.");
            // AQUÍ ATRAPAS EL ERROR: Muestras una alerta visual o un mensaje en consola
            System.out.println("Error de formato: Asegúrate de ingresar números válidos en los campos numéricos y no dejarlos vacíos.: " + e.getMessage());
        }
    }
}
