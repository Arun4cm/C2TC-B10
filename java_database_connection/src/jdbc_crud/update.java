package jdbc_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

public class update {

public static void main(String args[]) {

try {

Connection connection= DriverManager.getConnection

("jdbc:mysql://127.0.0.1:3306/exampledb", "root", "root");

System.out.println("We are successfully connected to the MySQL  server.");

String sql = "UPDATE User SET email=? WHERE name=?";

 

PreparedStatement statement = connection.prepareStatement(sql);

statement.setString(1, "newEmail");

statement.setString(2, "TestUser");

 

int rowsUpdated = statement.executeUpdate();

if (rowsUpdated > 0) {

    System.out.println("An existing user was updated  successfully!");

}

statement.close();

} catch (SQLException e) {

            System.out.println("SQLException: " + e.getMessage());

    }

  }
  
}
