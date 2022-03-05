package jdbc;
import java.sql.*;
public class JDBCDemo2 
{
	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo", "root", "root");
        
        Statement st=con.createStatement();
        
        //String query="create table student(id int primary key,sname varchar(20))";
        try 
        {
        String query1="insert into student values(1,'Arun')";
        String query2="insert into student values(2,'tharun')";
        String query3="select * from student";
        String query4="delete from student where id=2";
        System.out.println("id\tname\t");
        ResultSet rs=st.executeQuery("Select id,sname from student");
        while(rs.next())
        {
        	System.out.println(rs.getString(1));
        	System.out.println(rs.getString(2));
        	System.out.println(rs.getString(3));
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
        
		// st.executeUpdate(query);
        //st.executeUpdate(query1);
		//st.executeUpdate(query2);
       // st.executeUpdate(query3);
      // st.executeUpdate(query4);
        
        //System.out.println("student table created successfully!!!!");
        System.out.println("Row inserted successfully!!!!");
        
        st.close();
        con.close();
	}
}