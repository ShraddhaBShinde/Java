package java8features;

@FunctionalInterface  //it has only one abstract class 
interface Addable
{
	void add();
	static void display()
	{
		System.out.println("I am static method in interface");
	}
	default void details()
	{
		System.out.println("Default method from interfaces");
	}
}

public class Demo1 {
	public static void main(String args[])
	{
		Addable ad=new Addable()
				{

					@Override
					public void add() {
						// TODO Auto-generated method stub
						System.out.println("Addition is: "+(2+7+13+10)+" I am abstract method of interfaces");
						
					}
			
				};
				ad.add();
				ad.details();
				Addable.display();
	}
}
