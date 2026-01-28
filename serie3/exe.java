package serie3;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
public class exe extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stg){
        stg.setTitle("EXE");
        Circle c=new Circle(200,200,50);//x,y,radius
        c.setStyle("-fx-background-color: lightgreen;");
        c.setOnDragDetected(e->{
            c.startFullDrag();
        });
        c.setOnMouseDragOver(e->{
        c.setCenterX(e.getX());
        c.setCenterY(e.getY());
        });

        Scene scene=new Scene(new javafx.scene.layout.Pane(),400,400);
        stg.setScene(scene);
        stg.show();
    }
    
}
