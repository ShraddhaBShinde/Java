package JDBC;

import java.sql.*;
import java.util.Scanner;
public class CRUDApplication {
	Connection con=null;
	int result=0;
	String name,addr;
	int rollno;
	Scanner sc=new Scanner(System.in);
	void myConnection()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/student","root","shraddha");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	void add()
	{
		myConnection();
		System.out.println("Enter Name: ");
		name=sc.nextLine();
		System.out.println("Enter address: ");
		addr=sc.nextLine();
		System.out.println("Enter Rollno: ");
		rollno=sc.nextInt();
	try
	{
		PreparedStatement stmt=con.prepareStatement("insert into stud (rollno,name,address) values(?,?,?)");
		stmt.setInt(1, rollno);
		stmt.setString(2, name);
		stmt.setString(3, addr);
		result=stmt.executeUpdate();
		if(result>0)
		{
			System.out.println("Record inserted successfully!");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	void delete()
	{
		myConnection();
		System.out.println("Enter rollno to delete record");
		rollno=sc.nextInt();
		try
		{
			PreparedStatement stmt=con.prepareStatement("delete from stud where rollno=?");
			stmt.setInt(1, rollno);
			result=stmt.executeUpdate();
			if(result>0)
			{
				System.out.println("Record deleted sucessfully!");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	void update()
	{
		myConnection();
		System.out.println("Enter Rollno: ");
		rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter Address : ");
		addr=sc.nextLine();
		try{
			PreparedStatement stmt=con.prepareStatement("update stud set name=?, address=? where rollno=?");
			stmt.setString(2, name);
			stmt.setString(3, addr);
			result=stmt.executeUpdate();
			if(result>0)
			{
				System.out.println("Record updated sucessfully!");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	void view()
	{
		try
		{
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from stud");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		CRUDApplication a=new CRUDApplication();
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(i==1)
		{
			System.out.println("1)ADD \n 2}DELETE \n 3)UPDATE \n 4) VIEW \n 5)EXIT");
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:a.add(); a.view(); break;
			case 2:a.delete(); a.view(); break;
			case 3:a.update(); a.view(); break;
			case 4:a.view(); break;
			case 5:i++;
			
			}
		}
	}
}
