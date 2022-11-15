package org.example;

import javax.swing.*;
import java.awt.*;

public class Gui {
    public static void main(String[] args) {
        // Create a new JFrame container.
        JFrame frame = new JFrame("Test window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        JButton button = new JButton("Click me");
        JButton button2 = new JButton("Click me too");
        JButton button3 = new JButton("Click me three");

        // Create a new panel
        JPanel panel = new JPanel();
        // Set the layout manager
        panel.setLayout(new FlowLayout());
        // Add the buttons to the panel
        panel.add(button);
        panel.add(button2);
        panel.add(button3);

        // Add the panel to the frame
        frame.getContentPane().add(panel);
        // Set the size of the frame to fit the panel
        frame.pack();
        // Show the frame
        frame.setVisible(true);
    }
}
