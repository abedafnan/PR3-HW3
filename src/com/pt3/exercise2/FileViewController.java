package com.pt3.exercise2;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextArea;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileViewController {

    @FXML
    TextArea fileArea;

    public void open() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        File selectedFile = fileChooser.showOpenDialog(new Stage());
        fileArea.setEditable(true);

        if (selectedFile != null) {
            try {
                Scanner scanner = new Scanner(selectedFile);
                while (scanner.hasNextLine()) {
                    String s = scanner.nextLine();
                    fileArea.appendText(s);
                }
                scanner.close();
            } catch (IOException ioexception) {
                fileArea.setText("File Not Found!");
            }
        }
    }

    public void close() {
        fileArea.setText("");
        fileArea.setEditable(false);
    }

    public void exit() {
        System.exit(0);
    }

    public void chooseFont() {
        String[] fontSizes = {"10", "15", "20", "25", "30"};
        JComboBox<String> fontSizesCombo = new JComboBox<>(fontSizes);
        JOptionPane.showMessageDialog(null,
                fontSizesCombo, "Choose Font Size", JOptionPane.QUESTION_MESSAGE);
        int selectedSize = Integer.parseInt((String)fontSizesCombo.getSelectedItem());

        fileArea.setFont(new Font("Sans Serif", selectedSize));
    }

    public void chooseColor() {
        String [] colorsList = {"Red", "Green", "Blue", "Black"};
        ChoiceDialog choiceDialog = new ChoiceDialog(colorsList[3], colorsList);
        choiceDialog.setTitle("Color Selection");
        choiceDialog.setContentText("Available Colors");
        choiceDialog.setHeaderText("Select the color from list");
        choiceDialog.show();

        String selectedColor = (String) choiceDialog.getSelectedItem();
        selectedColor = selectedColor.toLowerCase();
        Text text = new Text(fileArea.getText());
        switch (selectedColor) {
            case "red":
                text.setFill(Color.RED);
                break;
            case "Blue":
                text.setFill(Color.BLUE);
                break;
            case "Green":
                text.setFill(Color.GREEN);
                break;
            case "Black":
                text.setFill(Color.BLACK);
                break;
        }
    }
}
