package com.pt3.exercise2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FileViewFx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("file_view_fx.fxml"));
        Parent layout = loader.load();
        primaryStage.setTitle("File View");

        TextArea area = (TextArea) layout.getChildrenUnmodifiable().get(1);
        area.setEditable(false);
        area.setWrapText(true);

        primaryStage.setScene(new Scene(layout));
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }

}
