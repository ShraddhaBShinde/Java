package daysep262022;

import java.util.Scanner;

public class Multilevel implements Language2{

	@Override
	public void lang() {
		System.out.println("I am learning JAVA (Multilevel Inheritance)!!");
		
	}

	@Override
	public void sides() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 dimensions: ");
		double s1=sc.nextDouble();
		System.out.println("Dimension 1 is: "+s1);
		double s2=sc.nextDouble();
		System.out.println("Dimension 2 is: "+s2);	
		
	}
	
	public static void main(String args[])
	{
		Multilevel ml=new Multilevel();
		ml.sides();
		ml.lang();
	}
	
}
