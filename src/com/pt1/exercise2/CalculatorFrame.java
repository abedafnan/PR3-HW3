package com.pt1.exercise2;

import javax.swing.*;

public class CalculatorFrame extends JFrame {

    private CalculatorPanel calculatorPanel;

    public CalculatorFrame(String title) {
        super(title);
        calculatorPanel = new CalculatorPanel();
        add(calculatorPanel);
        this.setSize(250, 250);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        CalculatorFrame calculatorFrame = new CalculatorFrame("Calculator");
        calculatorFrame.setVisible(true);
    }
}
