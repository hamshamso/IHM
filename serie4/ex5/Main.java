package serie4.ex5;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        //table view
        TableView <student> table=new TableView<>();
        //columns
        TableColumn<student,String> col1=new TableColumn<>("Name");//name column
        TableColumn<student,Integer> col2=new TableColumn<>("Age");//age column
        col1.setCellValueFactory(new PropertyValueFactory<>("name"));//link to student attribute name
        col2.setCellValueFactory(new PropertyValueFactory<>("age"));//link to student attribute age
        table.getColumns().addAll(col1,col2);
        //observable list
        ObservableList<student> List=FXCollections.observableArrayList(
            new student("Ahmed",20),
            new student("Ali",19),
            new student("Katia",19));
        //set observableList to table
        table.setItems(List);
      
        Scene scene=new Scene(table,400,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exo5 S4");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
