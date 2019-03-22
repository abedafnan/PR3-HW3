package com.pt2.exercise4;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessFrame extends JFrame implements ActionListener {

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
        openItem.addActionListener(this);
        openItem.setActionCommand("open");
        JMenuItem closeItem = new JMenuItem("Close", 'C');
        fileMenu.add(closeItem);
        closeItem.addActionListener(this);
        closeItem.setActionCommand("close");
        JMenuItem ExitItem = new JMenuItem("Exit", 'x');
        fileMenu.add(ExitItem);
        ExitItem.addActionListener(this);
        ExitItem.setActionCommand("exit");

        // Setup Edit menu
        JMenuItem fontItem = new JMenuItem("Font", 'F');
        editMenu.add(fontItem);
        fontItem.addActionListener(this);
        fontItem.setActionCommand("font");
        JMenuItem colorItem = new JMenuItem("Color", 'l');
        editMenu.add(colorItem);
        colorItem.addActionListener(this);
        colorItem.setActionCommand("color");

        // Add menus to the MenuBar
        bar.add(fileMenu);
        bar.add(editMenu);

        // Add the MenuBar to the frame
        this.setJMenuBar(bar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCmd = e.getActionCommand();
        switch (actionCmd) {
            case "open":
                openFile();
                break;
            case "close":
                clearText();
                break;
            case "exit":
                System.exit(0);
                break;
            case "font":
                openFontDialog();
                break;
            case "color":
                openColorPicker();

        }
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Document", "txt");
        fileChooser.setFileFilter(filter);
        int result = fileChooser.showOpenDialog(getParent());

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                File selectedFile = fileChooser.getSelectedFile();
                FileReader fileReader = new FileReader(selectedFile);
                BufferedReader reader = new BufferedReader(fileReader);
                mainPanel.area.read(reader, "Opening a text file");
            } catch (IOException ioexception) {
                mainPanel.area.setText("File Not Found!");
            }
        }
    }

    private void clearText() {
        mainPanel.area.setText("");
        mainPanel.area.setEditable(false);
    }

    private void openFontDialog() {
        String[] fontSizes = {"10", "15", "20", "25", "30"};
        JComboBox<String> fontSizesCombo = new JComboBox<>(fontSizes);
        JOptionPane.showMessageDialog(null,
                fontSizesCombo, "Choose Font Size", JOptionPane.QUESTION_MESSAGE);
        int selectedSize = Integer.parseInt((String)fontSizesCombo.getSelectedItem());

        mainPanel.area.setFont(new Font("Sans Serif", Font.PLAIN, selectedSize));
    }

    private void openColorPicker() {
        Color fontColor = JColorChooser.showDialog(getParent(), "Choose Color", Color.black);
        mainPanel.area.setForeground(fontColor);
    }
}
