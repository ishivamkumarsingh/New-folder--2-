import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTableOperations {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "shivam";
        String password = "123456";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {
            
            
            String createTableSQL = "CREATE TABLE Employees (" +
                    "ID INT PRIMARY KEY AUTO_INCREMENT, " +
                    "Name VARCHAR(100), " +
                    "Age INT, " +
                    "Department VARCHAR(50))";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table 'Employees' created successfully.");

            
            String alterTableSQL = "ALTER TABLE Employees ADD Salary DECIMAL(10,2)";
            stmt.executeUpdate(alterTableSQL);
            System.out.println("Table 'Employees' altered successfully.");

            
            String dropTableSQL = "DROP TABLE Employees";
            stmt.executeUpdate(dropTableSQL);
            System.out.println("Table 'Employees' deleted successfully.");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}