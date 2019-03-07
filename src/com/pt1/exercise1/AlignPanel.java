package com.pt1.exercise1;

import javax.swing.*;
import java.awt.*;

public class AlignPanel extends JPanel {
    private JPanel rightPanel;
    private JPanel centerPanel;
    private JPanel leftPanel;
    private JButton buttonOk;
    private JButton buttonCancel;
    private JButton buttonHelp;
    private JCheckBox snapCheckBox;
    private JCheckBox showCheckBox;
    private JLabel xLabel;
    private JLabel yLabel;
    private JTextField xTextField;
    private JTextField yTextField;

    public AlignPanel() {
        setLayout(new FlowLayout());
        rightPanel = new JPanel(new GridLayout(2, 1, 5, 0));
        rightPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        centerPanel = new JPanel(new GridLayout(2, 2, 0, 12));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        leftPanel = new JPanel(new GridLayout(3, 1, 5, 10));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        add(rightPanel);
        add(centerPanel);
        add(leftPanel);

        snapCheckBox = new JCheckBox("Snap to Grid");
        showCheckBox = new JCheckBox("Show Grid");
        rightPanel.add(snapCheckBox);
        rightPanel.add(showCheckBox);

        xLabel = new JLabel("X:");
        xTextField = new JTextField("8", 3);
        yLabel = new JLabel("Y:");
        yTextField = new JTextField("8", 3);
        centerPanel.add(xLabel);
        centerPanel.add(xTextField);
        centerPanel.add(yLabel);
        centerPanel.add(yTextField);

        buttonOk = new JButton("OK");
        buttonCancel = new JButton("Cancel");
        buttonHelp = new JButton("Help");
        leftPanel.add(buttonOk);
        leftPanel.add(buttonCancel);
        leftPanel.add(buttonHelp);

    }
}
