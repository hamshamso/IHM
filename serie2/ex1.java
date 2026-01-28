package serie2;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class ex1 extends Application {
    public static void main (String A[]){
        launch(A);
    }
    @Override
    public void start(Stage str){
     str.setTitle("Use of border Pane");
     //top
     MenuBar mb=new MenuBar();
     Menu fich=new Menu("fichier");
     Menu edit=new Menu("Edition");
     mb.getMenus().addAll(fich,edit);
    // left 
    Label l=new Label("commands");
    Button b1=new Button("action1");
    Button b2=new Button("action2");
    VBox gauche = new VBox();
    gauche.getChildren().addAll(l,b1,b2);
    //center
    Pane panaux =new Pane();
    panaux.setStyle("-fx-background-color:lightgray;");
    Label l1 =new Label("Ecpace principal");
    panaux.getChildren().addAll(l1);
    //right
    Label l2 =new Label("barre lateral");
    l2.setStyle("-fx-background-color:gray;-fx-min-width:100;");
    //bottom
    Pane base = new Pane();
    base.setStyle("-fx-background-color:lightgray; -fx-padding:10;");
    base.getChildren().add(new Label("information supplementaires"));
    //composition de la fenetre et ajont 
    //des zodes
    BorderPane root=new BorderPane();
    root.setTop(mb);//mb=menuBar
    root.setLeft(gauche);//gauche=VBox
    root.setCenter(panaux);//panaux=pane
    root.setRight(l2);//l2=label
    root.setBottom(base);//base=pane
    Scene myScene=new Scene(root,700,500);
    str.setScene(myScene);
    str.show();
}
}
