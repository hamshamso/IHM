package serie3;

import javafx.application.Application; // Import JavaFX
import javafx.event.Event; // Import pour creer un evenement personnalise
import javafx.event.EventHandler; // Import pour gerer les evenements
import javafx.event.EventType; // Import pour definir le type d’evenement
import javafx.scene.Scene; // Import pour la scene principale
import javafx.scene.control.Button; // Import pour les boutons
import javafx.scene.layout.VBox; // Import pour panneau vertical
import javafx.scene.text.Text; // Import pour afficher du texte
import javafx.stage.Stage; // Import pour la fenetre

// Definition d’un evenement personnalise pour l’animal
class PetEvent extends Event {
    private final String action; // Action effectuee sur l’animal
    public static final EventType<PetEvent> PER =
    new EventType<>(Event.ANY, "PET_EVENT"); // Type d’evenement personnalise
    public PetEvent(String x) {// Constructeur
        super(PER); // Call the parent class constructor  [EVENT]
        action = x; // Stocke l’action
    }
    public String getAction() {
        return action; // Retourne l’action
    }
}
public class ex13 extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10); // Panneau vertical avec espacement
        Text status = new Text("Votre animal virtuel est là!"); // Texte affichant l’état
        // Boutons pour interagir avec l’animal
        Button feedBtn = new Button("Nourrir");
        Button playBtn = new Button("Jouer");
        Button petBtn = new Button("Caresser");
        // Gestionnaire d’evenements personnalises
        EventHandler<PetEvent> handler = e -> {
    switch (e.getAction()) { // Selon l’action
        case "feed":
            status.setText("L’animal est nourri!");
            break;
        case "play":
            status.setText("L’animal joue!");
            break;
        case "pet":
            status.setText("L’animal est caressé!");
            break;
        }   
       System.out.println("Action: " + e.getAction()); // Affiche l’action dans la console
    };


        // Ajout du gestionnaire au texte
        status.addEventHandler(PetEvent.PER, handler);

        // Les boutons declenchent l’evenement personnalise
        feedBtn.setOnAction(e -> status.fireEvent(new PetEvent("feed")));
        playBtn.setOnAction(e -> status.fireEvent(new PetEvent("play")));
        petBtn.setOnAction(e -> status.fireEvent(new PetEvent("pet")));

        // Ajout des composants
        root.getChildren().addAll(status, feedBtn, playBtn, petBtn);

        // Creation de la scene
        Scene scene = new Scene(root, 250, 200);
        primaryStage.setScene(scene); // Ajout de la scene a la fenetre
        primaryStage.setTitle("Animal virtuel avec evenements personalises"); // Titre
        primaryStage.show(); // Affiche la fenetre
    }

    public static void main(String[] args) {
        launch(args); // Lancement de l’application
    }
}
