/*
To Run
======
Download XAMPP from: https://www.apachefriends.org/
Start Apache
Start MySQL

Download: "javafx-sdk-17.0.18" framework (library) 
Save it in C:\

E:\jtest\myproject\Java Awt, Swing, JavaFX>javac --module-path "C:\javafx-sdk-17.0.18\lib" --add-modules javafx.controls,javafx.fxml M_javafx.java

E:\jtest\myproject\Java Awt, Swing, JavaFX>java --module-path "C:\javafx-sdk-17.0.18\lib" --add-modules javafx.controls,javafx.fxml -cp ".;C:\jdbc\mysql-connector-j-9.5.0\mysql-connector-j-9.5.0.jar" M_javafx
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

public class M_javafx extends Application
{
    public void start(Stage stage)
    {
        Label l = new Label("Username:     ");
        TextField t = new TextField();
        t.setPrefColumnCount(15);
	t.setMaxWidth(Region.USE_PREF_SIZE);

        HBox f = new HBox();
        f.getChildren().addAll(l, t);

        Scene s = new Scene(f, 400, 600);
        stage.setScene(s);
        stage.setTitle("Scalable v1.0");
        stage.show();
    

t.setOnAction(e -> {
String x = t.getText();

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




