package serie3;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.input.MouseButton;

public class ex1 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stg){
    stg.setTitle("EXO1");
    Pane panel=new Pane();
    panel.setStyle("-fx-background-color: lightgray;");
    Scene scene=new Scene(panel,400,400);

    // the mouse click event handling
    scene.setOnMouseClicked( ev -> {
            if(ev.getButton()==MouseButton.PRIMARY){
                System.out.println("sakina");}
            else if(ev.getButton()==MouseButton.SECONDARY){
                System.out.println("amine");
            }});
    scene.setOnScroll(e->{
        System.out.println("Scrolling detected: ");
    });
    stg.setScene(scene);
    stg.show();
    }
}

