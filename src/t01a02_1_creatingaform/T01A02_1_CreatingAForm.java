/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t01a02_1_creatingaform;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author jose
 */
public class T01A02_1_CreatingAForm extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Welcome");
        
        // Definimos las caracteristicas de la escena
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        // Codigo para crear la escena
        Scene scene = new Scene(grid, 325, 300);
        primaryStage.setScene(scene);
        
        // Le damos titulo a la escena y lo añadimos al Grid
        Text scenetitle = new Text("Welcome");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);
        
        // Creacion del boton para recoger la accion
        Button btn = new Button("Sign in");
        // HBox coloca los nodos (componentes) en una fila horizontal, en lugar de en malla o rejilla _(grid)
        HBox hbBtn = new HBox(10);
        // Alineamos el boton abajo a la derecha
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        // Añadimos en el listado de hijos de hbBtn el boton
        hbBtn.getChildren().add(btn);
        // Añadimos el HBox en la primera columna y en la cuarta fila del casillero grid
        grid.add(hbBtn, 1, 4);
        
        // Creamos la etiqueta para el nombre de usuario y la añadimos al gridPane
        Label userName = new Label("User Name:");
        grid.add(userName, 0, 1);
        
        // Creamos el campo de texto donde el usuario introducira el user name y la añadimos
        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 1);
        
        // Creamos la etiqueta para el pw y la añadimos
        Label pw = new Label("Password:");
        grid.add(pw, 0, 2);
        
        // Creamos el campo de texto para que el usuario introduzca la pw y lo añadimos
        PasswordField pwBox = new PasswordField();
        grid.add(pwBox, 1, 2);
        
        // Con esta funcion, se pueden visualizar las lineas de la cuadricula grid
        // grid.setGridLinesVisible(true);
        
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
