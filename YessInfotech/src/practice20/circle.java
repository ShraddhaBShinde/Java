package practice20; //package name

public class circle {
	public double areaOfCir(double radius)  //user defined method with args and with return type
	{
		//Math.PI is a static final double constant in Java
		//Provided by java.lang.Math class, Math.PI constant is used to carry out multiple mathematical and scientific calculations like finding the area & circumference of a circle or the surface area and volume of a sphere.
		double area= Math.PI * Math.pow(radius, 2);
		return area;
	}
	public double circumOfCir(double radius) //user defined method with args and with return type
	{
		double circum= 2 * Math.PI * radius;
		return circum;
	}
	public double diaOfCir(double radius) //user defined method with args and with return type
	{
		double diameter = radius * 2;
		return diameter;
	}
	public static void main(String args[])
	{
		circle c=new circle();
		double Area=c.areaOfCir(2.713);
		System.out.println("Area of circle is: "+Area);
		double Circum=c.circumOfCir(2.713);
		System.out.println("Circumference of circle is: "+Circum);
		double Diameter=c.diaOfCir(2.713);
		System.out.println("Diameter of circle is: "+Diameter);
	}
	
}
