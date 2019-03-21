package com.pt2.exercise3;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessGamePanel extends JPanel {
    private JLabel questionLabel;
    private JLabel questionLabel2;
    private JLabel resultLabel;
    private JTextField numberField;
    private JButton gameButton;
    private int randNum;

    public GuessGamePanel() {
        generateRandom();

        questionLabel = new JLabel("I have a number between 1 and a 1000.");
        questionLabel2 = new JLabel("Can you guess my number?");
        questionLabel.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 30));
        add(questionLabel);
        add(questionLabel2);

        resultLabel = new JLabel("Result Here. Enter Number.");
        resultLabel.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 0));
        add(resultLabel);
        numberField = new JTextField(5);
        numberField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkInput();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkInput();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkInput();
            }
        });
        add(numberField);

        gameButton = new JButton("New Game");
        gameButton.setMargin(new Insets(5, 20, 5, 20));
        gameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateRandom();
                numberField.setEditable(true);
            }
        });
        add(gameButton);
    }

    private void checkInput() {
        int input = 0;
        try {
            input = Integer.parseInt(numberField.getText());
        } catch (Exception exception) {
            resultLabel.setText("Wrong input! Numbers Only.");
        }

        if (input == randNum) {
            resultLabel.setText("Correct! Play Again.");
            GuessGamePanel.this.setBackground(new Color(0x58C862));
            numberField.setEditable(false);
        } else if (input > randNum) {
            resultLabel.setText("Too High ! Enter Number.");
            GuessGamePanel.this.setBackground(new Color(0xC8342F));
        } else  {
            resultLabel.setText("Too Low ! Enter Number.");
            GuessGamePanel.this.setBackground(new Color(0x5658C8));
        }
    }

    private void generateRandom() {
        Random random = new Random();
        randNum = random.nextInt(1000) + 1;
        System.out.println(randNum);
    }
}
