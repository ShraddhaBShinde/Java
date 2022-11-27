package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.ResultSetMetaData;


public class TableData {
	public void readdata()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","shraddha");
			if(con!=null)
			{
				System.out.println("Connected Successfully!");
			}
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("desc student");
			/*while(rs.next())
			 * {
			 * System.out.println(rs.getString(1));
			 * System.out.println(rs.getString(2));
			 * System.out.println(rs.getString(3));
			 * }
			 */
			ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
			System.out.println(rsmd.getTableName(1));
			System.out.println(rsmd.getColumnName(1));
			System.out.println(rsmd.getColumnTypeName(1));
			
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String args[])
	{
		TableData td=new TableData();
		td.readdata();
	}
}
