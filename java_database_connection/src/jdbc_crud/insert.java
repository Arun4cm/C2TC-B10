package jdbc_crud;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

public class insert {

public static void main(String args[]) {

try {

Connection connection= DriverManager.getConnection

("jdbc:mysql://127.0.0.1:3306/exampledb", "root", "root");

System.out.println("We are succesfully connected to the MySQL  server.");

String sql = "INSERT INTO User (id, name, email, creation_time)  VALUES (?, ?, ?, ?)";

PreparedStatement statement = connection.prepareStatement(sql);

statement.setInt(1, 1);

statement.setString(2, "TestUser");

statement.setString(3, "testuser@gmail.com");

statement.setDate(4, new Date(new java.util.Date().getTime()));

 

int rowsInserted = statement.executeUpdate();

if (rowsInserted > 0) {

    System.out.println("A new user was inserted successfully!");

}

statement.close();

} catch (SQLException e) {

            System.out.println("SQLException: " + e.getMessage());

    }

  }

}