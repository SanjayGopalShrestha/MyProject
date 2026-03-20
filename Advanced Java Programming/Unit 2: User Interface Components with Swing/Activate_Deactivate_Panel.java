import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rough
{
public static void main(String[] arg)
{
JFrame f = new JFrame("Scalable v1.0");
f.setLayout(null);
f.setSize(1200,1500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);


JPanel p1 = new JPanel();
p1.setBounds(50,91,500,400);
p1.setBackground(Color.RED);


JButton btn1 = new JButton("Close");
btn1.setBounds(50, 50, 71, 30);
JButton btn2 = new JButton("Open");
btn2.setBounds(123, 50, 71, 30);


btn1.addActionListener(new ActionListener()
{
    public void actionPerformed(ActionEvent e1)
    {
        p1.setVisible(false);  		// hide
	//p1.setVisible(true);   	// show again
    }
});


btn2.addActionListener(new ActionListener()
{
    public void actionPerformed(ActionEvent e2)
    {
        //p1.setVisible(false);  	// hide
	p1.setVisible(true);   		// show again
    }
});


f.add(btn1);
f.add(btn2);
f.add(p1);

}
}
