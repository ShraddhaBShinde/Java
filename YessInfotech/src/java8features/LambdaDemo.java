package java8features;

interface Showable
{
	public void show();
}

public class LambdaDemo {
	public static void main(String args[])
	{
		Showable s=()->  //(->) lambda method is used only with functional interfaces and helps in reducing obvious code
		{
			System.out.println("Show method");
		};
		s.show();
	}
}
