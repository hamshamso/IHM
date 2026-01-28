package serie4.exemplecomplex;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;



public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
       //MENU BAR
       Menu fileMenu = new Menu("File");
       fileMenu.getItems().add(new MenuItem("Open"));
       fileMenu.getItems().add(new MenuItem("Save"));
       fileMenu.getItems().add(new MenuItem("Exit"));
       Menu helpMenu = new Menu("Help");
       helpMenu.getItems().add(new MenuItem("About"));

       MenuBar menuBar = new MenuBar(fileMenu, helpMenu);
         //TABLE VIEW
         TableView<Student> table=new TableView<>();
         //name column
         TableColumn<Student,String> colName=new TableColumn<>("Name");
         colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        
         //age column
            TableColumn<Student,Integer> colAge=new TableColumn<>("Age");
            colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
         //level column
            TableColumn<Student,String> colLevel=new TableColumn<>("Level");
            colLevel.setCellValueFactory(new PropertyValueFactory<>("level"));
            
            table.getColumns().addAll(colName,colAge,colLevel);
            
         //Sample data
            ObservableList<Student>student=FXCollections.observableArrayList( new Student("Ahmed",20,"Beginner"), new Student("Bilal",22,"Intermediate"), new Student("Said",19,"Advanced"));
            table.setItems(student);

         //combobox
            ComboBox<String> levelBox=new ComboBox<>();
            levelBox.getItems().addAll("Beginner","Intermediate","Advanced");
            levelBox.setPromptText("Select Level");
        //form to add new student
            Button addButton=new Button("Add Student");
            TextField nameField=new TextField();
            nameField.setPromptText("Name");
            TextField ageField=new TextField();
            ageField.setPromptText("Age");
        //add new student
            addButton.setOnAction(e->{
                String name=nameField.getText();
                String age =ageField.getText();
                String level=levelBox.getValue();
                if(!name.isEmpty() && !age.isEmpty() && level!=null){
                    student.add(new Student(name,Integer.parseInt(age),level));
                    nameField.clear();
                    ageField.clear();
                    levelBox.setValue(null);
                }
            });
            HBox form =new HBox(10,nameField,ageField,levelBox,addButton);

            //layout
            BorderPane root=new BorderPane();
            root.setTop(menuBar);//menu bar at the top
            root.setCenter(table);//table at the center
            root.setBottom(form);//form(textfields,button and combobox) at the bottom

            Scene scene=new Scene(root,600,400);
            //load CSS
            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("JavaFX Educational Example");
            primaryStage.show();
        }

        public static void main(String[] args) {
        launch(args);
    }
    
    }

   

