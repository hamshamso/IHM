package serie4;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ex4 extends Application {

    @Override
    public void start(Stage stage) {

        // 1️⃣ ObservableList
        ObservableList<String> levels =
                FXCollections.observableArrayList("Beginner", "Intermediate", "Advanced"); //default items
        // 2️⃣ ComboBox 
        ComboBox<String> comboBox = new ComboBox<>(levels);
        comboBox.setPromptText("Select a level");

        // 3️⃣ Label
        Label result = new Label("Selected level: none");

        // 4️⃣ TextField + Add Button
        TextField input = new TextField();
        input.setPromptText("New level");
        Button addBtn = new Button("Add");
        addBtn.setOnAction(e -> {
            String newLevel = input.getText();// get text from text field
            if (!newLevel.isEmpty()) {//ensure it's not empty
                levels.add(newLevel);// add to observable list
                input.clear();// clear text field
            }
        });

        // 5️⃣ Remove Button
        Button removeBtn = new Button("Remove Selected");

        removeBtn.setOnAction(e -> {
            String selected = comboBox.getValue();// get selected item
            if (selected != null) {
                levels.remove(selected);// remove from observable list
            }
        });


        // 6️⃣ Selection Listener
        // update label on selection change
        comboBox.getSelectionModel().selectedItemProperty().addListener((obs, oldv, newv) ->//for any change in selection 
            {  //newv is the new selected item 
                //oldv is the previous one
                //obs is the observable value
              result.setText("Selected level: " + newv); // update label
            });

        FlowPane root = new FlowPane(comboBox, input, addBtn, removeBtn, result);
        Scene scene = new Scene(root, 300, 300);

        stage.setTitle("ComboBox Exercise");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
