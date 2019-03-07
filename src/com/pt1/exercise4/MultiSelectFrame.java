package com.pt1.exercise4;

import javax.swing.*;

public class MultiSelectFrame extends JFrame {

    private MultiSelectPanel MainPanel;

    public MultiSelectFrame(String title) {
        super(title);
        MainPanel = new MultiSelectPanel();
        add(MainPanel);
        this.setSize(400, 180);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        MultiSelectFrame mainFrame = new MultiSelectFrame("Multiple Selection Lists");
        mainFrame.setVisible(true);
    }
}
