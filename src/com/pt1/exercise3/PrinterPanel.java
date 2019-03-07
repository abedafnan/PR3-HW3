package com.pt1.exercise3;

import javax.swing.*;
import java.awt.*;

public class PrinterPanel extends JPanel {
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel midPanel;
    private JPanel belowPanel;
    private JButton buttonOk;
    private JButton buttonCancel;
    private JButton buttonSetup;
    private JButton buttonHelp;
    private JLabel panelLabel;
    private JLabel qualityLabel;
    private JComboBox<String> qualityCombo;
    private JCheckBox printCheckBox;
    private JCheckBox imageCheckBox;
    private JCheckBox textCheckBox;
    private JCheckBox codeCheckBox;
    private ButtonGroup radioGroup;
    private JRadioButton allRadioButton;
    private JRadioButton selectionRadioButton;
    private JRadioButton appletRadioButton;

    public PrinterPanel() {
        // Instantiate and add the two main panels
        leftPanel = new JPanel(new BorderLayout(5, 5));
        rightPanel = new JPanel(new GridLayout(4, 1, 5, 10));
        add(leftPanel);
        add(rightPanel);

        panelLabel = new JLabel("Printer:MyPrinter");
        leftPanel.add(panelLabel, BorderLayout.PAGE_START);
        midPanel = new JPanel(new GridLayout(3, 2, 5, 0));
        midPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
        leftPanel.add(midPanel, BorderLayout.CENTER);

        // Instantiate checkboxes
        imageCheckBox = new JCheckBox("Image");
        codeCheckBox = new JCheckBox("Code");
        textCheckBox = new JCheckBox("Text");
        // Instantiate radio buttons
        selectionRadioButton = new JRadioButton("Selection");
        allRadioButton = new JRadioButton("All");
        allRadioButton.setSelected(true);
        appletRadioButton = new JRadioButton("Applet");
        // Add radio buttons to the button group
        radioGroup = new ButtonGroup();
        radioGroup.add(selectionRadioButton);
        radioGroup.add(allRadioButton);
        radioGroup.add(appletRadioButton);
        // Add checkboxes and radio buttons to the panel
        midPanel.add(imageCheckBox);
        midPanel.add(selectionRadioButton);
        midPanel.add(textCheckBox);
        midPanel.add(allRadioButton);
        midPanel.add(codeCheckBox);
        midPanel.add(appletRadioButton);

        // Instantiate buttons
        buttonOk = new JButton("OK");
        buttonCancel = new JButton("Cancel");
        buttonSetup = new JButton("Setup...");
        buttonHelp = new JButton("Help");
        // Add buttons to the panel
        rightPanel.add(buttonOk);
        rightPanel.add(buttonCancel);
        rightPanel.add(buttonSetup);
        rightPanel.add(buttonHelp);

        belowPanel = new JPanel(new FlowLayout());
        leftPanel.add(belowPanel, BorderLayout.PAGE_END);
        // Add label to panel
        qualityLabel = new JLabel("Print Quality:");
        belowPanel.add(qualityLabel);
        // Add combo to panel
        String[] qualities = {"High", "Mid", "Low"};
        qualityCombo = new JComboBox<>(qualities);
        belowPanel.add(qualityCombo);
        // Add checkbox to panel
        printCheckBox = new JCheckBox("Print to File");
        belowPanel.add(printCheckBox);
    }
}
