package serie4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.*;

public class ex7 extends Application {

    @Override
    public void start(Stage stage) {

        TreeItem<String> document = new TreeItem<>("Documents");
        TreeItem<String> img = new TreeItem<>("Images");
        TreeItem<String> pdf = new TreeItem<>("PDFs");
        TreeItem<String> videos = new TreeItem<>("Videos");

        img.getChildren().add(new TreeItem<>("vacances"));
        document.getChildren().addAll(img, pdf, videos);

        Label select = new Label("Select any item");

        TreeView<String> tree = new TreeView<>(document);

        tree.getSelectionModel().selectedItemProperty() .addListener((obs, oldv, newv) -> {
                if (newv != null) {
                    select.setText("Selected: " + newv.getValue());
                }
            });

        VBox root = new VBox(tree, select);

        Scene scene = new Scene(root, 300, 300);

        stage.setScene(scene);
        stage.setTitle("EXO7S4");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}