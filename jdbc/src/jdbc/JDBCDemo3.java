package jdbc;
import java.sql.*;
public class JDBCDemo3 
{
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo", "root", "root");
        
        Statement st=con.createStatement();
        
       // String query="create table student(id int primary key,sname varchar(20))";
    try 
    {
        String query1="insert into student values(1,'arun')";
        System.out.println("id\tname\t");
        ResultSet rs=st.executeQuery("Select id,sname from student");
        while(rs.next())
        {
        	int id=rs.getInt("id");
        	String sname=rs.getString("sname");
        	System.out.println(id + "\t" + sname);
        }
    } 
    catch (Exception e) 
    {
		// TODO: handle exception
    	System.out.println(e);
	}
        
        //st.executeUpdate(query);
       // st.executeUpdate(query1);
        
        //System.out.println("student table created successfully!!!!");
        //System.out.println("Row inserted successfully!!!!");
        
        st.close();
        con.close();
	}
}