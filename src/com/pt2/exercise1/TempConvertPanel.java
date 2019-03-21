package com.pt2.exercise1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempConvertPanel extends JPanel {

    private JLabel titleLabel;
    private JLabel resultLabel;
    private JLabel result2Label;
    private JTextField tempField;
    private JRadioButton fahRadio;
    private JRadioButton kelRadio;
    private String tempr;

    public TempConvertPanel() {
        titleLabel = new JLabel("Enter Celsius Temperature:");
        add(titleLabel);

        tempField = new JTextField(25);
        add(tempField);

        fahRadio = new JRadioButton("Fahrenheit");
        fahRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fahRadio.isSelected() || kelRadio.isSelected()) {

                }
                tempr = tempField.getText();
                resultLabel.setText("" + calculateFahTempr(tempr));
            }
        });

        kelRadio = new JRadioButton("Kelvin");
        kelRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tempr = tempField.getText();
                resultLabel.setText("" + calculateKelTempr(tempr));
            }
        });

        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(fahRadio);
        radioGroup.add(kelRadio);
        add(fahRadio);
        add(kelRadio);

        result2Label = new JLabel("New Temperature is: ");
        result2Label.setBorder(BorderFactory.createEmptyBorder(0,40,0,0));
        add(result2Label);

        resultLabel = new JLabel();
        resultLabel.setBorder(BorderFactory.createEmptyBorder(0,0,0,20));
        add(resultLabel);
    }

    public double calculateFahTempr(String celsTempr) {
        try {
            double tempr = Double.parseDouble(celsTempr);
            return tempr * 9 / 5 + 32;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public double calculateKelTempr(String celsTempr) {
        try {
            double tempr = Double.parseDouble(celsTempr);
            return tempr + 273.15;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

}
