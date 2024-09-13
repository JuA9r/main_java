package main;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main {
    public static void main(String[] args){

        JFrame frame = new JFrame("sample app");

        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        label.setVerticalAlignment(JLabel.TOP);
        frame.add(label);
    }
}