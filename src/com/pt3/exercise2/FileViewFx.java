package com.pt3.exercise2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FileViewFx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("file_view_fx.fxml"));
        Parent layout = loader.load();
        primaryStage.setTitle("File View");
        primaryStage.setScene(new Scene(layout));
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }

}
