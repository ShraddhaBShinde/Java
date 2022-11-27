package practice20; //package
import java.util.Scanner; 

public class Class_marks { //class
	public static void student()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Your name is: "+name);
		System.out.println("Enter roll no.: ");
		int roll_num=sc.nextInt();
		System.out.println("Your roll no is: "+roll_num);
		System.out.println("Enter marks of subject1: ");
		double marks1=sc.nextDouble();
		System.out.println("Enter marks of subject2: ");
		double marks2=sc.nextDouble();
		double sum=marks1+marks2;
		double per=marks1+marks2/200;
		System.out.println("Sum of marks is: "+sum);
		System.out.println("Percentage of marks is: "+per);
	}
	public static void main(String args[])
	{
		student();
	}
}
