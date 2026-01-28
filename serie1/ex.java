package serie1;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

import javafx.application.Application;
import javafx.stage.*;



public class ex extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
     public void start(Stage s){
        Label txt=new Label("login");
        TextField login=new TextField();
        Label txt2=new Label("Password");
        TextField password=new TextField();
        Button btn=new Button("Enter");
        Label msg=new Label();

        //events
        btn.setOnAction( e->{
            String nom=login.getText();
            String pwd=password.getText();
            if(nom.equals("admin") && pwd.equals("1234")){
                msg.setText("Done");
            }
            else{
                msg.setText("error");
            }

        });
       
        //layout
        FlowPane root=new FlowPane(10,10);
        root.getChildren().addAll(txt,login,txt2,password,btn,msg);
        Scene scene=new Scene(root,500,300);
        s.setTitle("login");
        s.setScene(scene);
        s.show();

     }
}

