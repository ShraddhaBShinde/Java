package practice20;  //package name

public class triangle {  //class name
	int base=10;
	int height=7;
	public void areaOfTri()  //user defined method with no args and no return type
	{
		double area=base*height/2;  //double to not miss result data
		System.out.println("Area of triangle is: "+area);
	}
	public static void main(String args[])
	{
		triangle a=new triangle();
		a.areaOfTri();
	}
}
