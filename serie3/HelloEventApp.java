package serie3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.event.EventHandler;

// تعريف الحدث المخصص
class HelloEvent extends Event {
    public static final EventType<HelloEvent> ANY = new EventType<>(Event.ANY, "HELLO_EVENT");
    private final String message;

    public HelloEvent(String message) {
        super(ANY);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class HelloEventApp extends Application {
    @Override
    public void start(Stage stage) {
        VBox root = new VBox(10);
        Text output = new Text("Waiting for event...");
        Button btn = new Button("Say Hello");

        // Handler للحدث المخصص
        EventHandler<HelloEvent> handler = e -> {
            output.setText(e.getMessage());
            System.out.println("Event received: " + e.getMessage());
        };

        // ربط الـ Handler بالنص
        output.addEventHandler(HelloEvent.ANY, handler);

        // عند الضغط على الزر، إرسال الحدث المخصص
        btn.setOnAction(e -> output.fireEvent(new HelloEvent("Hello World!")));

        root.getChildren().addAll(btn, output);
        stage.setScene(new Scene(root, 250, 150));
        stage.setTitle("Custom Event Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
