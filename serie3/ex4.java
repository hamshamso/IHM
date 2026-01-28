package serie3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ex4 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 300);

        // Lambda for key pressed
        scene.setOnKeyPressed(e -> {
            if (e.isControlDown() && e.isAltDown() && e.getCode() == KeyCode.O) {
                root.setStyle("-fx-background-color: orange;");
            }
        });

        primaryStage.setTitle("Exo4");
        primaryStage.setScene(scene);
        primaryStage.show();

        // ضروري لالتقاط ضغطات المفاتيح
        root.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
