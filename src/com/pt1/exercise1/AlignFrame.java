package com.pt1.exercise1;

import javax.swing.*;

public class AlignFrame extends JFrame {

    private AlignPanel mainPanel;

    public AlignFrame(String title) {
        super(title);
        mainPanel = new AlignPanel();
        add(mainPanel);
        this.setSize(350, 160);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        AlignFrame alignFrame = new AlignFrame("Align");
        alignFrame.setVisible(true);
    }
}

