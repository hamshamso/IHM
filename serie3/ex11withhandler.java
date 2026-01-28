package serie3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class ex11withhandler extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Application de dessin");

        Pane root = new Pane();
        root.setPrefSize(400, 400);

        // إضافة بعض الأشكال
        Rectangle rect = new Rectangle(50, 50, 100, 80); // x, y, width, height
        rect.setFill(Color.LIGHTBLUE);

        Circle circle = new Circle(250, 150, 50); // centerX, centerY, radius
        circle.setFill(Color.PINK);

        root.getChildren().addAll(rect, circle);

        // Handler لكل شكل
        rect.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
            System.out.println("Clicked Rectangle!");
            rect.setFill(Color.GREEN); // تغيير اللون عند الضغط
        });

        circle.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
            System.out.println("Clicked Circle!");
            circle.setFill(Color.ORANGE); // تغيير اللون عند الضغط
        });

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
