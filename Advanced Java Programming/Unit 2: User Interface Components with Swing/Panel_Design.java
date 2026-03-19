import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Panel_Design
{
public static void main(String[] arg)
{
JFrame f = new JFrame("Scalable v1.0");
f.setLayout(null);
f.setSize(500,800);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);

JPanel p1 = new JPanel();
p1.setLayout(null);
p1.setBackground(Color.red);
p1.setBounds(21,100,127,600);
f.add(p1);

JButton b1 = new JButton("OK");
b1.setFont(new Font("Arial", Font.PLAIN, 15)); 
b1.setMargin(new Insets(0, 0, 0, 0));  // adjust size as needed
b1.setBounds(17,31,43,43);
p1.add(b1);

ImageIcon icon1 = new ImageIcon("button1.jpg");
JButton b2 = new JButton(icon1);
b2.setMargin(new Insets(0, 0, 0, 0));  // adjust size as needed
b2.setBounds(65,31,43,43);
p1.add(b2);

ImageIcon icon2 = new ImageIcon("button2.jpg");
JButton b3 = new JButton(icon2);
b3.setMargin(new Insets(0, 0, 0, 0));  // adjust size as needed
b3.setBounds(17,79,43,43);
p1.add(b3);

JButton b4 = new JButton("OK");
b4.setBounds(65,79,43,43);
p1.add(b4);

JPanel p2 = new JPanel();
p2.setLayout(null);
p2.setBackground(Color.blue);
p2.setBounds(18,489,93,91);
p1.add(p2);

JPanel p3 = new JPanel();
p3.setLayout(null);
p3.setBackground(Color.yellow);
p3.setBounds(5,5,83,43);
p2.add(p3);

JPanel p4 = new JPanel();
p4.setLayout(null);
p4.setBackground(Color.green);
p4.setBounds(5,43,83,43);
p2.add(p4);

/*
JButton b = new JButton("OK");
b.setBounds(10,10,70,50);
p1.add(b);

JButton b = new JButton("OK");
b.setBounds(10,10,70,50);
p1.add(b);

JButton b = new JButton("OK");
b.setBounds(10,10,70,50);
p1.add(b);

JButton b = new JButton("OK");
b.setBounds(10,10,70,50);
p1.add(b);
*/


}
}