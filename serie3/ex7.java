package  serie3;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;
public class ex7 extends Application {
    List<String> cart = new ArrayList<>();//liste des produits dans le panier 
    Label display = new Label("Cart:[]"); //affichage du contenu du panier
     void add(String product) { //ajouter un produit au panier
        cart.add(product);
        display.setText("Cart: " + cart.toString());
    }
    @Override
    public void start(Stage stage) {
        Button b1 = new Button("Apple");
        Button b2 = new Button("Milk");
        Button b3 = new Button("Bread");
        b1.setOnAction(e -> add("Apple"));
        b2.setOnAction(e -> add("Milk"));
        b3.setOnAction(e -> add("Bread"));
        VBox root = new VBox(10, b1, b2, b3, display);
        stage.setScene(new Scene(root, 300, 200));
        stage.setTitle("Shopping Cart");
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
