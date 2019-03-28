package com.pt3.exercise1;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MultiSelectFx extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Multi Selection Lists");
        FlowPane layout = new FlowPane();
        primaryStage.setScene(new Scene(layout, 400, 180));
        primaryStage.show();
    }

    public static void main(String [] args) {
        launch(args);
    }
}
