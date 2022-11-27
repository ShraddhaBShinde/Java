package Abstraction;

abstract class Class
{
	public abstract void type(String name);
	public void display()
	{
		System.out.println("Display Method");
	}
}

public class AnonymousAbstract {
	public static void  main(String args[])
	{
		Class aa=new Class()
		{

			@Override
			public void type(String name) {
				System.out.println("My name is "+name);
						
			}
			
		};
		aa.type("Shraddha");
		aa.display();
	}
}
