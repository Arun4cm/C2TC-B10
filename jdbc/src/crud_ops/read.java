package crud_ops;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

public class read {
public static void main(String args[]) {
try {
Connection connection= DriverManager.getConnection
("jdbc:mysql://127.0.0.1:3306/exampledb","root","root"); 
System.out.println("We are successfully connected to the MySQL  server.");
String sql = "SELECT * FROM user";
Statement statement = connection.createStatement();
ResultSet result = statement.executeQuery(sql);

while (result.next()){
    int id = result.getInt(1);
   String name = result.getString(2);
    String email = result.getString("email");
    String date = result.getDate(4).toString();
    String output = "User #%d: %s - %s - %s";
    System.out.println(String.format(output, id, name, email,  date));
  }
statement.close();
} catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
     }
   }
 }