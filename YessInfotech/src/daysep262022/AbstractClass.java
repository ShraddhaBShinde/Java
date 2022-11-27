package daysep262022;

public abstract class AbstractClass {
	public AbstractClass()
	{
		System.out.println("This is constructor of abstract class");
	}
	public abstract void a_method();
	public void non_abstract()
	{
		System.out.println("This is normal method of abstract class");
	}
}
