package serie1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class exo4 extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage s){
    s.setTitle("identification");
    Label login=new Label("Login :");
    TextField txt=new TextField();
    TextField epwd=new TextField();
    Label pwd=new Label("Password:");
    Button btn=new Button("Enter");
    Label msg=new Label();
    FlowPane root=new FlowPane(10,10);
    root.getChildren().addAll(login,txt,pwd,epwd,btn,msg);
    
    //action de button
    btn.setOnAction(e->{
    String nome=txt.getText().trim();
    String password=epwd.getText().trim();
    //.trim() removes leading and trailing whitespace
    //.equals() method to compare strings
    
    if(nome.equals("admin") && password.equals("1234")){
        msg.setText(" ✅ secess");
    }
    else{
        msg.setText(" ❌ error");
    }
    });
    //layout
    Scene scene=new Scene(root,600,200);
    s.setScene(scene);
    s.show();

    }
    
}
