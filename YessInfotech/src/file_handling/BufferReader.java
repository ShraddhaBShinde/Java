package file_handling;

import java.io.BufferedReader;
import java.io.*;
public class BufferReader {
	public static void main(String args[]) throws IOException
	{
		//InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number: ");
		String s1=bf.readLine();
		System.out.println("Enter Number: ");
		String s2=bf.readLine();
		System.out.println(s1+s2);
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		int z=x+y;
		System.out.println("After type cast: "+z);
		
		String n=Integer.toString(z);
		String n1=String.valueOf(z);
		System.out.println(n+":"+n1);
	}
	
}
