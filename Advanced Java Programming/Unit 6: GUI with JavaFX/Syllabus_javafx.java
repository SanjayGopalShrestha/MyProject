/*
To Run
======
Download XAMPP from: https://www.apachefriends.org/
Start Apache
Start MySQL

Go to: https://gluonhq.com/products/javafx/ 
Download: "javafx-sdk-17.0.18" framework (library) 
Save it in C:\
Add the .jar files to your classpath when compiling and running as below for windows

E:\jtest>javac --module-path "C:\javafx-sdk-17.0.18\lib" --add-modules javafx.controls,javafx.fxml Syllabus_javafx.java

E:\jtest>java --module-path "C:\javafx-sdk-17.0.18\lib" --add-modules javafx.controls,javafx.fxml -cp ".;C:\jdbc\mysql-connector-j-9.5.0\mysql-connector-j-9.5.0.jar" Syllabus_javafx
Connection Successful!
*/


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.Region;
import javafx.event.Event;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
//import java.io.File; 
import javafx.stage.FileChooser;

public class Syllabus_javafx extends Application
{
    public void start(Stage stage)
    {
Pane p0 = new Pane();
p0.setPrefSize(200, 150);
p0.setMaxWidth(200);
p0.setMaxHeight(150);
p0.setStyle("-fx-background-color: lightblue;");
//p0.setLayoutX(47);  		// X position
//p0.setLayoutY(41);   		// Y position


Label l = new Label("Username:     ");
        TextField t = new TextField();
        t.setPrefColumnCount(11);
	t.setMaxWidth(Region.USE_PREF_SIZE);
	l.setLayoutX(7);  	// X position
	l.setLayoutY(11);   	// Y position	
	t.setLayoutX(7);  	// X position
	t.setLayoutY(31);	// Y position 	
	
        p0.getChildren().addAll(l,t);



Pane p1 = new Pane();
p1.setPrefSize(300, 200); 
p1.setMaxWidth(300);
p1.setMaxHeight(200);
p1.setStyle("-fx-background-color: red;");
//p1.setLayoutX(7);  		// X position
//p1.setLayoutY(300);   	// Y position



Label l1 = new Label("Mobile: ");
l1.setLayoutX(7);  		// X position
l1.setLayoutY(11);   		// Y position
p1.getChildren().add(l1);


TextField t1 = new TextField();
t1.setPrefColumnCount(9);
t1.setLayoutX(47);  		// X position
t1.setLayoutY(11);   		// Y position
p1.getChildren().add(t1);
	


Pane p2 = new Pane();
p2.setPrefSize(300, 200); 
p2.setMaxWidth(300);
p2.setMaxHeight(200);
p2.setStyle("-fx-background-color: magenta;");


// Buttons
Button b = new Button("OK");
b.setLayoutX(47);  		// X position
b.setLayoutY(11);   		// Y position
p2.getChildren().add(b);


// RadioButtons in a ToggleGroup
RadioButton rb1 = new RadioButton("Male");
RadioButton rb2 = new RadioButton("Female");
rb1.setLayoutX(47);  		// X position
rb1.setLayoutY(67);   		// Y position
rb2.setLayoutX(47);  		// X position
rb2.setLayoutY(89);   		// Y position
ToggleGroup group = new ToggleGroup();
rb1.setToggleGroup(group);
rb2.setToggleGroup(group);
p2.getChildren().addAll(rb1,rb2);


// CheckBox
CheckBox checkBox = new CheckBox("Check me");
checkBox.setLayoutX(47);  	// X position
checkBox.setLayoutY(109);   	// Y position
checkBox.setOnAction(e -> 
System.out.println("Checkbox is " + (checkBox.isSelected() ? "checked" : "unchecked"))
);
p2.getChildren().add(checkBox);


// Hyperlink
Hyperlink hyperlink = new Hyperlink("Visit OpenAI");
hyperlink.setLayoutX(47);  	// X position
hyperlink.setLayoutY(139);   	// Y position
hyperlink.setOnAction(e -> System.out.println("Hyperlink clicked!"));
p2.getChildren().add(hyperlink);




Pane p3 = new Pane();
p3.setPrefSize(300, 200); 
p3.setMaxWidth(300);
p3.setMaxHeight(200);
p3.setStyle("-fx-background-color: yellow;");



// Create MenuBar
        MenuBar menuBar = new MenuBar();

        // --- Menu File
        Menu fileMenu = new Menu("File");

        MenuItem newItem = new MenuItem("New");
        newItem.setOnAction(e -> System.out.println("New File"));

        MenuItem openItem = new MenuItem("Open");
        openItem.setOnAction(e -> System.out.println("Open File"));

        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(e -> stage.close());

        fileMenu.getItems().addAll(newItem, openItem, new SeparatorMenuItem(), exitItem);

        // --- Menu Edit
        Menu editMenu = new Menu("Edit");

        MenuItem cutItem = new MenuItem("Cut");
        cutItem.setOnAction(e -> System.out.println("Cut"));

        MenuItem copyItem = new MenuItem("Copy");
        copyItem.setOnAction(e -> System.out.println("Copy"));

        MenuItem pasteItem = new MenuItem("Paste");
        pasteItem.setOnAction(e -> System.out.println("Paste"));

        editMenu.getItems().addAll(cutItem, copyItem, pasteItem);

        // Add menus to the menu bar
        menuBar.getMenus().addAll(fileMenu, editMenu);

menuBar.setLayoutX(17);  	// X position
menuBar.setLayoutY(21);   	// Y position
p3.getChildren().add(menuBar);


// Button
Button btn = new Button("Hover over me");
btn.setLayoutX(47);  	// X position
btn.setLayoutY(139);   	// Y position

// Tooltip
Tooltip tooltip = new Tooltip("This is a tooltip message!");
btn.setTooltip(tooltip);
p3.getChildren().add(btn);




// Button to open file chooser
        Button btn1 = new Button("Select File");

        btn1.setOnAction(e -> {
            // Create FileChooser
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open File");

            // Optional: set initial directory
            fileChooser.setInitialDirectory(new java.io.File(System.getProperty("user.home")));

            // Optional: set extension filters
            FileChooser.ExtensionFilter extFilter = 
                new FileChooser.ExtensionFilter("Text files (*.txt)", "*.txt");
            fileChooser.getExtensionFilters().add(extFilter);

            // Show open dialog
            java.io.File file = fileChooser.showOpenDialog(stage);

            if (file != null) {
                System.out.println("Selected file: " + file.getAbsolutePath());
            }
        });

btn1.setLayoutX(157);  	// X position
btn1.setLayoutY(101);   	// Y position
p3.getChildren().add(btn1);



HBox row1 = new HBox(10);
row1.getChildren().addAll(p0, p1);

HBox row2 = new HBox(10);
row2.getChildren().addAll(p2, p3);

VBox root = new VBox(10);
root.getChildren().addAll(row1, row2);

  

      Scene s = new Scene(root,600, 400);
        stage.setScene(s);
        stage.setTitle("Scalable v1.0");
        stage.show();
    


t.setOnAction(e -> {
String x = t.getText();
System.out.println(x);

String url ="jdbc:mysql://localhost:3306/testdb";
String user = "root";
String password ="";

try
{
Connection conn = DriverManager.getConnection(url, user, password);
System.out.println("Connection Successful!");
conn.close();
}
catch(SQLException e1)
{
System.out.println("Connection Failed!");
e1.printStackTrace();
}
});




}

    public static void main(String[] arg)
    {
        launch(arg);
    }

}





