package serie2;
import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class ex4 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage s){
    s.setTitle("example GridPane");
    BorderPane bp=new BorderPane();
    bp.setStyle("-fx-alignment : center;");
    GridPane grid=new GridPane();
    grid.setPadding(new Insets(10));//padding around the grid
    grid.setHgap(10);
    grid.setVgap(10);
    //buttons creation
    Button b1 =new Button("1");
    Button b2 =new Button("2");
    Button b3 =new Button("3");
    Button b4 =new Button("4");
    Button b5 =new Button("5");
    Button b6 =new Button("6");
    Button b7 =new Button("7");
    Button b8 =new Button("8");
    Button b9 =new Button("9");
    //buttons placment
    grid.add(b1,0,0);
    grid.add(b2,1,0);
    grid.add(b3,2,0);
    grid.add(b4,0,1);
    grid.add(b5,1,1);
    grid.add(b6,2,1);
    grid.add(b7,0,2);
    grid.add(b8,1,2);
    grid.add(b9,2,2);
    bp.setCenter(grid);
    Scene scene=new Scene(bp,400,400);
    s.setScene(scene);
    s.show();
    }
}
