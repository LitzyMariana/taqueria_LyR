package sample.vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class adminPrincipal extends Stage {

    private Scene escena;
    private GridPane contenedor;
    private Label lblTacos, lblBebidas, lblEmpleados, lblRegistros;
    private Button btnSalir;
    private ToolBar tlbmenu;

    public adminPrincipal(){

        CrearGUI();
        this.setTitle("Administrador");
        this.setScene(escena);
        this.show();
    }

    private void CrearGUI(){

        tlbmenu = new ToolBar();
        btnSalir = new Button();
        btnSalir.setOnAction(event -> salir());
        contenedor = new GridPane();
        escena = new Scene(contenedor);

    }

    private void salir(){

    }
}
