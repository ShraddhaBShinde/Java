package Polymorphism;

//Q.Create a class to print the area of square and a rectangle the class has two methods 
//with the same name but different number of parameters

public class OverloadingArea {
	public void area(double s)
	{
		System.out.println("Area of a square is "+s*s);
	}
	public void area(double l, double b)
	{
		System.out.println("Area of rectangle is "+l*b);
	}
	public static void main(String args[])
	{
		OverloadingArea a=new OverloadingArea();
		a.area(2.0);
		a.area(54.154, 5647.14);
	}
}
