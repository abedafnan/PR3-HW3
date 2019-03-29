package com.pt2.exercise2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class MultiSelectPanel extends JPanel {

    private JButton copyButton;
    private JTextArea textArea;
    private JList<String> selectionList;

    public MultiSelectPanel() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        textArea = new JTextArea(7, 12);

        copyButton = new JButton("Copy>>>");
        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List<String> selectedItems = selectionList.getSelectedValuesList();
                if (selectedItems.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "No Items Selected!", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    textArea.setText("");
                    for (String s: selectedItems) {
                        textArea.append(s + "\n");
                    }
                }
            }
        });

        String[] colorsList = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Red", "Green", "Blue"};
        selectionList = new JList<>(colorsList);
        selectionList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        selectionList.setVisibleRowCount(5);

        add(new JScrollPane(selectionList));
        add(copyButton);
        add(textArea);
    }
}
