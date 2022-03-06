package jdbc_crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.sql.Date;

public class delete {

public static void main(String args[]) {

try {

Connection connection= DriverManager.getConnection

("jdbc:mysql://127.0.0.1:3306/exampledb", "root", "root");

System.out.println("We are successfully connected to the MySQL server.");

String sql = "DELETE FROM user WHERE name=?";

 

PreparedStatement statement = connection.prepareStatement(sql);

statement.setString(1, "TestUser");

 

int rowsDeleted = statement.executeUpdate();

if (rowsDeleted > 0) {

    System.out.println("The user was deleted successfully!");

}

statement.close();

sql = "SELECT COUNT(*) AS total FROM user";

Statement st = connection.createStatement();

ResultSet count = st.executeQuery(sql);

if(count.next() && (count.getInt("total") == 0)) {

System.out.println("The User table is empty!");

}

st.close();

} catch (SQLException e) {

            System.out.println("SQLException: " + e.getMessage());


}

}

}
