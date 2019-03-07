package com.pt1.exercise2;

import javax.swing.*;
import java.awt.*;

public class CalculatorPanel extends JPanel {

    private JPanel keysPanel;
    private JTextField calcField;
    private JButton [] buttons;

    public CalculatorPanel() {
        keysPanel = new JPanel(new GridLayout(4,4, 5, 5));
        calcField = new JTextField("", 22);
        add(calcField);

        buttons = new JButton[16];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("0");
            buttons[i].setPreferredSize(new Dimension(51, 40));
        }
        buttons[0].setText("7");
        buttons[1].setText("8");
        buttons[2].setText("9");
        buttons[3].setText("/");
        buttons[4].setText("4");
        buttons[5].setText("5");
        buttons[6].setText("6");
        buttons[7].setText("*");
        buttons[8].setText("1");
        buttons[9].setText("2");
        buttons[10].setText("3");
        buttons[11].setText("-");
        buttons[12].setText("0");
        buttons[13].setText(".");
        buttons[14].setText("=");
        buttons[15].setText("+");

        for (JButton button : buttons) {
            keysPanel.add(button);
        }
        add(keysPanel);
    }
}
