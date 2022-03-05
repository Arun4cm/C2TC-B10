package jdbc;
import java.sql.*;
public class JDBCDemo1 
{
	public static void main(String[] args) throws Exception 
	{
	 	// load the drivers
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //establish connection between java application with SQL database
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/arun", "root", "root");
        //create statement object
        Statement st=con.createStatement();
        
        //write and execute queries
        
       // String query="create table student(id int primary key,sname varchar(20))";
        
       // String query1="insert into student values(1,'Arun')";
       // String query2="insert into student values(2,'amith')";
       // String query3="insert into student values(3,'karan')";
       // String query4="insert into student values(4,'Nithin')";
        
       // String query5="delete from student where id=2";
        
       String query6="insert into student values(5,'varun')";
        
        
       // st.executeUpdate(query);
       // st.executeUpdate(query1);
       // st.executeUpdate(query2);
       // st.executeUpdate(query3);
       // st.executeUpdate(query4);
       // st.executeUpdate(query5);
       st.executeUpdate(query6);
        
       // System.out.println("student table created successfully!!!!");
       // System.out.println("Row inserted successfully!!!!");
        
        //close the connections
        st.close();
        con.close();
	}
}