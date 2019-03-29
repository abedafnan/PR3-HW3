package com.pt3.exercise2;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;

import javax.swing.*;
import java.awt.*;

public class FileViewController {

    @FXML
    TextArea fileArea;

    public void open() {

    }

    public void close() {
        fileArea.setText("");
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

    }
}
