package serie4.ex6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;


public class Main extends Application {
    @Override
    public void start(Stage stg) {
    Button btn=new Button("Get license");
    Label lbl=new Label("you will be a gentelman");
    VBox root=new VBox(btn,lbl);
    Scene scene=new Scene(root,500,300);
    scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
    stg.setScene(scene);
    stg.setTitle("Exo6 S4");
    stg.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
