module cl.duoc.gestorbibliotecafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens cl.duoc.gestorbibliotecafx to javafx.fxml;
    exports cl.duoc.gestorbibliotecafx;
}