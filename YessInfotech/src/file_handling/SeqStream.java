package file_handling;

import java.io.*;
public class SeqStream {
	public static void main(String args[]) throws Exception
	{
		FileInputStream input1=new FileInputStream("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file.txt");
		FileInputStream input2=new FileInputStream("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file1.txt");
		FileOutputStream fo=new FileOutputStream("C:\\Users\\shrad\\OneDrive\\Documents\\Java Class\\file3.txt");
		SequenceInputStream ss=new SequenceInputStream(input1,input2);
		int j;
		while((j=ss.read())!=-1)
		{
			fo.write(j);
			System.out.print((char)j);
		}
		ss.close();
		input1.close();
		input2.close();
		
	}
}
