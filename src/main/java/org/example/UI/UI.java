package org.example.UI;
import javax.swing.*;
import java.awt.*;

/**
 * @author Eliot, Adam, Laura, Sebastian
 * @since 0.5
 * @deprecated 1.5
 */

public class UI {
    private JFrame frame;
    public UI() {
        frame = new JFrame("Mele Mele island");
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
    public void hide() { frame.setVisible(false); }
}
