package com.pt2.exercise3;

import javax.swing.*;
import java.awt.*;

public class GuessGamePanel extends JPanel {
    private JLabel questionLabel;
    private JLabel questionLabel2;
    private JLabel resultLabel;
    private JTextField numberField;
    private JButton gameButton;

    public GuessGamePanel() {
        this.setBackground(Color.RED);

        questionLabel = new JLabel("I have a number between 1 and a 1000.");
        questionLabel2 = new JLabel("Can you guess my number?");
        add(questionLabel);
        add(questionLabel2);

        resultLabel = new JLabel("Result Here. Enter Number.");
        add(resultLabel);
        numberField = new JTextField(5);
        add(numberField);

        gameButton = new JButton("New Game");
        add(gameButton);
    }
}
