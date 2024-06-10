# TAREA-1-RETS


  **IMAGEN DE LA EJECUCIÓN DEL PROYECTO**
<img width="960" alt="Captura_ejecutada" src="https://github.com/ToalaSanRi/TAREA-1-RETS/assets/169106800/aa37d409-3edd-4ecc-80e9-44d46b97af6a">

package application;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.collections.FXCollections;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Layout RETS");

        BorderPane root = new BorderPane();

        ListView<StackPane> leftListView = new ListView<>();
        leftListView.setItems(FXCollections.observableArrayList(
                createLabeledBox("  Ricardo Toalin"),
                createLabeledBox("  Marilyn Villon"),
                createLabeledBox("  Maria Santana"),
                createLabeledBox("  Enrique Martinez"),
                createLabeledBox("  Alberto Cerezo")
        ));
        leftListView.setPrefSize(200, 300);

        ScrollPane leftScrollPane = new ScrollPane(leftListView);
        leftScrollPane.setFitToWidth(true);
        leftScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        leftScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        ListView<String> blackListView = new ListView<>();
        blackListView.setItems(FXCollections.observableArrayList("Item 1", "Item 2", "Item 3"));
        blackListView.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        blackListView.setPrefSize(200, 200);

        TextField blueTextField = new TextField();
        blueTextField.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
        blueTextField.setPrefSize(100, 50);

        BorderPane leftPane = new BorderPane();
        leftPane.setCenter(leftScrollPane);

        BorderPane rightPane = new BorderPane();
        rightPane.setTop(blackListView);
        rightPane.setBottom(blueTextField);
        BorderPane.setMargin(blackListView, new Insets(10));
        BorderPane.setMargin(blueTextField, new Insets(10));

        root.setLeft(leftPane);
        root.setRight(rightPane);

        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private StackPane createLabeledBox(String labelText) {
        Label label = new Label(labelText);

        Rectangle innerBorder = new Rectangle(20, 20);
        innerBorder.setFill(null);
        innerBorder.setStroke(Color.BLACK);

        HBox hBox = new HBox();
        hBox.getChildren().addAll(innerBorder, label);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(hBox);
        return stackPane;
    }
}



                -- COMPONENTES DEL CÓDIGO --

**Clase Main que extiende Application:** Esta es la clase principal de la aplicación que extiende la clase javafx.application.Application y proporciona el método start() que JavaFX invoca al iniciar la aplicación.

**Método main:** Este método inicia la aplicación JavaFX invocando el método launch() con los argumentos proporcionados.

**Método start():** Este método es donde se construye la interfaz gráfica de la aplicación.

**BorderPane:** Se utiliza como el contenedor principal de la interfaz de usuario. Permite organizar los nodos en cinco áreas: arriba, abajo, izquierda, derecha y centro.

**ListView:** Se utilizan dos ListView. Uno en el lado izquierdo y otro en el lado derecho. Un ListView es una lista vertical de elementos desplazables. El lado izquierdo muestra una lista de StackPane, cada uno conteniendo un Label con un nombre. El lado derecho muestra una lista de strings con un fondo negro y texto blanco.

**ScrollPane:** Se utiliza para permitir el desplazamiento vertical en el ListView del lado izquierdo.

**TextField:** Un campo de texto que aparece en la parte inferior del lado derecho con un fondo azul y texto blanco.

**Rectángulo y Label dentro de un StackPane:** El método createLabeledBox() crea un StackPane que contiene un rectángulo y un Label dentro de un HBox. Este método se utiliza para crear elementos individuales en el ListView del lado izquierdo.
