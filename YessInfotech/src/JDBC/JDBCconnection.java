package JDBC;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class JDBCconnection {
	public void connect() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");  //com.mysql.cj.jdbc.Driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","shraddha");
		if(con!=null)
		{
			System.out.println("Connected Successfully");
		}
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
		}
	}
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		JDBCconnection j=new JDBCconnection();
		j.connect();
	}
}
