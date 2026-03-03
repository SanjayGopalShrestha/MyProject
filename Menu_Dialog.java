import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;


public class Menu_Dialog
{
public static void main(String[] arg)
{
JFrame f = new JFrame("Scalable v1.0");

f.setLayout(new FlowLayout());

JTextArea textArea = new JTextArea();

JMenuBar menubar = new JMenuBar();

JMenu file = new JMenu("File");
JMenu edit = new JMenu("Edit");
JMenu insert = new JMenu("Insert");

ImageIcon newicon = new ImageIcon("1.jpg");

file.setMnemonic(KeyEvent.VK_F); 


JMenuItem item1 = new JMenuItem("New", newicon);
item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));

        // Add ActionListener
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(f);

                if (result == JFileChooser.APPROVE_OPTION) {
                    System.out.println("Selected File: " +
                        fileChooser.getSelectedFile().getAbsolutePath());
                }
            }
        });

JMenuItem item2 = new JMenuItem("Open");
JMenuItem item3 = new JMenuItem("Close");
JMenuItem item4 = new JMenuItem("Exit");

JMenuItem item5 = new JMenuItem("Cut");
JMenuItem item6 = new JMenuItem("Copy");
JMenuItem item7 = new JMenuItem("Paste");


JCheckBoxMenuItem item11 = new JCheckBoxMenuItem("Show Toolbar");
JCheckBoxMenuItem item12 = new JCheckBoxMenuItem("Show Status Bar");

JRadioButtonMenuItem item13 = new JRadioButtonMenuItem("Light Mode");
JRadioButtonMenuItem item14 = new JRadioButtonMenuItem("Dark Mode");

// Group radio buttons
ButtonGroup modeGroup = new ButtonGroup();
modeGroup.add(item13);
modeGroup.add(item14);


JMenuItem item8 = new JMenuItem("Picture");
JMenuItem item9 = new JMenuItem("Audio");
JMenuItem item10 = new JMenuItem("Video");


file.add(item1);
file.add(item2);
file.add(item3);
file.addSeparator();
file.add(item4);

edit.add(item5);
edit.add(item6);
edit.addSeparator();
edit.add(item7);

insert.add(item8);
insert.add(item9);
insert.add(item10);
insert.add(item11);
insert.add(item12);
insert.add(item13);
insert.add(item14);

menubar.add(file);
menubar.add(edit);
menubar.add(insert);




JToolBar tool = new JToolBar();

JButton n = new JButton ("New");
JButton s = new JButton ("Save");
JButton p = new JButton ("Open");

tool.add(n);
tool.add(s);
tool.add(p);

//f.add(tool,"North");

JPanel topPanel = new JPanel();
topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));

topPanel.add(tool);      // Toolbar first
topPanel.add(menubar);   // Menu below it
 
//f.add(topPanel, BorderLayout.NORTH);



/*

JToolBar tool = new JToolBar();

JButton n = new JButton ("New");
JButton s = new JButton ("Save");
JButton p = new JButton ("Open");

tool.add(n);
tool.add(s);
tool.add(p);

f.add(tool,"North");

*/




f.add(topPanel);
f.add(new JScrollPane(textArea));
f.add(new JScrollPane(textArea));



JButton b = new JButton("OK");
f.add(b);



b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
JDialog d = new JDialog(f, "New", true);

JLabel l = new JLabel("Hello! Dialog");
l.setBounds(40, 30, 150, 30);
d.add(l);

d.setLayout(null);
d.setSize(200,100);
d.setVisible(true);


}
});




JOptionPane.showMessageDialog(null, 
"Hello, this is a message!");




JOptionPane.showMessageDialog(null, "Info Message", "Title",
        JOptionPane.INFORMATION_MESSAGE);

JOptionPane.showMessageDialog(null, "Warning Message", "Title",
        JOptionPane.WARNING_MESSAGE);

JOptionPane.showMessageDialog(null, "Error Message", "Title",
        JOptionPane.ERROR_MESSAGE);




int result = JOptionPane.showConfirmDialog(null,
        "Are you sure?",
        "Confirm",
        JOptionPane.YES_NO_OPTION);

if (result == JOptionPane.YES_OPTION) 
{
    System.out.println("User clicked Yes");
}



String name = JOptionPane.showInputDialog("Enter your name:");

if (name != null) 
{
    System.out.println("Hello " + name);
}


//

Object[] options = {"Yes", "No", "Cancel"};

int choice = JOptionPane.showOptionDialog(null,
        "Choose an option:",
        "Custom Dialog",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        options,
        options[0]);

System.out.println("Selected: " + choice);


//Open File Example
JButton button = new JButton("Open File");
        f.add(button);

        button.addActionListener(e -> {

            JFileChooser fileChooser = new JFileChooser();

            int result1 = fileChooser.showOpenDialog(f);

            if (result1 == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();

try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
                    textArea.read(br, null);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(f,
                            "Error opening file!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

               }
        });



ImageIcon icon = new ImageIcon("E:/jtest/2.jpg");

JOptionPane.showMessageDialog(null,"This is your image:",
                "Image Dialog",
                JOptionPane.INFORMATION_MESSAGE,
                icon
        );

JButton b1 = new JButton("Click");   
b1.setBounds(200,100,50,60);
f.add(b1); 

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
JDialog d = new JDialog(f,"Save As",true);
//d.setLayout(null);

JPanel p1 = new JPanel();
p1.setLayout(new GridLayout(0, 1));
JLabel l = new JLabel("Gender:");
d.add(p1);

JPanel p2 = new JPanel();
p2.setLayout(new GridLayout(0, 1));

JCheckBox c1 = new JCheckBox("Male");
JCheckBox c2 = new JCheckBox("Female");



JRadioButton r1 = new JRadioButton("Male");
JRadioButton r2 = new JRadioButton("Female");
ButtonGroup group = new ButtonGroup();
group.add(r1);
group.add(r2);


p2.add(c1);
p2.add(c2);
p2.add(r1);
p2.add(r2);

d.add(p2);

d.pack();

//d.setSize(300,200);
d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
d.setVisible(true);

}
});



f.setSize(300,200);
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}



