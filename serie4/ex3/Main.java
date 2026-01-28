package serie4.ex3;

import javafx.application.Application;
import javafx.scene.control.MenuBar;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.Scene;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
    Menu filemenu=new Menu("File");
    filemenu.getItems().add(new MenuItem("new"));
    filemenu.getItems().add(new MenuItem("open"));
    MenuItem quit=new MenuItem("quit");
    filemenu.getItems().add(quit);
    Menu helpmenu=new Menu("Help");
    MenuItem about=new MenuItem("About");
    helpmenu.getItems().add(about);
    MenuBar menubar=new MenuBar(filemenu,helpmenu);

    //actions de button quit
    quit.setOnAction(e->{
        primaryStage.close();//ferme la fenetre
    });

    //action de button about
    about.setOnAction(e->{
        //Afficher une boite de dialogue
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("About this application");//titre du message
        alert.setContentText("This is a JavaFX example application.");//contenu du message
        alert.show();//affiche le message

    });

    Scene scene=new Scene(menubar,500,300);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Menu Bar Example");
    primaryStage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
