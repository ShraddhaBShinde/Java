package Calculations;
import java.util.Scanner;

public class StudentAttendance {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of class held: ");
		int classes=sc.nextInt();
		System.out.println("Enter number of class attended: ");
		int attended=sc.nextInt();
		int per=(attended*100)/classes;
		System.out.println(per+"%");
		if(per<75)
		{
			System.out.println("You are not allowed to sit in the exam :(");
		}
		else
		{
			System.out.println("You are allowed to sit in the exam :)");
		}
		
	}
}
