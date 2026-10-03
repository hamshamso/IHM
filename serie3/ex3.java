package serie3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;

public class ex3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stg) {
        Label l = new Label("Type a key...");
        Pane panel = new Pane();
        panel.getChildren().addAll(l);
        Scene scene = new Scene(panel, 400, 400);
        panel.setStyle("-fx-background-color: skyblue;");
        // keyboard actions 
        panel.setOnKeyTyped(ev-> {
                //display the clicked key
                l.setText("Key pressed: " + ev.getCharacter());  
        });
        stg.setScene(scene);
        stg.show();
        // prepare the panel to track keyboard clicks 
        panel.requestFocus();
    }
}
