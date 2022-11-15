package org.example;

import javax.swing.*;

public class Main {
    JFrame frame = new JFrame("My First GUI");
    JButton button = new JButton("Click me");

    public Main() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.add(button);
    }

    public static void main(String[] args) {
        new Main();
    }
}