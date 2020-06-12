package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.vistas.adminPrincipal;

public class Main extends Application {

    Scene escena;
    Label lblLogin;
    TextField txtUsusario, txtContraseña;
    VBox vLogin;
    Button btnIngresar;
    BorderPane brpPrincipal;


    @Override
    public void start(Stage primaryStage) throws Exception{

        lblLogin = new Label("LOGIN");
        txtUsusario = new TextField();
        txtContraseña = new TextField();
        btnIngresar = new Button("INGRESAR");

        vLogin = new VBox();
        vLogin.setSpacing(5);
        vLogin.getChildren().addAll(lblLogin, txtUsusario,txtContraseña,btnIngresar);

        brpPrincipal = new BorderPane();
        brpPrincipal.setCenter(vLogin);

        btnIngresar = new Button();
        btnIngresar.setOnAction(event -> ingresar());

        escena = new Scene(brpPrincipal,300,275);
        primaryStage.setMaximized(true);
        //titulo de la ventana
        primaryStage.setTitle("Taqueria Litzy y Rodrigo");
        //creamos la conwxion a la bd
        conexion.crearConexion();
        //root jala contenidoo de xml para mostrar contenido, se remplaza con el boton, solo recive un contenedor padre
        primaryStage.setScene(escena);
        //para visualizar
        primaryStage.show();
    }

    private void ingresar(){
        new adminPrincipal();
    }


    public static void main(String[] args) {
        launch(args);
        System.out.println("taqueria");
    }
}
