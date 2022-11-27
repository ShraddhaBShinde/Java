package java8features;

interface Printable1  //name cannot be same in any other class
{
	private static void add()
	{
		System.out.println("Private Method "+(7+13));
	}
	default void mul()
	{
		add();
		System.out.println("Default method "+(2*10));
	}
	public void print();
}

public class Demo2 {
	public static void main(String args[])
	{
		Printable1 p=()->System.out.println("Print method ");
		p.mul();
		p.print();
	}
}
