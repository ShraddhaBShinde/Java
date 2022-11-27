package file_handling;

import java.io.*;
public class FileCopy 
{
	public static void main(String args[]) throws IOException
	{
	FileInputStream fi=new FileInputStream("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file.txt");
	FileOutputStream fo=new FileOutputStream("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file2.txt");
	int n;
	while((n=fi.read())!=-1)
	{
		fo.write(n);
		//System.out.println((char)n)
	}
	System.out.println("File copied successfully");
	fi.close();
	fo.close();
	}
}
