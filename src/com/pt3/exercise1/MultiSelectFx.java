package com.pt3.exercise1;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MultiSelectFx extends Application implements EventHandler<ActionEvent> {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("multi_select_fx.fxml"));
        Parent layout = loader.load();
        primaryStage.setTitle("Multi Selection Lists");

        // Modify the ListView
        ListView listView = (ListView) layout.getChildrenUnmodifiable().get(0);
        listView.setItems(FXCollections.
                observableArrayList("Black", "Blue", "Cyan", "Dark Gray", "Gray", "Red", "Green", "Blue"));
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        primaryStage.setScene(new Scene(layout));
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {

    }
}
