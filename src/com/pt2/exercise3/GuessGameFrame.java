package com.pt2.exercise3;

import javax.swing.*;

public class GuessGameFrame extends JFrame {
    private GuessGamePanel mainPanel;

    public GuessGameFrame(String title) {
        super(title);
        mainPanel = new GuessGamePanel();
        add(mainPanel);
        this.setSize(330, 150);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        GuessGameFrame mainFrame = new GuessGameFrame("Guessing Game");
        mainFrame.setVisible(true);
    }
}
