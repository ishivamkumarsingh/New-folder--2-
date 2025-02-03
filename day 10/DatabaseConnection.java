import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
    
        String url = "jdbc:mysql://localhost:3306/your_database"; 
        String user = "your_username";
        String password = "your_password";

        
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database successfully!");
        } catch (Exception e) {
            System.out.println("Connection failed!");
           
        }
    }
}
