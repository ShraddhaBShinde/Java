package file_handling;

import java.io.*;
public class Buffered {
	void read() throws IOException
	{
		FileWriter writer= new FileWriter("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file4.txt");
		BufferedWriter buffer=new BufferedWriter(writer);
		buffer.write("Welcome to JavaFullStackWorld!!");
		buffer.append("Programming");
		buffer.close();
		System.out.println("Success!!");
		
		FileReader fr=new FileReader("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file4.txt");
		BufferedReader br=new BufferedReader(fr);
		
		int i;
		while((i=br.read())!=-1)
		{
			System.out.print((char)i);
		}
		br.close();
		fr.close();
	}
	public static void main(String args[]) throws IOException
	{
		Buffered b=new Buffered();
		b.read();
	}
}
