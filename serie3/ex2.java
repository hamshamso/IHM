package serie3;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ex2 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stg){
    stg.setTitle("EXO2");
    Circle cercle=new Circle(80,80,40,Color.LIGHTBLUE);
    Pane root=new Pane(cercle);
        //drag event 
        cercle.setOnDragDetected(Event->{
             cercle.startFullDrag();
             //active les mouseDragEvent
            
        }); 
        cercle.setOnMouseDragOver(ev ->{
           
                cercle.setCenterX(ev.getX());
                cercle.setCenterY(ev.getY());
            
        });
        cercle.setOnMouseDragReleased(ev->{
            
                cercle.setCenterX(ev.getX());
                cercle.setCenterY(ev.getY());

        });
    Scene scene=new Scene(root,400,300);
    stg.setScene(scene);
    stg.show();        
    };


    }
