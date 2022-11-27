package Constructors;

public class ThisKeyword {
	public ThisKeyword(int a)
	{
		
		System.out.println("Int a "+a);
	}
	public ThisKeyword(int i, double b)
	{
		this("hello");
		System.out.println("Int i "+i+" "+"Double b "+b);
	}
	public ThisKeyword (double d1, double d2)
	{
		this(7,5.2);
		System.out.println("Double d1 "+d1+" "+"Double d2 "+d2);
	}
	public ThisKeyword(String s)
	{
		this(7);  
		System.out.println("String s "+s);
	}
	public static void main(String args[])
	{
		ThisKeyword t=new ThisKeyword(7.2,5.2);  //first this is called
	}
}
