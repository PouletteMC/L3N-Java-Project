package org.example.UI;

import javax.swing.*;
import java.awt.*;

public class UI {

    private JFrame frame;

    public UI() {
        frame = new JFrame("Hello, World!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());
    }

    public void addComponent(Component component) {
        frame.add(component);
    }

    public void removeComponent(Component component) {
        frame.remove(component);
    }

    public void show() {
        frame.setVisible(true);
    }

    public void hide() {
        frame.setVisible(false);
    }

}
