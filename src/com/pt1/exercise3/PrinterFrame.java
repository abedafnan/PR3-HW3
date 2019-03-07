package com.pt1.exercise3;

import com.pt1.exercise1.AlignFrame;
import com.pt1.exercise1.AlignPanel;

import javax.swing.*;

public class PrinterFrame extends JFrame {

    private PrinterPanel mainPanel;

    public PrinterFrame(String title) {
        super(title);
        mainPanel = new PrinterPanel();
        add(mainPanel);
        this.setSize(400, 190);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        PrinterFrame mainFrame = new PrinterFrame("Printer");
        mainFrame.setVisible(true);
    }
}
