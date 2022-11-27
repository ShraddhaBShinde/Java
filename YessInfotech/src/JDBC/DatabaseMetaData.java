package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseMetaData {
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","shraddha");
		if(con!=null)
		{
			System.out.println("Connected Successfully");
			java.sql.DatabaseMetaData ds=con.getMetaData();
			System.out.println(ds.getDatabaseMajorVersion());
			System.out.println(ds.getDatabaseProductName());
			System.out.println(ds.getDatabaseProductName());
			System.out.println(ds.getDriverName());
			System.out.println(ds.getUserName());
		}
	}
}
