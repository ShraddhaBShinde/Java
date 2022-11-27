package file_handling;

import java.io.*;
public class PrintStreamText {
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fo=new FileOutputStream("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file4.txt");
		PrintStream ps=new PrintStream(fo);
		ps.print(2016);
		ps.print("Hello Java");
		ps.print("Java Programming");
		ps.close();
		fo.close();
		System.out.println("Success");
	}
}
