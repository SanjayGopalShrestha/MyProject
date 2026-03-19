/* This program creates a JFrame and creates a JPanel named p1 and adds sub JPanels p2,....,p10 in p1 JPanel.*/
/* All components are inside related JPanels p1,...,p10 */

import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Panel_Dialog_Demo
{
public static void main(String[] arg)
{
JFrame f = new JFrame("Scalable v1.0");
f.setLayout(null);


JPanel p1 = new JPanel();
p1.setLayout(null);
p1.setBounds(50,50,50,50);
p1.setBackground(Color.decode("#FFFFFF"));

JPanel p2 = new JPanel();
p2.setBounds(150,100,100,100);
p2.setBackground(Color.RED);
JLabel l = new JLabel("Buttons:");
JButton b = new JButton("OK");
JButton c = new JButton("Cancel");
p2.add(l);
p2.add(b);
p2.add(c);
p1.add(p2);


JPanel p3 = new JPanel();
p3.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
p3.setBounds(200,150,150,150);
p3.setBackground(Color.WHITE);
JLabel l1 = new JLabel("Qualification:");
JCheckBox c1 = new JCheckBox("SEE");
JCheckBox c2 = new JCheckBox("+2");
JCheckBox c3 = new JCheckBox("Bachelor");

p3.add(l1);
p3.add(c1);
p3.add(c2);
p3.add(c3);
p1.add(p3);

JPanel p4 = new JPanel();
p4.setBounds(250,200,200,200);
p4.setBackground(Color.YELLOW);
JLabel l2 = new JLabel("Hello!");
p4.add(l2);
p1.add(p4);

JPanel p5 = new JPanel();
p5.setBounds(300,250,250,250);
p5.setBackground(Color.GRAY);
JLabel l3 = new JLabel("Nepal");
p5.add(l3);
p1.add(p5);

//-------Creates ComboBox-----------

JPanel p6 = new JPanel();
p6.setBounds(650,250,250,75);
p6.setBackground(Color.BLUE);
 String[] courses = {"BCA", "BSc", "BCom", "BA"};
        JComboBox<String> comboBox = new JComboBox<>(courses);

        JLabel comboLabel = new JLabel("Selected: BCA");
	comboLabel.setForeground(Color.WHITE);

        comboBox.addActionListener(e -> {
            String selected = (String) comboBox.getSelectedItem();
            comboLabel.setText("Selected: " + selected);
        });
p6.add(comboBox);
p6.add(comboLabel);
p1.add(p6);
//---------ComboBox Close------------


JPanel p7 = new JPanel();
p7.setBounds(900,250,250,75);
p7.setBackground(Color.MAGENTA);
        // ---------- Slider ----------
        JSlider slider = new JSlider(0, 100, 50); // min, max, initial
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JLabel sliderLabel = new JLabel("Value: 50");

        slider.addChangeListener(e -> {
            sliderLabel.setText("Value: " + slider.getValue());
        });
p7.add(slider);
p7.add(sliderLabel);
p1.add(p7);


// ---------- Create JSpinner ----------

JPanel p8 = new JPanel();
p8.setBounds(900,450,150,75);
p8.setBackground(Color.decode("#FFCCAA"));
  
        SpinnerNumberModel numberModel = new SpinnerNumberModel(
            0,   // initial value
            0,   // minimum
            100, // maximum
            1    // step
        );

        JSpinner spinner = new JSpinner(numberModel);

        JLabel label = new JLabel("Selected value: 0");

        // ---------- Add change listener ----------
        spinner.addChangeListener(e -> {
            int value = (int) spinner.getValue();
            label.setText("Selected value: " + value);
        });

// ---------- Add components to frame ----------

p1.add(p8);
p8.add(spinner);
p8.add(label);
//---------Close JSpinner--------------


// -----Create internal frame--------

JPanel p9 = new JPanel();
p9.setLayout(null);
p9.setBounds(900,650,250,150);
p9.setBackground(Color.decode("#FFCCAA"));

        JInternalFrame internal = new JInternalFrame(
                "Internal Window", true, true, true, true);
        internal.setSize(215,135);
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

p1.add(p9);
p9.add(internal);

//---------- Internal Frame Close ---------------


//----create Basic table----- 

JPanel p10 = new JPanel();
p10.setBackground(Color.RED);
p10.setBounds(120,550,540,100);

        // Table Data
        String[][] data = {
            {"1", "Alice", "20"},
            {"2", "Bob", "22"},
            {"3", "Charlie", "19"}
        };

        // Column Names
        String[] columnNames = {"ID", "Name", "Age"};

        // Create JTable
        JTable table = new JTable(data, columnNames);

        // Add table to scroll pane
        JScrollPane scrollPane = new JScrollPane(table);

p10.add(scrollPane);
p1.add(p10);

//----Table Close-------



//----create JTable with Table Model (Editable, Dynamic Data)----- 

//Needs Class: import javax.swing.table.DefaultTableModel;

JPanel p11 = new JPanel();
p11.setBackground(Color.GREEN);
p11.setBounds(120, 675, 540, 150);
p11.setLayout(new BorderLayout()); // Make table expand

// Table Model
DefaultTableModel model = new DefaultTableModel();
model.addColumn("ID");
model.addColumn("Name");
model.addColumn("Age");

// Add rows
model.addRow(new Object[]{1, "Alice", 20});
model.addRow(new Object[]{2, "Bob", 22});
model.addRow(new Object[]{3, "Charlie", 19});

// JTable
JTable table1 = new JTable(model);
table1.setRowHeight(15); // more readable

// Optional: set column widths (in pixels), don't use values less than 50, effects are not seen properly
table1.getColumnModel().getColumn(0).setPreferredWidth(100);
table1.getColumnModel().getColumn(1).setPreferredWidth(150);
table1.getColumnModel().getColumn(2).setPreferredWidth(50);

// Scroll pane
JScrollPane scrollPane1 = new JScrollPane(table1);

// Add scroll pane to panel
p11.add(scrollPane1, BorderLayout.CENTER);
p1.add(p11);

//----JTable with Table Model Close-------


/*

Advantages of Using DefaultTableModel
=====================================

Add or remove rows dynamically:
==============================

model.addRow(new Object[]{4, "David", 21});
model.removeRow(0);

Control whether cells are editable:
==================================

@Override
public boolean isCellEditable(int row, int column) {
    return column != 0; // ID column not editable
}

3. Customizing JTable
=====================

Set column width:
================

table.getColumnModel().getColumn(0).setPreferredWidth(50);

Set row height:
===============

table.setRowHeight(25);

Set selection mode:
==================

table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

Change colors & fonts:
======================

table.setBackground(Color.LIGHT_GRAY);
table.setForeground(Color.BLUE);
table.setFont(new Font("Arial", Font.BOLD, 14));

*/


//------------Create Tree--------------------
//Needs Class: import javax.swing.tree.DefaultMutableTreeNode;

JPanel p12 = new JPanel();
p12.setBackground(Color.GREEN);
p12.setBounds(120, 831, 300, 100);
p12.setLayout(new BorderLayout()); // Make table expand
// Root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Computer");

        // Child nodes
        DefaultMutableTreeNode cDrive = new DefaultMutableTreeNode("C Drive");
        DefaultMutableTreeNode dDrive = new DefaultMutableTreeNode("D Drive");

        root.add(cDrive);
        root.add(dDrive);

        // Add files
        cDrive.add(new DefaultMutableTreeNode("File1.txt"));
        cDrive.add(new DefaultMutableTreeNode("File2.txt"));
        dDrive.add(new DefaultMutableTreeNode("Movie.mp4"));

        // Create tree
        JTree tree = new JTree(root);

      

// Scroll pane
JScrollPane scrollPane12 = new JScrollPane(tree);

// Add scroll pane to panel
p12.add(scrollPane12, BorderLayout.CENTER);
p1.add(p12);
//-------------Tree Close------------



// --------------Popup Menu Open------------------
 JPanel panel = new JPanel();
panel.setLayout(null);
panel.setBounds(620,831,300, 200); 
        
        // Create popup menu
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem item1 = new JMenuItem("Option 1");
        JMenuItem item2 = new JMenuItem("Option 2");

        popupMenu.add(item1);
        popupMenu.add(item2);

        // Add mouse listener to show popup
        panel.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger())
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
            }

            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger())
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
            }
        });
p1.add(panel);
        //f.add(panel);

//------------Popup Menu Close------------------


f.setContentPane(p1);
f.setSize(1200,2000);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
f.setVisible(true);

}
}
