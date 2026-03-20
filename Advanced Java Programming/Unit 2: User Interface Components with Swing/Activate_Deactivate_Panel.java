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
p1.setLayout(null);
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


JLabel l1 = new JLabel("Name:");
l1.setBounds(5,5,125,30);
p1.add(l1);

JLabel l2 = new JLabel("Mobile:");
l2.setBounds(5,35,125,30);
p1.add(l2);

JTextField t1 = new JTextField(45);
t1.setBounds(67,5,125,30);
p1.add(t1);

JTextField t2 = new JTextField(45);
t2.setBounds(67,35,125,30);
p1.add(t2);


// -----Create internal frame--------

	JInternalFrame internal = new JInternalFrame("Internal Window", true, true, true, true);
	//internal.setLayout(null);
        internal.setBounds(15,75,300,250);
	internal.setVisible(true);

        // Create menu bar
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem closeItem = new JMenuItem("Close");
        closeItem.addActionListener(e -> internal.dispose());

        fileMenu.add(closeItem);
        menuBar.add(fileMenu);

        // Attach menu bar to internal frame
        internal.setJMenuBar(menuBar);

	p1.add(internal);   

//---------- Internal Frame Close ---------------


f.add(btn1);
f.add(btn2);
f.add(p1);

}
}
