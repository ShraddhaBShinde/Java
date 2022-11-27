package file_handling;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileWr {
	void write() throws IOException
	{
		FileWriter fw=new FileWriter("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file1.txt");
		fw.write("Java");
		fw.write("****");
		fw.write("Programming");
		System.out.println("Successfull!!");
		fw.close();
	}
	void read() throws InterruptedException, IOException
	{
		int n;
		FileReader fr=null;
		try
		{
			fr = new FileReader("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file1.txt");
			while((n=fr.read())!=-1)
			{
				Thread.sleep(500);
				System.out.print((char)n);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
		}
		fr.close();
	}
	public static void main(String args[]) throws InterruptedException, IOException
	{
		FileWr f=new FileWr();
		f.write();
		f.read();
	}
}
