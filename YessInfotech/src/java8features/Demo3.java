package java8features;

public class Demo3 {
	final int a=84; //final variable
	final int b;  //blank final variable
	static final int c=64;  //static final
	static final int d;
	
	static 
	{
		d=45;  //initialization done
	}
	
	public Demo3()
	{
		b=654;  //initialization done
	}
	
	public void print()
	{
		System.out.println("Final var "+a);
		System.out.println("Blank final var "+b);
		System.out.println("Static final var "+c);
		System.out.println("Blank static final "+d);
		
	}
	
	public static void main(String args[])
	{
		Demo3 d3=new Demo3();
		d3.print();
	}
}
