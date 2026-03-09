import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Main
{
public static void main(String[] arg)
{
JFrame f = new JFrame("Scalable v1.0");

JButton b = new JButton("OK");
JLabel l = new JLabel("Username:");
JTextField t = new JTextField(15);
JButton c = new JButton("Cancel");

JLabel l1 = new JLabel("Password:");
JPasswordField p = new JPasswordField(20);
p.setEchoChar('^');

JLabel notesLabel = new JLabel("Notes:");
JTextArea textArea = new JTextArea(5, 20); // 5 rows, 20 columns
JScrollPane scrollPane = new JScrollPane(textArea); // add scroll


// Radio buttons
JRadioButton r1 = new JRadioButton("Male");
JRadioButton r2 = new JRadioButton("Female");

// Group radio buttons
ButtonGroup group = new ButtonGroup();
group.add(r1);
group.add(r2);


// Checkboxes
JCheckBox c1 = new JCheckBox("Check A");
JCheckBox c2 = new JCheckBox("Check B");

// Panel to hold components
JPanel panel = new JPanel();
panel.add(c1);
panel.add(c2);




GroupLayout x = new GroupLayout(f.getContentPane());
f.getContentPane().setLayout(x);

x.setAutoCreateGaps(true);
x.setAutoCreateContainerGaps(true);

x.setHorizontalGroup(
x.createSequentialGroup()
.addGroup
(
x.createParallelGroup(GroupLayout.Alignment.LEADING)
.addComponent(l)
.addComponent(b)
.addComponent(l1)
.addComponent(notesLabel)
.addComponent(r1)
.addComponent(r2)
.addComponent(panel)
)
.addGroup
(
x.createParallelGroup(GroupLayout.Alignment.LEADING)
.addComponent(t)
.addComponent(c)
.addComponent(p)
.addComponent(scrollPane)
)
);


x.setVerticalGroup(
x.createSequentialGroup()
.addGroup
(
x.createParallelGroup(GroupLayout.Alignment.BASELINE)
.addComponent(l)
.addComponent(t)
)

.addGroup
(
x.createParallelGroup(GroupLayout.Alignment.BASELINE)
.addComponent(b)
.addComponent(c)
)

.addGroup
(
x.createParallelGroup(GroupLayout.Alignment.BASELINE)
.addComponent(l1)
.addComponent(p)
)


.addGroup
(
x.createParallelGroup(GroupLayout.Alignment.BASELINE)
.addComponent(notesLabel)
.addComponent(scrollPane)
)

.addGroup
(
x.createParallelGroup(GroupLayout.Alignment.BASELINE)
.addComponent(r1)
.addComponent(panel)
)

.addGroup
(
x.createParallelGroup(GroupLayout.Alignment.BASELINE)
.addComponent(r2)
.addComponent(panel)
)
);


f.pack();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);


/*
t.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String x = t.getText();
System.out.println(x);
}
});
*/


b.addMouseListener(new MouseAdapter()
{
public void mouseClicked(MouseEvent e)
{
String x = t.getText();
System.out.println(x);


String url = "jdbc:mysql://localhost:3306";
String user = "root";
String password ="";

try
{
Connection conn = DriverManager.getConnection(url, user, password);
System.out.println("Connected Successfully with MySQL Database Server!");


//PreparedStatement ps = conn.prepareStatement("SELECT * FROM student WHERE Roll>1");
//ps.setInt(1, 42); // sets the first "?" to 42


Statement y = conn.createStatement();
String sql1 = "show databases;";
ResultSet rs1 = y.executeQuery(sql1);

while(rs1.next())
{
String name1 = rs1.getString(1);
System.out.println(name1);
}



/*
Statement x1 = conn.createStatement();
String sql2 = "create database college15;";
x1.executeUpdate(sql2);
*/

Statement x2 = conn.createStatement();
String sql3 = "use college15;";
x2.executeUpdate(sql3);

Statement x101 = conn.createStatement();
String sql101 = "show tables;";
ResultSet rs2 = x101.executeQuery(sql101);
while(rs2.next())
{
String p = rs2.getString(1);
System.out.println(p);
}




/*
Statement x3 = conn.createStatement();
String sql4 = "create table student ( Roll integer, Name varchar(15), Address varchar(30));";
x3.executeUpdate(sql4);

Statement x5 = conn.createStatement();
String sql5 = "insert into student (Roll, Name, Address) values(1,'A','Kathmandu'),(2,'B','Kota'),(3,'C','New Delhi');";
x5.executeUpdate(sql5);
*/


Statement x6 = conn.createStatement();
String sql6 = "select * from student;";
ResultSet rs = x6.executeQuery(sql6);

while(rs.next())
{
int roll = rs.getInt("Roll");
String name = rs.getString("Name");
String address = rs.getString("Address");
System.out.println(name+" "+name+" "+address);
}

//rs.close();
//stmt1.close();

conn.close();
}
catch(SQLException d)
{
System.out.println("Connection Failed!");
d.printStackTrace();
}

}
});

/*
b.addKeyListener(new KeyAdapter()
{
public void keyPressed(KeyEvent e)
{
String x = t.getText();
System.out.println(x);
}
});


f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
f.dispose();
}
});


c.addMouseListener(new MouseAdapter()
{
public void mouseClicked(MouseEvent e)
{
t.setText("");
}
});


c.addKeyListener(new KeyAdapter()
{
public void keyPressed(KeyEvent e)
{
t.setText("Designed by Mr. X");
}
});


p.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
System.out.println(p.getPassword());
}
});

*/

}
}
