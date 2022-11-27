package file_handling;

import java.io.*;
public class Buffered1 {
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file4.txt");
		BufferedOutputStream bout=new BufferedOutputStream(fout);
		String s="Welcome to Java";
		byte b[]=s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("Success!!");
		
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file4.txt");
			BufferedInputStream bin=new BufferedInputStream(fin);
			int i;
			while((i=bin.read())!=-1)
			{
				System.out.print((char)i);
			}
			bin.close();
			fin.close();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
