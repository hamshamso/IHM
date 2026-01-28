package serie3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MouseDragExample extends Application {

    public void start(Stage stage) {
        Pane panel = new Pane();
        Label lbl = new Label("Drag the mouse");
        lbl.setLayoutX(50);
        lbl.setLayoutY(50);
        panel.getChildren().add(lbl);

        Scene scene = new Scene(panel, 400, 400);
        panel.setStyle("-fx-background-color: lightgreen;");

        // Mouse Pressed → بدء السحب
        panel.setOnMousePressed(ev -> {
            lbl.setText("Mouse Pressed at: (" + ev.getX() + ", " + ev.getY() + ")");
        });

        // Mouse Dragged → أثناء السحب
        panel.setOnMouseDragged(ev -> {
            lbl.setText("Mouse Dragged at: (" + ev.getX() + ", " + ev.getY() + ")");
        });

        // Mouse Released → انتهاء السحب
        panel.setOnMouseReleased(ev -> {
            lbl.setText("Mouse Released at: (" + ev.getX() + ", " + ev.getY() + ")");
        });

        stage.setScene(scene);
        stage.setTitle("Mouse Drag Events Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
