package serie2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class ex3 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage S){
        S.setTitle("Une fenetre");
        VBox root =new VBox();
        Button b1=new Button("Nord");
        Button b2=new Button("Ouest");
        Button b3=new Button("Sud");
        Button b4=new Button("Centre");
        Button b5=new Button("Est");
        root.getChildren().addAll(b1,b2,b3,b4,b5);
        Scene myScene=new Scene(root,1000,1000);
        S.setScene(myScene);
        S.show();
    }
}
