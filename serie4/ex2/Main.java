package serie4.ex2;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage stg) {
        Label label=new Label("Bounjour JavaFX !");
        label.setId("titleLabel"); //applique le style #titleLabel
        Button btn=new Button("Click Me");
        VBox root = new VBox(15, label, btn);
        Scene scene=new Scene(root,300,200);
        //charger le fichier CSS
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stg.setTitle("Exemple CSS JavaFX");
        stg.setScene(scene);
        stg.show();
    }
    public static void main(String[] args){
        launch();
    }
    
}
