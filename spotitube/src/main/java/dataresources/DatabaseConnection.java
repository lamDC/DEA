package dataresources;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {

    public java.sql.Connection getConnection() throws ClassNotFoundException {
        java.sql.Connection cnEmps = null;
        var driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String connectionString = "jdbc:sqlserver://localhost:1433";
        var userID = "diego";
        var password = "cuppie123";
        Class.forName(driver);

        try
        {
            cnEmps = DriverManager.getConnection(connectionString, userID, password);

        }
        catch (SQLException e)
        {
            System.out.println("Error connecting to a database: " + e);
        }
        return cnEmps;
    }
}
