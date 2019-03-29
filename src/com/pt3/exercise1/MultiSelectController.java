package com.pt3.exercise1;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javax.swing.*;

import java.util.List;

public class MultiSelectController {

    @FXML
    ListView colorsList;
    @FXML
    TextArea copiedItemsList;

    // Called when the copy button is clicked
    public void copy() {
        ObservableList<String> selectedItems = colorsList.getSelectionModel().getSelectedItems();
        if (selectedItems.isEmpty()) {
            JOptionPane.showMessageDialog(null,
                    "No Items Selected!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            copiedItemsList.setText("");
            for (String s: selectedItems) {
                copiedItemsList.appendText(s + "\n");
            }
        }
    }

}
