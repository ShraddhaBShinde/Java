package Polymorphism;
import java.util.Scanner;
//runtime polymorphism
//overriding(rewriting)->between two classes(parent-child)->modifications->(body)->1.Dynamic overriding
//not changing method name,return type,no. of arguments

public class Overriding1 {
	Scanner sc=new Scanner(System.in);
	double d1,d2;
	double b,h;
	
	public void user_input()
	{
		System.out.println("Enter Dimensions 1 & 2: ");
		d1=sc.nextDouble();
		d2=sc.nextDouble();
	}
	public void user_input_triangle()
	{
		System.out.println("Enter base and height: ");
		b=sc.nextDouble();
		h=sc.nextDouble();
	}
	public void cal_area()
	{
		System.out.println("Calculating area....");
	}
}
