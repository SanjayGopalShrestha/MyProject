import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Chooser Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Choose Color");

        button.addActionListener(e -> {
            Color selectedColor = JColorChooser.showDialog(
                    frame, "Pick a Color", Color.WHITE);

            if (selectedColor != null) {
                frame.getContentPane().setBackground(selectedColor);
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
