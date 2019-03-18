import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    //psvm + TAB
    public static void main(String[] args) throws ClassNotFoundException {
        java.sql.Connection cnEmps = null;
        var driver = "com.sqlserver.jdbc.Driver";
        String connectionString = "jdbc:sqlserver://localhost/Spotitube";

        Class.forName(driver);

        try
        {
            cnEmps = DriverManager.getConnection(connectionString);
            System.out.println(cnEmps.toString());
        }
        catch (SQLException e)
        {
            System.out.println("Error connecting to a database: " + e);
        }
    }
}
