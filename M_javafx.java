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