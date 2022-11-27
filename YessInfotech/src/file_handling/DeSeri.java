package file_handling;

import java.io.*;
public class DeSeri {
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		FileInputStream fin=new FileInputStream("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file4.txt");
		ObjectInputStream in=new ObjectInputStream(fin);
		//System.out.println(in.readObject())
		
		Student s1=(Student)in.readObject();
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.per);
	}
}
