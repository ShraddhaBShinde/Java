package Calculations;
import java.util.Scanner;

public class AbsoluteNumber {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		if(num<0)
		{
			System.out.println((num*-1)+" is the absolute number");
		}
		else
		{
			System.out.println(num+" is the absolute number");
		}
	}
}
