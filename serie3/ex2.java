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
        //كي تبدا تسحب في الدائرة
        cercle.setOnDragDetected(Event->{
             cercle.startFullDrag();
             //active les mouseDragEvent
            
        });
        //كل مرة تجرّ الماوس فوق الدائرة، يتبدّل مركز الدائرة للـX و الـY تاع الماوس
        cercle.setOnMouseDragOver(ev ->{
           
                cercle.setCenterX(ev.getX());
                cercle.setCenterY(ev.getY());
                //getX()getY()إحداثيات الماوس على محور x,y
            
        });
        //كي تخلّي الماوس (release)، نثبتو الدائرة في المكان الأخير لي وصلّو ليه الماوس
        cercle.setOnMouseDragReleased(ev->{
            
                cercle.setCenterX(ev.getX());
                cercle.setCenterY(ev.getY());

        });
    Scene scene=new Scene(root,400,300);
    stg.setScene(scene);
    stg.show();        
    };


    }
