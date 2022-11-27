package java8features;

interface Callable
{
	public void call(int a);
}
interface Printable
{
	public void print(String s, int age);
}

public class Lambdawithargs {
	public static void main(String args[])
	{
		Callable c=(a)->System.out.println(a);
		c.call(10);
		
		Printable p=(s,age)->
		{
			System.out.println("My name is "+s);
			System.out.println("My age is "+age);
		};
		p.print("Shraddha",21);
				
	}
}
