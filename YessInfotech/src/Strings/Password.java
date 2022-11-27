package Strings;
import java.util.Scanner;

public class Password {
	public static void Pw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter password: ");
		String password=sc.next();
		if(password.length()>=10)
		{
			System.out.println("Password length is correct :)");
		}
		else
		{
			System.out.println("Password length is too short :(");
		}
		StringBuilder sb=new StringBuilder(password);
		sb.append(" Welcome to Java!!!!");
		System.out.println(sb);
		String str=new String(sb);
		System.out.println(str.replace('!','*'));
		
	}
	public static void main(String args[])
	{
		Pw();
	}
}
