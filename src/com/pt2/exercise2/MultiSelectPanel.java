package com.pt2.exercise2;

import javax.swing.*;
import java.awt.*;

public class MultiSelectPanel extends JPanel {

    private JButton copyButton;
    private JTextArea textArea;
    private JList<String> selectionList;

    public MultiSelectPanel() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        copyButton = new JButton("Copy>>>");
        textArea = new JTextArea(7, 12);

        String[] colorsList = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Red", "Green", "Blue"};
        selectionList = new JList<>(colorsList);
        selectionList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        selectionList.setVisibleRowCount(5);

        add(new JScrollPane(selectionList));
        add(copyButton);
        add(textArea);
    }
}
