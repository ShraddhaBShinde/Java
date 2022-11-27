package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CRUDApplication1
{
	Connection con=null;
	int result =0;
	String name,course;
	int rollno;
	Scanner sc=new Scanner(System.in);
	void myConnection()
	{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/project","root","mysql123");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	void add()
	{
		myConnection();
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter course");
		course=sc.nextLine();
		System.out.println("enter id");
		rollno=sc.nextInt();
		try
		{
			PreparedStatement stmt=con.prepareStatement("insert into stud (rollno,name,adress) value(?,?,?)");
			stmt.setInt(1, rollno);
			stmt.setString(2, name);
			stmt.setString(3, course);
			result=stmt.executeUpdate();
			if(result>0)
			{
				System.out.println("record inserted succesfully...");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	void delete()
	{
		myConnection();
		System.out.println("enter id to delete record");
		rollno=sc.nextInt();
		try
		{
			PreparedStatement stmt=con.prepareStatement("delete from stud where rollno=?");
			stmt.setInt(1,rollno);
			result=stmt.executeUpdate();
			if(result>0)
			{
				System.out.println("Record Deleted Succesfully ");
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
		System.out.println("Enter Name : ");
		name=sc.nextLine();
		System.out.println("Enter course : ");
		course=sc.nextLine();
		try{
			PreparedStatement stmt=con.prepareStatement("update stud set name=?, course=? where id=?");
			stmt.setString(2, name);
			stmt.setString(3, course);
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
			ResultSet rs=stmt.executeQuery("select * from stud ");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+": "+rs.getString(3));  
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static  void main(String[]args)
	{
		 CRUDApplication a=new  CRUDApplication();
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(i==1)
		{
			System.out.println("1.ADD\n2.DELETE\n3.UPDATE\n4.VIEW\n5.EXIT");
			System.out.println("enter your choice :");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:a.add();  a.view(); break;
			case 2:a.delete();a.view(); break;
			case 3: a.update();a.view(); break;
			case 4:a.view();a.view(); break;
			case 5:i++;
			}
			
			
		
			}
		}
	}
