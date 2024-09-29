
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//data base connnection
public class databaseConnection {
     //C:\Program Files\Java\jdk1.8.0_281\jre\lib\ext
   
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/admin";

    final static String email = "root";
    final static String password = "";

   public static Connection connection() {
        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, email, password);
            return conn;

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

}
