package file_handling;

import java.io.*;
public class PrintWriteEx {
	public static void main(String args[]) throws FileNotFoundException
	{
		PrintWriter writer=new PrintWriter(System.out);
		writer.write("Java Programming Frameworks");
		writer.flush();
		writer.close();
		
		//DATA TO WRITE IN FILE USING PrintWriter
		PrintWriter writer1=null;
		writer1 = new PrintWriter(new File("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file4.txt"));
		writer1.write("njjkskdjksakjnskfhcbsf");
		writer1.flush();
		writer1.close();
	}
}
