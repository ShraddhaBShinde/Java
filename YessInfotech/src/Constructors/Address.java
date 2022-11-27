package Constructors;

public class Address extends Student {
	public Address()
	{
		super("Shraddha");  //super keyword is used as we have to pass arguments
		System.out.println("Address constructor");
	}
	public static void main(String args[])
	{
		Address a=new Address();
	}
}
