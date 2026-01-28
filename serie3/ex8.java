package  serie3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ex8 extends Application {

    @Override
    public void start(Stage stage) {
        TextField username = new TextField();
        username.setPromptText("Username");

        PasswordField pwd = new PasswordField();
        pwd.setPromptText("Password");

        Button login = new Button("Login");
        Label msg = new Label();

        login.setOnAction(e -> {
            if (username.getText().equals("admin") && pwd.getText().equals("1234")) {
                msg.setText("Login successful!");
            } else {
                msg.setText("Invalid login!");
            }
        });

        VBox root = new VBox(10, username, pwd, login, msg);

        stage.setScene(new Scene(root, 300, 200));
        stage.setTitle("Login Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
