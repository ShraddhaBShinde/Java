package file_handling;

import java.io.*;
class Student implements Serializable {
	int rollno=101;
	String name="shraddha";
	double per=82.63;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [rollno=" +rollno+ ", name=" +name+ ", per=" +per+ "]";
	}
	
}
public class Seri
{
	public static void main(String args[]) throws IOException
	{
		Student s=new Student();
		System.out.println(s);
		FileOutputStream f=new FileOutputStream("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file4.txt");
		ObjectOutputStream out=new ObjectOutputStream(f);
		out.writeObject(s);
	}
}
