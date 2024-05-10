
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