package serie1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class exo3 extends Application {

    @Override
    public void start(Stage stage) {
       
        Label txt=new Label("enter a nuber :");
        Label labcarry =new Label("carry :");
        TextField nombre=new TextField();
        Button btnCalcul =new Button("calcul:");
        btnCalcul.setOnAction(e->{
        int n =Integer.parseInt(nombre.getText());
        labcarry.setText("carry : "+(n*n));
        });

        FlowPane root = new FlowPane(10, 10);
        root.getChildren().addAll(txt, nombre, btnCalcul, labcarry);

        Scene scene = new Scene(root, 400, 100);
        stage.setTitle("Carrés");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
