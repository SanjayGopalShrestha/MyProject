import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main2
{
public static void main(String[] arg)
{
JFrame f = new JFrame("Scalable v1.0");
f.setLayout(null);
f.setSize(500,400);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);

JPanel p1 = new JPanel();
p1.setLayout(null);
p1.setBackground(Color.red);
p1.setBounds(100,200,100,100);
f.add(p1);

JButton b = new JButton("OK");
b.setBounds(10,10,70,50);
p1.add(b);

}
}
