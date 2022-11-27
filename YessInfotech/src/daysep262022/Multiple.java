package daysep262022;
import java.util.*;

public class Multiple implements Polygon,Language {

	@Override
	public void lang() {
		System.out.println("I am learning JAVA (Multiple Inheritance)!!");
		
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
		Multiple m=new Multiple();
		m.sides();
		m.lang();
				
	}

}
