package crud_ops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class create {

public static void main(String args[]) {
try {
Connection connection= DriverManager.getConnection
("jdbc:mysql://127.0.0.1:3306/arun","root","root"); 
System.out.println("We are successfully connected to  the MySQL    server.");
Statement stmt=connection.createStatement();
stmt.executeUpdate("CREATE DATABASE exampledb");
System.out.println("A new database with the name exampledb is   created.");
stmt.close();

System.out.println("Let's create a new table!");
stmt = connection.createStatement();
String sql = "CREATE TABLE exampledb.USER (ID INT, NAME         VARCHAR(50), "
+ "EMAIL VARCHAR(45), CREATION_TIME DATE, PRIMARY               KEY (ID))";
stmt.execute(sql);
System.out.println("The table is created successfully!");
stmt.close();

} catch (SQLException e) {

            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
      }

    }

}