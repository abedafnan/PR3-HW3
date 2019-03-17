package com.pt2.exercise1;

import javax.swing.*;

public class TempConvertPanel extends JPanel {

    private JLabel titleLabel;
    private JLabel resultLabel;
    private JTextField tempField;
    private JRadioButton fahRadio;
    private JRadioButton kelRadio;

    public TempConvertPanel() {
        titleLabel = new JLabel("Enter Celsius Temperature:");
        add(titleLabel);

        tempField = new JTextField(25);
        add(tempField);

        fahRadio = new JRadioButton("Fahrenheit");
        kelRadio = new JRadioButton("Kelvin");
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(fahRadio);
        radioGroup.add(kelRadio);
        add(fahRadio);
        add(kelRadio);

        resultLabel = new JLabel("New Temperature is: ");
        resultLabel.setBorder(BorderFactory.createEmptyBorder(0,20,0,20));
        add(resultLabel);
    }

}
