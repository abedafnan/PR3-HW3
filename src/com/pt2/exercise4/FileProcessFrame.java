package com.pt2.exercise4;

import javax.swing.*;

public class FileProcessFrame extends JFrame {

    private FileProcessPanel mainPanel;

    public FileProcessFrame(String title) {
        super(title);
        mainPanel = new FileProcessPanel();
        add(mainPanel);
        this.setSize(330, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        menuSetup();
    }

    public static void main(String[] args) {
        FileProcessFrame mainFrame = new FileProcessFrame("File Processing");
        mainFrame.setVisible(true);
    }

    public void menuSetup() {
        JMenuBar bar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Setup File menu
        JMenuItem openItem = new JMenuItem("Open", 'O');
        fileMenu.add(openItem);
//        openItem.addActionListener(this);
        openItem.setActionCommand("open");
        JMenuItem closeItem = new JMenuItem("Close", 'C');
        fileMenu.add(closeItem);
//        closeItem.addActionListener(this);
        closeItem.setActionCommand("close");
        JMenuItem ExitItem = new JMenuItem("Exit", 'x');
        fileMenu.add(ExitItem);
//        ExitItem.addActionListener(this);
        ExitItem.setActionCommand("exit");

        // Setup Edit menu
        JMenuItem fontItem = new JMenuItem("Font", 'F');
        editMenu.add(fontItem);
//        colorBlack.addActionListener(this);
        fontItem.setActionCommand("font");
        JMenuItem colorItem = new JMenuItem("Color", 'l');
        editMenu.add(colorItem);
//        colorBlue.addActionListener(this);
        colorItem.setActionCommand("color");

        // Add menus to the MenuBar
        bar.add(fileMenu);
        bar.add(editMenu);

        // Add the MenuBar to the frame
        this.setJMenuBar(bar);
    }
}
