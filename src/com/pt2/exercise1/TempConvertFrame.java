package com.pt2.exercise1;

import javax.swing.*;

public class TempConvertFrame extends JFrame {

    private TempConvertPanel mainPanel;

    public TempConvertFrame(String title) {
        super(title);
        mainPanel = new TempConvertPanel();
        add(mainPanel);
        this.setSize(330, 150);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        TempConvertFrame mainFrame = new TempConvertFrame("Temperature Converter");
        mainFrame.setVisible(true);
    }
}
