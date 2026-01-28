package serie3;

import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;

public class ex10 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stg) {
        stg.setTitle("use of handler");

        Pane pane = new Pane();

        Pane pane1 = createPane("Pane1", 0, 0, 200, 200);
        Pane pane2 = createPane("Pane2", 0, 200, 200, 200);
        Pane pane3 = createPane("Pane3", 200, 0, 200, 200);
        Pane pane4 = createPane("Pane4", 200, 200, 200, 200);

        Button button = new Button("cliquer");
        button.setLayoutX(150);
        button.setLayoutY(350);

        pane.getChildren().addAll(pane1, pane2, pane3, pane4, button);

        // 🔽 هنا التغيير الوحيد
        addMyEventHandler(pane1, "Pane1");
        addMyEventHandler(pane2, "Pane2");
        addMyEventHandler(pane3, "Pane3");
        addMyEventHandler(pane4, "Pane4");

        button.setOnAction(e -> {
            logEvent("Button", "Button cliquer");
        });

        Scene scene = new Scene(pane);
        stg.setScene(scene);
        stg.show();
    }

    // 🔹 إضافة Event Handler 
    void addMyEventHandler(Pane node, String nName) {
        node.addEventHandler(Event.ANY, e -> {
            logEvent(nName, e.getEventType().getName());
        });
    }

    void logEvent(String nName, String eType) {
        System.out.println("Event capte: " + nName + " (" + eType + ")");
    }

    Pane createPane(String n, double x, double y, double w, double h) {
        Pane p = new Pane();
        Label l = new Label(n);
        p.getChildren().add(l);
        p.setLayoutX(x);
        p.setLayoutY(y);
        p.setPrefSize(w, h);
        return p;
    }
}
